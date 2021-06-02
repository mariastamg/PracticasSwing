

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosDeRaton2 {

	public static void main(String[] args) {
		MarcoRaton2 miMarco = new MarcoRaton2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton2 extends JFrame {
	public MarcoRaton2() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		EventosDeRaton3 EventoRaton = new EventosDeRaton3();
		//addMouseListener(EventoRaton);
		addMouseMotionListener(EventoRaton);
	}

}

class EventosRaton2 extends MouseAdapter {
	public void mouseClickrd(MouseEvent e) {
		//System.out.println("Coordenada x:" + e.getX() + "Coordenada y:" + e.getY());
		/**getClickCount() num de clicks*/
		//System.out.println(e.getClickCount());
		
	}
	
	public void mousePressed(MouseEvent e) {
		/**getModifiersEx() saber si se ha pulsado boton izq/derecho/rueda*/
		//System.out.println(e.getModifiersEx());
		/**Saber que boton ha pulsado*/
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {//es una variable estatica para acceder a ella tenemos que usar el nombre de la clase
			System.out.println("Has pulsado el boton izquierdo del ratón");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del ratón");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el boton derecho del ratón");
		}
	}
}
	/**MouseMotionListener cuando movemos/arrastramos el raton*/
	class EventosDeRaton3 implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("Estas arrastrando el raton");
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println("Te estas moviendo");
			
		}
		
		
		
	}





