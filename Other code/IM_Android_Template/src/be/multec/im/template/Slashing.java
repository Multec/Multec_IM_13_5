package be.multec.im.template;

import processing.core.*;

public class Slashing extends SlashTag {

	private boolean mouseAfterClick;
	private boolean outOfPlace;
	private int lastMouseX;
	private boolean draggable;

	public Slashing(float x, float y, float z, int fillColor, float scale,
			PShape headAndFoot, PShape middle, PShape text, boolean draggable) {
		super(x, y, z, fillColor, scale, headAndFoot, middle, text);
		this.draggable = draggable;

	}

	public void draw(MainActivity app) {
		float localX = app.mouseX - x;
		//app.ellipse(app.mouseX, app.mouseY, 20, 20);
		app.pushMatrix();
		app.translate(x, y);
		app.scale(scale);
		app.shape(headAndFoot);
		app.popMatrix();

		if (draggable == true) {

			if (app.mouseX >= x && app.mousePressed) {
				outOfPlace = true;
				app.shape(middle, app.mouseX, (int) (y - localX * 0.245));
				app.shape(text, app.mouseX, (int) (y - localX * 0.245));

			}

			else if (!app.mousePressed) {
			/*	app.shape(middle, x, y);
				app.shape(text, x, y);*/

			}

			else if (lastMouseX < app.mouseX) {
				outOfPlace = false;
				mouseAfterClick = false;
				System.out.println("outofplace");

			}

			if (outOfPlace && mouseAfterClick && app.mousePressed == false) {
				/*app.shape(middle, x, y);
				app.shape(text, x, y);*/
				lastMouseX -= 15;

			}
		}
		else {
			app.shape(middle, x, y);
			app.shape(text, x, y);
		}

	}

	public void mouseReleased(MainActivity app) {
		mouseAfterClick = true;
		lastMouseX = app.mouseX;

	}

	public boolean isDraggable() {
		return draggable;
	}

	public void setDraggable(boolean draggable) {
		this.draggable = draggable;
	}
}
