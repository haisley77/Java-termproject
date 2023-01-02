package maingame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;



public class Application extends JFrame implements ObjectCollection  {

	private JPanel contentPane;
	private JPanel main_panel = new JPanel();
	private JPanel game_panel = new JPanel();
	private JPanel how_to_play_panel = new JPanel();
	private JTextField user_input_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor
	 */
	public Application() {
		
		makeMainPanel();
		
		makeHowPanel();
		
		makeGamePanel();
		
	}
	
	
	private void makeMainPanel() {
		setResizable(false);
		setTitle("BASEBALL GAME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 614, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		main_panel.setLayout(null);
		main_panel.setBackground(Color.WHITE);
		main_panel.setBounds(0, 0, 600, 600);
		contentPane.add(main_panel);
		
		JButton play_btn = new JButton("Play");
		play_btn.setFont(new Font("Arial", Font.BOLD, 15));
			
		JLabel background2 = new JLabel("");
		background2.setIcon(new ImageIcon(Application.class.getResource("/images/baseball-shadow.png")));
		background2.setBounds(346, 32, 242, 475);
		main_panel.add(background2);
		play_btn.setBounds(64, 480, 120, 40);
		main_panel.add(play_btn);
		
		JButton exit_btn = new JButton("Exit");
		exit_btn.setFont(new Font("Arial", Font.BOLD, 15));
		
		exit_btn.setBounds(410, 480, 120, 40);
		main_panel.add(exit_btn);
		
		JButton how_to_play_btn = new JButton("How-To-Play");
		how_to_play_btn.setFont(new Font("Arial", Font.BOLD, 13));
		
		how_to_play_btn.setBounds(235, 480, 120, 40);
		main_panel.add(how_to_play_btn);
		
		JLabel game_title = new JLabel("BASEBALL GAME");
		game_title.setHorizontalAlignment(SwingConstants.CENTER);
		game_title.setFont(new Font("Berlin Sans FB", Font.BOLD, 45));
		game_title.setBounds(12, 50, 438, 96);
		main_panel.add(game_title);
		
		JLabel background1 = new JLabel("");
		background1.setIcon(new ImageIcon(Application.class.getResource("/images/ball.png")));
		background1.setBounds(0, 0, 600, 600);
		main_panel.add(background1);
		
		
		// ActionListener
		play_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				main_panel.setVisible(false);
				game_panel.setVisible(true);
				GENERATOR.pickRandomNumber();
				
			}
		});
		
		how_to_play_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				main_panel.setVisible(false);
				how_to_play_panel.setVisible(true);
				
			}
		});
		
		exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}

	private void makeGamePanel() {
		game_panel.setBounds(0, 0, 600, 600);
		contentPane.add(game_panel);
		game_panel.setLayout(null);
		
		JPanel enter_panel = new JPanel();
		enter_panel.setBackground(new Color(0, 255, 128));
		enter_panel.setBounds(0, 0, 250, 600);
		game_panel.add(enter_panel);
		enter_panel.setLayout(null);
		game_panel.setVisible(false);
		
		user_input_text = new JTextField();
		user_input_text.setFont(new Font("Arial", Font.BOLD, 36));
		user_input_text.setToolTipText("");
		user_input_text.setHorizontalAlignment(SwingConstants.CENTER);
		user_input_text.setBounds(50, 150, 150, 50);
		enter_panel.add(user_input_text);
		user_input_text.setColumns(10);
		
		JButton enter_btn = new JButton("Input");
		enter_btn.setFont(new Font("Arial", Font.PLAIN, 12));
		
		enter_btn.setBounds(80, 270, 85, 50);
		enter_panel.add(enter_btn);
		
		JLabel background = new JLabel("New label");
		background.setIcon(new ImageIcon(Application.class.getResource("/images/baseball-background1.png")));
		background.setBounds(0, 0, 250, 600);
		enter_panel.add(background);
		
		JPanel result_panel = new JPanel();
		result_panel.setBackground(new Color(255, 255, 255));
		result_panel.setBounds(250, 0, 350, 600);
		game_panel.add(result_panel);
		result_panel.setLayout(null);
		
		
		JLabel pic1 = new JLabel("");
		pic1.setIcon(new ImageIcon(Application.class.getResource("/images/1.png")));
		pic1.setBounds(0, 0, 420, 700);
		result_panel.add(pic1);
		pic1.setVisible(false);

		
		JLabel pic2 = new JLabel("");
		pic2.setIcon(new ImageIcon(Application.class.getResource("/images/2.png")));
		pic2.setBounds(0, 0, 420, 700);
		result_panel.add(pic2);
		pic2.setVisible(false);
		
		JLabel pic3 = new JLabel("");
		pic3.setIcon(new ImageIcon(Application.class.getResource("/images/3.png")));
		pic3.setBounds(0, 0, 420, 700);
		result_panel.add(pic3);
		pic3.setVisible(false);
		
		JLabel pic4 = new JLabel("");
		pic4.setIcon(new ImageIcon(Application.class.getResource("/images/4.png")));
		pic4.setBounds(0, 0, 420, 700);
		result_panel.add(pic4);
		pic4.setVisible(false);
		
		JLabel pic5 = new JLabel("");
		pic5.setIcon(new ImageIcon(Application.class.getResource("/images/5.png")));
		pic5.setBounds(0, 0, 420, 700);
		result_panel.add(pic5);
		pic5.setVisible(false);
		
		JLabel pic6 = new JLabel("");
		pic6.setIcon(new ImageIcon(Application.class.getResource("/images/6.png")));
		pic6.setBounds(0, 0, 420, 700);
		result_panel.add(pic6);
		pic6.setVisible(false);
		
		
		JLabel pic7 = new JLabel("");
		pic7.setIcon(new ImageIcon(Application.class.getResource("/images/7.png")));
		pic7.setBounds(0, 0, 420, 700);
		result_panel.add(pic7);
		pic7.setVisible(false);
		
		
		// ActionListener
		enter_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				try {
					PLAY.play(user_input_text.getText());
				}catch (Exception e) {	
			   	}finally {

			   		if (GAME.try_count == 1) {
						checkSuccessCase(pic1);
					}
			   		if (GAME.try_count == 2) {
						pic1.setVisible(false);
						checkSuccessCase(pic2);
					}
			   		if (GAME.try_count == 3) {
						pic2.setVisible(false);
						checkSuccessCase(pic3);
					}
			   		if (GAME.try_count == 4) {
						pic3.setVisible(false);
						checkSuccessCase(pic4);
					}
					if (GAME.try_count == 5) {
						pic4.setVisible(false);
						checkSuccessCase(pic5);
					}
					if (GAME.try_count == 6) {
						pic5.setVisible(false);
						checkSuccessCase(pic6);
					}
					if (GAME.try_count == 7) {
						pic6.setVisible(false);
						checkSuccessCase(pic7);
					}
					// Restart case -> reset
					if (GAME.try_count == 0){
						pic1.setVisible(false);
						pic2.setVisible(false);
						pic3.setVisible(false);
						pic4.setVisible(false);
						pic5.setVisible(false);
						pic6.setVisible(false);
						pic7.setVisible(false);
					}

			   	}
				
			}

			private void checkSuccessCase(JLabel pic) {
				// Success
				if (GAME.strike == 3) {
					OUTPUT.printGameSuccessMessage();
					PLAY.checkRestart();

				}
				// Fail
				if (GAME.strike != 3) {
					pic.setVisible(true);
					// Last
					if (GAME.try_count == 7) {
						OUTPUT.printGameFailMessage();
						PLAY.checkRestart();
					}
				}
			}
			
		});
	}

	private void makeHowPanel() {
		
		how_to_play_panel.setLayout(null);
		how_to_play_panel.setBackground(new Color(255, 255, 255));
		how_to_play_panel.setBounds(0, 0, 600, 600);
		contentPane.add(how_to_play_panel);
		how_to_play_panel.setVisible(false);
		
		JLabel how_label = new JLabel("<How-To-Play>");
		how_label.setHorizontalAlignment(SwingConstants.CENTER);
		how_label.setFont(new Font("Arial", Font.BOLD, 20));
		how_label.setBounds(200, 26, 183, 33);
		how_to_play_panel.add(how_label);
		
		JLabel step1 = new JLabel("1. Click the [PLAY] button.");
		step1.setHorizontalAlignment(SwingConstants.CENTER);
		step1.setFont(new Font("Arial", Font.BOLD, 18));
		step1.setBounds(20, 82, 538, 22);
		how_to_play_panel.add(step1);
		
		JLabel step2 = new JLabel("2. Enter a 3-digits-number which you think is the answer.");
		step2.setHorizontalAlignment(SwingConstants.CENTER);
		step2.setFont(new Font("Arial", Font.BOLD, 18));
		step2.setBounds(20, 124, 538, 22);
		how_to_play_panel.add(step2);
		
		JLabel step3 = new JLabel("3. Check a message from your screen about balls and strikes.");
		step3.setHorizontalAlignment(SwingConstants.CENTER);
		step3.setFont(new Font("Arial", Font.BOLD, 18));
		step3.setBounds(10, 165, 584, 22);
		how_to_play_panel.add(step3);
		
		JLabel step4 = new JLabel("4. Repeat step 2-4 until your number is correct.");
		step4.setHorizontalAlignment(SwingConstants.CENTER);
		step4.setFont(new Font("Arial", Font.BOLD, 18));
		step4.setBounds(20, 211, 538, 22);
		how_to_play_panel.add(step4);
		
		
		JCheckBox check_box = new JCheckBox("I understand how to play this game.");
		check_box.setBackground(new Color(255, 255, 255));
		check_box.setHorizontalAlignment(SwingConstants.CENTER);
		check_box.setFont(new Font("Arial", Font.PLAIN, 13));
		check_box.setBounds(150, 290, 298, 23);
		how_to_play_panel.add(check_box);
		
		JButton back_btn = new JButton("Back");
		back_btn.setFont(new Font("Arial", Font.BOLD, 12));
		back_btn.setBounds(250, 342, 91, 23);
		how_to_play_panel.add(back_btn);
		
		
		
		
		// ActionListener
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check_box.isSelected()) {
					how_to_play_panel.setVisible(false);
					main_panel.setVisible(true);
				}
				if (!check_box.isSelected()) {
					JOptionPane.showMessageDialog(null, "Check the box");
				}
			}
		});
		
	}
}
