

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Ejemplo uso de la clase GridLayout
public class Calculadora {

	public static void main(String[] args) {

		MarcoCalculadora miMarco = new MarcoCalculadora();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class MarcoCalculadora extends JFrame {

	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);
		LaminaCalculadora miLamina = new LaminaCalculadora();
		add(miLamina);
		// pack();//El contenedor se tiene que adaptar a lo que contiene
	}

}

//pantalla
class LaminaCalculadora extends JPanel {

	public LaminaCalculadora() {
		// porque este metodo solo se lee una vez al iniciar el programa
		principio = true;

		setLayout(new BorderLayout());
		// Boton de pantalla de display, es 0 porque las calculadoras empiezan en 0.
		pantalla = new JButton("0");
		add(pantalla, BorderLayout.NORTH);
		// Vamos a deshabilitar el boton que va a hacer de pantalla para que no sea raro
		pantalla.setEnabled(false);

		// Vamos a crear una instancia de JPanel, podriamos crear otra clase que
		// heredara de JPanel, pero x hacerlo de manera diferente
		// Esta lamina habrá despues que agregarla a la otra lamina
		miLamina2 = new JPanel();
		miLamina2.setLayout(new GridLayout(4, 4));
		/** Una manera de hacerlo crear los botones uno a uno sucesivamente */
		// JButton boton1=new JButton("1");
		// miLamina2.add(boton1);
		/**
		 * Y agregariamos esta lamina 2 a lamina 1 y le dariamos alineacion central para
		 * que ocuppe el resto del espacio
		 */
		add(miLamina2, BorderLayout.CENTER);

		// creamos una instancia de inserta numero para poner los botones de numero a la
		// escucha
		ActionListener insertar = new InsertaNumero();
		// creamos una instancia de accion orden para poner los botones de operaciones a
		// la escucha
		ActionListener orden = new AccionOrden();

		// porque lo coloca por filas empezando por arriba
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", orden);
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", orden);
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", orden);
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		ponerBoton("=", orden);
		ponerBoton("+", orden);

	}

	private void ponerBoton(String rotulo, ActionListener oyente) {
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);
		// No puede acceder por que esta declarada en el metodo del constructor, la
		// sacamos fuera y la encapsulamos a private
		miLamina2.add(boton);
		// Vamos a poner los botones a la escucha

	}

	private class InsertaNumero implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// capturar el texto de la tecla de la calculadora pulsada
			String entrada = e.getActionCommand();
			// para que el 0 no se añada a los numeros introducidos
			if (principio == true/* Si ponemos solo PRINCIPIO ES EQUIVALENTE **/) {
				pantalla.setText("");
				principio = false;
			}
			// Pero hay que ir añadiendo lo que haya en pantalla
			pantalla.setText(pantalla.getText() + entrada);

		}

	}

	// clase que gestiona los eventos de las operaciones matematicas
	private class AccionOrden implements ActionListener {// Ponemos los botones a la escucha

		public void actionPerformed(ActionEvent e) {
            
			String operacion=e.getActionCommand();
			
			//metodo al que le paso lo que haya en el display.Usamos el metodo Double.parseDouble para convertir a double un String que es lo que tenemos en el display
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaOperacion = operacion;
			//resetea el display
			principio = true;
			

		}
		
		public void calcular(double x) {
			
			if(ultimaOperacion.equals("+")) {
				resultado+=x;//resultado=resultado+x
			}
			else if(ultimaOperacion.equals("-")) {
				resultado-=x;
			}
			else if(ultimaOperacion.equals("*")) {
				resultado*=x;
			}
			else if(ultimaOperacion.equals("/")) {
				resultado/=x;
			}
			else if(ultimaOperacion.equals("=")) {
				resultado=x;
			}
			//truco del almendruco para engañar a un metodo que me pide string y yo le paso otra cosa
			pantalla.setText("" +resultado);
			
		}

	}

	private JPanel miLamina2;
	private JButton pantalla;
	// para saber si es el primer boton que se introduce en el display
	private boolean principio;
	//variable donde iremos almacenando el resultado de las operaciones
	private double resultado;
	private String ultimaOperacion;
}
