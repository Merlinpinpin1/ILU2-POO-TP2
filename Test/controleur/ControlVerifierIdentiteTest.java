package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;


class ControlVerifierIdentiteTest {
	private Village village;
	private Chef abraracourcix ;
	private ControlEmmenager emmanager ;
	
	@BeforeEach
	public void initialiserSituation() {
		village = new Village ("Le village des iréductibles", 10 ,5);
		abraracourcix = new Chef("Abraracourci",10,village);
		village.setChef(abraracourcix);
		emmanager = new ControlEmmenager(village);
		emmanager.ajouterDruide("Panoramix", 6, 4, 8);
		}
	
	@Test
	void testControlVerifierIdentite() {
		ControlVerifierIdentite crtlverifIdentite = new ControlVerifierIdentite(village);
		assertNotNull(crtlverifIdentite,"Constructeur de renvoie pas null");

	}
	
	@Test
	void testVerifierIdentite() {
		ControlVerifierIdentite crtlverifIdentite = new ControlVerifierIdentite(village);
		assertTrue(crtlverifIdentite.verifierIdentite("Panoramix"));
	}

}
