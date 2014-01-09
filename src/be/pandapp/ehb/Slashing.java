package be.pandapp.ehb;
import processing.core.*;
public class Slashing extends SlashTag {
	
	boolean mouseAfterClick;
	boolean outOfPlace;
	int lastMouseX;
	


	public Slashing(float x, float y, float z, int fillColor, float scale,
			PShape headAndFoot, PShape middle, PShape text) {
		super(x, y, z, fillColor, scale, headAndFoot, middle, text);
		//this.middle = middle;
		headAndFoot.disableStyle();
		middle.disableStyle();	
		// TODO Auto-generated constructor stub
	}

	 public void draw(PApplet app) {
		 
		app.fill(123, 123, 100);
		app.ellipse(app.mouseX, app.mouseY, 20, 20);
		app.pushMatrix();
		app.translate(x, y);
		app.scale(scale);
		app.shape(headAndFoot);
		//app.shape(middle);
		app.shape(text);
		app.popMatrix();
		
		int mouseX2 = (int) (app.mouseX * 0.245);
		int lastMouseX2 = (int) (lastMouseX * 0.245);
		
		if (app.mouseX >= (x + 10) && app.mousePressed) {
			System.out.println("test1");
			outOfPlace = true;
			app.shape(middle, app.mouseX, (x + 92) - (mouseX2));
		}

		else if (lastMouseX < (x + 20)) {
			outOfPlace = false;
			mouseAfterClick = false;
			//System.out.println("test2");
		}
		if (outOfPlace && mouseAfterClick && app.mousePressed == false) {

			app.shape(middle, lastMouseX, (x + 92) - (lastMouseX2));
			lastMouseX -= 15;
			//System.out.println("test3");
		}
		else if (outOfPlace == false) {
			//System.out.println("test5");

		}

	}
	
	 
	 
	public void mouseReleased(PApplet app) {

		mouseAfterClick = true;
		lastMouseX = app.mouseX;
		//System.out.println("test6");
	}
	
	/*public void drag(PApplet app) {
		if (app.mouseX >= x && app.mouseX + 200 < x && app.mouseX >= y && app.mouseX + 200 < y) {
			
		}

	}*/

	
}
