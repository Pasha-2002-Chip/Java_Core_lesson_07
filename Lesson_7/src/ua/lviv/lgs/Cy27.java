package ua.lviv.lgs;

public class Cy27 extends Plane implements TurboAcceleration, NuclearStrike, StealthTechnology {

	public Cy27(double length, double width, double weight, double maxSpeed) {
		super(length, width, weight, maxSpeed);
	}

	@Override
	public void nuclearStrike() {
		int warheads = 0 + (int) (Math.random() * 10);
		System.out.println(
				"Скидаю ядерні боєголовки. Кількість ядерних боєголовок які буде скинуто " + warheads + " боєголовок.");
	}

	@Override
	public void turboAcceleration() {
		double acceleration = (0 + (double) (Math.random() * 300)) + getMaxSpeed();
		System.out.println("Включаю турбо прискорення. Швидкість літака після прискорення " + acceleration + " км/год.");

	}

	@Override
	public void stealthTechnology() {
		int stealthTime = 0 + (int) (Math.random() * 200);
		System.out.println("Включаю технологію стелс. Технологія стелс включиться на " + stealthTime + " c.");

	}

}
