package Tag5;

import java.util.*;
import java.io.*;

public class Schleife {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		ArrayList<String> namen = new ArrayList<>();
		String weiter;
		do {
			System.out.println("Geben sie einen Namen ein:");
			namen.add(br.readLine());
			System.out.println("Möchten sie einen weiteren Namen eingeben(j/n)?");
			weiter = br.readLine();
			
		}while(weiter.equals("j"));
		System.out.println(namen);
		
	}

}
