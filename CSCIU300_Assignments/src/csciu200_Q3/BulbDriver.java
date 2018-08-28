package csciu200_Q3;

/* Design and implement a class called Bulb that represents a light bulb that can be turned
 * on and off.
 * This class needs to have methods for turning the bulb on and off, and checking the bulb
 * is on or off.
 */

public class BulbDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WallController wallcontroller = new WallController();
		Bulb bulb = new Bulb();
		Prompt bulbOn = new BulbOnPrompt(bulb);
		Prompt bulbOff = new BulbOffPrompt(bulb);
		
		wallcontroller.setPrompt(bulbOn);
		wallcontroller.flipSwitch();
		
		wallcontroller.setPrompt(bulbOff);
		wallcontroller.flipSwitch();
		
	}


}
