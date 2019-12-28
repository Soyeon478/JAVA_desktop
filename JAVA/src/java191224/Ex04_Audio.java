package java191224;

public class Ex04_Audio implements Ex04_RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 Audio 볼륨 : " + volume);
	}
	
}
