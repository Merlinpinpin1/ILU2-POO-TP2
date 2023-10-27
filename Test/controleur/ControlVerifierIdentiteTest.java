package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import personnages.Gaulois;
import villagegaulois.Village;


class ControlVerifierIdentiteTest {
	private Village village;
	private ControlEmmenager emmanager ;

	
	@BeforeEach
	public void initialiserSituation() {
		village = new Village ("Le village des iréductibles", 10 ,5);
		emmanager = new ControlEmmenager(village);
		}
	@Test
	void test() {
		ControlVerifierIdentite crtlverifIdentite = new ControlVerifierIdentite(village);
		emmanager.ajouterDruide("Panoramix", 6, 4, 8);
		assertTrue(crtlverifIdentite.verifierIdentite("Panoramix"));
	}

}
