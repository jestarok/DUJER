package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Dujer Sti");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnRegistros = new JMenu("Registros");
		menuBar.add(mnRegistros);
		
		JMenuItem mntmNuevoCliente = new JMenuItem("Nuevo Cliente");
		mntmNuevoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registrar_cliente nuevo_cliente = new Registrar_cliente();
				nuevo_cliente.setVisible(true);
			}
		});
		mnRegistros.add(mntmNuevoCliente);
		
		JMenuItem mntmNuevoEmpleado = new JMenuItem("Nuevo Empleado");
		mnRegistros.add(mntmNuevoEmpleado);
		
		JMenu mnDatos = new JMenu("Datos");
		menuBar.add(mnDatos);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ver_clientes vc = new ver_clientes();
				vc.setVisible(true);
			}
		});
		mnDatos.add(mntmClientes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
