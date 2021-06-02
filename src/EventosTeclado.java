

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		MarcoConTeclas miMarco = new MarcoConTeclas();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTeclas extends JFrame {
	public MarcoConTeclas() {
		setBounds(700, 300, 600, 450);
		setVisible(true);
		EventoDeTeclado tecla=new EventoDeTeclado();
		addKeyListener(tecla);

	}
}

//nuestro objeto oyente
class EventoDeTeclado implements KeyListener{

	
	public void keyTyped(KeyEvent e) {
		char letra=e.getKeyChar(); //Devuelve la letra
		System.out.println(letra);
	}


	public void keyPressed(KeyEvent e) {
		//Devuelve el codigo numerico int codigo=e.getKeyCode();
		
		//System.out.println(codigo);
		
	}

	
	public void keyReleased(KeyEvent e) {
	
		
	}
	
}