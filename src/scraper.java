import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class scraper {
	private HashMap<String, HashMap<String, String>> dictionary;

	void getDef(String s) {
		try {
			URL ur = new URL("https://en.wiktionary.org/wiki/" + s.toLowerCase());
			HttpURLConnection yc = (HttpURLConnection) ur.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}