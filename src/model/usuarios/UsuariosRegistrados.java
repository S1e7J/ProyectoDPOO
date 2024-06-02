package model.usuarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsuariosRegistrados {
	private Map<TipoUsuario, List<Usuario>> usuarios;
	public UsuariosRegistrados() {
		this.usuarios = new HashMap<TipoUsuario, List<Usuario>>();
		this.usuarios.put(TipoUsuario.Administrador, new ArrayList<Usuario>());
		this.usuarios.put(TipoUsuario.Cajero, new ArrayList<Usuario>());
		this.usuarios.put(TipoUsuario.Operador, new ArrayList<Usuario>());
		this.usuarios.put(TipoUsuario.CompradorPropieatrio, new ArrayList<Usuario>());
	}

	public Map<TipoUsuario, List<Usuario>> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Map<TipoUsuario, List<Usuario>> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void agregarUsuario(TipoUsuario tipo, Usuario usuario) {
		this.usuarios.get(tipo).add(usuario);
	}
	
	public void removerUsuario(TipoUsuario tipo, Usuario usuario) {
		this.usuarios.get(tipo).remove(usuario);
	}
	
	public Usuario encontrarUsuario(TipoUsuario tipo, String idUsuario, String contrasena) {
		List<Usuario> usuariosDelTipo = this.usuarios.get(tipo);
		for (Usuario us : usuariosDelTipo) {
			if (us.getIdUsuario().equals(idUsuario) && us.getPassword().equals(contrasena)) {
				return us;
			}
		}
		return null;
	}
	
	public Usuario crearUsuario(TipoUsuario tipo, String idUsuario, String contrasena) {
		Usuario us = null;
		switch (tipo) {
		case CompradorPropieatrio:
			us = new CompradorPropietario(0, idUsuario, contrasena);
			break;
		case Administrador:
			us = new Administrador(idUsuario, contrasena);
			break;
		case Operador:
			us = new Operador(idUsuario, contrasena);
			break;
		case Cajero:
			us = new Cajero(idUsuario, contrasena);
			break;
		default:
			us = new CompradorPropietario(0, idUsuario, contrasena);
			break;
		}
		
		this.usuarios.get(tipo).add(us);
		return us;
	}
}
