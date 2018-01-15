package gestionprojet.controleur.actions;
import gestionprojet.view.ui.*;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import gestionprojet.view.ui.FenetreCreationLot;

public class ActionCreerLot extends AbstractAction{
	
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Nouveau lot";
	
	public ActionCreerLot(){
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		if(action.equals(NOM_ACTION)){
			FenetreCreationLot fenetre = new FenetreCreationLot(); 
			fenetre.setVisible(true);
		}
		
	}

}
