/**
 * 
 */
package test;

import java.util.ArrayList;

/**
 * @author SONY
 *
 */
public class Salles {
	private  Integer idSalle;
	private String nom = new String();
	private String batiment = new String();
	private ArrayList<Equipements> ListEq;
	/**
	 * 
	 */
	public Salles(Integer idSalle, String nom, String batiment) {
		super();
		this.idSalle = idSalle;
		this.nom = nom;
		this.batiment = batiment;
		ListEq=new ArrayList<Equipements>();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idSalle the idSalle to set
	 */
	public void setIdSalle(Integer idSalle) {
		this.idSalle = idSalle;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @param batiment the batiment to set
	 */
	public void setBatiment(String batiment) {
		this.batiment = batiment;
	}
	/**
	 * @param listEq the listEq to set
	 */
	public void setListEq(ArrayList<Equipements> listEq) {
		ListEq = listEq;
	}
	/**
	 * @return the idSalle
	 */
	public Integer getIdSalle() {
		return idSalle;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the batiment
	 */
	public String getBatiment() {
		return batiment;
	}
	/**
	 * @return the listEq
	 */
	public ArrayList<Equipements> getListEq() {
		return ListEq;
	}

}
