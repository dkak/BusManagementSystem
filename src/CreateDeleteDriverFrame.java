import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class CreateDeleteDriverFrame extends JFrame {

	private JPanel mainPanel;
	private ImageIcon icon;
	private JPanel deletePanel;
	private JPanel createPanel;

	private JButton createButton;
	private JButton deleteButton;
	private JButton backButton;

	private JTextField idField;
	private JLabel idLabel;
	private JTextField passwordField;
	private JLabel passwordLabel;
	private JTextField firstNameField;
	private JLabel firstNameLabel;
	private JTextField lastNameField;
	private JLabel lastNameLabel;
	private JTextField ageField;
	private JLabel ageLabel;
	private JTextField phoneField;
	private JLabel phoneLabel;
	private JTextField deleteField;
	private Secretariat sec;
	private Driver aDriver;
	private ArrayList<Driver> driverList = new ArrayList<Driver>();

	public CreateDeleteDriverFrame(Secretariat sec) {

		this.sec = sec;

		// Create Panel, Buttons, Labels, JTextFields.
		mainPanel = new JPanel();
		icon = new ImageIcon("p2.png");
		createPanel = new JPanel();
		deletePanel = new JPanel();

		createButton = new JButton("Create Driver");
		deleteButton = new JButton("Delete Driver");
		backButton = new JButton("Back");

		idField = new JTextField(10);
		idLabel = new JLabel("ID");
		passwordField = new JTextField(10);
		passwordLabel = new JLabel("Password:");
		firstNameField = new JTextField(10);
		firstNameLabel = new JLabel("First Name:");
		lastNameField = new JTextField(10);
		lastNameLabel = new JLabel("Last Name:");
		ageField = new JTextField(10);
		ageLabel = new JLabel("Age:");
		phoneField = new JTextField(10);
		phoneLabel = new JLabel("Phone:");
		deleteField = new JTextField(10);

		// FocusListener for idTextField
		idField.setText("Enter id");
		idField.addFocusListener(new FocusListener() {

			public void focusGained(FocusEvent e) {
				if (idField.getText().equals("Enter id")) {
					idField.setText("");
				}
			}

			public void focusLost(FocusEvent arg0) {
				if (idField.getText().equals("")) {
					idField.setText("Enter id");
				}
			}
		});

		// FocusListener for passwordField
		passwordField.setText("Enter Password");
		passwordField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (passwordField.getText().equals("Enter Password")) {
					passwordField.setText("");
				}
			}

			public void focusLost(FocusEvent arg0) {
				if (passwordField.getText().equals("")) {
					passwordField.setText("Enter Password");
				}
			}
		});

		// FocusListener for firstNameField
		firstNameField.setText("Enter First Name");
		firstNameField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (firstNameField.getText().equals("Enter First Name")) {
					firstNameField.setText("");
				}
			}

			public void focusLost(FocusEvent arg0) {
				if (firstNameField.getText().equals("")) {
					firstNameField.setText("Enter First Name");
				}
			}
		});

		// FocusListener for lastNameField
		lastNameField.setText("Enter Last Name");
		lastNameField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (lastNameField.getText().equals("Enter Last Name")) {
					lastNameField.setText("");
				}
			}

			public void focusLost(FocusEvent arg0) {
				if (lastNameField.getText().equals("")) {
					lastNameField.setText("Enter Last Name");
				}
			}
		});

		// FocusListener for ageField
		ageField.setText("Enter age");
		ageField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (ageField.getText().equals("Enter age")) {
					ageField.setText("");
				}
			}

			public void focusLost(FocusEvent arg0) {
				if (ageField.getText().equals("")) {
					ageField.setText("Enter age");
				}
			}
		});

		// FocusListener for phoneField
		phoneField.setText("Enter phone");
		phoneField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (phoneField.getText().equals("Enter phone")) {
					phoneField.setText("");
				}
			}

			public void focusLost(FocusEvent arg0) {
				if (phoneField.getText().equals("")) {
					phoneField.setText("Enter phone");
				}
			}
		});

		// FocusListener for deleteField
		deleteField.setText("Enter ID");
		deleteField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (deleteField.getText().equals("Enter ID")) {
					deleteField.setText("");
				}
			}

			public void focusLost(FocusEvent arg0) {
				if (deleteField.getText().equals("")) {
					deleteField.setText("Enter ID");
				}
			}
		});

		// ButtonListener for all Buttons
		ButtonListener b1 = new ButtonListener();
		createButton.addActionListener(b1);
		deleteButton.addActionListener(b1);
		backButton.addActionListener(b1);

		// CreateDriverPanel
		createPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
		createPanel.setBorder(new TitledBorder(new EtchedBorder(), "Create Driver Area"));
		createPanel.setLayout(new GridLayout(0, 1));
		createPanel.add(firstNameLabel);
		createPanel.add(firstNameField);
		createPanel.add(lastNameLabel);
		createPanel.add(lastNameField);
		createPanel.add(ageLabel);
		createPanel.add(ageField);
		createPanel.add(phoneLabel);
		createPanel.add(phoneField);
		createPanel.add(idLabel);
		createPanel.add(idField);
		createPanel.add(passwordLabel);
		createPanel.add(passwordField);
		createPanel.add(createButton);

		// DeleteDriverPanel
		deletePanel.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.LIGHT_GRAY));
		deletePanel.setBorder(new TitledBorder(new EtchedBorder(), "Delete Driver Area"));
		deletePanel.setLayout(new GridLayout(0, 1));
		deletePanel.add(deleteField);
		deletePanel.add(deleteButton);

		// MainPanel
		mainPanel.setLayout(null);

		// Set size to panels
		createPanel.setBounds(0, 0, 280, 280);
		deletePanel.setBounds(0, 300, 280, 70);
		backButton.setBounds(110, 380, 70, 20);

		mainPanel.add(createPanel);
		mainPanel.add(deletePanel);
		mainPanel.add(backButton);

		this.setFocusable(true);
		this.setContentPane(mainPanel);
		this.setIconImage(icon.getImage());
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(290, 450);
		this.setTitle("Create/Delete Driver");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			boolean ifexistDriver = false;
			String id;

			// Create Button Function
			if (e.getSource().equals(createButton)) {
				String outcome = " ";
				aDriver = new Driver(firstNameField.getText(), lastNameField.getText(), ageField.getText(),
						phoneField.getText(), idField.getText(), passwordField.getText(), sec);

				if (aDriver.getPassword().length() < 1) {
					outcome = "Your password should be 8 characters or more.";
				}

				driverList = sec.getDriverList();

				for (Driver driver : driverList) {
					if (aDriver.getId().equals(driver.getId())) {
						outcome = "Please choose a different id.";
						JOptionPane.showMessageDialog(null, outcome);
					}
				}

				if (outcome.equals(" ")) {
					sec.addFreeDrivers(aDriver);
					sec.addDriver(aDriver);
					JOptionPane.showMessageDialog(null,
							"You have create succesfully the driver: " + aDriver.getId() + ".");

				} else {
					JOptionPane.showMessageDialog(null, outcome);
				}

			}

			// Delete Button Function
			if (e.getSource().equals(deleteButton)) {
				ifexistDriver = sec.searchIdDriver(aDriver);

				if (ifexistDriver == true) {
					sec.deleteDriver(aDriver);
					JOptionPane.showMessageDialog(mainPanel, "The driver has been deleted");

				} else {
					JOptionPane.showMessageDialog(mainPanel, "The driver does not exist in the system.");

				}

			}

			// Back Button Function
			if (e.getSource().equals(backButton)) {
				new MainSecretariatFrame(sec);
				dispose();
			}

		}

	}
}