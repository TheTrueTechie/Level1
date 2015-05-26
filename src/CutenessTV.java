import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JButton Button1 = new JButton();
	JButton Button2 = new JButton();
	JButton Button3 = new JButton();

	public static void main(String[] args) {
		CutenessTV A = new CutenessTV();
		A.showCode();

	}

	void showCode() {

		mainFrame.setVisible(true);
		mainPanel.setVisible(true);
		Button1.setVisible(true);
		Button2.setVisible(true);
		Button3.setVisible(true);

		mainFrame.add(mainPanel);
		mainPanel.add(Button1);
		mainPanel.add(Button2);
		mainPanel.add(Button3);

		mainFrame.setTitle("CutenessTV");
		mainFrame.setSize(150, 150);

		Button1.setText("Show Ducks");
		Button2.setText("Show Frog");
		Button3.setText("Show Fluffy Unicorns");

		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);

		mainFrame.pack();
	}

	static void showDucks() {
		playVideo("T0Rne4KbZSE");
	}

	static void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	static void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	static void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID
					+ "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent B1) {
		JButton buttonpressed = (JButton) B1.getSource();

		if (buttonpressed == Button1) {
			System.out.println("B1");
			showDucks();
		}
		if (buttonpressed == Button2) {
			System.out.println("B2");
			showFrog();
		}
		if (buttonpressed == Button3) {
			System.out.println("B3");
			showFluffyUnicorns();
		}
	}
}
