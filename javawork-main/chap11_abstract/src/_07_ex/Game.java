package _07_ex;

public class Game implements Product {
	
	private boolean isPowerOn = false;
	private int volume = 0;
	private String game = "";

	@Override
	public void powerOn() {
		isPowerOn = true;
	}

	@Override
	public void powerOff() {
		isPowerOn = false;
	}

	@Override
	public void volumeUp(int volume) {
		if(isPowerOn) {
			this.volume += volume;
			System.out.println("volume : " + this.volume);
		}
		else {
			System.out.println("power off");
		}
	}

	@Override
	public void volumeDown(int volume) {
		if(isPowerOn) {
			this.volume -= volume;
			System.out.println("volume : " + this.volume);
		}
		else {
			System.out.println("power off");
		}
		
	}
	
	public void switchGame(String game) {
		if(isPowerOn) {
			this.game = game;
			System.out.println("channel : " + this.game);
		}
		else {
			System.out.println("power off");
		}
	}

}
