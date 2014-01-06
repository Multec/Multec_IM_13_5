package be.pandapp.ehb;

import processing.core.*;

public class NewsTile extends Shape {
	
	private float width;
	private float height;
	private float depth;
	
	private PImage img;
	
	
	public NewsTile(float x, float y, float z, int fillColor, float width, float height, float depth) {
		super(x, y, z, fillColor);
		
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
		PImage img = app.loadImage("images/Scientology_01.jpg");
		app.image(img, 200, 200);
		app.beginShape();
		//app.texture(img);
		app.TexturedCube(img, app);
		app.translate(x, y, z);
		//app.box(width, height, depth);
		app.endShape();
		app.popMatrix();
		
	}
	
	public void TexturedCube(PImage img, PApplet app) {
		  app.beginShape(); //QUADS
		  app.texture(img);

		  // Given one texture and six faces, we can easily set up the uv coordinates
		  // such that four of the faces tile "perfectly" along either u or v, but the other
		  // two faces cannot be so aligned.  This code tiles "along" u, "around" the X/Z faces
		  // and fudges the Y faces - the Y faces are arbitrarily aligned such that a
		  // rotation along the X axis will put the "top" of either texture at the "top"
		  // of the screen, but is not otherwised aligned with the X/Z faces. (This
		  // just affects what type of symmetry is required if you need seamless
		  // tiling all the way around the cube)
		  
		  // +Z "front" face
		  app.vertex(-1, -1,  1, 0, 0);
		  app.vertex( 1, -1,  1, 1, 0);
		  app.vertex( 1,  1,  1, 1, 1);
		  app.vertex(-1,  1,  1, 0, 1);

		  // -Z "back" face
		  app.vertex( 1, -1, -1, 0, 0);
		  app.vertex(-1, -1, -1, 1, 0);
		  app.vertex(-1,  1, -1, 1, 1);
		  app.vertex( 1,  1, -1, 0, 1);

		  // +Y "bottom" face
		  app.vertex(-1,  1,  1, 0, 0);
		  app.vertex( 1,  1,  1, 1, 0);
		  app.vertex( 1,  1, -1, 1, 1);
		  app.vertex(-1,  1, -1, 0, 1);

		  // -Y "top" face
		  app.vertex(-1, -1, -1, 0, 0);
		  app.vertex( 1, -1, -1, 1, 0);
		  app.vertex( 1, -1,  1, 1, 1);
		  app.vertex(-1, -1,  1, 0, 1);

		  // +X "right" face
		  app.vertex( 1, -1,  1, 0, 0);
		  app.vertex( 1, -1, -1, 1, 0);
		  app.vertex( 1,  1, -1, 1, 1);
		  app.vertex( 1,  1,  1, 0, 1);

		  // -X "left" face
		  app.vertex(-1, -1, -1, 0, 0);
		  app.vertex(-1, -1,  1, 1, 0);
		  app.vertex(-1,  1,  1, 1, 1);
		  app.vertex(-1,  1, -1, 0, 1);

		  app.endShape();
		}

}
