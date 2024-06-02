package model.usuarios;

public abstract class Usuario {
	private TipoUsuario tipo;
	private String idUsuario;
	private String password;
	public TipoUsuario getTipo() {
		return tipo;
	}
	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Usuario(TipoUsuario tipo, String idUsuario, String password) {
		super();
		this.tipo = tipo;
		this.idUsuario = idUsuario;
		this.password = password;
	}
}
