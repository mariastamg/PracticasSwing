

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaAcciones {

	public static void main(String[] args) {
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoAccion extends JFrame {
	public MarcoAccion() {
		setTitle("Prueba Acciones");
		setBounds(600, 350, 600, 300);
		PanelAccion lamina = new PanelAccion();
		add(lamina);

	}
}

class PanelAccion extends JPanel {
	public PanelAccion() {
		AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.gif"), Color.yellow);
		AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.gif"), Color.blue);
		AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/bola_roja.gif"), Color.red);
		
		// botonAmarillo = new JButton(accionAmarillo);
		//add(botonAmarillo);
		
		//es equivalente
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		/*JButton botonAmarillo = new JButton("Amarillo"); 
		JButton botonAzul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");

		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);*/
		
		/**1Crear mapa de entrada*/       //Constante de clase por lo que va precedida por la clase
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
	}



private class AccionColor extends AbstractAction {
	
	public AccionColor(String nombre, Icon icono, Color color_boton) {
		//pareja clave valor
		putValue(Action.NAME, nombre);
		putValue(Action.SMALL_ICON, icono);
		putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color "+nombre);
		putValue("color_de_fondo", color_boton);
		 
	}

	public void actionPerformed(ActionEvent e) {

		Color c=(Color) getValue("color_de_fondo");
		
		/**Para cambiar el color de fondo necesitamos utilizar un metodo de JPanel, pero no lo reconoce porque 
		 * estamos en otra clase asi que lo mejor es convertir AccionColor en una clase interna que herede de JPanel*/
		setBackground(c);
		System.out.println("Nombre: "+getValue(Action.NAME)+" Descripcion: "+getValue(Action.SHORT_DESCRIPTION));
		
		/**Para asignar combinaciones de teclas a botones*/
		/**1Crear mapa de entrada*/
		/**2Crear combinacion de teclas*/
		/**3Asignar combinacion de teclas a objeto*/
		
		
	}

}

}












