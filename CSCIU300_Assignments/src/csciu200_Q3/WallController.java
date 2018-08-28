package csciu200_Q3;

public class WallController {
	private Prompt prompt;
	public void setPrompt(Prompt prompt) {
		this.prompt = prompt;
	}
	public void flipSwitch() {
		prompt.execute();
	}
}
