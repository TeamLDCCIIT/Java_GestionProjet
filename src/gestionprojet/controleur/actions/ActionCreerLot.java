package gestionprojet.controleur.actions;
import gestionprojet.view.ui.Fenetre.FenetreOptionLot;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ActionCreerLot extends AbstractAction{
	
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Nouveau lot";
	
	/**
	 * Action qui ouvre la fen�tre de creation de lot
	 */
	public ActionCreerLot(){
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FenetreOptionLot fenetre = FenetreOptionLot.getInstance();
		fenetre.getBoutonValider().setAction(new ActionCreationL());
		fenetre.getBoutonAnnule().setAction(new ActionAnnuler(fenetre));
		fenetre.setVisible(true);
	}

}
