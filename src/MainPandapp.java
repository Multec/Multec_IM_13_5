

import be.pandapp.ehb.NewsTile;
import processing.core.PApplet;

/**
 * @author 
 *
 */
public class MainPandapp extends PApplet {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PApplet.main(new String[] { "PandApp" });
	}
	
	private NewsTile n1;
	
	public void setup() {
		size(800, 800, OPENGL);
		smooth();
		//n1 = new NewsTile(0, 0, image);
		
	}
	
	public void draw() {

		background(0);
		lights();
		//n1.draw(this);
		
	}

}
