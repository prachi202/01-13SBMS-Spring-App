package in.ashokit.beans;

public class Car {
	private IEngine eng;

	public Car() {
		System.out.println("Car class :: constructor");

	}

	public void setEng(IEngine eng)
	{
		this.eng = eng;
	}
	 

	public void drive() {
		int engStatus = eng.start();
		if (engStatus == 1) {
			System.out.println("journey started");
		}

		else {
			System.out.println("journey failed to start");
		}
	}




}
