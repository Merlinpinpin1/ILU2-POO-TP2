package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;
import personnages.Chef;
import villagegaulois.Village;

class testControlLibererEtal {
	private Village village;
	private Chef abraracourcix ;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	
	@BeforeEach
	public void initialiserSituation() {
		village = new Village ("Le village des iréductibles", 10 ,5);
		abraracourcix = new Chef("Abraracourci",10,village);
		village.setChef(abraracourcix);
		controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		}
	
	@Test
	void tesIsVendeur() {
		ControlLibererEtal crtlControlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		assertTrue(crtlControlLibererEtal.isVendeur());
	}
	
	@Test
	void testPrendreEtal() {
		ControlLibererEtal crtlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite,village);
		crtlPrendreEtal.prendreEtal("Bonemine","bouclier",4);
		assertTrue(crtlPrendreEtal.prendreEtal("Bonemine","bouclier",4)== 1);
		
	}

	
	@Test
	void teVerifierIdentite() {
		ControlPrendreEtal crtlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite,village);
		assertTrue(crtlPrendreEtal.verifierIdentite("Bonemine"));
	}

}