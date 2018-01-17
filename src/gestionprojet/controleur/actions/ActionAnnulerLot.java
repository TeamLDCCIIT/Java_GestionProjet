package gestionprojet.controleur.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import gestionprojet.view.ui.Fenetre.FenetreOptionLot;

public class ActionAnnulerLot extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Annuler Lot";
	FenetreOptionLot fenetre;
	
	public ActionAnnulerLot(FenetreOptionLot fenetre){
		super(NOM_ACTION);
		this.fenetre = fenetre;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		fenetre.dispose();
	}
	
	
}
