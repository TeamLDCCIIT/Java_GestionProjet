package gestionprojet.modele;

import java.util.Date;

/*
 * Par Céline MERAND
 * Le 08/01/2018
 */

public class Personne {

	//Attributs
	public String lastName;
	public String firstName;
	public String function;
	
	//Constructeur
	public Personne(String lastName, String firstName, String function){
		this.lastName = lastName;
		this.firstName = firstName;
		this.function = function;		
	}	

	//Accesseurs & Mutateurs
	public String lastName(){
		return this.lastName;
	}
	
	public String firstName(){
		return this.firstName;
	}
	
	public String function(){
		return this.function;
	}
	
	//Méthodes
}
