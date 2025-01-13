package _07_ex;

public class Tv implements Product {
	
	private boolean isPowerOn = false;
	private int volume = 0;
	private int channel = 1;

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
	
	public void setChannel(int ch) {
		if(isPowerOn) {
			this.channel = ch;
			System.out.println("channel : " + this.channel);
		}
		else {
			System.out.println("power off");
		}
	}

}
