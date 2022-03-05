package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("size of desktop - 64bit");
	}
	
public static void main(String[] args) {
	
	
	Desktop desktop=new Desktop();
	desktop.desktopSize();
	desktop.computerModel();
}
}
