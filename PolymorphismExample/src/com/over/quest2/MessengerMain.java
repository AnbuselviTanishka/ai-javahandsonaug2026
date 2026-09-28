package com.over.quest2;

public class MessengerMain {

	public static void main(String[] args) {
		Messenger msg=new Messenger();
		msg.sendMail("hai how are you");
		msg.sendMail("Tanishka","Welcome to java programming");
        msg.sendMail("Sastika","Welcome to python programming","Sub: course invite");
	}

}
