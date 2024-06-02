package model.usuarios;

import java.util.ArrayList;
import java.util.List;

import model.inventario.Pieza;

public class CompradorPropietario extends Usuario {
	private int dinero;
	private List<Pieza> piezas;
	
	public CompradorPropietario(int dinero, String idUsuario, String pass) {
		super(TipoUsuario.CompradorPropieatrio, idUsuario, pass);
		this.dinero = dinero;
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPiezas(List<Pieza> piezasNuevas) {
		this.piezas.addAll(piezasNuevas);
	}

	public void removerPieza(Pieza pieza) {
		this.piezas.remove(pieza);
	}
}
