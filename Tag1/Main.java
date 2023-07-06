package Tag1;

import java.math.BigDecimal;
import java.text.NumberFormat;
//Util helps to  input the information
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		while(true) {
			Scanner sc = new Scanner(System.in);
			// The person must to enter, how many money does it want. So this is an input
			System.out.println("Type 'en' if your language is English or 'de' if your language is German or 'ru' if your language is Russian");
			Locale usLocale = Locale.US;
			Locale deLocale = Locale.GERMANY;
			Locale ruLocale = Locale.GERMANY;

			BigDecimal number1 = new BigDecimal(1000.00d);
			NumberFormat usNumberFormat = NumberFormat.getCurrencyInstance(usLocale); 

			BigDecimal number2 = new BigDecimal(1000.00d);
			NumberFormat deNumberFormat = NumberFormat.getCurrencyInstance(deLocale); 


			BigDecimal number3 = new BigDecimal(1000.00d);
			NumberFormat ruNumberFormat = NumberFormat.getCurrencyInstance(ruLocale); 
			String d = sc.nextLine();


			if(d.equals("en")){ // if it's English, than print .....
				AtmMachine K1 = new AtmMachine(number1);
				System.out.println("Enter your Code:");
				BigDecimal a = sc.nextBigDecimal();
				System.out.println(a);
				System.out.println("Your Account Balance:"  + usNumberFormat.format(K1.Balance));
				System.out.println("Enter the money supply: ");
				BigDecimal b = sc.nextBigDecimal();
				System.out.println("The money supply you want to have: " + b);
				System.out.println("  ");
				System.out.println("........................................Loading...............................................");
				System.out.println("  ");
				System.out.println("Your new Account Balance:" + usNumberFormat.format(K1.geldAuszahlung(b)));
				System.out.println("----------------------------------------------------------------");
				System.out.println("Thanks for using our service");
				BigDecimal a1 = K1.geldAuszahlung(b);
				a1 = K1.Balance;

			}
			
			
			
			

			else if(d.equals("de")) {// if it's German, than print this.....
				AtmMachine K2 = new AtmMachine(number2);
				System.out.println("Gib deinen Code ein:");
				BigDecimal a = sc.nextBigDecimal();
				System.out.println(a);
				System.out.println("Dein Kontostand:"  + deNumberFormat.format(K2.Balance));					
				System.out.println("Schreibe die Geldmenge: ");
				BigDecimal b = sc.nextBigDecimal();
				System.out.println("Geldmenge, die du haben willst: " + b);
				System.out.println("  ");
				System.out.println("........................................Laden...............................................");
				System.out.println("  ");
				System.out.println("Dein neuer Kontostand:" + deNumberFormat.format(K2.geldAuszahlung(b)));
				System.out.println("----------------------------------------------------------------");
				System.out.println("Danke für die Nutzung von unserem Service");
				AtmMachine number;

			}
			
			

			else if(d.equals("ru")) {// if it's Russian, than print this.....
				AtmMachine K3 = new AtmMachine(number3);
				System.out.println("напишите ваш код:");
				BigDecimal a = sc.nextBigDecimal();
				System.out.println(a);
				System.out.println("ваш счет:"  + ruNumberFormat.format(K3.Balance));
				System.out.println("напишите сумму денег для снятия со счета: ");
				BigDecimal b = sc.nextBigDecimal();
				System.out.println("сумма денег которую вы хотите получить: " + b);
				System.out.println("  ");
				System.out.println("........................................загрузка...............................................");
				System.out.println("  ");
				System.out.println("твой новый баланс:" + ruNumberFormat.format(K3.geldAuszahlung(b)));
				System.out.println("----------------------------------------------------------------");
				System.out.println("спасибо что используете наш сервис");

			}
			else {

				System.out.println("Error");

			}
		}


	}


 }





