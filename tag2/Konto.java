package tag2;

import java.util.ArrayList;//import der bestimmten Java utils
import java.util.List;

public class Konto {//erstellen der Klasse "Konto"
	private int balance;//angabe der Standarteigenschaften
	private String id;

	
	/**
	 * Create a new konto with an id and a given balance
	 * 
	 * @param id the id to use
	 * @param balance the balance given
	 */
	public Konto(final String id, final int balance) {//erstellen eines zugreifbares Konstruktors
		this.id = id;
		this.balance = balance;
	}
	
	public String getId()//erstellen der Methode, mit der man auf die ID von den Kontos zugreifen kann
	{
		return id;
	}
	
	/**
	 * Return the current balance
	 * 
	 * @return returns the current balance of the account
	 */
	public int getBalance() {//erstellen einer weiteren Methode, die den Balance des Kontos wiedergibt
		return balance;
	}

	/**
	 * Checks if we can withdraw the amount
	 * @param amount the amount to withdraw
	 * @return true if we have a good balance, false otherwise
	 */
	public boolean verifyWithdrawal(int amount){//Methode, die prüft ob der amount kleiner als der Kontostand ist
		return balance >= amount;
	}
	
	public int substractTheMoney(int amount){//Methode, die das amount von dem Kontostand subtrahiert
		this.balance = this.balance - amount;
		return getBalance();
		
	}

}
