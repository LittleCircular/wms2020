package p1.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.baidu.com/");
			System.out.println(url.getPort());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(url.openStream()));
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
