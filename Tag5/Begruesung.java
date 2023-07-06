package Tag5;
import java.io.*;

public class Begruesung {

	public static void main(String[] args) throws IOException {
		while(true) {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Geben sie den Namen ein:");
			String eingabe = br.readLine();
			System.out.println("Geben sie den Passwort ein:");
			String passwort = br.readLine();

			if(eingabe.equals("Paul") || eingabe.equals("paul") && passwort.equals("xyz")) {

				System.out.println("Willkommen"+ " " + eingabe);

			}
			else {

				System.err.println("Der Zugriff ist nicht erlaubt");
				break;

			}

		}
	}

}
