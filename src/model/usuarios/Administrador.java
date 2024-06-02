package model.usuarios;

public class Administrador extends Usuario {

	public Administrador(String idUsuario, String password) {
		super(TipoUsuario.Administrador, idUsuario, password);
	}

}
