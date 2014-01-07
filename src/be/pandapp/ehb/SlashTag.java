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
	
	PShape headAndFoot;
	PShape middle;
	PShape text;
	float scale;
	
	
	public SlashTag(float x, float y, float z, int fillColor, float scale, PShape headAndFoot, PShape middle, PShape text) {
		super(x, y, z, fillColor);
		this.headAndFoot = headAndFoot;
		this.middle = middle;
		this.text = text;
		this.scale = scale;
		
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



	public float getScale() {
		return scale;
	}


	public void setScale(float scale) {
		this.scale = scale;
	}


	@Override
	public void draw(PApplet app) {
		app.fill(fillColor);
		app.stroke(strokeColor);
		app.strokeWeight(strokeWeight);
		app.scale(this.scale);
	}
	
	

}
