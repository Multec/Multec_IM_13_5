import be.pandapp.ehb.SlashTag;
import processing.core.PApplet;
import processing.core.PShape;

/**
 * 
 */

/**
 * @author AdrienSchautteet
 *
 */
public class MainSlashTag extends PApplet{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(new String[] { "PandApp" });
	}
	
	private SlashTag st;
	private PShape headAndFoot;
	private PShape middle;
	private PShape text;

	// ---

	boolean mouseAfterClick;
	boolean outOfPlace;
	int lastMouseX;

	public void setup() {
		size(1280, 800);
		background(0);
		smooth();

		headAndFoot = loadShape("../images/SlashTagProcessingHeadFoot.svg");
		middle = loadShape("../images/SlashTagProcessingMiddle.svg");
		text = loadShape("../images/SlashTagProcessingText.svg");
		st = new SlashTag(400, 400, 0, 150, 100, 100, headAndFoot, middle, text);
		text.disableStyle();

		// ---

		outOfPlace = false;
	}

	public void draw() {
		// positie vastzetten van middelstuk
		int mouseX2 = (int) (mouseX * 0.245);
		int lastMouseX2 = (int) (lastMouseX * 0.245);
		background(0);
		shapeMode(CENTER);

		shape(headAndFoot, 400, 400, 800, 800);

		if (mouseX >= 410 && mousePressed) {
			outOfPlace = true;
			text.enableStyle();
			shape(middle, mouseX, 492 - (mouseX2), 800, 800);
		}

		else if (lastMouseX < 420) {
			outOfPlace = false;
			mouseAfterClick = false;
		}

		if (outOfPlace && mouseAfterClick && mousePressed == false) {
			// shape(logoHeadAndFoot, 400, 400, 800, 800);
			shape(middle, lastMouseX, 492 - (lastMouseX2), 800, 800);
			lastMouseX -= 15;
		}

		else if (outOfPlace == false) {

			// shape(logoHeadAndFoot, 400, 400, 800, 800);
			text.disableStyle();
			shape(middle, 410, 392, 800, 800); // in place

		}
		shape(text, 400, 400, 800, 800);

	}

	public void mouseReleased() {
		mouseAfterClick = true;
		lastMouseX = mouseX;
	}
	
}
