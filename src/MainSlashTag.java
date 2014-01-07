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
public class MainSlashTag extends PApplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(new String[] { "PandApp" });
	}

	private int aantal = 15;
	SlashTag slashtag[] = new SlashTag[aantal];
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

		text.disableStyle();

		outOfPlace = false;
	}

	public void draw() {
		// shape(headAndFoot, 400, 400, 800, 800);
		for (int i = 0; i < this.aantal; i++) {
			
			
			if (i == 0) {
				slashtag[i] = new SlashTag(random(0, 100),
						random(0, 100), 0, 255, 1, headAndFoot, middle,
						text);

				slashtag[i].draw(this);
			}

			if (i < 5 && i > 0) {
				slashtag[i] = new SlashTag(random(slashtag[i - 1].getX() + 150,
						slashtag[i - 1].getX() + 275), random(0, 100),
						0, 255, 1, headAndFoot, middle, text);
				slashtag[i].draw(this);

				

			}
			
			if (i == 5) {
				slashtag[i] = new SlashTag(random(0, 100),
						random(250, 350), 0, 255, 1, headAndFoot, middle,
						text);

				slashtag[i].draw(this);
			}
			
			if (i < 10 && i > 5) {
				
				
				slashtag[i] = new SlashTag(random(slashtag[i - 1].getX() + 150,
						slashtag[i - 1].getX() + 275), random(250, 350),
						0, 255, 1, headAndFoot, middle, text);
				slashtag[i].draw(this);

				System.out.println(slashtag[i].getX());

			}
			
			if (i == 10) {
				slashtag[i] = new SlashTag(random(0, 100),
						random(500, 600), 0, 255, 1, headAndFoot, middle,
						text);

				slashtag[i].draw(this);
			}
			
			
			if (i <= 15 && i > 10) {
				slashtag[i] = new SlashTag(random(slashtag[i - 1].getX() + 150,
						slashtag[i - 1].getX() + 275), random(500, 600),
						0, 255, 1, headAndFoot, middle, text);
				slashtag[i].draw(this);

				System.out.println(slashtag[i].getX());

			}
			
			


			/*else {
				slashtag[i] = new SlashTag(random(slashtag[i - 1].getX(),
						slashtag[i - 1].getX() + 300), random(
						slashtag[i - 1].getY(), slashtag[i - 1].getY() + 300),
						0, 255, 1, headAndFoot, middle, text);
				slashtag[i].draw(this);

				System.out.println(slashtag[i].getX());
			}*/
			stop();
		}

		/*
		 * // positie vastzetten van middelstuk int mouseX2 = (int) (mouseX *
		 * 0.245); int lastMouseX2 = (int) (lastMouseX * 0.245); background(0);
		 * shapeMode(CENTER);
		 * 
		 * shape(headAndFoot, 400, 400, 800, 800);
		 * 
		 * if (mouseX >= 410 && mousePressed) { outOfPlace = true;
		 * text.enableStyle(); shape(middle, mouseX, 492 - (mouseX2), 800, 800);
		 * }
		 * 
		 * else if (lastMouseX < 420) { outOfPlace = false; mouseAfterClick =
		 * false; }
		 * 
		 * if (outOfPlace && mouseAfterClick && mousePressed == false) { //
		 * shape(logoHeadAndFoot, 400, 400, 800, 800); shape(middle, lastMouseX,
		 * 492 - (lastMouseX2), 800, 800); lastMouseX -= 15; }
		 * 
		 * else if (outOfPlace == false) {
		 * 
		 * // shape(logoHeadAndFoot, 400, 400, 800, 800); text.disableStyle();
		 * shape(middle, 410, 392, 800, 800); // in place
		 * 
		 * } shape(text, 400, 400, 800, 800);
		 */
	}

	// public void mouseReleased() {
	/*
	 * mouseAfterClick = true; lastMouseX = mouseX; }
	 */

}
