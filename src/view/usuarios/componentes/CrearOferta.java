package view.usuarios.componentes;

import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.GaleriaGeneral;
import model.inventario.Pieza;
import model.subastas.Oferta;

public class CrearOferta extends JPanel {
	private JTextField tfDinero;
	private JTextField tfOfertante;
	private JTextField tfFecha;
	private JTextField tfPieza;
	private GaleriaGeneral galeria;
	public CrearOferta(GaleriaGeneral galeria) {
		this.galeria = galeria;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.tfDinero = new JTextField();
		this.tfOfertante = new JTextField();
		this.tfFecha = new JTextField();
		this.tfPieza = new JTextField();
		this.add(new JLabel("Dinero: "));
		this.add(tfDinero);
		this.add(new JLabel("Ofertante ID: "));
		this.add(tfOfertante);
		this.add(new JLabel("Fecha: "));
		this.add(tfFecha);
		this.add(new JLabel("Pieza ID: "));
		this.add(tfPieza);
	}
	
	public Oferta devolverOferta() {
		return new Oferta(Integer.parseInt(tfDinero.getText()), this.galeria.encontrarCompradorPropietario(tfOfertante.getText()),
				new Date(), this.galeria.encontrarPieza(tfPieza.getText()));
	}
	public void limpiar() {
		this.tfDinero.setText("");
		this.tfOfertante.setText("");
		this.tfFecha.setText("");
		this.tfPieza.setText("");
	}
}
