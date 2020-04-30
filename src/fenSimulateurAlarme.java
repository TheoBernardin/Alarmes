import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class fenSimulateurAlarme extends JFrame {
	  private JPanel container = new JPanel();
	  private Box left = Box.createVerticalBox();
      
	  private JLabel labelBat = new JLabel("Batiment :");
	  private JComboBox comboBat = new JComboBox();
	  
	  private JLabel labelType = new JLabel("Type d'alarme :") ;
	  private JComboBox comboType = new JComboBox();
	  
	  private JLabel labelNiveau = new JLabel("Niveau d'importance :") ;
	  private JComboBox comboNiveau = new JComboBox();
	  
	  private JButton bouton = new JButton("Valider");
	  
	  public fenSimulateurAlarme(){
		//fenetre
	    this.setTitle("Simulateur alarme");
	    this.setSize(800, 500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    //batiment
	    comboBat.setPreferredSize(new Dimension(100, 20));
	    String[] tabBat = {"Option 1", "Option 2", "Option 3", "Option 4"}; //TODO : recuperer liste batiments
	    comboBat = new JComboBox(tabBat);
	    JPanel batiment = new JPanel();
	    batiment.add(labelBat);
	    batiment.add(comboBat);
	    
	    //type alarme
	    comboType.setPreferredSize(new Dimension(100, 20));
	    String[] tabType = {"Incendie", "Gaz", "Radiation"};
	    comboType = new JComboBox(tabType);
	    JPanel type = new JPanel();
	    type.add(labelType);
	    type.add(comboType);
	    
	    //Niveau importance
	    comboNiveau.setPreferredSize(new Dimension(100, 20));
	    String[] tabNiveau = {"1", "2", "3"};
	    comboNiveau = new JComboBox(tabNiveau);
	    JPanel niveau = new JPanel();
	    niveau.add(labelNiveau);
	    niveau.add(comboNiveau);
	    
	    //bouton valider
	    JPanel panBout = new JPanel();
	    panBout.add(bouton);
	    
	    //affichage
	    left.add(batiment);
	    left.add(type);
	    left.add(niveau);
	    left.add(panBout);
	    container.add(left, BorderLayout.CENTER);
	    this.setContentPane(container);
	    this.setVisible(true);            
	  }   

}