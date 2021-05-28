import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Saludador {
	
	private String nombre;

	public static void main(String[] args) {
	
		MiFrame marco=new MiFrame();
		marco.setTitle("Saludador");
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
			
		}
class MiFrame extends JFrame{
	
	public MiFrame() {
		setBounds(300, 200, 450, 300);
		MiLamina lamina1=new MiLamina();
		add(lamina1);
		
	}

}

class MiLamina extends JPanel{
	
	JTextField campoTexto;
	
	public MiLamina() {
		//this.setLayout(new FlowLayout());
		JLabel texto=new JLabel("Escriba nombre para saludar");
		add(texto);
		campoTexto=new JTextField(20);
		add(campoTexto);
		JButton miBoton=new JButton("¡Saludar!");
		EventoRaton clickBoton=new EventoRaton();
		miBoton.addActionListener(clickBoton);
		add(miBoton);
		
		
		
		
		
	}
	class EventoRaton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String nombre=campoTexto.getText();
			//Metodo estatico por eso llevan delante el nombre de la clase
		JOptionPane.showMessageDialog(MiLamina.this/*El componente padre es la clase(padre) en la que me encuentro*/, "¡Hola "+nombre+"!");
		//si solo pongo this hago referencia a la clase privada	
		}
		
	}
	
}



/*class Mensaje extends JOptionPane{
	
	public Mensaje() {
		String nombre = "";
		JOptionPane.showInputDialog("¡Hola "+nombre+"!");
	}
}*/

