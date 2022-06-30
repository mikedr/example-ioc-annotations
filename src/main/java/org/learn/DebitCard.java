package org.learn;

import org.springframework.stereotype.Component;

@Component("theDC")
public class DebitCard {
	
	public int fund() {
		return 100;
	}
}
