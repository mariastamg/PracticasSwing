

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos {

	public static void main(String[] args) {
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBotones extends JFrame {
	public MarcoBotones() {
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);

	}
}

class LaminaBotones extends JPanel implements ActionListener {
	JButton botonAzul=new JButton("Azul");
	JButton botonRojo=new JButton("Rojo");
	JButton botonVerde=new JButton("Verde");
	
	//constructor
	public LaminaBotones() {
		add(botonAzul);
		botonAzul.addActionListener(this);//This porque tenemos como oyente a la propia LaminaBotones
		add(botonRojo);
		botonRojo.addActionListener(this);
		add(botonVerde);
		botonVerde.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado=e.getSource();//Sabemos quien es la fuente, el desencadenante de la accion
		
		if(botonPulsado==botonAzul) {
			setBackground(Color.blue);
		}else if(botonPulsado==botonRojo) {
			setBackground(Color.red);
		}else if(botonPulsado==botonVerde) {
			setBackground(Color.green);
		}
		
		
		
		
	}

}
