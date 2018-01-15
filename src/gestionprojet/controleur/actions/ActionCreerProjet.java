package gestionprojet.controleur.actions;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class ActionCreerProjet extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Nouveau Projet";
	
	public ActionCreerProjet(){
		super(NOM_ACTION);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		if(action.equals(NOM_ACTION)){
			FenetreCreationProjet fenetre = new FenetreCreationProjet();
		}
	}
	


}
