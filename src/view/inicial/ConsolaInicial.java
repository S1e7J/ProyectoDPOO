package view.inicial;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

import model.usuarios.Usuario;
import view.Consola;

public class ConsolaInicial extends Consola {
	private Cuestionario cuestionario;
	public ConsolaInicial() {
		super();
		this.setLayout(new FlowLayout());
		this.cuestionario = new Cuestionario(this);
		this.add(cuestionario);
	}
	
	public void gestionarInicioSesion(IHUsuario us) {
		Usuario usuario = super.galeria.gestionarInicioSesion(us);
		if (usuario != null) {
			System.out.println("Se encontro el usuario");
		} else {
			JLabel error = new JLabel("No existe ese usuario");
			this.cuestionario.add(error);
			this.setVisible(true);
		}
	}
	
	public void crearUsuario() {
		this.setVisible(false);
		CrearUsuario crearUsuario = new CrearUsuario(super.galeria);
		crearUsuario.setVisible(true);
	}
	
	public static void main(String[] args) {
		ConsolaInicial con = new ConsolaInicial();
		con.setVisible(true);
	}
}
