package view.usuarios;

import javax.swing.JFrame;

import model.usuarios.Operador;
import view.Consola;

public class ConsolaOperador extends Consola {
	private Operador usuario;
	
	
	public ConsolaOperador() {
		
	}
	
	public static void main(String[] args) {
		ConsolaOperador consola = new ConsolaOperador();
		consola.setVisible(true);
	}
}
