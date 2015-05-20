/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parc;
import java.util.*;


/**
 *
 * @author Boubacar
 */
public class Local{
	
	private  Integer idLocal;
	private String nom;
	private ArrayList<Salle> salles=new ArrayList<Salle>();
	

	/**
	 * @param idLocal
	 * @param nom
	 * @param salle
	 */
	public Local(Integer idLocal, String nom) {
		super();
		this.idLocal = idLocal;
		this.nom = nom;
		
	}

	
	/**
	 * @return the idLocal
	 */
	public Integer getIdLocal() {
		return idLocal;
	}

	/**
	 * @param idLocal the idLocal to set
	 */
	public void setIdLocal(Integer idLocal) {
		this.idLocal = idLocal;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the salle
	 */
	public ArrayList<Salle> getSalle() {
		return salles;
	}

	/**
	 * @param salle the salle to set
	 */
	public void setSalles(ArrayList<Salle> salle) {
		this.salles = salle;
	}

	/**
	 * @param s the salle to add
	 */
	public void ajoutSalle(Salle s){
		salles.add(s);
	}
	
	/**
	 * @param salle the salle to remove
	 */
	public void supprimerSalle(int idSalle){
             
                
		//salles.remove(idSalle);
	}
	

}
