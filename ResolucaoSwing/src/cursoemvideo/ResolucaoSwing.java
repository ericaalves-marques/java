package cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResolucaoSwing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResolucaoSwing window = new ResolucaoSwing();
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
	public ResolucaoSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 377, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\remote_desktop_connection_icon.png"));
		frame.getContentPane().add(lblNewLabel, BorderLayout.EAST);
		
		JLabel lblNewLabel_1 = new JLabel("Resolu\u00E7\u00E3o da Tela:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1, BorderLayout.NORTH);
		
		JLabel lblResolucao = new JLabel("Aperte o Bot\u00E3o");
		lblResolucao.setHorizontalAlignment(SwingConstants.CENTER);
		lblResolucao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResolucao.setForeground(UIManager.getColor("Button.darkShadow"));
		frame.getContentPane().add(lblResolucao, BorderLayout.CENTER);
		
		JButton btnResolucao = new JButton("Mostrar Resolu\u00E7\u00E3o");
		btnResolucao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toolkit t = Toolkit.getDefaultToolkit();
				Dimension d = t.getScreenSize();
				lblResolucao.setText(d.width + " " + d.height);
			}
		});
		btnResolucao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(btnResolucao, BorderLayout.SOUTH);
	}

}
