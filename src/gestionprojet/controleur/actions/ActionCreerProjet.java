package gestionprojet.controleur.actions;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import gestionprojet.view.ui.Fenetre.FenetreOption;
import gestionprojet.view.ui.Fenetre.FenetreOptionProjet;

public class ActionCreerProjet extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Nouveau Projet";
	
	public ActionCreerProjet(){
		super(NOM_ACTION);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		FenetreOption fenetre = new FenetreOptionProjet();
		fenetre.getBoutonValider().setAction(new ActionCreationP());
		fenetre.setVisible(true);
		}
	}
	



