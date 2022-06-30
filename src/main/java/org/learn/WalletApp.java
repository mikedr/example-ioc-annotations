package org.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WalletApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context  = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		DebitCard debitCard = context.getBean("theDC", DebitCard.class);
		System.out.println("La wallet se fondeo con: $"+debitCard.fund());
		context.close();
	}
}
