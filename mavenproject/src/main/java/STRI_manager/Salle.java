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
public class Salle {

	private  Integer idSalle;
	private String nom;
	private Integer batiment;
	private ArrayList<Equipement> equipement=new ArrayList<Equipement>();
	
	/**
	 * @param idSalle
	 * @param nom
	 * @param batiment
	 */
	public Salle(Integer idSalle, String nom, Integer batiment) {
		super();
		this.idSalle = idSalle;
		this.nom = nom;
		this.batiment = batiment;
	}
	
	/**
	 * @return the idSalle
	 */
	public Integer getIdSalle() {
		return idSalle;
	}
	/**
	 * @param idSalle the idSalle to set
	 */
	public void setIdSalle(Integer idSalle) {
		this.idSalle = idSalle;
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
	 * @return the batiment
	 */
	public Integer getBatiment() {
		return batiment;
	}
	/**
	 * @param batiment the batiment to set
	 */
	public void setBatiment(Integer batiment) {
		this.batiment = batiment;
	}

	/**
	 * @param equipement the equipement to add
	 */
	public void ajouterEquipement(Equipement s){
		equipement.add(s);
	}
	
	/**
	 * @param equipement the equipement to remove
	 */
	public void supprimerEquipement(Integer  s){
		/*
                    on trouve l'equipement à supprimer 
                */
	}
	
}
