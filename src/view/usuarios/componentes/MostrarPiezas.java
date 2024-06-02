package view.usuarios.componentes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import model.inventario.Pieza;

public class MostrarPiezas extends JDialog {
	private List<Pieza> piezas;
	
	public MostrarPiezas(List<Pieza> pieza) {
		this.piezas = pieza;
		this.setSize(300, 300);
		JScrollPane pan = new JScrollPane();
		JList<JLabel> lista = new JList<JLabel>();
		for (Pieza p : piezas) {
			JLabel descripcion = new JLabel("id: " + p.getIdPieza() + " Propietario: " + p.getPropietario().getIdUsuario());
			lista.add(descripcion);
		}
		pan.add(lista);
		this.add(pan);
	}
}
