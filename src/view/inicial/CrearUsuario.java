package view.inicial;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.GaleriaGeneral;
import model.usuarios.TipoUsuario;
import model.usuarios.Usuario;
import view.Consola;
import view.usuarios.ConsolaCompradorPropietario;

public class CrearUsuario extends Consola implements ActionListener {
	public CrearUsuario(GaleriaGeneral galeria) {
		super(galeria);
		this.setLayout(new FlowLayout());
		JPanel pane = new JPanel();
		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
		JLabel lUsuario = new JLabel("Usuario: ");
		JTextField tfUsuario = new JTextField();
		tfUsuario.setMaximumSize(new Dimension(400, 20));
		tfUsuario.setPreferredSize(new Dimension(20, 20));
		pane.add(lUsuario);
		pane.add(tfUsuario);
		JLabel lContra = new JLabel("Contraseña: ");
		JTextField tfContra = new JTextField();
		tfContra.setMaximumSize(new Dimension(400, 20));
		tfContra.setPreferredSize(new Dimension(20, 20));
		pane.add(lContra);
		pane.add(tfContra);
		
		JButton crearUsuario = new JButton("Crear Usuario");
		crearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearUsuario(tfUsuario.getText(), tfContra.getText());
			}
		});

		pane.add(crearUsuario);
		
		this.add(pane);
	}
	
	public void crearUsuario(String usuario, String contra) {
		Usuario user = super.galeria.crearUsuario(TipoUsuario.CompradorPropieatrio,usuario, contra);
		this.setVisible(false);
		ConsolaCompradorPropietario con = new ConsolaCompradorPropietario(user, super.galeria);
		con.setVisible(true);
	}
	
	public static void main(String[] args) {
		CrearUsuario con = new CrearUsuario(new GaleriaGeneral());
		con.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}