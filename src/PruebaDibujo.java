import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujo {

	public static void main(String[] args) {
		MarcoConDibujos miMarco=new MarcoConDibujos();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		setTitle("prueba de dibujo");
		setSize(400, 400);
		LaminaConFiguras miLamina=new LaminaConFiguras();
		add(miLamina);
	}
	
}

class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawRect(50, 50, 200, 200);
		//g.drawLine(100, 100, 300, 200);
		//g.drawArc(50, 100, 100, 200, 120, 150);
		
		Graphics2D g2=(Graphics2D)g;
		Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);
		g2.draw(rectangulo);
		
		//La elipse va enmarcada por el rectangulo
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
	    g2.draw(elipse);
	    
	    
		
		
	}
	
	
}
