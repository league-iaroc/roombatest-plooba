package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(500,500);
		sleep(1700);
		driveDirect(100,500);
		sleep(900);
		driveDirect(500,500);
		sleep(7000);
		driveDirect(100,500);
		sleep(600);
		driveDirect(100000,100000);
		
	}

	public void loop() {
	
	}
}
