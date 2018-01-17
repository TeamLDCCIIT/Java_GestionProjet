package gestionprojet.view.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gestionprojet.controleur.actions.ActionDerouler;

public class FenetreOption extends JDialog {

//-------------Constantes-------------
	public static final String DEFAULT_TITLE = "Option";
	public static final ModalityType TYPE_MODAL = ModalityType.APPLICATION_MODAL;
	
	private JPanel panneauBasic =new JPanel() ;
	private JPanel panneauModulaire = new JPanel();
	private JPanel panneauBoutousValidation;
	private JButton boutonValider;
	private JButton boutonAnnule;
	private JButton boutonPlus;
	public boolean developpe = false;
			
			
	public FenetreOption(){
		super();
		this.initFenetre(null);
	}
	
	public FenetreOption(JFrame frame){
		super(frame,DEFAULT_TITLE,true);
		this.initFenetre(frame);
	}
	
	public JPanel getPanneauBasic() {
		return panneauBasic;
	}

	public void setPanneauBasic(JPanel panneauBasic) {
		this.panneauBasic = panneauBasic;
	}

	public JPanel getPanneauModulaire() {
		return panneauModulaire;
	}

	public void setPanneauModulaire(JPanel panneauModulaire) {
		this.panneauModulaire = panneauModulaire;
	}

	public JPanel getPanneauBoutousValidation() {
		return panneauBoutousValidation;
	}

	public void setPanneauBoutousValidation(JPanel panneauBoutousValidation) {
		this.panneauBoutousValidation = panneauBoutousValidation;
	}

	public boolean isDeveloppe() {
		return developpe;
	}

	public void setDeveloppe(boolean developpe) {
		this.developpe = developpe;
	}

	public JButton getBoutonValider() {
		return boutonValider;
	}

	public void setBoutonValider(JButton boutonValider) {
		this.boutonValider = boutonValider;
	}

	public JButton getBoutonAnnule() {
		return boutonAnnule;
	}

	public void setBoutonAnnule(JButton boutonAnnule) {
		this.boutonAnnule = boutonAnnule;
	}

	private void initFenetre(JFrame frame){
		this.setTitle(DEFAULT_TITLE);
		this.setLocationRelativeTo(frame);
		this.setModalityType(TYPE_MODAL);
		this.getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.PAGE_AXIS));
		this.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.initComposant();
		this.pack();
	}
	private void initComposant() {
		
		this.getContentPane().add(this.getPanneauBasic());
		
		JPanel panneauPlus = new JPanel();
		panneauPlus.setLayout(new BoxLayout(panneauPlus, BoxLayout.LINE_AXIS));
		boutonPlus = new JButton(new ActionDerouler(this));
		boutonPlus.setText("plus");
		panneauPlus.add(Box.createRigidArea(new Dimension(10, 0)));
		panneauPlus.add(boutonPlus);
		panneauPlus.add(Box.createHorizontalGlue());
		this.getContentPane().add(panneauPlus);
		this.getPanneauModulaire().setBackground(new Color(150,200,250));
		this.getContentPane().add(this.getPanneauModulaire());
		
		this.setPanneauBoutousValidation(new JPanel());
		this.getPanneauBoutousValidation().setLayout(new BoxLayout(this.getPanneauBoutousValidation(), BoxLayout.LINE_AXIS));
		this.getPanneauBoutousValidation().setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		
		this.setBoutonValider(new JButton("Valider"));
		this.setBoutonAnnule(new JButton("Annuler"));
	
		this.getPanneauBoutousValidation().add(this.getBoutonValider());
		this.getPanneauBoutousValidation().add(Box.createRigidArea(new Dimension(10, 0)));
		this.getPanneauBoutousValidation().add(this.getBoutonAnnule());
		this.getPanneauBoutousValidation().add(Box.createHorizontalGlue());
		this.getContentPane().add(this.getPanneauBoutousValidation());
		
		
		this.getPanneauBasic().setVisible(true);
		this.getPanneauModulaire().setVisible(false);
		panneauPlus.setVisible(true);
		this.getPanneauBoutousValidation().setVisible(true);
		
	}
	
	public void afficherMasquer(){
		this.getPanneauModulaire().setVisible(!developpe);
		this.setDeveloppe(!developpe);
		this.pack();
	}
}
