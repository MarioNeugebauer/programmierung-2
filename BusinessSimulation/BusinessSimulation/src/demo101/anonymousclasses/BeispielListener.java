package demo101.anonymousclasses;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class BeispielListener extends JFrame {
	JButton button;
    JLabel label;
    JPanel panel;
 
    public BeispielListener(){
        this.setTitle("ActionListener Beispiel");
        this.setSize(400, 100);
        panel = new JPanel();
 
        label = new JLabel();

        button = new JButton("Button");

        ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
		        if(ae.getSource() == button){
		            label.setText(("Button wurde betätigt"));
		        }
			}
		};
 
        //Buttons werden dem Listener zugeordnet
        button.addActionListener(listener);
 
        //Buttons werden dem JPanel hinzugefügt
        panel.add(button);
 
        //JLabel wird dem Panel hinzugefügt
        panel.add(label);
        this.add(panel);
    }
 
    public static void main(String[] args)
    {
        // Ein neues Objekt der Klasse BeispielListener wird erzeugt
        // und sichtbar gemacht
        BeispielListener bl = new BeispielListener();
        bl.setVisible(true);
    }
}