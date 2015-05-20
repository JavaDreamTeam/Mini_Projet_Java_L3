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
	/**
	 * 
	 */
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
	public void voirDetailsEq(Equipements E){
		System.out.println("Details de l'equipement "+E.getNomEq()+" : /n");
		System.out.println("Identifiant"+E.getIdEq()+"/n");
		System.out.println("Type d'equipement " +E.getTypeEq()+"/n");
	}
	
	public void voirListInter(){ //pour voir l'ensemble des interfaces de l'equipement
		Iterator<InterfaceOrdi> itr = listInter.listIterator();//utilisation de ListIterator pour parcourir la liste des interfaces de l'equipements
		while (itr.hasNext()){
		System.out.println(itr.hasNext()+"/n");
		}
	}
	public void supprimerInterface(Integer Id){
		 Iterator<InterfaceOrdi> itr = listInter.listIterator();//utilisation de ListIterator pour parcourir la liste des interfaces de l'equipements
		 while (itr.hasNext()){
			 if (itr.next().getIdInter()==Id){
				 listInter.remove(itr.next());
				 }
			 else {
				 System.out.println("L'objet que vous voulez supprimer n'exite pas");
			 }
		 }
		
	   }
	public void ajouterInterface(InterfaceOrdi I){
		listInter.add(I);
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
