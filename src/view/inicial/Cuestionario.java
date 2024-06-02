package view.inicial;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import model.usuarios.TipoUsuario;

public class Cuestionario extends JPanel implements ActionListener {
	
	private ConsolaInicial consola;

	public Cuestionario(ConsolaInicial con) {
		this.consola = con;
		
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		JLabel lUsuario = new JLabel("Usuario: ");
		JTextField tfUsuario = new JTextField();
		tfUsuario.setMaximumSize(new Dimension(400, 20));
		tfUsuario.setPreferredSize(new Dimension(200, 20));
		this.add(lUsuario);
		this.add(tfUsuario);
		JLabel lContra = new JLabel("Contraseña: ");
		JTextField tfContra = new JTextField();
		this.add(lContra);
		this.add(tfContra);
		
		JPanel pTipoUsuario = new JPanel();
		pTipoUsuario.setLayout(new FlowLayout());
		ButtonGroup gBoton = new ButtonGroup();
		JRadioButton compradorPropietario = new JRadioButton();
		compradorPropietario.setText("Comprador/Propietario");
		compradorPropietario.setActionCommand("Comprador");
		compradorPropietario.setSelected(true);
		gBoton.add(compradorPropietario);
		JRadioButton operador = new JRadioButton();
		operador.setText("Operador");
		operador.setActionCommand("Operador");
		gBoton.add(operador);
		JRadioButton cajero = new JRadioButton();
		cajero.setText("Cajero");
		cajero.setActionCommand("Cajero");
		gBoton.add(cajero);
		JRadioButton admin = new JRadioButton();
		admin.setActionCommand("Admin");
		admin.setText("Admin");
		gBoton.add(admin);
		pTipoUsuario.add(compradorPropietario);
		pTipoUsuario.add(cajero);
		pTipoUsuario.add(operador);
		pTipoUsuario.add(admin);
		this.add(pTipoUsuario);
		
		JPanel btnsEnvio = new JPanel();
		btnsEnvio.setLayout(new FlowLayout());
		JButton ingresar = new JButton("Ingresar ");
		ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoUsuario tipo = getTipoUsuario(gBoton.getSelection().getActionCommand());
				consola.gestionarInicioSesion(new IHUsuario(tipo, tfUsuario.getText(), tfContra.getText()));
			}
		});
		JButton crearUsuario = new JButton("Crear Usuario ");
		crearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.crearUsuario();
			}
		});
		btnsEnvio.add(ingresar);
		btnsEnvio.add(crearUsuario);
		this.add(btnsEnvio);
	}
	
	public TipoUsuario getTipoUsuario(String dUsuario) {
		switch (dUsuario) {
		case "Comprador":
			return TipoUsuario.CompradorPropieatrio;
		case "Cajero":
			return TipoUsuario.Cajero;
		case "Admin":
			return TipoUsuario.Administrador;
		case "Operador":
			return TipoUsuario.Operador;
		default:
			return TipoUsuario.CompradorPropieatrio;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
