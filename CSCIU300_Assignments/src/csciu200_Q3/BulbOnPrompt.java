package csciu200_Q3;

public class BulbOnPrompt implements Prompt{
	Bulb bulb;
	public BulbOnPrompt(Bulb bulb) {
		this.bulb = bulb;
	}
	public void execute() {
		bulb.flashOn();
		
	}
}
