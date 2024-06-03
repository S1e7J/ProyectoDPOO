package view.usuarios;

import model.GaleriaGeneral;
import model.usuarios.Administrador;
import model.usuarios.Usuario;

public class ConsolaAdministrador extends ConsolaUsuario {
	private Administrador us;
	public ConsolaAdministrador(GaleriaGeneral galeria, Usuario us) {
		super(galeria);
		this.us = (Administrador) us;
		this.agregarDescripcion();
	}
	@Override
	public String conseguirDescripcionUsuario() {
		return "Identificador: " + us.getIdUsuario() + " Rol " + us.getTipo().toString();
	}

}
