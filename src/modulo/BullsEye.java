package modulo;

public class BullsEye {
	void setup() {
		size(200, 200);
	}

	void draw() {

		int x = 10;
		int y = 10;

		for (int i = 0; i < 15; i++) {
			noFill();
			x += 10;
			y += 10;
			ellipse(100, 100, x, y);

		}
		ellipse(100, 100, 10, 10);
	}
}
