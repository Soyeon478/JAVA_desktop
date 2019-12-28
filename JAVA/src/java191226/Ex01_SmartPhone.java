package java191226;

public class Ex01_SmartPhone extends Ex01_PDA implements Ex01_MobilePhone, Ex01_MP3{

	@Override
	public void sendCall() {
		System.out.println("전화를 겁니다.");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화를 끊습니다.");
	}

	@Override
	public void musicOn() {
		System.out.println("음악을 재생합니다.");
	}

	@Override
	public void musicOff() {
		System.out.println("음악 재생을 정지합니다.");
	}

	@Override
	public void sendMessage() {
		System.out.println("메시지를 보냅니다.");
	}

	@Override
	public void receiveMessage() {
		System.out.println("메시지를 받습니다");
	}
	
}
