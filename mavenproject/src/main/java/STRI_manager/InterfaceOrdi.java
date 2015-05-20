/**
 * 
 */
package STRI_manager;

/**
 * @author SONY
 *
 */
public class InterfaceOrdi {
	private Integer idInter;
	private String NomInter= new String();
	private Integer numPort;
	private String addrMAC= new String();
	private Boolean active; //pour tester si l'inetrface est up ou down
	private Integer idEq; //Identifiant de l'equipement auquel l'interface appartient
	private Integer idInterCon; //Identifiant de l'interface a laquelle elle est connectee
	private Integer niveau; //niveau de l'equipement, s'il est noeud ou pas et a quel niveaau
	/**
	 * 
	 */
	public InterfaceOrdi(Integer idInter,Integer numPort,String addrMAC,Integer idEq,Integer niveau) {
		// TODO Auto-generated constructor stub
		this.idInter=idInter;
		this.numPort=numPort;
		this.addrMAC=addrMAC;
		this.active=false;
		this.idEq=idEq;
		this.niveau=niveau;
	}
	/**
	 * @return the idInter
	 */
	public Integer getIdInter() {
		return idInter;
	}
	/**
	 * @param nomInter the nomInter to set
	 */
	public void setNomInter(String nomInter) {
		NomInter = nomInter;
	}
	/**
	 * @return the nomInter
	 */
	public String getNomInter() {
		return NomInter;
	}
	/**
	 * @param idInter the idInter to set
	 */
	public void setIdInter(Integer idInter) {
		this.idInter = idInter;
	}
	/**
	 * @return the numPort
	 */
	public Integer getNumPort() {
		return numPort;
	}
	/**
	 * @param numPort the numPort to set
	 */
	public void setNumPort(Integer numPort) {
		this.numPort = numPort;
	}
	/**
	 * @return the addrMAC
	 */
	public String getAddrMAC() {
		return addrMAC;
	}
	/**
	 * @param addrMAC the addrMAC to set
	 */
	public void setAddrMAC(String addrMAC) {
		this.addrMAC = addrMAC;
	}
	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}
	/**
	 * @return the idEq
	 */
	public Integer getIdEq() {
		return idEq;
	}
	/**
	 * @param idEq the idEq to set
	 */
	public void setIdEq(Integer idEq) {
		this.idEq = idEq;
	}
	/**
	 * @return the idInterCon
	 */
	public Integer getIdInterCon() {
		return idInterCon;
	}
	/**
	 * @param idInterCon the idInterCon to set
	 */
	public void setIdInterCon(Integer idInterCon) {
		this.idInterCon = idInterCon;
	}
	/**
	 * @return the niveau
	 */
	public Integer getNiveau() {
		return niveau;
	}
	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}
	public void voirDetailsInterfaces(InterfaceOrdi I){
		System.out.println("Details de l'interface "+I.getNomInter()+" : /n");
		System.out.println("Adresse MAC : "+I.getAddrMAC()+"/n");
		System.out.println("Identifiant"+I.getIdEq()+"/n");
		System.out.println("Numero de port " +I.getNumPort()+"/n");
		System.out.println("Statut : "+I.getActive());
		System.out.println("Appartient a l'equipement "+I.getIdEq()+"/n");
	}
	public void voirConnectivite(InterfaceOrdi I){ //pour savoir si l'interface est connecte ou non a une autre
			
	}
	public void voirStatut(InterfaceOrdi I){
		active=I.getActive();
		if (active==true){
			System.out.println("Activee");
		}
		else{
			System.out.println("Desactivee");
		}
	}
        
        
        public void connecter(InterfaceOrdi it){
            
        }
   }

   