package view.usuarios;

import java.awt.BorderLayout;

import model.GaleriaGeneral;
import view.Consola;
import view.usuarios.componentes.ComponenteEast;

public abstract class ConsolaUsuario extends Consola {
	public ConsolaUsuario(GaleriaGeneral galeria) {
		super(galeria);
		ComponenteEast comEast = new ComponenteEast(galeria);
		this.add(comEast, BorderLayout.EAST);
	}
}