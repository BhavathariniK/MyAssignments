package org.system;

public class Desktop extends Computer {

	public void desktopSize() 
	{
		System.out.println("Desktop Size is 33");

	}

	public static void main(String[] args) 
	{

		Desktop dd = new Desktop();
		dd.computerModel();
		dd.desktopSize();

	}
}
