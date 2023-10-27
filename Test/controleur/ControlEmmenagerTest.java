package controleur;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import personnages.*;
import villagegaulois.Village;


class ControlEmmenagerTest {
	private Village village;
	private Chef chef ;
	
	@BeforeEach
	public void initialiserSituation() {
		village = new Village ("Le village des iréductibles", 10 ,5);
		chef = new Chef("Abracourcix" , 10  , village);
		}
	@Test
	void test() {
		ControlEmmenager crtlEmmanager = new ControlEmmenager(village);
		crtlEmmanager.ajouterGaulois("Bonemine", 3);
		crtlEmmanager.ajouterDruide("Panoramix", 6,4,8);
		assertTrue(crtlEmmanager.isHabitant("Bonemine"));
		assertTrue(crtlEmmanager.isHabitant("Panoramix"));
	}

}
