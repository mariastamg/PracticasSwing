import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DemoDibujo extends JFrame {
	
	private final static long serialVersionUID=1L;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new DemoDibujo().setVisible(true));
	}
	
	public DemoDibujo() {
		super("Demo Dibujo");
		setContentPane(new Lienzo(900, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}

}


