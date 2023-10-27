package controleur;

import villagegaulois.Village;

public class ControlAfficherMarche {
	private Village village;

	public ControlAfficherMarche(Village village) {
		this.village = village;
	}

	public String[] donnerinfosMarche()
	{
		String[] infosMarche=village.donnerEtatMarche();
		return infosMarche;
	}
			
			
}
