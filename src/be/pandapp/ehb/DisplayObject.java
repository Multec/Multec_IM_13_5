package be.pandapp.ehb;

import processing.core.PApplet;

/**
 * @author Wouter Van den Broeck
 * @author Louis Rigot
 * 
 */
abstract public class DisplayObject {

	/**
	 * Constructor if no arguments are given.
	 */
	public DisplayObject() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	/**
	 * Constructor if positioning arguments are given.
	 * 
	 * @param x Value on the x-axis (horizontal) in the 3D-window.
	 * @param y Value on the y-axis (vertical) in the 3D-window.
	 * @param z Value on the z-axis (depth) in the 3D-window.
	 */
	public DisplayObject(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	protected float x;
	protected float y;
	protected float z;
	protected float scale = 1;
	protected float rotX;
	protected float rotY;
	protected float rotZ;
	
	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}
	
	/**
	 * @return the z
	 */
	public float getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(float z) {
		this.z = z;
	}


	
	/**
	 * @return the rotX
	 */
	public float getRotX() {
		return rotX;
	}

	/**
	 * @param rotX the rotX to set
	 */
	public void setRotX(float rotX) {
		this.rotX = rotX;
	}

	/**
	 * @return the rotY
	 */
	public float getRotY() {
		return rotY;
	}

	/**
	 * @param rotY the rotY to set
	 */
	public void setRotY(float rotY) {
		this.rotY = rotY;
	}

	/**
	 * @return the rotZ
	 */
	public float getRotZ() {
		return rotZ;
	}

	/**
	 * @param rotZ the rotZ to set
	 */
	public void setRotZ(float rotZ) {
		this.rotZ = rotZ;
	}

	/**
	 * @return the scale
	 */
	public float getScale() {
		return scale;
	}

	/**
	 * @param scale the scale to set
	 */
	public void setScale(float scale) {
		this.scale = scale;
	}

	/**
	 * @param scale the scale to set
	 */
	public void setScale(double scale) {
		this.scale = (float) scale;
	}
	
	/**
	 * Draws the object. Implemented in subclasses.
	 * 
	 * @param app The PApplet object.
	 */
	abstract public void draw(PApplet app);

	/**
	 * Sets the desired rotation of the 3D object over 3 axes (x, y and z)
	 * 
	 * @param x The rotation around the x-axis.
	 * @param y The rotation around the y-axis.
	 * @param z The rotation around the z-axis.
	 */
	public void setRotationXYZ(double x, double y, double z) {
		this.rotX = (float) x;
		this.rotY = (float) y;
		this.rotZ = (float) z;
	}
}

