import acm.graphics.*;
import acm.program.*;

public class Add2Integers extends ConsoleProgram { //DialogProgram { 
	public void run() {
		println ("This program adds 2 integers \n");
		int n1 = readInt ("Enter n1: ");
		int n2 = readInt ("Enter n2: ");
		int total = n1 + n2;
		println ("The total is " + total + ".");
	}

}
