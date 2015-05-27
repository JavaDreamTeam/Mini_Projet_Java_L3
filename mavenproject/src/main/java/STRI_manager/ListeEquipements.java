package test;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;


public class ListeEquipements extends JFrame implements ActionListener
{
	private JTable table;
	private Vector <String> colonnes ;
	private Vector <String> tuple;
	private Vector <Vector>  lignes;
	private JPanel panneau1,panneau2;
	private JButton qt;
	
	public ListeEquipements(ArrayList <Equipements> liste)
	{
		panneau1=new JPanel();
		panneau2=new JPanel();
		qt = new JButton("Quitter");
		colonnes = new Vector<String>();
		colonnes.add("Nom");
		colonnes.add("Interface");
		colonnes.add("Type");
		colonnes.add("Salle");
		
		lignes = new Vector <Vector>();
		
		for (int i=0;i<liste.size();i++)
		{
			tuple= new Vector <String>();
			Equipements E = liste.get(i);
			tuple.add(E.getNomEq());
			tuple.add(E.getInterfaceEq());
			tuple.add(E.getTypeEq());
			tuple.add(E.getSalle());
			lignes.add(tuple);
		}
		
		  setTitle("Liste des Equipements de cette salle");
		  setSize(550,500);
		  qt.addActionListener(this); 
		  table = new JTable(lignes,colonnes);
		  panneau1.add(new JScrollPane(table));
		  panneau2.add(qt);
		  add(panneau1,BorderLayout.NORTH);
		  add(panneau2,BorderLayout.SOUTH);
		  setVisible(true);
	}
    public void actionPerformed(ActionEvent e)
    {
    	if (e.getSource()==qt)
    	{
    		dispose();
    		new Gestionnaire();
    	}
    }
    
    else
		
		if (e.getSource()==qt)
		{
			try
			{
				oos.writeObject("lister");	
		         oos.flush();
		         ArrayList<Personne> liste=(ArrayList<Personne>)ois.readObject();
		         new ListeClients(liste);
		        
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	
}
