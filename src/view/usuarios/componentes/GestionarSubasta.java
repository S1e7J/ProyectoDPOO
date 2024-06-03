package view.usuarios.componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import model.GaleriaGeneral;
import model.subastas.Oferta;
import model.subastas.Subasta;

public class GestionarSubasta extends JPanel {
	private Subasta subasta;
	private Oferta oferta;
	public GestionarSubasta(Subasta subasta, GaleriaGeneral galeria) {
		this.subasta = subasta;
		JPanel panelOferta = new JPanel();
		panelOferta.setLayout(new BoxLayout(panelOferta, BoxLayout.Y_AXIS));
		CrearOferta cOferta = new CrearOferta(galeria);
		JButton conseguirOferta = new JButton("Crear OFerta");
		conseguirOferta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				oferta = cOferta.devolverOferta();
				subasta.agregarOferta(oferta, oferta.getPieza().getIdPieza());
				cOferta.limpiar();
				// System.out.print(subasta.getOfertasPorPieza().get(oferta.getPieza().getIdPieza()).get(0).getDinero());
			}
			
		});
		panelOferta.add(cOferta);
		panelOferta.add(conseguirOferta);
		this.add(panelOferta);
	}
}
