package gestionprojet.modele;

/*
 * Par Céline MERAND
 * Le 12/01/2018
 */

public class Tache {
	//Attributs
	private 
	Personne responsible;
			
	//Constructeur
	/**
	 * Constructeur
	 * @param responsible Personne
	 */
	public Tache(Personne responsible) {	
		this.responsible = responsible;
	}
			
	//Accesseurs & Mutateurs
	/**
	 * Getter
	 * @return responsible Personne
	 */
	public Personne getResponsible(){
		return this.responsible;
	}
	/**
	 * Setter
	 * @param responsible Personne
	 */
	public void setResponsible(Personne responsible){
		this.responsible = responsible;
	}
	
	//Méthodes
	

}
