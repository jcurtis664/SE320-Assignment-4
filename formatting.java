import java.text.NumberFormat;
import java.util.*;

public class formatting {
	public static void main(String[] args) {
		//FORMAT FOR UK LOCALE
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.UK);
		numberFormat.setMaximumFractionDigits(2);
		
		System.out.println("UK LOCALE : " + numberFormat.format(12345.678));
		
		//FORMAT FOR US CURRENCY
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US CURRENCY : " + currencyFormat.format(12345.678));
		
		//PARSE FORMATTED NUMBER INTO NORMAL NUMBER
		numberFormat = NumberFormat.getInstance(Locale.US);
		
		try {
			System.out.println("PARSED NUMBER : " + numberFormat.parse("12,345.678"));
		}
		catch (java.text.ParseException e)	{
			System.out.println("Parse Failed");
		}
	}
}
