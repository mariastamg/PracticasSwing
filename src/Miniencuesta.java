import java.awt.Checkbox;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Miniencuesta {

	public static void main(String[] args) {
		Marco marco = new Marco();
		marco.setTitle("Mini Encuesta");
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco extends JFrame {
	public Marco() {
		setBounds(300, 100, 250, 600);
		Panel panel=new Panel();
		add(panel);

	}

}

class Panel extends JPanel {
	
	private JRadioButton buttonWindows,buttonLinux,buttonMac;
	private JCheckBox especialidad1, especialidad2, especialidad3;
	private JSlider horas;
	private JButton generar;
	private JLabel horasSelec;
	private int horasDia;
	public Panel() {
		Accion accion=new Accion();
		setLayout(new GridLayout(13,1,5,5));
		//SISTEMA OPERATIVO
		JLabel textoSistema=new JLabel("Elige un sistema operativo");
		Font fuente1=new Font("Calibri", Font.BOLD,14);
		textoSistema.setFont(fuente1);
		add(textoSistema);
		ButtonGroup sistema=new ButtonGroup();
		buttonWindows=new JRadioButton("Windows");
		buttonLinux=new JRadioButton("Linux", true);
		buttonMac=new JRadioButton("Mac");
		sistema.add(buttonWindows);
		sistema.add(buttonLinux);
		sistema.add(buttonMac);
		add(buttonWindows);
		add(buttonLinux);
		add(buttonMac);
		//ESPECIALIDAD
		JLabel textoEspecialidad=new JLabel("Elige tu especialidad");
		add(textoEspecialidad);
		Font fuente2=new Font("Calibri",Font.BOLD,14);
		textoEspecialidad.setFont(fuente2);
		especialidad1=new JCheckBox("Programación");
		especialidad2=new JCheckBox("Diseño gráfico");
		especialidad3=new JCheckBox("Administracion");
		add(especialidad1);
		add(especialidad2);
		add(especialidad3);
		JLabel textoHoras=new JLabel("Horas que dedicas ante el ordenador");
		horasSelec=new JLabel("0");
		horas=new JSlider(SwingConstants.HORIZONTAL, 0, 12, 6);
		horas.addChangeListener(accion);
		horas.setPaintLabels(true);
		add(textoHoras);
		add(horasSelec);
		add(horas);
		generar=new JButton("Generar");
		add(generar);
		generar.addActionListener(accion);
		
		
		
		
	}
	
	class Accion implements ActionListener, ChangeListener{
    private String sistema;
    private ArrayList<String>especialidadesSeleccionadas=new ArrayList<String>();
    
	
	public void actionPerformed(ActionEvent e) {
		//Recoger los resultados de las respuestas(sistema, especialidad, horas)
		//Sistema
		
		if(buttonWindows.isSelected()==true) {
			sistema=buttonWindows.getText();
		}else if(buttonLinux.isSelected()==true) {
			sistema=buttonLinux.getText();
		}else {
			sistema=buttonMac.getText();
		}
		//Especialidades
		if(especialidad1.isSelected()==true) 
			especialidadesSeleccionadas.add(especialidad1.getText());
		if(especialidad2.isSelected()==true)
			especialidadesSeleccionadas.add(especialidad2.getText());
		if(especialidad3.isSelected()==true)
			especialidadesSeleccionadas.add(especialidad3.getText());
		
		
		
		
		JOptionPane.showMessageDialog(Panel.this, "Tu sistema operativo preferido es"+
		sistema+" tus especialidades son "+especialidadesSeleccionadas+ " y el numero de horas dedicadas"
				+ "al ordenador es "+horasDia, "Muestra de datos", JOptionPane.INFORMATION_MESSAGE);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		//Horas
		horasDia=horas.getValue();
		horasSelec.setText(""+horasDia);
	}
	
}
}

