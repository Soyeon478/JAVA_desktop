package java191226;

public class Ex01_SmartPhoneMain {

	public static void main(String[] args) {
		
		Ex01_SmartPhone sp = new Ex01_SmartPhone();
		
		sp.sendCall();
		sp.receiveCall();
		sp.sendMessage();
		sp.receiveMessage();
		sp.musicOn();
		sp.musicOff();
		System.out.println(sp.sum(5, 10));

	}

}
