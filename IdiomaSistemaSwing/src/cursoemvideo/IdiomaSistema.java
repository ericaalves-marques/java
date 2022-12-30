package cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class IdiomaSistema {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdiomaSistema window = new IdiomaSistema();
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
	public IdiomaSistema() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 420, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\globo2.png"));
		frame.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("Idioma do Sistema");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1, BorderLayout.NORTH);
		
		JLabel lblidioma = new JLabel("Aperte o Bot\u00E3o");
		lblidioma.setHorizontalAlignment(SwingConstants.CENTER);
		lblidioma.setForeground(UIManager.getColor("Button.darkShadow"));
		lblidioma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblidioma, BorderLayout.CENTER);
		
		JButton btnidioma = new JButton("Mostrar Idioma");
		btnidioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Locale loc = Locale.getDefault();
				String idioma = loc.getDisplayLanguage();
				lblidioma.setText(idioma);
				
			}
		});
		frame.getContentPane().add(btnidioma, BorderLayout.SOUTH);
	}

}
