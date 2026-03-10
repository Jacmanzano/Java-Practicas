import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class Hotel extends JFrame {

	//POR DEFECTO
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	//MODIFICADOS
	ArrayList<Habitacion> listaHab = new ArrayList<>();
	private JTextField nombre;
	private JTextField reserv_hab;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel frame = new Hotel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Hotel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Bienvenida = new JLabel("Bienvenido al Hotel Manzano");
		Bienvenida.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		Bienvenida.setBounds(10, 0, 246, 37);
		contentPane.add(Bienvenida);
		
		JLabel CrearHab = new JLabel("Crear Nueva Habitacion");
		CrearHab.setFont(new Font("Tahoma", Font.BOLD, 12));
		CrearHab.setBounds(10, 38, 152, 14);
		contentPane.add(CrearHab);
		
		JLabel txt_nombre = new JLabel("Nombre: ");
		txt_nombre.setBounds(10, 63, 58, 14);
		contentPane.add(txt_nombre);
		
		nombre = new JTextField();
		nombre.setBounds(70, 60, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel txt_camas = new JLabel("Num camas: ");
		txt_camas.setBounds(10, 91, 77, 14);
		contentPane.add(txt_camas);
		
		JSpinner camas = new JSpinner();
		camas.setBounds(87, 88, 30, 20);
		contentPane.add(camas);
		
		JLabel txt_precio = new JLabel("Precio: ");
		txt_precio.setBounds(10, 119, 54, 14);
		contentPane.add(txt_precio);

		//PASAMOS EL SPINNER A DOUBLE
		JSpinner precio = new JSpinner();
		precio.setModel(new SpinnerNumberModel(70.0, 20.0, 250.0, 0.5));
		precio.setBounds(64, 116, 58, 20);
		contentPane.add(precio);
		
		JCheckBox reservada = new JCheckBox("Está Reservada?");
		reservada.setBounds(10, 153, 131, 23);
		contentPane.add(reservada);
		
		//RESULTADO
		JLabel result = new JLabel("");
		result.setFont(new Font("Tahoma", Font.BOLD, 13));
		result.setBounds(252, 193, 147, 37);
		contentPane.add(result);
		
		JButton btn_crear = new JButton("Guardar Habitacion");
		btn_crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nombHab = nombre.getText();
					int numCamas = (int) camas.getValue();
					double precHab = (double) precio.getValue();
					boolean reserv = reservada.isSelected();
					
					if(reserv == true) {
						Habitacion reservHab = new Habitacion(nombHab, numCamas, precHab, reserv);
						listaHab.add(reservHab);
					} else {
						Habitacion noReservHab = new Habitacion(nombHab, numCamas, precHab);
						listaHab.add(noReservHab);
					}
					
					nombre.setText(null);
					camas.setValue(0);
					precio.setValue(70.0);
					
				} catch(Exception error_hab) {
					JOptionPane.showMessageDialog(contentPane, "Error al crear la habitacion.");
				}
			}
		});
		btn_crear.setBounds(10, 183, 145, 23);
		contentPane.add(btn_crear);
		
		JButton btn_crear_1 = new JButton("Limpiar Datos");
		btn_crear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre.setText(null);
				camas.setValue(0);
				precio.setValue(70.0);
			}
		});
		btn_crear_1.setBounds(10, 215, 145, 23);
		contentPane.add(btn_crear_1);
		
		JLabel txt_reservarhab = new JLabel("Reservar Habitacion");
		txt_reservarhab.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_reservarhab.setBounds(247, 39, 152, 14);
		contentPane.add(txt_reservarhab);
		
		JLabel txt_nombre_1 = new JLabel("Nombre: ");
		txt_nombre_1.setBounds(227, 63, 54, 14);
		contentPane.add(txt_nombre_1);
		
		reserv_hab = new JTextField();
		reserv_hab.setColumns(10);
		reserv_hab.setBounds(282, 60, 86, 20);
		contentPane.add(reserv_hab);
		
		JButton reservar = new JButton("Reservar");
		reservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean encontrada = false;
				
				for(Habitacion a : listaHab) {
					if(a.getNombre().equals(reserv_hab.getText())) {
						String resReserva = a.reservar();
						result.setText(resReserva);
						encontrada = true;
						break;
					}
				}
				if(encontrada ==  false) {
					result.setText("Habitación no existente");
				}
			}
		});
		reservar.setBounds(272, 87, 89, 23);
		contentPane.add(reservar);

	}
}
