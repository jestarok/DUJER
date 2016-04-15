package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import java.util.Date;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

import datos.Company;
import datos.Empleado;

import com.toedter.calendar.JDateChooser;

public class Registrar_empleado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldApellido2;
	private JTextField textFieldCorreo;
	private JTextField textFieldTelefono;
	private JTextField textFieldUsuario;
	private JTextField textFieldClave;
	private JTextField textFieldCedula;
	private JTextField textFieldHoras;
	private JTextField textFieldPlaca;
	private JTextField textFieldMarca;
	private JTextField textFieldModelo;
	private JTextField textFieldColor;
	private JTextField textFieldYearr;
	private Empleado empleado_temp;
	private JTextField textFieldDireccion;
	private Company company;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Registrar_empleado dialog = new Registrar_empleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Registrar_empleado() {
		setTitle("Registrar Empleado");
		setBounds(100, 100, 754, 480);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 410, 395);
		contentPanel.add(panel);
		
		JLabel label = new JLabel("Nombre: ");
		label.setBounds(10, 25, 66, 15);
		panel.add(label);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(151, 25, 238, 17);
		panel.add(textFieldNombre);
		
		JLabel label_1 = new JLabel("Primer Apellido: ");
		label_1.setBounds(10, 60, 94, 14);
		panel.add(label_1);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(151, 59, 238, 17);
		panel.add(textFieldApellido);
		
		JLabel label_2 = new JLabel("Segundo Apellido: ");
		label_2.setBounds(10, 91, 117, 14);
		panel.add(label_2);
		
		textFieldApellido2 = new JTextField();
		textFieldApellido2.setColumns(10);
		textFieldApellido2.setBounds(151, 93, 238, 17);
		panel.add(textFieldApellido2);
		
		JLabel label_3 = new JLabel("Correo: ");
		label_3.setBounds(10, 125, 46, 14);
		panel.add(label_3);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setColumns(10);
		textFieldCorreo.setBounds(151, 124, 238, 17);
		panel.add(textFieldCorreo);
		
		JLabel label_4 = new JLabel("Tel\u00E9fono: ");
		label_4.setBounds(10, 160, 79, 14);
		panel.add(label_4);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(151, 159, 238, 17);
		panel.add(textFieldTelefono);
		
		JLabel label_5 = new JLabel("Usuario:   ");
		label_5.setBounds(10, 236, 66, 14);
		panel.add(label_5);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBounds(151, 231, 238, 17);
		panel.add(textFieldUsuario);
		
		JLabel label_6 = new JLabel("Clave:  ");
		label_6.setBounds(10, 265, 46, 14);
		panel.add(label_6);
		
		textFieldClave = new JTextField();
		textFieldClave.setColumns(10);
		textFieldClave.setBounds(151, 264, 238, 17);
		panel.add(textFieldClave);
		
		JLabel lblNewLabel = new JLabel("C\u00E9dula:");
		lblNewLabel.setBounds(10, 302, 66, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_1.setBounds(10, 199, 117, 14);
		panel.add(lblNewLabel_1);
		
		textFieldCedula = new JTextField();
		textFieldCedula.setColumns(10);
		textFieldCedula.setBounds(151, 301, 238, 17);
		panel.add(textFieldCedula);
		
		JLabel lblMinimoHorasSem = new JLabel("Minimo horas sem.:");
		lblMinimoHorasSem.setBounds(10, 332, 117, 15);
		panel.add(lblMinimoHorasSem);
		
		textFieldHoras = new JTextField();
		textFieldHoras.setColumns(10);
		textFieldHoras.setBounds(151, 331, 238, 17);
		panel.add(textFieldHoras);
		
		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(151, 193, 238, 27);
		panel.add(dateChooser);
		
		textFieldPlaca = new JTextField();
		textFieldPlaca.setColumns(10);
		textFieldPlaca.setBounds(502, 25, 206, 20);
		contentPanel.add(textFieldPlaca);
		
		JLabel label_7 = new JLabel("Placa: ");
		label_7.setBounds(433, 25, 46, 14);
		contentPanel.add(label_7);
		
		JLabel label_8 = new JLabel("Marca: ");
		label_8.setBounds(433, 64, 46, 14);
		contentPanel.add(label_8);
		
		textFieldMarca = new JTextField();
		textFieldMarca.setColumns(10);
		textFieldMarca.setBounds(502, 64, 206, 20);
		contentPanel.add(textFieldMarca);
		
		textFieldModelo = new JTextField();
		textFieldModelo.setColumns(10);
		textFieldModelo.setBounds(502, 108, 206, 20);
		contentPanel.add(textFieldModelo);
		
		JLabel label_9 = new JLabel("Modelo:    ");
		label_9.setBounds(433, 108, 65, 14);
		contentPanel.add(label_9);
		
		JLabel label_10 = new JLabel("Color:    ");
		label_10.setBounds(433, 148, 46, 14);
		contentPanel.add(label_10);
		
		textFieldColor = new JTextField();
		textFieldColor.setColumns(10);
		textFieldColor.setBounds(502, 148, 206, 20);
		contentPanel.add(textFieldColor);
		
		textFieldYearr = new JTextField();
		textFieldYearr.setColumns(10);
		textFieldYearr.setBounds(502, 186, 206, 20);
		contentPanel.add(textFieldYearr);
		
		JLabel label_11 = new JLabel("A\u00F1o: ");
		label_11.setBounds(433, 186, 46, 14);
		contentPanel.add(label_11);
		
		JLabel label_12 = new JLabel("Veh\u00EDculo:  ");
		label_12.setBounds(433, 223, 65, 14);
		contentPanel.add(label_12);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Autom\u00F3vil", "Vud"}));
		comboBox.setBounds(502, 217, 206, 20);
		contentPanel.add(comboBox);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:  ");
		lblDireccin.setBounds(433, 265, 65, 14);
		contentPanel.add(lblDireccin);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setColumns(10);
		textFieldDireccion.setBounds(502, 262, 206, 20);
		contentPanel.add(textFieldDireccion);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						java.sql.Date pdate;
						
						pdate = (java.sql.Date) dateChooser.getDate();
					
						empleado_temp = new Empleado(textFieldNombre.getText(), textFieldApellido.getText(), textFieldApellido2.getText(), "Español", textFieldDireccion.getText(), textFieldCorreo.getText(), textFieldTelefono.getText(), textFieldUsuario.getText(), textFieldClave.getText() , textFieldCedula.getText(), pdate, Integer.parseInt(textFieldHoras.getText()));
						Company.getIntances().getEmpleados().add(empleado_temp);
						JOptionPane.showMessageDialog(null, "El nuevo empleado ha sido añadido exitosamente");
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			} 
			{
				JButton cancelButton = new JButton("Guardar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
