package java191224;

// 두 개의 interface를 구현하는 클래스
public class Ex04_SmartTelevision implements Ex04_RemoteControl, Ex04_InternetSearch {

	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > Ex04_RemoteControl.MAX_VOLUME) {
			this.volume = Ex04_RemoteControl.MAX_VOLUME;
		} else if (volume < Ex04_RemoteControl.MIN_VOLUME) {
			this.volume = Ex04_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 스마트 TV 볼륨 : " + volume);
	}

}
