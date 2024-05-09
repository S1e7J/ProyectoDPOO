package model.subastas;

import java.util.List;
import java.util.Map;
import model.inventario.Pieza;
import model.usuarios.CompradorPropietario;

public class Subasta {
	private Map<String, Pieza> piezasDisponibles;
	private Map<String, List<Oferta>> ofertasPorPieza;
	private List<CompradorPropietario> compradoresAutorizados;
}
