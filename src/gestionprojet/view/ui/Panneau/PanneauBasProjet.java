package gestionprojet.view.ui.Panneau;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gestionprojet.modele.Lot;
import gestionprojet.modele.Personne;

public class PanneauBasProjet extends JPanel {
	 
	private JTextField nom;
	private JTextField prenom;
	private JTextField fonction;
	private  ArrayList<Personne> personne = new ArrayList<Personne>();
	
	public PanneauBasProjet(){
		super();
		this.afficheListe();
		this.initBoutonAjouter();
	}

	public void setPersonne(ArrayList<Personne> personne) {
		this.personne = personne;
	}

	public ArrayList<Personne> getPersonne() {
		return personne;
	}

	public JTextField getNom() {
		return nom;
	}

	public JTextField getPrenom() {
		return prenom;
	}

	public JTextField getFonction() {
		return fonction;
	}

	private void afficheListe() {
		// TODO Auto-generated method stub
		JPanel panneauList = new JPanel();
		panneauList.setBackground(new Color(255,0,0));
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(panneauList);
	}

	private void initBoutonAjouter() {
		JPanel panneauChamp = new JPanel();
		panneauChamp.setBackground(new Color(150,200,10));
		panneauChamp.setLayout(new BoxLayout(panneauChamp, BoxLayout.LINE_AXIS));
		panneauChamp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panneauChamp.add(Box.createHorizontalGlue());
		panneauChamp.add(new JLabel("Nom : "));
		panneauChamp.add(Box.createRigidArea(new Dimension(5, 0)));
		this.nom = new JTextField(5);
		panneauChamp.add(nom);
		
		panneauChamp.add(Box.createRigidArea(new Dimension(10, 0)));
		panneauChamp.add(new JLabel("Prenom : "));
		panneauChamp.add(Box.createRigidArea(new Dimension(5, 0)));
		this.prenom = new JTextField(5);
		panneauChamp.add(prenom);
		
		panneauChamp.add(Box.createRigidArea(new Dimension(10, 0)));
		panneauChamp.add(new JLabel("Fonction : "));
		panneauChamp.add(Box.createRigidArea(new Dimension(5, 0)));
		this.fonction = new JTextField(10);
		panneauChamp.add(fonction);
		
		panneauChamp.add(Box.createRigidArea(new Dimension(20, 0)));
		panneauChamp.add(new JButton("Ajouter"));
		
		this.add(panneauChamp);
		this.setBackground(new Color(0,0,0));
		
		
	}
	
}
