

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {
		MarcoRaton miMarco = new MarcoRaton();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
//Objeto fuente
class MarcoRaton extends JFrame {
	public MarcoRaton() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
         //ponemos el marco a la escucha
		EventosDeRaton EventoRaton=new EventosDeRaton();
		addMouseListener(EventoRaton);
	}
}
//Oyente
class EventosDeRaton implements MouseListener{
/**class EventosDeRaton extends MouseAdapter (y solo usamos el metodo necesario)*/
	@Override
	public void mouseClicked(MouseEvent e) {
	System.out.println("Has hecho click.");	
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	System.out.println("Acabas de presionar.");	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	System.out.println("Acabas de levantar.");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	System.out.println("Acabas de entrar.");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
	System.out.println("Acabas de salir.");	
		
	}
	
}
