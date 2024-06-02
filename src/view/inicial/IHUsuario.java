package view.inicial;

import model.usuarios.TipoUsuario;

public class IHUsuario {
	private TipoUsuario tipoUsuario;
	private String usuario;
	private String pass;
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public IHUsuario(TipoUsuario tipoUsuario, String usuario, String pass) {
		super();
		this.tipoUsuario = tipoUsuario;
		this.usuario = usuario;
		this.pass = pass;
	}
}
