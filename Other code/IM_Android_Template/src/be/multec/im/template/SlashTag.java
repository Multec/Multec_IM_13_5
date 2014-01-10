package be.multec.im.template;

//import processing.core.PApplet;
import processing.core.PShape;

/**
 * @author Pindamannetje
 *
 */
public class SlashTag extends DisplayObject {
	
	
	protected PShape headAndFoot;
	protected PShape middle;
	protected PShape text;
	protected float scale;
	
	
	public SlashTag(float x, float y, float z, int fillColor, float scale, PShape headAndFoot, PShape middle, PShape text) {
		super(x, y, z);
		this.headAndFoot = headAndFoot;
		this.middle = middle;
		this.text = text;
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
	public void draw(MainActivity app) {
		/*app.fill(fillColor);
		app.stroke(strokeColor);
		app.strokeWeight(strokeWeight);*/
		app.pushMatrix();
		app.translate(x, y);
		app.scale(scale);
		app.shape(headAndFoot);
		app.shape(middle);
		app.shape(text);
		app.popMatrix();
	}
	
	

}
