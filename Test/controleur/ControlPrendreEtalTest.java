package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class ControlPrendreEtalTest {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;
	private ControlPrendreEtal crtlTestprendreEtal;
	private ControlEmmenager emmanager ;
	
	@BeforeEach
	public void initialiserSituation() {
		village = new Village ("Le village des iréductibles", 10 ,5);
		controlVerifierIdentite = new ControlVerifierIdentite(village);
		}
	@Test
	void test() {
		emmanager.ajouterGaulois("Bonemine", 6);
		crtlTestprendreEtal.prendreEtal("Bonemine","bouclier",4);
		assertFalse(crtlTestprendreEtal.resteEtals());
		assertTrue(crtlTestprendreEtal.verifierIdentite("Bonemine"));
		
	}

}
