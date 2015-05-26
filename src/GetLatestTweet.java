import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.Query;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	public static void main(String[] args) {
		GetLatestTweet A = new GetLatestTweet();
		A.startCode();

	}
	
	private void startCode() {
		JFrame mainFrame = new JFrame();
		JPanel mainPanel = new JPanel();
		JButton Button1 = new JButton();
		JTextField Text1 = new JTextField(15);

		mainFrame.add(mainPanel);
		mainPanel.add(Button1);
		mainPanel.add(Text1);

		mainFrame.setVisible(true);
		mainPanel.setVisible(true);

		mainFrame.setTitle("Get Latest Tweet");
		Button1.setText("Search Twitter");

		Button1.addActionListener(this);
		
		mainFrame.pack();
	}
	

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String searchTerm = Text1.getT
	
}
	}

}
