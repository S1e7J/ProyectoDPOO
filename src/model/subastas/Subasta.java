package model.subastas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.inventario.Pieza;
import model.usuarios.Cajero;
import model.usuarios.CompradorPropietario;

public class Subasta {
	private Map<String, Pieza> piezasDisponibles;
	private Map<String, List<Oferta>> ofertasPorPieza;
	private List<CompradorPropietario> compradoresAutorizados;
	
	
	public Subasta(Map<String, Pieza> piezasDisponibles, Map<String, List<Oferta>> ofertasPorPieza,
			List<CompradorPropietario> compradoresAutorizados) {
		super();
		this.piezasDisponibles = piezasDisponibles;
		this.ofertasPorPieza = ofertasPorPieza;
		this.compradoresAutorizados = compradoresAutorizados;
	}
	
	public Subasta(List<Pieza> piezasDisponibles, 
			List<CompradorPropietario> compradoresAutorizados) {
		super();
		this.piezasDisponibles = new HashMap<String, Pieza>();
		this.ofertasPorPieza = new HashMap<String, List<Oferta>>();
		piezasDisponibles.forEach(x -> {
			this.piezasDisponibles.put(x.getIdPieza(), x);
			this.ofertasPorPieza.put(x.getIdPieza(), new ArrayList<Oferta>());
		});
		this.compradoresAutorizados = compradoresAutorizados;
	}
	
	public List<CompradorPropietario> getCompradoresAutorizados() {
		return compradoresAutorizados;
	}
	public Map<String, List<Oferta>> getOfertasPorPieza() {
		return ofertasPorPieza;
	}
	public Map<String, Pieza> getPiezasDisponibles() {
		return piezasDisponibles;
	}
	
	public void setCompradoresAutorizados(List<CompradorPropietario> compradoresAutorizados) {
		this.compradoresAutorizados = compradoresAutorizados;
	}
	public void setOfertasPorPieza(Map<String, List<Oferta>> ofertasPorPieza) {
		this.ofertasPorPieza = ofertasPorPieza;
	}
	public void setPiezasDisponibles(Map<String, Pieza> piezasDisponibles) {
		this.piezasDisponibles = piezasDisponibles;
	}
	
	public void agregarOferta(Oferta oferta, String idPieza) {
		this.ofertasPorPieza.get(idPieza).add(oferta);
	}
}
