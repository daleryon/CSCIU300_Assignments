package csciu200_Q2;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 10, c = 10, d = 10;
		switch (b = a++ % 3) //a = 2; b = 1 (10/3 = 3 but remainder of 1 -- 1 is answer)
		{
		
		//a++ = add
		//++a = updated value
		
		case 1: //Why have empties?
		case 0:
			c = --a / ++b; //a = 1; b = 2; c = 0 (a/b or 1/2 = .5 but in Java it is 0 bc of remainder)
		case 2:
			d = (a == b) ? a++ : --b;
			break;
		default: //default is only optional for switch statements
			d++;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
