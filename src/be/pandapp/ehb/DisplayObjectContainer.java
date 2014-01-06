package be.pandapp.ehb;

import java.util.ArrayList;

import processing.core.PApplet;

/**
 * @author Wouter Van den Broeck
 * @author Louis Rigot
 *
 */
public class DisplayObjectContainer extends DisplayObject {

	/**
	 * Constructor for a container that contains sub-DisplayObject objects.
	 * 
	 * @param x Value on the x-axis (horizontal) in the 3D-window.
	 * @param y Value on the y-axis (vertical) in the 3D-window.
	 * @param z Value on the z-axis (depth) in the 3D-window.
	 */
	public DisplayObjectContainer(float x, float y, float z) {
		super(x, y, z);
	}
	
	private ArrayList<DisplayObject> children = new ArrayList<DisplayObject>();
	
	/**
	 * Adds a DisplayObject to the container
	 * 
	 * @param child The desired child to add to the container.
	 */
	public void addChild(DisplayObject child) {
		children.add(child);
	}

	/**
	 * @return the children
	 */
	public ArrayList<DisplayObject> getChildren() {
		return children;
	}


	/**
	 * Draws all children of the DisplayObjectContainer after applying
	 * transformations to the container.
	 */
	public void draw(PApplet app) {
		app.pushMatrix();
		app.translate(x, y, z);
		app.rotateX(rotX);
		app.rotateY(rotY);
		app.rotateZ(rotZ);
		app.scale(scale);
		for (DisplayObject child : children) {
			child.draw(app);
		}
		app.popMatrix();
	}

}
