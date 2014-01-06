import be.pandapp.ehb.NewsTile;
import processing.core.PApplet;
import processing.core.*;

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
		background(255);
		smooth();
		n1 = new NewsTile(400, 400, 0, 255, 100, 100, 100);
		
	}
	
	public void draw() {

		lights();
		box(100, 100, 100);
		n1.draw(this);
		
	}

}
