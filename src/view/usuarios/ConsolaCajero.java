package view.usuarios;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.GaleriaGeneral;
import model.usuarios.Cajero;
import model.usuarios.Usuario;
import view.usuarios.componentes.*;

public class ConsolaCajero extends ConsolaUsuario implements ActionListener {
	private Cajero us;

	public ConsolaCajero(GaleriaGeneral galeria, Usuario us) {
		super(galeria);
		this.us = (Cajero) us;
		this.agregarDescripcion();
		JButton pagar = new JButton("Hacer un Pago: ");
		pagar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RealizarVenta con = new RealizarVenta(5);
				con.setVisible(true);
			}
			
		});
		this.add(pagar, BorderLayout.CENTER);
	}

	@Override
	public String conseguirDescripcionUsuario() {
		return "Identificador: " + us.getIdUsuario() + " Rol " + us.getTipo().toString();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
