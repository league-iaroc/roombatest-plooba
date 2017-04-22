package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(500,500);
	sleep(2500);
	driveDirect(-100,100);
	sleep(1200);
	driveDirect(500,500);
	sleep(2500);
	driveDirect(100,-100);
	sleep(1300);
	driveDirect(500,500);
	sleep(2100);
	driveDirect(-100,100);
	sleep(1000);
	driveDirect(500,500);
	sleep(200);
	

	if(isBumpedRight()){
		driveDirect(-100,-100);
	}
	
	
	}

	public void loop() {
	
	}
}
