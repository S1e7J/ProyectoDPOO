package view.usuarios;

import model.GaleriaGeneral;
import model.usuarios.Cajero;
import model.usuarios.Usuario;

public class ConsolaCajero extends ConsolaUsuario {
	private Cajero us;

	public ConsolaCajero(GaleriaGeneral galeria, Usuario us) {
		super(galeria);
		this.us = (Cajero) us;
		this.agregarDescripcion();
	}

	@Override
	public String conseguirDescripcionUsuario() {
		return "Identificador: " + us.getIdUsuario() + " Rol " + us.getTipo().toString();
	}
}
