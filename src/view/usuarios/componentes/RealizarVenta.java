package view.usuarios.componentes;

import javax.swing.JDialog;
import javax.swing.JTextField;

public class RealizarVenta extends JDialog {
	public RealizarVenta(int dinero) {
		this.setSize(300, 300);
		JTextField tfNumero = new JTextField("", 16);
		JTextField tfFecha = new JTextField("", 5);
		JTextField tfNombre = new JTextField("", 25);
		JTextField tfCvc = new JTextField("", 3);
		JButton btEnviar = new JButton("Pagar");
	}
}
