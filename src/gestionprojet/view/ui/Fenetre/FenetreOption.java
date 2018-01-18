package gestionprojet.view.ui.Fenetre;

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

import gestionprojet.controleur.actions.ActionAnnulerProjet;
import gestionprojet.controleur.actions.ActionCreationP;
import gestionprojet.controleur.actions.ActionDerouler;

public abstract class FenetreOption extends JDialog {

//-------------Constantes-------------
	public static final String DEFAULT_TITLE = "Option";
	public static final ModalityType TYPE_MODAL = ModalityType.APPLICATION_MODAL;

	private JPanel panneauHaut;
	private JPanel panneauBas;
	private JPanel panneauBoutousValidation;
	private JButton boutonValider;
	private JButton boutonAnnule;
	private JButton boutonPlus;
	

	
	public boolean developpe = false;
			
			
	public FenetreOption(){
		super();
		
		this.initFenetre();
		this.initPanneauHaut();
		this.initPanneauPlus();
		this.initPanneauBas();
		this.initPanneauBoutonValidation();
		
		this.pack();
	}

	
	public JPanel getPanneauHaut() {
		return panneauHaut;
	}

	public void setPanneauHaut(JPanel panneauHaut) {
		this.panneauHaut = panneauHaut;
		this.pack();
	}

	public JPanel getPanneauBas() {
		return panneauBas;
	}

	public void setPanneauBas(JPanel panneauBas) {
		this.panneauBas = panneauBas;
		this.pack();
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

	private void initFenetre(){
		this.setTitle(DEFAULT_TITLE);
		this.setLocationRelativeTo(null);
		this.setModalityType(TYPE_MODAL);
		this.setResizable(false);
		this.getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.PAGE_AXIS));
		this.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	}
	private void initPanneauPlus() {
		
		JPanel panneauPlus = new JPanel();
		panneauPlus.setLayout(new BoxLayout(panneauPlus, BoxLayout.LINE_AXIS));
		boutonPlus = new JButton(new ActionDerouler(this));
		boutonPlus.setText("Plus");
		panneauPlus.add(Box.createRigidArea(new Dimension(10, 0)));
		panneauPlus.add(boutonPlus);
		panneauPlus.add(Box.createHorizontalGlue());
		this.getContentPane().add(panneauPlus);
		panneauPlus.setVisible(true);
	}
	
	private void initPanneauBoutonValidation(){
		this.setPanneauBoutousValidation(new JPanel());
		this.getPanneauBoutousValidation().setBackground(new Color(150,200,20));
		this.getPanneauBoutousValidation().setLayout(new BoxLayout(this.getPanneauBoutousValidation(), BoxLayout.LINE_AXIS));
		this.getPanneauBoutousValidation().setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		
		this.setBoutonValider(new JButton("Valider"));
		this.setBoutonAnnule(new JButton("Annuler"));
	
		this.getPanneauBoutousValidation().add(this.getBoutonValider());
		this.getPanneauBoutousValidation().add(Box.createRigidArea(new Dimension(10, 0)));
		this.getPanneauBoutousValidation().add(this.getBoutonAnnule());
		this.getPanneauBoutousValidation().add(Box.createHorizontalGlue());
		this.getContentPane().add(this.getPanneauBoutousValidation());
		
		this.getPanneauBoutousValidation().setVisible(true);
	}
	
	abstract void initPanneauHaut();
	
	abstract void initPanneauBas();
	
	
	public void afficherMasquer(){
		this.getPanneauBas().setVisible(!this.isDeveloppe());
		this.setDeveloppe(!this.isDeveloppe());
		if (this.isDeveloppe()){
			this.boutonPlus.setText("Moins");
		}else{
			this.boutonPlus.setText("Plus");
		}
		this.pack();
	}
}
