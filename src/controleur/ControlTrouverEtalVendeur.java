package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public Etal trouverEtalVendeur(String nomVendeur) {
		Gaulois veudeur = village.trouverHabitant(nomVendeur);
		Etal etal = null;
		if (veudeur!=null)
		{
			etal= village.rechercherEtal(veudeur);
		}
		return etal;
	}
}
