

import javax.swing.*;

public class JFramePrueba {

	public static void main(String[] args) {

		MiMarco marco1 = new MiMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MiMarco extends JFrame {

	// creamos el constructor
	public MiMarco() {
		/**le damos tamaño**/
		//setSize(500, 300);
		/**le damos situacion dentro del marco padre**/
		//setLocation(500, 300);
		/**le damos tamaño y situación**/
		setBounds(300, 200, 500, 300);
		/**permitir o no al usuario redimensionar el marco**/
		//setResizable(false);
		/**permitir que el marco se abra a pantalla completa**/
		setExtendedState(JFrame.MAXIMIZED_BOTH);
}
}
