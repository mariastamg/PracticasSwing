import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Peliculas {

	public static void main(String[] args) {
		Frame marco=new Frame();
		marco.setTitle("Peliculas");
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Frame extends JFrame{
	
	public Frame() {
		setBounds(300, 200, 500, 300);
		Contenedor panel=new Contenedor();
		add(panel);
		
	}
	

}

class Contenedor extends JPanel{
	
	JTextField tituloIntroducido;
	
	public Contenedor() {
		Accion accion=new Accion();
		setLayout(new GridLayout(3, 2, 50, 50));
		JLabel titulo=new JLabel("Escribe el titulo de una pelicula");
		add(titulo);
		JLabel listado=new JLabel("Peliculas");
		add(listado);
		tituloIntroducido=new JTextField(20);
		add(tituloIntroducido);
		peliculas=new JComboBox();
		add(peliculas);
		JButton anadir=new JButton("Añadir");
		add(anadir);
		anadir.addActionListener(accion);
		
	}
	
	private JComboBox peliculas;
	
	class Accion implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			String tituloPelicula=tituloIntroducido.getText();
			//añadir al combobox
			peliculas.addItem(tituloPelicula);
			tituloIntroducido.setText("");
		
			
		}
		
	}
	
}

class Accion implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
	
		
	}
	
}

