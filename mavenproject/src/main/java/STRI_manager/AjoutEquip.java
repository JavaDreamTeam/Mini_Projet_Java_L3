package STRI_manager;
import java.net.*;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class AjoutEquip extends JFrame implements ActionListener 
{
	private JLabel lnom,ltypEq,lsalle,lbat,linter;
	private JTextField chnom,chtypeq,chsalle,chbat,chinterface;
	private JButton aj,qt;
	private JPanel pan1,pan2;
	InputStream is ;
    OutputStream os;
    ObjectOutputStream oos;
    ObjectInputStream ois;
	Connection con=null;
	PreparedStatement st=null;
    ResultSet rs=null;
   
	public AjoutEquip()
	{
		//Label des champ de saisie
		lnom= new JLabel("Nom:");
		ltypEq= new JLabel("Type:");
		linter= new JLabel("Interfaces");
		lsalle= new JLabel("Salle:");
		//champs de saisie en tant que tel pour les differents attributs de l'Equipement	
		chnom=new JTextField();
		chtypeq=new JTextField();
		chinterface = new JTextField();
		chsalle = new JTextField();
		//creation des boutons Ajouter et Quitter
		aj = new JButton("Enregistrer");
		qt = new JButton("Quitter");
		aj.addActionListener(this);
		qt.addActionListener(this);
		//ajout des champ de texte et de leurs label dans le premier panneau
		pan1=new JPanel();
		pan2=new JPanel();
		pan1.setLayout(new GridLayout(4,2));
		pan1.add(lnom);
		pan1.add(chnom);
		pan1.add(linter);
		pan1.add(chinterface);
		pan1.add(lsalle);
		pan1.add(chsalle);
		pan1.add(lbat);
		pan1.add(chbat);
		//ajout des boutons dans le deuxieme panneau
		pan2.add(aj);
		pan2.add(qt);
		add(pan1,BorderLayout.CENTER);
		add(pan2,BorderLayout.SOUTH);
		setTitle("Ajouter un Equipement");
		setSize(500,400);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent e)
	{
		
			try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionnaire","root","");

            }
            catch(Exception ex)
            {
                System.out.println("OUPS!!!! Erreur de connexion"+ex.getMessage());
            }
            Equipements_1 E; 
            try
			 {
		        	//Recuperer les valeurs des differents champs de saisie  
		    		String nom=chnom.getText();
		    		String typEq=chtypeq.getText();
		    		String interfaceEq=chinterface.getText();
		    		String salle=chsalle.getText();
		    		String bat=chbat.getText();
		    	    E = new Equipements_1();
		    	  //Ajout des Attributs de l'objet equipement a ajouter
		    		E.setNomEq(nom);
		    		E.setTypeEq(typEq);
		    		E.setInterfaceEq(interfaceEq);
		    		E.setSalle(salle);
		    		oos.writeObject(E);//mettre l'objet (l'equipement E) dans le flux d'objet de sortie
		    		oos.flush(); //Vider le le conteneur de flux d'objet de sortie
		    	 //Vider chaque champ de texte pour une quelconque nouvel ajout
		    		chnom.setText("");
		    		chtypeq.setText("");
		    		chsalle.setText("");
		    		chbat.setText("");
		    		
		    		st= con.prepareStatement("insert into equipements (nomEq,interface,type,nomSalle) values(?,?,?,?)");

		             st.setString(1,E.getNomEq());
		             st.setString(2,E.getTypeEq());
		             st.setString(3,E.getInterfaceEq());
		             st.setString(4,E.getNomSal());
		             st.executeUpdate();
		    }
			 catch(Exception ex)
			 {
				 System.out.println(ex.getMessage());
			 }
		}
		
		
	
	public static void main(String args[])
	{
		new AjoutEquip();
	 
     }
}
