package java191224;

// 구현클래스
public class Ex04_Television implements Ex04_RemoteControl {

	// 필드 선언
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
	// 재정의할때 public 사용
	@Override
	public void setMute(boolean mute) {
		System.out.println("음소거");
	}
	
}
