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
	/**
	 * Constructeur
	 * @param lastName String
	 * @param firstName String
	 * @param function String
	 */
	public Personne(String lastName, String firstName, String function){
		this.lastName = lastName;
		this.firstName = firstName;
		this.function = function;		
	}	

	//-----------Accesseurs------------
	/**
	 * Getter
	 * @return lastName String
	 */
	public String getLastName(){
		return this.lastName;
	}
	/**
	 * Getter
	 * @return firstName String
	 */
	public String getFirstName(){
		return this.firstName;
	}
	/**
	 * Getter
	 * @return function String
	 */
	public String getFunction(){
		return this.function;
	}
	
	//-------------Mutateurs--------------	
	/**
	 * Setter
	 * @param lastName String
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	/**
	 * Setter
	 * @param firstName String
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	/**
	 * Setter
	 * @param function String
	 */
	public void setFunction(String function){
		this.function = function;
	}
	
	//Méthodes
}
