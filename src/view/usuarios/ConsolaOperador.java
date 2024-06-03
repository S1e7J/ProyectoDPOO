package view.usuarios;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.GaleriaGeneral;
import model.usuarios.Operador;
import model.usuarios.Usuario;
import view.Consola;
import view.usuarios.componentes.GestionarSubasta;

public class ConsolaOperador extends ConsolaUsuario {

	private Operador us;
	public ConsolaOperador(GaleriaGeneral galeria, Usuario us) {
		super(galeria);
		this.us = (Operador) us;
		this.agregarDescripcion();
		if (this.us.getSubastaActual() == null ) {
			this.us.setSubastaActual(super.galeria.crearSubasta());
		}
		GestionarSubasta gSubasta = new GestionarSubasta(this.us.getSubastaActual(), super.galeria);
		gSubasta.setVisible(true);
		this.add(gSubasta, BorderLayout.CENTER);
	}
	@Override
	public String conseguirDescripcionUsuario() {
		return "Identificador: " + us.getIdUsuario() + " Rol " + us.getTipo().toString();
	}
}
