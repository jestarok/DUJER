package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JTextField;

import datos.Cliente;
import datos.Company;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;

import javax.swing.JFormattedTextField;

public class Registrar_cliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_nombre;
	private JTextField textField_apellido1;
	private JTextField textField_apellido2;
	private JTextField textField_correo;
	private JTextField textField_telefono;
	private JTextField textField_usuario;
	private JTextField textField_clave;
	private Cliente clienteTemp;
	private JTextField textFieldTarjeta;
	private JTextField textFieldCodigo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Registrar_cliente dialog = new Registrar_cliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Registrar_cliente() {
		setTitle("Registrar Cliente");
		setBounds(100, 100, 457, 467);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 25, 66, 15);
		contentPanel.add(lblNombre);
		
		textField_nombre = new JTextField();
		textField_nombre.setBounds(120, 23, 238, 17);
		contentPanel.add(textField_nombre);
		textField_nombre.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido: ");
		lblPrimerApellido.setBounds(10, 60, 94, 14);
		contentPanel.add(lblPrimerApellido);
		
		textField_apellido1 = new JTextField();
		textField_apellido1.setColumns(10);
		textField_apellido1.setBounds(120, 57, 238, 17);
		contentPanel.add(textField_apellido1);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido: ");
		lblSegundoApellido.setBounds(10, 91, 117, 14);
		contentPanel.add(lblSegundoApellido);
		
		textField_apellido2 = new JTextField();
		textField_apellido2.setColumns(10);
		textField_apellido2.setBounds(120, 91, 238, 17);
		contentPanel.add(textField_apellido2);
		
		JLabel lblCorreo = new JLabel("Correo: ");
		lblCorreo.setBounds(10, 125, 46, 14);
		contentPanel.add(lblCorreo);
		
		textField_correo = new JTextField();
		textField_correo.setColumns(10);
		textField_correo.setBounds(120, 122, 238, 17);
		contentPanel.add(textField_correo);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono: ");
		lblTelfono.setBounds(10, 160, 79, 14);
		contentPanel.add(lblTelfono);
		
		textField_telefono = new JTextField();
		textField_telefono.setColumns(10);
		textField_telefono.setBounds(120, 157, 238, 17);
		contentPanel.add(textField_telefono);
		
		JLabel lblUsuario = new JLabel("Usuario:   ");
		lblUsuario.setBounds(10, 236, 66, 14);
		contentPanel.add(lblUsuario);
		
		textField_usuario = new JTextField();
		textField_usuario.setColumns(10);
		textField_usuario.setBounds(120, 229, 238, 17);
		contentPanel.add(textField_usuario);
		
		JLabel lblClave = new JLabel("Clave:  ");
		lblClave.setBounds(10, 265, 46, 14);
		contentPanel.add(lblClave);
		
		textField_clave = new JTextField();
		textField_clave.setColumns(10);
		textField_clave.setBounds(120, 262, 238, 17);
		contentPanel.add(textField_clave);
		
		JLabel lblIdioma = new JLabel("Idioma: ");
		lblIdioma.setBounds(10, 198, 46, 14);
		contentPanel.add(lblIdioma);
		
		final JComboBox comboBoxIdioma = new JComboBox();
		comboBoxIdioma.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol", "Ingles"}));
		comboBoxIdioma.setBounds(120, 185, 238, 27);
		contentPanel.add(comboBoxIdioma);
		
		JLabel lblTarjeta = new JLabel("Tarjeta:   ");
		lblTarjeta.setBounds(10, 292, 79, 14);
		contentPanel.add(lblTarjeta);
		
		textFieldTarjeta = new JTextField();
		textFieldTarjeta.setColumns(10);
		textFieldTarjeta.setBounds(120, 290, 238, 17);
		contentPanel.add(textFieldTarjeta);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:   ");
		lblCdigo.setBounds(10, 328, 66, 14);
		contentPanel.add(lblCdigo);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setColumns(10);
		textFieldCodigo.setBounds(120, 326, 238, 17);
		contentPanel.add(textFieldCodigo);
		
		JLabel lblExpiracin = new JLabel("Expiraci\u00F3n: ");
		lblExpiracin.setBounds(10, 363, 66, 14);
		contentPanel.add(lblExpiracin);
		
		MaskFormatter mask = null;
        try {
           
            mask = new MaskFormatter("##/##");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
		final JFormattedTextField formattedTextField = new JFormattedTextField(mask);
		formattedTextField.setBounds(120, 360, 238, 17);
		
		
		contentPanel.add(formattedTextField);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clienteTemp = new Cliente(textField_nombre.getText(), textField_apellido1.getText(), textField_apellido2.getText(), comboBoxIdioma.getSelectedItem().toString(), " ", textField_correo.getText(), textField_telefono.getText(), textField_usuario.getText(), textField_clave.getText(), textFieldTarjeta.getText(), Integer.parseInt(textFieldCodigo.getText()), formattedTextField.getText());
						Company.getIntances().getClientes().add(clienteTemp);
						JOptionPane.showMessageDialog(null, "El nuevo cliente ha sido añadido exitosamente");

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
