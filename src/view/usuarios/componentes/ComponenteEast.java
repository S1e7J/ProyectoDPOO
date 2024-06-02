package view.usuarios.componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import model.GaleriaGeneral;
import model.inventario.Pieza;

public class ComponenteEast extends JPanel implements ActionListener{
	private GaleriaGeneral galeria;
	
	public ComponenteEast(GaleriaGeneral galeria) {
		this.galeria = galeria;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JButton verCuadros = new JButton("Ver Cuadros");
		verCuadros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Pieza> piezas = galeria.conseguirPiezas();
				MostrarPiezas dPieza = new MostrarPiezas(piezas);
				dPieza.setVisible(true);
			}
		});
		this.add(verCuadros);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}