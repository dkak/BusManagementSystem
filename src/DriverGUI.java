import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class DriverGUI extends JFrame{
	
	private JPanel panel;
	private ImageIcon icon;
	private JLabel img;
	private JButton ScheduleButton;
	private JButton InboxButton;
	private JButton EmergencyButton;
	private JButton LogOutButton;
	private Driver aDriver;
	private Secretariat sec;
	private int id;
	private JFrame mainMenuFrame;
	
	public DriverGUI(Driver aDriver, Secretariat sec) {
		this.aDriver = aDriver;
		this.sec = sec;
		panel = new JPanel();
		icon = new ImageIcon("p2.png");
		img = new JLabel(new ImageIcon("p7.png"));
		ScheduleButton = new JButton("Show Schedule");
		InboxButton = new JButton("Show Messages");
		EmergencyButton = new JButton("Emergency!");
		LogOutButton = new JButton("Logout");
		ScheduleButton.setFont(new Font("Show Schedule", Font.PLAIN,20)); 
		InboxButton.setFont(new Font("Messages", Font.PLAIN, 20)); 
		EmergencyButton.setFont(new Font("Emergency", Font.PLAIN, 20));
		EmergencyButton.setForeground(Color.RED);
		LogOutButton.setFont(new Font("Logout", Font.PLAIN, 15));
		LogOutButton.setBackground(Color.LIGHT_GRAY);
		
		ButtonListener listener = new ButtonListener();
		ScheduleButton.addActionListener(listener);
		InboxButton.addActionListener(listener);
		EmergencyButton.addActionListener(listener);
		LogOutButton.addActionListener(listener);
		
		panel.setLayout(null);
		img.setBounds(35, 5, 200, 200);
		ScheduleButton.setBounds(45, 225, 185, 40);
		InboxButton.setBounds(45, 285, 185, 40);
		EmergencyButton.setBounds(45, 345, 185, 40);
		LogOutButton.setBounds(155, 420, 95, 25);
		
		
		panel.add(img);
		panel.add(ScheduleButton);
		panel.add(InboxButton);
		panel.add(EmergencyButton);
		panel.add(LogOutButton);
		
		this.setContentPane(panel);
		this.setIconImage(icon.getImage());
		this.setTitle("Driver Page");
		this.setSize(300, 500);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(ScheduleButton)) {
				ScheduleGUI sch = new ScheduleGUI(sec,aDriver);
			}
		    if(e.getSource().equals(InboxButton)) {
		    	MessagesDriverGUI mess = new MessagesDriverGUI(sec,aDriver);
			}
		    if(e.getSource().equals(EmergencyButton)) {
		    	sec.addEmergncy(aDriver);
			}
		    if(e.getSource().equals(LogOutButton)) {
		    	mainMenuFrame.setVisible(true);;
		    	dispose();
			}
			
		}
	}


	public void setMainMenuFrame(JFrame mainMenuFrame) {
		this.mainMenuFrame=mainMenuFrame;
	}
	
	
	
}