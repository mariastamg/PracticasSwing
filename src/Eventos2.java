

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Otra forma de hacer el cambio de colores de fondo
public class Eventos2 {

	public static void main(String[] args) {
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBotones2 extends JFrame {
	public MarcoBotones2() {
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones2 miLamina = new LaminaBotones2();
		add(miLamina);

	}
}

class LaminaBotones2 extends JPanel  {
	
	private static final long serialVersionUID = 1L;
	JButton botonAzul=new JButton("Azul");
	JButton botonRojo=new JButton("Rojo");
	JButton botonVerde=new JButton("Verde");
	
	//constructor
	public LaminaBotones2() {
		
		//Instancias de la clase oyente ColorFondo
		ColorFondo Azul=new ColorFondo(Color.blue);
		ColorFondo Rojo=new ColorFondo(Color.red);
		ColorFondo Verde=new ColorFondo(Color.green);
		
		add(botonAzul);
		botonAzul.addActionListener(Azul);//This porque tenemos como oyente a la propia LaminaBotones
		add(botonRojo);
		botonRojo.addActionListener(Rojo);
		add(botonVerde);
		botonVerde.addActionListener(Verde);
	}
	
	private class ColorFondo implements ActionListener{

		public ColorFondo(Color c) {
			colorDeFondo=c;
		}
		private Color colorDeFondo;
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
			
		}
		
	}

}


