package gestionprojet.controleur.actions;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class ActionOuvrir extends AbstractAction{
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Ouvrir";
	
	public ActionOuvrir(){
		super(NOM_ACTION);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		if(action.equals(NOM_ACTION)){
			this.ouvrirCalendrier();
		}
		
	}
	
	public void ouvrirCalendrier(){
		
		
	}

}
