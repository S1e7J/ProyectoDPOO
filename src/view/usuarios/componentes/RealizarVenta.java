package view.usuarios.componentes;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RealizarVenta extends JDialog {
	public RealizarVenta(int dinero) {
		this.setSize(300, 300);
		JPanel pane = new JPanel();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		JPanel tfNumero = crearContenido("Numero de Tarjeta", 16);
		JPanel tfFecha = crearContenido("Mes:", 2);
		JPanel tfFechaAno = crearContenido("Año:", 2);
		JPanel tfNombre = crearContenido("Nombre Propietario: ", 25);
		JPanel tfCvc = crearContenido("CVC: ", 3);
		JButton btEnviar = new JButton("Pagar");
		pane.add(tfNumero);
		pane.add(tfFecha);
		pane.add(tfFechaAno);
		pane.add(tfNombre);
		pane.add(tfCvc);
		pane.add(btEnviar);
		pane.setVisible(true);
		this.add(pane);
	}
	public JPanel crearContenido(String label, int tamano) {
		JPanel ret = new JPanel();
		ret.setLayout(new FlowLayout());
		JLabel jLabel = new JLabel(label);
		JTextField tf = new JTextField("", tamano);
		ret.add(jLabel);
		ret.add(tf);
		return ret;
	}
}
