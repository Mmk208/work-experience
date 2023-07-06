package Tag5;
import java.io.*;

public class IF2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		while(true) {
			System.out.println("Geben sie die Zahl 3 ein:");
			String eingabe = br.readLine();
			int zahl = Integer.parseInt(eingabe);

			if(zahl == 3){
				System.out.println("Die Eingabe ist richtig.");

			}

			else if (zahl != 3){
				System.err.println("Die Zahl ist falsch");

			}
		}
	}

}
