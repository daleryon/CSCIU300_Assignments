package csciu200_Q3;

public class BulbOffPrompt implements Prompt{
	Bulb bulb;

	public BulbOffPrompt(Bulb bulb) {
		this.bulb = bulb;
	}
	public void execute() {
		bulb.flashOff();
		
	}
}
