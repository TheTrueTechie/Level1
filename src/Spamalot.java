import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	static final String FAKE_USERNAME = "bobthenobisreal@gmail.com";
	static final String FAKE_PASSWORD = "bobthenobisreal123";

	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JButton Button1 = new JButton();
	JButton Button2 = new JButton();
	JButton Button3 = new JButton();
	JButton Button4 = new JButton();
	JTextField TextField1 = new JTextField(15);

	public static void main(String[] args) {
		Spamalot A = new Spamalot();
		A.startCode();
	}

	private void startCode() {
		mainFrame.setVisible(true);
		mainPanel.setVisible(true);
		TextField1.setVisible(true);
		Button1.setVisible(true);
		Button2.setVisible(true);
		Button3.setVisible(true);
		Button4.setVisible(true);

		mainFrame.add(mainPanel);
		mainPanel.add(TextField1);
		mainPanel.add(Button1);
		mainPanel.add(Button2);
		mainPanel.add(Button3);
		mainPanel.add(Button4);

		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);
		Button4.addActionListener(this);

		Button1.setText("Bad (Email)");
		Button2.setText("Good (Email)");
		Button3.setText("Bad (Mobile)");
		Button4.setText("Good (Mobile)");

		mainFrame.pack();

	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(
								FAKE_USERNAME, FAKE_PASSWORD);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	String sendTextMessage(String phoneNumber, String message) {
		if (sendSpam(phoneNumber + "@tmomail.net", "1", message))
			return "T-Mobile";
		if (sendSpam(phoneNumber + "@vmobl.com", "1", message))
			return "Virgin Mobile";
		if (sendSpam(phoneNumber + "@cingularme.com", "1", message))
			return "Cingular";
		if (sendSpam(phoneNumber + "@messaging.sprintpcs.com", "1", message))
			return "Sprint";
		if (sendSpam(phoneNumber + "@vtext.com", "1", message))
			return "Verizon";
		if (sendSpam(phoneNumber + "@messaging.nextel.com", "1", message))
			return "Nextel";
		return "FAIL!";
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		System.out.println("Clicked!");
		if (buttonPressed == Button2) {
			//sendSpam(TextField1.getText(), "Your Getting Spammed!","https://www.youtube.com/TheTrueTechie, http://www.thetruetechies.com/");
			sendSpam("youngtechscholars@gmail.com", "Your Getting Spammed!",
					"https://www.youtube.com/TheTrueTechie, http://www.thetruetechies.com/");
			TextField1.setBackground(Color.GREEN);
		}
		if (buttonPressed == Button1) {
			sendSpam("boulderbuff64@gmail.com", "Your Getting Spammed!",
					"I know who you are. I know where you live. I AM BATMAN! P.S You Suck");
			TextField1.setBackground(Color.RED);
		}
		if (buttonPressed == Button3) {
			String phone = sendTextMessage("3032047925", "Hello!");
			System.out.println(phone);
			TextField1.setBackground(Color.GREEN);
		}
		if (buttonPressed == Button4) {
			String phone = sendTextMessage("3032047925", "Hello!");
			System.out.println(phone);
			TextField1.setBackground(Color.GREEN);
		}
	}

}
