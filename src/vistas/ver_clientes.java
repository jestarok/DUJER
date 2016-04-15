package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;



import datos.Cliente;
import datos.Company;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ver_clientes extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel tableModel;
	private Object[] fila;
	private Company company;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			ver_clientes dialog = new ver_clientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public ver_clientes() {
		setTitle("Clientes");
		setBounds(100, 100, 449, 334);
		getContentPane().setLayout(null);
		{
			tableModel = new DefaultTableModel();
			String[] columnNames = { "Nombre", "Apellido", "Tel\u00E9fono", "Tarjeta"};
			tableModel.setColumnIdentifiers(columnNames);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 11, 414, 239);
			getContentPane().add(scrollPane);
			
			table = new JTable();
			/*table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Nombre", "Apellido", "Tel\u00E9fono", "Tarjeta"
					)
				}*/
			 {
				boolean[] columnEditables = new boolean[] {
					false, true, true, true
				};
				
			/*table.getColumnModel().getColumn(0).setPreferredWidth(153);
			table.getColumnModel().getColumn(1).setPreferredWidth(139);
			table.getColumnModel().getColumn(2).setPreferredWidth(140);
			table.getColumnModel().getColumn(3).setPreferredWidth(188);*/
			
			table.setModel(tableModel);
			scrollPane.setViewportView(table);
			
		
		}
		loadCliente();
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setBounds(335, 261, 89, 23);
		getContentPane().add(btnOk);}
		
	
	}

	
	private void loadCliente() {
		
		tableModel.setRowCount(0);
		fila = new Object[tableModel.getColumnCount()];
		
		for (Cliente cli : company.getIntances().getClientes())
		{
							fila[0] = cli.getNombre();
							fila[1] = cli.getP_apellido();
							fila[2] = cli.getTelefono();
							fila[3] = cli.getTarjeta();
							tableModel.addRow(fila);
							
						
			
				
				}
		table.setModel(tableModel);
}
}

