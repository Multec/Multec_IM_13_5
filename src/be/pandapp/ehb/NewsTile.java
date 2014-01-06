package be.pandapp.ehb;

import processing.core.PApplet;
import processing.core.PImage;

public class NewsTile extends Shape {
	
	
	private float newsTile;

	private float width;
	private float height;
	private float depth;
	
	public NewsTile(float posX, float posY, float posZ, int fillColor, float width, float height, float depth) {
		super(posX, posY, posZ, fillColor);
		
		this.width = width;
		this.height = height;
		this.depth = depth;
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

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	@Override
	public void draw(PApplet app) {
		app.fill(fillColor);
		app.stroke(strokeColor);
		app.strokeWeight(strokeWeight);
		
		app.pushMatrix();
		app.box(width, height, depth);
		app.popMatrix();
		
	}
}
