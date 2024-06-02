package model.usuarios;

public class Cajero extends Usuario {
	public Cajero(String idUsuario, String pass) {
		super(TipoUsuario.Cajero, idUsuario, pass); 
	}
}
