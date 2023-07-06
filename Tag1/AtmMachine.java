package Tag1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.*; //Util helps to  input the information

public class AtmMachine {

	public AtmMachine(BigDecimal number){
		Balance = number;	// balance number
	}

	BigDecimal geldAuszahlung(BigDecimal b) {
		return Balance.subtract(b); // balance number - b
	}
	BigDecimal Balance;
	


	public Object build() {
		return null;
	}
	public void setLanguage(String string) {
		// TODO Auto-generated method stub

	}

}








