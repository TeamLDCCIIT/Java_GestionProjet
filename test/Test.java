import javax.swing.JFrame;

import gestionprojet.modele.Calendrier;
import gestionprojet.modele.Lot;
import gestionprojet.modele.Projet;
import gestionprojet.vue.ui.FenetreCalendrier2;

public class Test {

	public Test() {
	}

	public static void main(String[] args) {
			Calendrier c1 = new Calendrier("2017-01-01", "2017-10-21");
			
			System.out.println(c1.getStartDate());
			System.out.println(c1.getEndDate());
			System.out.println(c1.getDurationInDays());
			System.out.println(c1.getDatesBetween());
			System.out.println(c1.getDatesBetween().size());
			
			Lot lot1 = new Lot("L1", "2018-02-18", "2018-02-21");
			Lot lot2 = new Lot("L2", "2018-02-01", "2018-02-05");
			Lot lot3 = new Lot("L3", "2018-02-20", "2018-02-25");
			Lot lot4 = new Lot("L4", "2018-02-18", "2018-02-20");
			Lot lot5 = new Lot("L5", "2018-02-05", "2018-02-25");
			
			Projet p = new Projet("projet test", c1);
			p.getLotList().add(lot1);
			p.getLotList().add(lot2);
			p.getLotList().add(lot3);
			p.getLotList().add(lot4);
			p.getLotList().add(lot5);
			p.updateLotList(p.getLotList());
			for(int i = 0; i < p.getLotList().size();i++){
				System.out.println(p.getLotList().get(i).getName());
			}
			/*JFrame.setDefaultLookAndFeelDecorated(true);
			FenetreCalendrier2 f = new FenetreCalendrier2(p);
			f.setVisible(true);
			*/
	}

}
