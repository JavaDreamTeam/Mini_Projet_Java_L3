/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRI_manager;
import java.sql.* ;
 import java.io.* ;

 import com.mysql.jdbc.driver.* ;

 public  class TestDB {

    public  static  void main (String[] args) {
       try {
          // chargement de la classe par son nom
         Class c = Class.forName("com.mysql.jdbc.Driver") ;
         Driver pilote = (Driver)c.newInstance() ;
          // enregistrement du pilote auprès du DriverManager
         DriverManager.registerDriver(pilote);
          // Protocole de connexion
         String protocole =  "jdbc:mysql:" ;
          // Adresse IP de l’hôte de la base et port
         //String ip =  "mysql.hostinger.fr" ;  // dépend du contexte
         String ip =  "127.0.0.1" ;  // dépend du contexte
         String port =  "3306" ;  // port MySQL par défaut
          // Nom de la base ;
         //String nomBase =  "u363596812_java" ;  // dépend du contexte

         String nomBase =  "gestionnaire" ;  // dépend du contexte
          // Chaîne de connexion
         String conString = protocole +  "//" + ip +  ":" + port +  "/" + nomBase ;
          // Identifiants de connexion et mot de passe
          // String nomConnexion =  "u363596812_stri" ;  // dépend du contexte

         String nomConnexion =  "root" ;  // dépend du contexte
        // String motDePasse =  "teamjava" ;  // dépend du contexte

         String motDePasse =  "" ;  // dépend du contexte
          // Connexion
         Connection con = DriverManager.getConnection(
            conString, nomConnexion, motDePasse) ;

          // Envoi d’un requête générique
         String sql =  "select * from salles" ;
         Statement smt = con.createStatement() ;
         ResultSet rs = smt.executeQuery(sql) ;
          while (rs.next()) {
            System.out.println(rs.getString("nom")) ;
         }
      }  catch (Exception e) {
          // gestion des exceptions
          System.out.println("erreur");
      }
   }
}