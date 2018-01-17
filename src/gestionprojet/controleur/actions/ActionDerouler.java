package gestionprojet.controleur.actions;
import gestionprojet.view.ui.FenetreOption;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class ActionDerouler extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Plus";
	FenetreOption fenetre;
	
	public ActionDerouler(FenetreOption fenetre){
		super(NOM_ACTION);
		this.fenetre = fenetre;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		if(e.equals(NOM_ACTION)){
			fenetre.AfficherMasquer();
		}
		
	}
	
	
}
