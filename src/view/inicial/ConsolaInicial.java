package view.inicial;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

import model.usuarios.CompradorPropietario;
import model.usuarios.TipoUsuario;
import model.usuarios.Usuario;
import view.Consola;
import view.usuarios.*;

public class ConsolaInicial extends Consola {
	private Cuestionario cuestionario;
	public ConsolaInicial() {
		super();
		this.setLayout(new FlowLayout());
		this.cuestionario = new Cuestionario(this);
		this.add(cuestionario);
		crearUsuarios();
	}
	
	private void crearUsuarios() {
		Usuario admin = super.galeria.crearUsuario(TipoUsuario.Administrador, "Admin", "123");
		CompradorPropietario comprador = (CompradorPropietario) super.galeria.crearUsuario(TipoUsuario.CompradorPropieatrio, "CompradorPropietario", "123");
		CompradorPropietario comprador2 = (CompradorPropietario) super.galeria.crearUsuario(TipoUsuario.CompradorPropieatrio, "Comprador/Propietario", "123");
		Usuario cajero = super.galeria.crearUsuario(TipoUsuario.Cajero, "Cajero", "123");
		Usuario operador = super.galeria.crearUsuario(TipoUsuario.Operador, "Operador", "123");
		super.galeria.crearPieza("1", true, 10, 10, comprador);
		super.galeria.crearPieza("2", true, 11, 11, comprador2);
		super.galeria.crearPieza("3", true, 12, 12, comprador);
		super.galeria.crearPieza("4", true, 13, 13, comprador2);
	}
	
	public void gestionarInicioSesion(IHUsuario us) {
		super.galeria.crearUsuario(TipoUsuario.Administrador, "Hola", "Hola");
		Usuario usuario = super.galeria.gestionarInicioSesion(us);
		if (usuario != null) {
			mostrarUsuario(usuario);
		} else {
			JLabel error = new JLabel("No existe ese usuario");
			this.cuestionario.add(error);
			this.setVisible(true);
		}
	}
	
	public void mostrarUsuario(Usuario usuario) {
		ConsolaUsuario con = null;
		switch (usuario.getTipo()) {
		case Administrador:
			con = new ConsolaAdministrador(galeria, usuario);
			break;
		case Cajero:
			con = new ConsolaCajero(galeria, usuario);
			break;
		case CompradorPropieatrio:
			con = new ConsolaCompradorPropietario(usuario, galeria);
			break;
		case Operador:
			con = new ConsolaOperador(galeria, usuario);
			break;
		default:
			con = new ConsolaCompradorPropietario(usuario, galeria);
			break;
		}
		
		con.setVisible(true);
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
