package csciu200_Q3;

public class Bulb {
	private boolean on;
	public void flashOn() {
		setOn(true);
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	private boolean off;
	public void flashOff() {
		setOn(false);
	}
	public boolean isOff() {
		return off;
	}
	public void setOff(boolean off) {
		this.off = off;
	}
}
