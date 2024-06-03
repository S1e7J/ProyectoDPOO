package view.usuarios;

import javax.swing.JFrame;

import model.GaleriaGeneral;
import model.usuarios.Operador;
import model.usuarios.Usuario;
import view.Consola;

public class ConsolaOperador extends ConsolaUsuario {

	private Operador us;
	public ConsolaOperador(GaleriaGeneral galeria, Usuario us) {
		super(galeria);
		this.us = (Operador) us;
		this.agregarDescripcion();
	}
	@Override
	public String conseguirDescripcionUsuario() {
		return "Identificador: " + us.getIdUsuario() + " Rol " + us.getTipo().toString();
	}
}
