package model.usuarios;

import java.util.ArrayList;
import java.util.List;

import model.subastas.Subasta;

public class Operador extends Usuario {
	private Subasta subastaActual;
	private List<Subasta> subastasRealizadas;
	
	public Operador(Subasta subastaActual, String idUsuario, String pass) {
		super(TipoUsuario.Operador, idUsuario, pass);
		subastasRealizadas = new ArrayList<Subasta>();
		this.subastaActual = subastaActual;
		subastasRealizadas.add(subastaActual);
	}
	public Operador(String idUsuario, String pass) {
		super(TipoUsuario.Operador, idUsuario, pass);
		subastasRealizadas = new ArrayList<Subasta>();
	}
	public Subasta getSubastaActual() {
		return subastaActual;
	}
	public void setSubastaActual(Subasta subastaActual) {
		this.subastaActual = subastaActual;
	}
	public List<Subasta> getSubastasRealizadas() {
		return subastasRealizadas;
	}
	public void setSubastasRealizadas(List<Subasta> subastasRealizadas) {
		this.subastasRealizadas = subastasRealizadas;
	}
}
