/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRI_manager;
import java.util.*;
/**
 * 
 */

/**
 * @author SONY
 *
 */
public class Equipements {
	private Integer idEq;
	private String nomEq= new String();;
	private String typeEq= new String();
	private Integer idSal;
	private ArrayList<InterfaceOrdi> listInter= new ArrayList<InterfaceOrdi>();
	
        
        
	public Equipements(Integer idEq, String nomEq, String typeEq, Integer idSal) {
		this.idEq=idEq;
		this.idSal=idSal;
		this.typeEq=typeEq;
		this.nomEq=nomEq;
	}
	/**
	 * @return the idEq
	 */
	public Integer getIdEq() {
		return idEq;
	}
	/**
	 * @return the nomEq
	 */
	public String getNomEq() {
		return nomEq;
	}
	/**
	 * @return the typeEq
	 */
	public String getTypeEq() {
		return typeEq;
	}
	/**
	 * @return the idSal
	 */
	public Integer getIdSal() {
		return idSal;
	}
	/**
	 * @param idEq the idEq to set
	 */
	public void setIdEq(Integer idEq) {
		this.idEq = idEq;
	}
	/**
	 * @param nomEq the nomEq to set
	 */
	public void setNomEq(String nomEq) {
		this.nomEq = nomEq;
	}
	/**
	 * @param typeEq the typeEq to set
	 */
	public void setTypeEq(String typeEq) {
		this.typeEq = typeEq;
	}
	/**
	 * @param idSal the idSal to set
	 */
	public void setIdSal(Integer idSal) {
		this.idSal = idSal;
	}
	public void supprimerInterface(InterfaceOrdi I){
		listInter.remove(I);
	   }
	public void ajouterInterface(InterfaceOrdi I){
		listInter.add(I);
	   }
	public void desactiverInterface(Integer idInter){
		   
	   }
}

