package view.usuarios;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.GaleriaGeneral;
import model.usuarios.Usuario;
import view.Consola;
import view.usuarios.componentes.ComponenteEast;

public abstract class ConsolaUsuario extends Consola {
	public ConsolaUsuario(GaleriaGeneral galeria) {
		super(galeria);
		ComponenteEast comEast = new ComponenteEast(galeria);
		this.add(comEast, BorderLayout.EAST);
		
	}
	public void agregarDescripcion() {
		JLabel descripcion = new JLabel(conseguirDescripcionUsuario(), SwingConstants.CENTER);
		this.add(descripcion, BorderLayout.SOUTH);
	}
	
	public abstract String conseguirDescripcionUsuario();
}