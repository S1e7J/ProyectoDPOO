package model;

import java.util.List;

import model.inventario.InventarioGeneral;
import model.inventario.Pieza;
import model.usuarios.CompradorPropietario;
import model.usuarios.TipoUsuario;
import model.usuarios.Usuario;
import model.usuarios.UsuariosRegistrados;
import view.inicial.IHUsuario;

public class GaleriaGeneral {
	private static InventarioGeneral inventario = new InventarioGeneral();
	private static UsuariosRegistrados usuarios = new UsuariosRegistrados();
	
	public Usuario gestionarInicioSesion(IHUsuario us) {
		return usuarios.encontrarUsuario(us.getTipoUsuario(), us.getUsuario(), us.getPass());
	}
	
	public Usuario crearUsuario(TipoUsuario tipo, String usuario, String contra) {
		return usuarios.crearUsuario(tipo, usuario, contra);
	}
	
	public List<Pieza> conseguirPiezas() {
		return inventario.getPiezasActuales();
	}
	public Pieza crearPieza(String idPieza, boolean disponibleVentaFija, int precioMinimo, int precioInicial,
			CompradorPropietario propietario) {
		return inventario.crearPieza(idPieza, disponibleVentaFija, precioMinimo, precioInicial, propietario);
	}
}
