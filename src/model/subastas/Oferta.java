package model.subastas;

public class Oferta {
	private int dinero;
	
	public int getDinero() {
		return this.dinero;
	}
	
	public Oferta getMaxOferta(Oferta segunda_oferta) {
		if (this.dinero > segunda_oferta.dinero) {
			return this;
		}
		return segunda_oferta;
	}
}
