package modulo;

public class Amazingrings {
	void setup() {
		size(500, 500);
	}

	void draw() {

		int x = 10;
		int y = 10;

		for (int i = 0; i < 15; i++) {
			noFill();
			x += 10;
			y += 10;
			ellipse(100, 250, x, y);

		}
	}

	int x = 10;
	int y=10;

	for(
	int i = 0;i<15;i++)
	{
		noFill();
		x += 10;
		y += 10;
		ellipse(400, 250, x, y);
	}
}
