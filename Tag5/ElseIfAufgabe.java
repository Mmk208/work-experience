package Tag5;
import java.io.*;

public class ElseIfAufgabe {
	public static void main(String[] args) throws IOException {
		while(true) {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Geben sie eine Zahle zwischen 1 und 12 ein:");
			String eingabe = br.readLine();
			int zahl = Integer.parseInt(eingabe);
			
			if(zahl == 1){
				System.out.println("January");
			}
			else if(zahl == 2){
				System.out.println("February");
			}
			else if(zahl == 3){
				System.out.println("March");
			}
			else if(zahl == 4){
				System.out.println("April");
			}
			else if(zahl == 5){
				System.out.println("May");
			}
			else if(zahl == 6){
				System.out.println("June");
			}
			else if(zahl == 7){
				System.out.println("July");
			}
			else if(zahl == 8){
				System.out.println("August");
			}
			else if(zahl == 9){
				System.out.println("September");
			}
			else if(zahl == 10){
				System.out.println("October");
			}
			else if(zahl == 11){
				System.out.println("November");
			}
			else if(zahl == 12){
				System.out.println("December");
			}
			else {
				System.err.println("Der Wert ist nicht im Rahmen der möglichen Zahlen");
			}

		}

	}
}
