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
import java.util.Random;
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
		makeWindow();
		makeTitleLabel();
		JPanel panel = makeControlPanel();
		JPanel panel_1 = makeImagePanel();
		JLabel lblBalloon1 = balloon1Label(panel_1);
		JLabel lblBalloon2 = balloon2Label(panel_1);
		JLabel lblCompare = compareLabel(panel);
		generateBalloons(panel, lblBalloon1, lblBalloon2, lblCompare);	
	}

	private void generateBalloons(JPanel panel, JLabel lblBalloon1, JLabel lblBalloon2, JLabel lblCompare) {
		JButton btnGenerateBalloons = new JButton("Generate Balloons");
		btnGenerateBalloons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				
				String match;
				
				boolean helium1 = rand.nextBoolean();
				boolean helium2 = rand.nextBoolean();
				
				int s1 = rand.nextInt(5);
				int s2 = rand.nextInt(5);

				Balloon b1 = new Balloon(helium1, Size.values()[s1]);
				Balloon b2 = new Balloon(helium2, Size.values()[s2]);
				
				lblBalloon1.setIcon(b1.getIcon());
				lblBalloon2.setIcon(b2.getIcon());
				
				lblBalloon1.setText(b1.toString());
				lblBalloon2.setText(b2.toString());
				
				if(b1.equals(b2)) {
					match = "equal";
				} else {
					match = "not equal";
				}
				
				lblCompare.setText(match);

			}
		});
		panel.add(btnGenerateBalloons);
	}

	private JLabel compareLabel(JPanel panel) {
		JLabel lblCompare = new JLabel("compare");
		panel.add(lblCompare);
		return lblCompare;
	}

	private JLabel balloon2Label(JPanel panel_1) {
		JLabel lblBalloon2 = new JLabel("Balloon2");
		lblBalloon2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblBalloon2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBalloon2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalloon2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblBalloon2.setIcon(new ImageIcon(BalloonApp.class.getResource("/lab12_balloon/images/balloon/balloon100.jpg")));
		lblBalloon2.setBackground(Color.WHITE);
		lblBalloon2.setOpaque(true);
		panel_1.add(lblBalloon2);
		return lblBalloon2;
	}

	private JLabel balloon1Label(JPanel panel_1) {
		JLabel lblBalloon1 = new JLabel("Balloon1");
		lblBalloon1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblBalloon1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBalloon1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalloon1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblBalloon1.setIcon(new ImageIcon(BalloonApp.class.getResource("/lab12_balloon/images/balloon/balloon100.jpg")));
		lblBalloon1.setOpaque(true);
		lblBalloon1.setBackground(Color.WHITE);
		panel_1.add(lblBalloon1);
		return lblBalloon1;
	}

	private JPanel makeImagePanel() {
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 5, 0));
		return panel_1;
	}

	private JPanel makeControlPanel() {
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		return panel;
	}

	private void makeTitleLabel() {
		JLabel lblLabBalloon = new JLabel("Lab Balloon");
		lblLabBalloon.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblLabBalloon.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblLabBalloon.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabBalloon.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(lblLabBalloon, BorderLayout.NORTH);
	}

	private void makeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
