package controleur;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import personnages.Chef;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
//import personnages.*;
import villagegaulois.Village;


class ControlEmmenagerTest {
	private Village village;
	private Chef abraracourcix ;
	
	@BeforeEach
	public void initialiserSituation() {
		village = new Village ("Le village des iréductibles", 10 ,5);
		abraracourcix = new Chef("Abraracourci",10,village);
		village.setChef(abraracourcix);
		}
	
	@Test
	void testControlEmmanager() {
		ControlEmmenager crtlEmmanager = new ControlEmmenager(village);
		assertNotNull(crtlEmmanager,"Constructeur de renvoie pas null");

	}
	
	
	@Test
	void testIsHabitant() {
		ControlEmmenager crtlEmmanager = new ControlEmmenager(village);
		crtlEmmanager.ajouterGaulois("Bonemine", 3);
		assertTrue(crtlEmmanager.isHabitant("Bonemine"));
		assertFalse(crtlEmmanager.isHabitant("N'existe pas"));
		crtlEmmanager.ajouterDruide("Panoramix", 6,4,8);
		assertTrue(crtlEmmanager.isHabitant("Panoramix"));
	}
	@Test
	void testAjouterDruide() {
		ControlEmmenager crtlEmmanager2 = new ControlEmmenager(village);
		crtlEmmanager2.ajouterDruide("Panoramix", 6,4,8);
		//assertTrue(crtlEmmanager2.isHabitant("Bonemine"));
	}
	@Test
	void testAjouterGaulois() {
		ControlEmmenager crtlEmmanager3 = new ControlEmmenager(village);
		crtlEmmanager3.ajouterGaulois("Bonemine", 3);
		//assertTrue(crtlEmmanager3.ajouterGaulois("Bonemine",3));
	}
}
