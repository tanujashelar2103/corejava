package com.Interface;

public class MainShowMessages {

	public static void main(String[] args) {
   ShowMessages message =
		   msg -> System.out.println(msg);
		   message.displayMessage("Hello read this message!");
	}

}
