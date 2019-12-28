package java191224;

public class Ex04_RemoteControlMain {

	public static void main(String[] args) {
		
		Ex04_Television tv = new Ex04_Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(5);
		tv.setMute(true);
		
		// Audio크래스를 RemoteControl의 구현클래스로 정의하여
		// 메소드 등을 정의하고 main 클래스에서 다형성을 적용하여
		// TV, Audio 객체를 만들어 메소드를 호출해보세요.
		
		Ex04_RemoteControl rc = new Ex04_Television();
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(false);
		rc.turnOff();
		
		rc = new Ex04_Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		
		Ex04_RemoteControl.changeBattery();
		System.out.println(Ex04_RemoteControl.MAX_VOLUME);
		
		rc = new Ex04_SmartTelevision();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(false);
		Ex04_InternetSearch is = new Ex04_SmartTelevision();
		is.search("www.naver.com");
		
	}

}
