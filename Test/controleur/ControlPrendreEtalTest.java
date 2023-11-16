package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;
import personnages.Chef;
import villagegaulois.Village;

class ControlPrendreEtalTest {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;
	private ControlEmmenager emmanager ;
	private Chef abraracourcix ;
	
	@BeforeEach
	public void initialiserSituation() {
		village = new Village ("Le village des iréductibles", 10 ,5);
		controlVerifierIdentite = new ControlVerifierIdentite(village);
		abraracourcix = new Chef("Abraracourci",10,village);
		village.setChef(abraracourcix);
		emmanager = new ControlEmmenager(village);
		emmanager.ajouterGaulois("Bonemine", 6);
		}
	
	@Test
	void tesResteEtals() {
		ControlPrendreEtal crtlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite,village);
		assertTrue(crtlPrendreEtal.resteEtals());
	}
	
	@Test
	void testPrendreEtal() {
		ControlPrendreEtal crtlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite,village);
		crtlPrendreEtal.prendreEtal("Bonemine","bouclier",4);
		assertTrue(crtlPrendreEtal.prendreEtal("Bonemine","bouclier",4)== 1);
		
	}

	
	@Test
	void teVerifierIdentite() {
		ControlPrendreEtal crtlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite,village);
		assertTrue(crtlPrendreEtal.verifierIdentite("Bonemine"));
	}

}
