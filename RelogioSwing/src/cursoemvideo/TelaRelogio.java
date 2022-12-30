package cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TelaRelogio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelogio window = new TelaRelogio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaRelogio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 438, 247);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Java-100.png"));
		frame.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("Data e Hora Atuais");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_1, BorderLayout.NORTH);
		
		JLabel lblHora = new JLabel("Clique no Bot\u00E3o");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHora.setForeground(new Color(105, 105, 105));
		lblHora.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblHora, BorderLayout.CENTER);
		
		JButton btnHora = new JButton("Clique Aqui");
		btnHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date relogio = new Date();
				lblHora.setText(relogio.toString());
			}
		});
		btnHora.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(btnHora, BorderLayout.SOUTH);
	}

}
