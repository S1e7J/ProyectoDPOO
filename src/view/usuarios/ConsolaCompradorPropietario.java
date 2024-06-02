package view.usuarios;

import model.GaleriaGeneral;
import model.usuarios.CompradorPropietario;
import model.usuarios.Usuario;
import view.Consola;

public class ConsolaCompradorPropietario extends ConsolaUsuario {
	private CompradorPropietario us;
	public ConsolaCompradorPropietario(Usuario user, GaleriaGeneral galeria) {
		super(galeria);
		this.us = (CompradorPropietario) user;
		this.galeria = galeria;
		galeria.crearPieza("1", true, 0, 0, us);
	}
}