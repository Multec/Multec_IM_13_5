import be.pandapp.ehb.NewsTile;
import be.pandapp.ehb.SlashTag;
import processing.core.*;

/**
 * @author
 * 
 */

//test adrien commit
public class MainPandapp extends PApplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PApplet.main(new String[] { "PandApp" });
	}

	
	 private NewsTile n1;
	 
	 public void setup() { size(1280, 800, P3D); 
	 background(255); 
	 smooth();
	 textureMode(NORMAL);
	 n1 = new NewsTile(1024, 544, 0, 100, 256, 256, 256);
	 
	 }//end setup
	 
	 public void draw() { 
		 lights();
		 n1.draw(this);
	 
	 }//end draw
	
	
	

} // end MainPandapp
