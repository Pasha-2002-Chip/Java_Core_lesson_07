package ua.lviv.lgs;

public abstract class Plane extends AircraftControl {

	private double length;
	private double width;
	private double weight;
	private double maxSpeed;

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getWeight() {
		return weight;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public Plane(double length, double width, double weight, double maxSpeed) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
	}

	public void startingEngine() {
		int time = 20 + (int) (Math.random() * 88);
		System.out.println("Запускаю двигун. Готовність до вильту " + time + " c.");
	}

	public void takePlane() {
		double flightLength = 0 + (double) (Math.random() * 1000);
		System.out.println("Взлітаю дальність польту літакана повному баці " + flightLength + " км.");
	}

	public void landingPlane() {
		System.out.println("Знижаюсь. Літак іде на посадку.");
	}

}
