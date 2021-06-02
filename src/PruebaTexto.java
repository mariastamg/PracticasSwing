

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		MarcoTexto miMarco = new MarcoTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//mimarco.setVisible(true);
	}
}

class MarcoTexto extends JFrame {
	public MarcoTexto() {
		setBounds(600, 300, 600, 350);
		LaminaTexto miLamina = new LaminaTexto();
		add(miLamina);
		setVisible(true);

	}
}

class LaminaTexto extends JPanel {
	
	public LaminaTexto() {
		setLayout(new BorderLayout());
		JPanel miLamina2=new JPanel();
		miLamina2.setLayout(new FlowLayout());
		resultado=new JLabel("",JLabel.CENTER);
		JLabel texto1=new JLabel("Email: ");
		miLamina2.add(texto1);
		campo1=new JTextField(20);
		miLamina2.add(campo1);
		add(resultado,BorderLayout.CENTER);
		//.trim() metodo que elimina los espacios 
		JButton miBoton=new JButton("Comprobar");
		DameTexto mievento=new DameTexto();
		miBoton.addActionListener(mievento);
		miLamina2.add(miBoton);
		add(miLamina2,BorderLayout.NORTH);
		
	}
 //Creamos una clase interna para el evento DameTexto
	private class DameTexto implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			int correcto=0;
			/**Vamos a validad una direccion de correo, si contiene 0 @ sera incorrecta, si tiene una correcta y si tiene mas incorrecta*/
			String email=campo1.getText().trim();
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					correcto++;
				}
			}
			
			if(correcto!=1) {
				resultado.setText("Incorrecto");
			}else {
				resultado.setText("Correcto");
			}
			
			System.out.println(campo1.getText().trim());
			
			
		}
		
		}
	private JTextField campo1;
	private JLabel resultado;
}
