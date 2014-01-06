/**
 * 
 */
package be.pandapp.ehb;

import processing.core.PApplet;
import processing.core.PShape;

/**
 * @author Pindamannetje
 *
 */
public class SlashTag extends Shape {
	
	float width;
	float height;
	PShape shape;
	
	public SlashTag(float x, float y, float z, int fillColor, float width, float height, PShape shape) {
		super(x, y, z, fillColor);
		this.shape = shape;
		this.width = width;
		this.height = height;
	}
	
	

	public float getWidth() {
		return width;
	}



	public void setWidth(float width) {
		this.width = width;
	}



	public float getHeight() {
		return height;
	}



	public void setHeight(float height) {
		this.height = height;
	}



	public PShape getShape() {
		return shape;
	}



	public void setShape(PShape shape) {
		this.shape = shape;
	}



	@Override
	public void draw(PApplet app) {
		app.fill(fillColor);
		app.stroke(strokeColor);
		app.strokeWeight(strokeWeight);
		
	}
	
	

}
