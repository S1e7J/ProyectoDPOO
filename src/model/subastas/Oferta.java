package model.subastas;

import java.util.Date;

import model.inventario.Pieza;
import model.usuarios.CompradorPropietario;

public class Oferta {
	private int dinero;
	private CompradorPropietario ofertante;
	private Date fecha;
	private Pieza pieza;

	public Oferta(int dinero, CompradorPropietario ofertante, Date fecha, Pieza pieza) {
		super();
		this.dinero = dinero;
		this.ofertante = ofertante;
		this.fecha = fecha;
		this.pieza = pieza;
	}

	public int getDinero() {
		return this.dinero;
	}

	public Date getFecha() {
		return fecha;
	}

	public Oferta getMaxOferta(Oferta segunda_oferta) {
		if (this.dinero > segunda_oferta.dinero) {
			return this;
		}
		return segunda_oferta;
	}

	public CompradorPropietario getOfertante() {
		return ofertante;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setOfertante(CompradorPropietario ofertante) {
		this.ofertante = ofertante;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}
}
