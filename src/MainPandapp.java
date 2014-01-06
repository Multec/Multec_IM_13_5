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
		size(1280, 800, OPENGL);
		background(255);
		smooth();
		n1 = new NewsTile(400, 400, 0, 100, 300, 100, 100);
		
	}//end setup
	
	public void draw() {
		lights();
		n1.draw(this);
		
	}//end draw

} //end MainPandapp
