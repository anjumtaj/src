package src;

import acm.graphics.*;
import acm.program.*;

public class HelloProgram extends GraphicsProgram {
	
	public void run() {
		
		add (new GLabel("hello world", 100, 75));
		add (new GLabel("This is the x = 0, y = 10 co-ordinate", 0, 10));
	}

} 
