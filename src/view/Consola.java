package view;

import java.awt.Color;

import javax.swing.JFrame;

import model.GaleriaGeneral;
import model.usuarios.Usuario;

public abstract class Consola extends JFrame {
	protected GaleriaGeneral galeria;

	public Consola() {
		super();
		this.galeria = new GaleriaGeneral();
		this.setSize(700, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(Color.BLACK);
	}
	public Consola(GaleriaGeneral galeria) {
		super();
		this.galeria = galeria;
		this.setSize(700, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(Color.BLACK);
	}
}
