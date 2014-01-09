import be.pandapp.ehb.Slashing;
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
	Slashing Slashing[] = new Slashing[aantal];
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
		background(0);
		
		if (frameCount <= 1) {
			if (Slashing.length >= 0) {
				for (int i = 0; i < this.aantal; i++) {

					if (i == 0) {
						Slashing[i] = new Slashing(random(0, 100), random(0,
								100), 0, 255, 1, headAndFoot, middle, text);

					}

					if (i < 5 && i > 0) {
						Slashing[i] = new Slashing(random(
								Slashing[i - 1].getX() + 150,
								Slashing[i - 1].getX() + 275), random(0, 100),
								0, 255, 1, headAndFoot, middle, text);

					}

					if (i == 5) {
						Slashing[i] = new Slashing(random(0, 100), random(250,
								350), 0, 255, 1, headAndFoot, middle, text);

					}

					if (i < 10 && i > 5) {

						Slashing[i] = new Slashing(random(
								Slashing[i - 1].getX() + 150,
								Slashing[i - 1].getX() + 275),
								random(250, 350), 0, 255, 1, headAndFoot,
								middle, text);

						// System.out.println(Slashing[i].getX());

					}

					if (i == 10) {
						Slashing[i] = new Slashing(random(0, 100), random(500,
								600), 0, 255, 1, headAndFoot, middle, text);

					}

					if (i <= 15 && i > 10) {
						Slashing[i] = new Slashing(random(
								Slashing[i - 1].getX() + 150,
								Slashing[i - 1].getX() + 275),
								random(500, 600), 0, 255, 1, headAndFoot,
								middle, text);

						// System.out.println(Slashing[i].getX());

					}

				}
			}
		}
		if (Slashing.length == 15) {
			for (int i = 0; i < Slashing.length; i++) {
				Slashing[i].draw(this);
				if (!mousePressed) {
					Slashing[i].mouseReleased(this);
				}
				
			}
			// System.out.println(Slashing[1].getX());
		}
	}
}