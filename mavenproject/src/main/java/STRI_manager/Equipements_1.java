package STRI_manager;
import java.util.*;

public class Equipements_1 {

	private String nomEq= new String();;
	private String typeEq= new String();
	private String salle= new String();
	private String interfaceEq = new String();;
	
	/**
	 * @param interfaceEq the interfaceEq to set
	 */
	public void setInterfaceEq(String interfaceEq) {
		this.interfaceEq = interfaceEq;
	}
	/**
	 * @return the salle
	 */
	public String getSalle() {
		return salle;
	}

	/**
	 * @return the interfaceEq
	 */
	public String getInterfaceEq() {
		return interfaceEq;
	}
	/**
	 * 
	 */
	public Equipements() {
		this.nomEq=nomEq;
		this.typeEq=typeEq;
		this.salle=salle;
		this.interfaceEq=interfaceEq;
	
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
	public String getNomSal() {
		return salle;
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
	public void setSalle(String Salle) {
		this.salle = salle;
	}
	public void voirDetailsEq(Equipements E){
		System.out.println("Details de l'equipement "+E.getNomEq()+" : /n");
		System.out.println("Interface"+E.getInterfaceEq()+"/n");
		System.out.println("Type d'equipement " +E.getTypeEq()+"/n");
		System.out.println("Salle " +E.getNomSal()+"/n");
	}
	
	public void desactiverInterface(Integer Id){
        Iterator<InterfaceOrdi> itr = listInter.listIterator();//utilisation de ListIterator pour parcourir la liste des interfaces de l'equipements
		while (itr.hasNext()){
			 if (itr.next().getIdInter()==Id){
				 if (itr.next().getActive()==true){
					 itr.next().setActive(false);
				 }
				 else {
					 System.out.println("L'interface est deja desactivee"); 
				 } }
			else {
				 System.out.println("L'interface que vous voulez desactiver n'exite pas");
			}
				 }
	
		
	   }
}
