package gestionprojet.controleur.actions;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import gestionprojet.view.ui.Fenetre.FenetreOptionProjet;

public class ActionAnnulerProjet extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Annuler";
	FenetreOptionProjet fenetre;
	
	public ActionAnnulerProjet(FenetreOptionProjet fenetre){
		super(NOM_ACTION);
		this.fenetre = fenetre;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		fenetre.dispose();
	}

}
