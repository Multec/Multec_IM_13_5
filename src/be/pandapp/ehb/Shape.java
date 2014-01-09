package be.pandapp.ehb;

/**
 * @author Wouter Van den Broeck
 * @author Louis Rigot
 *
 */
abstract public class Shape extends DisplayObject {
	
	/**
	 * Constructor for the abstract class.
	 * 
	 * @param x Value on the x-axis (horizontal) in the 3D-window.
	 * @param y Value on the y-axis (vertical) in the 3D-window.
	 * @param z Value on the z-axis (depth) in the 3D-window.
	 * @param fillColor Color value (0xAARRGGBB) of the surfaces.
	 */
	public Shape(float x, float y, float z, int fillColor) {
		super(x, y, z);
		this.fillColor = fillColor;
	}

	protected int fillColor;
	
	protected int strokeColor;
	
	protected int strokeWeight;
	
	

	/**
	 * @return the fillColor
	 */
	public int getFillColor() {
		return fillColor;
	}

	/**
	 * @param fillColor the fillColor to set
	 */
	public void setFillColor(int fillColor) {
		this.fillColor = fillColor;
	}

	/**
	 * @return the strokeColor
	 */
	public int getStrokeColor() {
		return strokeColor;
	}

	/**
	 * @param strokeColor the strokeColor to set
	 */
	public void setStrokeColor(int strokeColor) {
		this.strokeColor = strokeColor;
	}

	/**
	 * @return the strokeWeight
	 */
	public int getStrokeWeight() {
		return strokeWeight;
	}

	/**
	 * @param strokeWeight the strokeWeight to set
	 */
	public void setStrokeWeight(int strokeWeight) {
		this.strokeWeight = strokeWeight;
	}
	

	
}
