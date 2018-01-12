package gestionprojet.modele;

import java.util.Date;

/*
 * Par Céline MERAND
 * Le 08/01/2018
 */

public class Personne {

	//Attributs
	private String lastName;
	private String firstName;
	private String function;
	
	//Constructeur
	public Personne(String lastName, String firstName, String function){
		this.lastName = lastName;
		this.firstName = firstName;
		this.function = function;		
	}	

	//-----------Accesseurs------------
	public String getLastName(){
		return this.lastName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getFunction(){
		return this.function;
	}
	
	//-------------Mutateurs--------------	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setFunction(String function){
		this.function = function;
	}
	
	//Méthodes
}
