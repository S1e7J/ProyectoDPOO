package model.inventario;

import java.util.LinkedList;
import java.util.List;

import model.usuarios.CompradorPropietario;

public class InventarioGeneral {
	private List<Pieza> piezasActuales;
	private List<Pieza> piezasPasadas;
	
	public InventarioGeneral() {
		this.piezasActuales = new LinkedList<Pieza>();
		this.piezasPasadas = new LinkedList<Pieza>();
	}
	
	public List<Pieza> getPiezasActuales() {
		return piezasActuales;
	}
	public List<Pieza> getPiezasPasadas() {
		return piezasPasadas;
	}
	public void setPiezasActuales(List<Pieza> piezasActuales) {
		this.piezasActuales = piezasActuales;
	}
	public void setPiezasPasadas(List<Pieza> piezasPasadas) {
		this.piezasPasadas = piezasPasadas;
	}
	
	public void agregarPiezaActual(Pieza p) {
		this.piezasActuales.add(p);
	}
	
	public void agregarPiezaPasada(Pieza p) {
		this.piezasPasadas.add(p);
	}
	
	public void removerPiezaActual(Pieza p) {
		this.piezasActuales.remove(p);
		this.piezasPasadas.add(p);
	}
	
	public void removerPiezaPasada(Pieza p) {
		this.piezasPasadas.remove(p);
	}
	
	public Pieza encontraPiezaActual(String idPieza) {
		for (Pieza p : this.piezasActuales) {
			if (p.getIdPieza().equals(idPieza)) {
				return p;
			}
		}
		return null;
	}
	public Pieza crearPieza(String idPieza, boolean disponibleVentaFija, int precioMinimo, int precioInicial,
			CompradorPropietario propietario) {
		Pieza pieza = new Pieza(idPieza, disponibleVentaFija, precioMinimo, precioInicial, propietario);
		this.agregarPiezaActual(pieza);
		return pieza;
	}
}
