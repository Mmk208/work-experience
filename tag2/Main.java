package tag2;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Eingabe Kontonummer
		Scanner sc = new Scanner(System.in);
		final List<Konto> kontos = new ArrayList<>(); //erstellen einer Liste

		while (true) {//unendliche Schleife
			System.out.println("Please enter your account number, such as 0000");
			String n = sc.nextLine();//Eingabe Kontonummer

			//Überprüfung der Kontonummer
			// check length first
			if(n.length() != 4) {
				System.err.println("Wrong account number, please 4 digits");
				continue;// wenn es sind nicht vier Zeichen, dann Fehlermeldung anzeigen und dann weitermachen
			}

			// check content for digits only
			boolean hasFailed = false;
			for (int i = 0; i < n.length(); i++) {
				if (!Character.isDigit(n.charAt(i))) {//wenn die Zeichen keine Zahlen sind, dann findet ein break statt
					hasFailed = true;
					break;
				}
			}
			// communicate failure and restart 
			if (hasFailed) {//es geht dann hier weiter
				System.err.println("Wrong account number, please use digits only");
				continue;//wieder eine fehlermeldung, dann soll es wieder weitermachen
			}
			
			Konto currentKonto = null;
			for (final Konto konto : kontos)//für das konto die Liste Kontos durchsuchen
			{
				if (konto.getId().equals(n))//wenn das Konto id ist gleich der Kontonummer die eingegeben wurde
					// dann ist das currentKonto gleich dem konto(id)
				{
					currentKonto = konto;
					break; //dann wieder break
				}
			}
			
			if (currentKonto == null) // aber wenn das Konto doch leer ist, dann wird ein neues Konto erstellt
			{
				currentKonto = new Konto(n, 1000);//mit der Eigenschaft das der Balance/Kontostand gleich 1000 euro ist
				kontos.add(currentKonto);//das neue Konto wird der Liste hinzugefügt
			}

			System.out.println("Your Balance right now:" + currentKonto.getBalance());
			// input withdrawal amount
			int amount = 0; // Die Geldmenge ist erstmal 0
			while (true) {// erstellen einer neuen unendlichen Schleife
				System.out.println("Type the amount that you want to get: ");
				String inputAmount = sc.nextLine();//input des amounts

				// verify
				boolean valid = verifyAmountInput(inputAmount);//überprüfen ob das inoputAmount aus Zahlen besteht
				if (valid) {//wenn es stimmt, dann wird aus dem String ein Integer
					amount = Integer.parseInt(inputAmount);
					break;//wieder ein break
				}
				System.err.println("Please enter a number");//wenn das nicht so ist dann Fehlermeldung 
			}

			// verify that we can withdraw
			final boolean withdrawalTestResult = currentKonto.verifyWithdrawal(amount);
			if (!withdrawalTestResult) {//hier überprüft man ob amount nicht größer als der Kontostand ist
				System.err.println("Your account is not covered");//eine Fehlermeldung wenn es falsch ist
				continue;//den Prozess wiederholen
			}

			// withdraw it
			currentKonto.substractTheMoney(amount);//hier subtrahiert man die Geldmenge vom Kontostand

			System.out.println("Your new Balance: " + currentKonto.getBalance()); // den Kontostand am Ende anzeigen
			System.out.println("Thanks for using our service!!!!");//Dankeschön ausrichtung an die Kunden als Abschluss
		}
		}

	private static boolean verifyAmountInput(String amount) {//Methode die überprüft ob der amount kleiner oder größer ist als Kontostand
		try {//wird genutzt um die Ausnahme zu behandeln und Programmablauf fortzusetzen
			int a = Integer.parseInt(amount); //amount wird in int umgewandelt
		}
		catch(NumberFormatException e){//konventiert in das Int Format
			return false;//wenn das so ist, dann gibt es als Falsch zurück
		}

		return true;//wenn nicht, dann gibt es als Wahr wieder zurück
	}
}



