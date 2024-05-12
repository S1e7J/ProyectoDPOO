package model.subastas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.inventario.Pieza;
import model.usuarios.CompradorPropietario;
import model.errores.*;

public class Subasta {
	private Map<String, Pieza> piezasDisponibles;
	private Map<String, List<Oferta>> ofertasPorPieza;
	private List<CompradorPropietario> compradoresAutorizados;
	private Map<String, Oferta> obrasVendidas;
	
	
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
		this.obrasVendidas = new HashMap<String, Oferta>();
	}
	
	public Subasta(Map<String, Pieza> piezasDisponibles, Map<String, List<Oferta>> ofertasPorPieza,
			List<CompradorPropietario> compradoresAutorizados) {
		super();
		this.piezasDisponibles = piezasDisponibles;
		this.ofertasPorPieza = ofertasPorPieza;
		this.compradoresAutorizados = compradoresAutorizados;
		this.obrasVendidas = new HashMap<String, Oferta>();
	}
	
	public void agregarOferta(Oferta oferta, String idPieza) {
		this.ofertasPorPieza.get(idPieza).add(oferta);
	}
	public List<CompradorPropietario> getCompradoresAutorizados() {
		return compradoresAutorizados;
	}
	public Map<String, Oferta> getObrasVendidas() {
		return this.obrasVendidas;
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
	public void setObrasVendidas(Map<String, Oferta> obrasVendidas) {
		this.obrasVendidas = obrasVendidas;
	}
	public void setOfertasPorPieza(Map<String, List<Oferta>> ofertasPorPieza) {
		this.ofertasPorPieza = ofertasPorPieza;
	}
	
	public void setPiezasDisponibles(Map<String, Pieza> piezasDisponibles) {
		this.piezasDisponibles = piezasDisponibles;
	}
	public Oferta getMaximaOferta(String idPieza) throws Exception {
		List<Oferta> ofertas = this.ofertasPorPieza.get(idPieza);
		if (ofertas.size() == 0) {
			throw new ExceptionOfertas(idPieza, ExceptionsEnOfertas.NoHayOfertas);
		}
		Oferta maxOferta = ofertas.get(0);
		for (int i = 0; i < ofertas.size(); i++) {
			maxOferta = maxOferta.getMaxOferta(ofertas.get(i));
		}
		return maxOferta;
	}
	public void venderPieza(String idPieza) throws Exception {
		Pieza pieza = this.piezasDisponibles.get(idPieza);
		Oferta maxOferta = null;
		try { maxOferta = this.getMaximaOferta(idPieza); } 
		catch (Exception e) { throw e; }
		if (maxOferta.getDinero() < pieza.getPrecioMinimo()) {
			throw new ExceptionOfertas(idPieza, ExceptionsEnOfertas.OfertaMenorValorMinimo);
		}
		this.obrasVendidas.put(idPieza, maxOferta);
	}
}
