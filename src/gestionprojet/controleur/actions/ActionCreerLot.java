package gestionprojet.controleur.actions;
import gestionprojet.view.ui.*;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import gestionprojet.view.ui.FenetreOptionLot;

public class ActionCreerLot extends AbstractAction{
	
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Nouveau lot";
	
	public ActionCreerLot(){
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		FenetreOptionLot fenetre = new FenetreOptionLot();
		fenetre.setVisible(true);
	}

}
