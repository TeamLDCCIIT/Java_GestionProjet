package gestionprojet.modele;
import java.util.ArrayList;

/*
 * Par Céline MERAND
 * Le 08/01/2018
 */

public class Projet {

	//Attributs
	private String name;
	private ArrayList<Lot> lotList = new ArrayList<Lot>();
	private Calendrier calendar;
	private ArrayList<Personne> personList = new ArrayList<Personne>();
	
	//Constructeur
	/**
	 * Constructeur
	 * @param name String
	 * @param calendar Calendrier
	 */
	public Projet(String name, Calendrier calendar) {
		this.name = name;
		this.calendar = calendar;		
	}
	
	//----------------------Accesseurs--------------------------
	/* 
	 *Non possibilité de modifier le nom ou les dates du projet 
	 *--> faciliter le projet au départ 
	 */
	/**
	 * Getter
	 * @return name String
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * Getter
	 * @return lotList ArrayList<Lot>
	 */
	public ArrayList<Lot> getLotList(){
		return this.lotList;
	}
	/**
	 * Getter
	 * @return calendar Calendrier
	 */
	public Calendrier getCalendar(){
		return this.calendar;
	}
	/**
	 * Getter
	 * @return lotResponsible ArrayList<Personne>
	 */
	public ArrayList<Personne> getLotResponsible(){
		return this.personList;
	}
	
	//------------------------Mutateurs--------------------------	
	/**
	 * Setter
	 * @param name String
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * Setter
	 * @param lotList ArrayList<Lot>
	 */
	public void setLotList(ArrayList<Lot> lotList){
		this.lotList = lotList;
	}
	/**
	 * Setter
	 * @param calendar Calendrier
	 */
	public void setCalendar(Calendrier calendar){
		this.calendar = calendar;
	}
	/**
	 * Setter
	 * @param lotResponsible ArrayList<Personne>
	 */
	public void setLotResponsible(ArrayList<Personne> lotResponsible){
		this.personList = lotResponsible;
	}
	
	//Méthodes
	/**
	 * Met à jour une liste de lots
	 * @param liste ArrayList<Lot>
	 */
	public void updateLotList(ArrayList<Lot> liste){
		for(int i = 0; i< liste.size()-1; i++){
			for (int j = 0;j<liste.size()-1; j++){
				if(liste.get(j).getStartDate().after(liste.get(j+1).getStartDate())) {
					Lot temp = liste.get(j);
					liste.set(j, liste.get(j+1));
					liste.set(j+1, temp);
				}
				if (liste.get(j).getStartDate().equals(liste.get(j+1).getStartDate()) 
						&& liste.get(j).getEndDate().after(liste.get(j+1).getEndDate())){
					Lot temp = liste.get(j);
					liste.set(j, liste.get(j+1));
					liste.set(j+1, temp);
				}
			}
			
		}
	}
}
