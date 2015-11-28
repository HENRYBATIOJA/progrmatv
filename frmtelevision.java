package progrmatv;


	import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

	import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JProgressBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

	public class frmtelevision  extends JFrame {

		private JPanel contentPane;
		private JTextField txtcanal;
		private JTextField txtvolumen;
		television tv1=new television();




		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						frmtelevision frame = new frmtelevision();
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
		public frmtelevision() {
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Pablo\\Downloads\\imagnes\\1.jpg"));
			setBackground(Color.WHITE);
			setForeground(Color.RED);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 503, 360);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnEncender = new JButton("ENCENDER");
			btnEncender.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					tv1.encender();
					System.out.println("televisor encendido");
				}
			});
			btnEncender.setBounds(320, 56, 89, 23);
			contentPane.add(btnEncender);
			
			JButton btnApagar = new JButton("APAGAR");
			btnApagar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					tv1.apagar();
					System.out.println("televisor apagado");
				}
			});
			btnApagar.setBounds(320, 96, 89, 23);
			contentPane.add(btnApagar);
			
			JButton btnCanal = new JButton("CANAL++");
			btnCanal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					tv1.CambiarCanalArriba();
					txtcanal.setText("canal:"+tv1.obtenerCanal()+"");
				}
			});
			btnCanal.setBounds(320, 172, 89, 23);
			contentPane.add(btnCanal);
			
			JButton btnCanal_1 = new JButton("CANAL--");
			btnCanal_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					tv1.CambiarCanalAbajo();
					txtcanal.setText("canal:"+tv1.obtenerCanal()+"");
				}
			});
			btnCanal_1.setBounds(320, 206, 89, 23);
			contentPane.add(btnCanal_1);
			
			JButton btnSubirVol = new JButton("SUBIR VOL.");
			btnSubirVol.setForeground(Color.BLUE);
			btnSubirVol.setBackground(Color.YELLOW);
			btnSubirVol.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					tv1.SubirVolumen();
					txtvolumen.setText("volumen:"+tv1.obtenerVolumen()+"");
				}
			});
			btnSubirVol.setBounds(32, 172, 89, 23);
			contentPane.add(btnSubirVol);
			
			JButton btnBajarvol = new JButton("BAJARVOL.");
			btnBajarvol.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					tv1.BajarVolumen();
					txtvolumen.setText("volumen:"+tv1.obtenerVolumen()+"");
				}
				
			});
			btnBajarvol.setBounds(32, 206, 89, 23);
			contentPane.add(btnBajarvol);
			
			txtcanal = new JTextField();
			txtcanal.setBounds(126, 53, 157, 29);
			contentPane.add(txtcanal);
			txtcanal.setColumns(10);
			
			txtvolumen = new JTextField();
			txtvolumen.setBounds(126, 93, 157, 29);
			contentPane.add(txtvolumen);
			txtvolumen.setColumns(10);
		}
	}
