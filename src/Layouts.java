

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts {

	public static void main(String[] args) {
		Marco_layout miMarco = new Marco_layout();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_layout extends JFrame {

	public Marco_layout() {
		setTitle("Prueba acciones");
		setBounds(600, 350, 600, 300);
		Panel_layout lamina = new Panel_layout();
		/** Creamos la disposicion */
		// FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
		// lamina.setLayout(disposicion);
		// lamina.setLayout(new FlowLayout(FlowLayout.LEFT));
		/** Vamos a crear la disposicion modificando la sepacion entre los elementos */
		// FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT, 30, 30);
		// lamina.setLayout(disposicion);
		Panel_layout2 lamina2=new Panel_layout2();
		add(lamina,BorderLayout.NORTH);
		add(lamina2,BorderLayout.SOUTH);
	}

}

class Panel_layout extends JPanel {

	public Panel_layout() {
		/** Es mas sencillo crear la disposicion donde van a ir los elementos */
		/**
		 * En un contenedor solo puede haber una disposicion, si quieres diferentes
		 * disposiciones tienes que crear diferentes/contenedores laminas y a su vez
		 * elegir la disposicion de esas laminas
		 */
		// setLayout(new FlowLayout(FlowLayout.CENT ER,40,50));
		setLayout(new FlowLayout());

		add(new JButton("Amarillo"), BorderLayout.NORTH);
		add(new JButton("Rojo"), BorderLayout.SOUTH);
		
	}

}

/**
 * Creamos otra clase JPanel con otra lamina para que pueda tener una
 * disposición distinta a la anterior
 */
class Panel_layout2 extends JPanel {
	
	public Panel_layout2() {
		setLayout(new BorderLayout(10,10));
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER);
		
	}

}
