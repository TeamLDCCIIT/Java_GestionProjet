package gestionprojet.controleur.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import gestionprojet.view.ui.Fenetre.FenetreOptionLot;

public class ActionAnnulerLot extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Annuler Lot";
	
	public ActionAnnulerLot(){
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		FenetreOptionLot fenetre = FenetreOptionLot.getInstance();
		//permet d'effacer
		//fenetre.getPanneauDessin().getVueFormes().clear();
		fenetre.repaint();
	}
	
	
}
