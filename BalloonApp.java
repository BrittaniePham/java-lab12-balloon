package lab12_balloon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BalloonApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalloonApp frame = new BalloonApp();
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
	public BalloonApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblLabBalloon = new JLabel("Lab Balloon");
		contentPane.add(lblLabBalloon, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JLabel lblCompare = new JLabel("compare");
		panel.add(lblCompare);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 5, 0));
		
		JLabel lblBalloon1 = new JLabel("Balloon1");
		lblBalloon1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblBalloon1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBalloon1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalloon1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblBalloon1.setIcon(new ImageIcon(BalloonApp.class.getResource("/lab12_balloon/images/balloon/balloon100.jpg")));
		lblBalloon1.setOpaque(true);
		lblBalloon1.setBackground(Color.WHITE);
		panel_1.add(lblBalloon1);
		
		JLabel lblBalloon2 = new JLabel("Balloon2");
		lblBalloon2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblBalloon2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBalloon2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalloon2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblBalloon2.setIcon(new ImageIcon(BalloonApp.class.getResource("/lab12_balloon/images/balloon/balloon100.jpg")));
		lblBalloon2.setBackground(Color.WHITE);
		lblBalloon2.setOpaque(true);
		panel_1.add(lblBalloon2);
		
		JButton btnGenerateBalloons = new JButton("Generate Balloons");
		btnGenerateBalloons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Balloon b1 = new Balloon(false, Size.XS);
				Balloon b2 = new Balloon(false, Size.XS);
			}
		});
		panel.add(btnGenerateBalloons);
	}

}
