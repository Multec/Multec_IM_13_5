/**
 * 
 */
package be.pandapp.ehb;

import com.apple.jobjc.JObjCRuntime.Width;

import processing.core.PApplet;
import processing.core.PShape;

/**
 * @author Pindamannetje
 *
 */
public class SlashTag extends Shape {
	
	float width;
	float height;
	PShape headAndFoot;
	PShape middle;
	PShape text;
	
	
	public SlashTag(float x, float y, float z, int fillColor, float width, float height, PShape headAndFoot, PShape middle, PShape text) {
		super(x, y, z, fillColor);
		this.headAndFoot = headAndFoot;
		this.middle = middle;
		this.text = text;
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



	public PShape getMiddle() {
		return middle;
	}



	public void setMiddle(PShape middle) {
		this.middle = middle;
	}


	public PShape getHeadAndFoot() {
		return headAndFoot;
	}


	public void setHeadAndFoot(PShape headAndFoot) {
		this.headAndFoot = headAndFoot;
	}



	public PShape getText() {
		return text;
	}



	public void setText(PShape text) {
		this.text = text;
	}



	@Override
	public void draw(PApplet app) {
		app.fill(fillColor);
		app.stroke(strokeColor);
		app.strokeWeight(strokeWeight);
	}
	
	

}
