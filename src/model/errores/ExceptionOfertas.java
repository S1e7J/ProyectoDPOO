package model.errores;

public class ExceptionOfertas extends Exception {
	private static final long serialVersionUID = 1L;
	private String idPieza;
	private ExceptionsEnOfertas tipoExcepcion;
	
	public ExceptionOfertas(String idPieza, ExceptionsEnOfertas tipoExcepcion) {
		this.idPieza = idPieza;
		this.tipoExcepcion = tipoExcepcion;
	}
	
	public void mostrarError() {
		switch (tipoExcepcion) {
		case NoHayOfertas:
			System.out.println("No hay ofertas disponibles para la pieza con ID "+this.idPieza);
			break;
		case OfertaMenorValorMinimo:
			System.out.println("Las Ofertas no superan el valor minimo para la pieza "+this.idPieza);
		}
	}
}
