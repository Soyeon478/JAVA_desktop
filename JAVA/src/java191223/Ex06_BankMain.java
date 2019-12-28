package java191223;

public class Ex06_BankMain extends Ex06_HanaBank {

	public static void main(String[] args) {
		
		Ex06_WooriBank wb = new Ex06_WooriBank();
		Ex06_KbBank kb = new Ex06_KbBank();
		Ex06_HanaBank hb = new Ex06_HanaBank();
		
		wb.interstRete();
		kb.interstRete();
		hb.interstRete();
		
	}

}
