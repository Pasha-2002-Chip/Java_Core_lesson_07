package ua.lviv.lgs;

public class AircraftControl {

	public void moveUp() {
		System.out.println("Піднімаю висоту польту. Літак піднімається в верх на " + Math.random() + " км.");

	}

	public void moveDown() {
		System.out.println("Знижую висоту польту. Літак опускається в низ на " + Math.random() + " км.");

	}

	public void moveRight() {
		System.out.println("Повертаю в право. Літак летить в право на " + Math.random() + " км.");

	}

	public void moveLeft() {
		System.out.println("Повертаю в ліво. Літак летить в ліво на " + Math.random() + " км.");

	}

}
