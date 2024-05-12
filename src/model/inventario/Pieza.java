package model.inventario;

import java.util.List;

import model.usuarios.CompradorPropietario;

public class Pieza {
	private String idPieza;
	private boolean disponibleVentaFija;
	private int precioMinimo;
	private int precioInicial;
	private CompradorPropietario propietario;
	
	public Pieza(String idPieza, boolean disponibleVentaFija, int precioMinimo, int precioInicial,
			CompradorPropietario propietario) {
		super();
		this.idPieza = idPieza;
		this.disponibleVentaFija = disponibleVentaFija;
		this.precioMinimo = precioMinimo;
		this.precioInicial = precioInicial;
		this.propietario = propietario;
	}
	
	public Pieza(String idPieza) {
		super();
		this.idPieza = idPieza;
		this.disponibleVentaFija = true;
		this.precioMinimo = 10;
		this.precioInicial = 100;
		this.propietario = new CompradorPropietario();
	}

	public boolean getDisponibleVentaFija() {
		return this.disponibleVentaFija;
	}

	public String getIdPieza() {
		return this.idPieza;
	}

	public int getPrecioInicial() {
		return precioInicial;
	}
	
	public int getPrecioMinimo() {
		return precioMinimo;
	}

	public CompradorPropietario getPropietario() {
		return propietario;
	}

	public void setDisponibleVentaFija(boolean disponibleVentaFija) {
		this.disponibleVentaFija = disponibleVentaFija;
	}

	public void setIdPieza(String idPieza) {
		this.idPieza = idPieza;
	}

	public void setPrecioInicial(int precioInicial) {
		this.precioInicial = precioInicial;
	}

	public void setPrecioMinimo(int precioMinimo) {
		this.precioMinimo = precioMinimo;
	}

	public void setPropietario(CompradorPropietario propietario) {
		this.propietario = propietario;
	}

}
