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
	
	PApplet app;	
	PShape headAndFoot;
	PShape middle;
	PShape text;
	float scale;
	
	
	public SlashTag(float x, float y, float z, int fillColor, float scale) {
		super(x, y, z, fillColor);
		this.headAndFoot = this.app.loadShape("../images/SlashTagProcessingHeadFoot.svg");
		this.middle = this.app.loadShape("../images/SlashTagProcessingMiddle.svg");
		this.text = this.app.loadShape("../images/SlashTagProcessingText.svg");
		this.scale = scale;
		
	}
	

	public float getScale() {
		return scale;
	}


	public void setScale(float scale) {
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
	

	@Override
	public void draw(PApplet app) {
		app.fill(fillColor);
		app.stroke(strokeColor);
		app.strokeWeight(strokeWeight);
		app.scale(scale);
		app.shape(headAndFoot);
		app.shape(middle);
		app.shape(text);
		
	}
	
	

}
