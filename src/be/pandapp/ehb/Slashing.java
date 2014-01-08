package be.pandapp.ehb;

import processing.core.*;

public class Slashing extends SlashTag {

	boolean mouseAfterClick;
	boolean outOfPlace;
	int lastMouseX;
	PApplet app;

	public Slashing(float x, float y, float z, int fillColor, float scale,
			PShape headAndFoot, PShape middle, PShape text, PApplet app) {
		super(x, y, z, fillColor, scale, headAndFoot, middle, text);
		this.app = app;
		// TODO Auto-generated constructor stub

	}

	int mouseX2 = (int) (app.mouseX * 0.245);
	int lastMouseX2 = (int) (lastMouseX * 0.245);

	public void draw() {
		if (app.mouseX >= 410 && app.mousePressed) {

			outOfPlace = true;

			app.shape(middle, app.mouseX, 492 - (mouseX2));
		}

		else if (lastMouseX < 420) {
			outOfPlace = false;
			mouseAfterClick = false;
		}

		if (outOfPlace && mouseAfterClick && app.mousePressed == false) {

			app.shape(middle, lastMouseX, 492 - (lastMouseX2));
			lastMouseX -= 15;
		}

		else if (outOfPlace == false) {

		}

	}

	public void mouseReleased() {

		mouseAfterClick = true;
		lastMouseX = app.mouseX;
	}

}
