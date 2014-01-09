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
	PShape[] bodies = new PShape[4];
	PShape[] middles = new PShape[4];
	private PShape headAndFoot;
	private PShape middle;
	private PShape text;
	private boolean bool;
	private Integer index;
	boolean mouseAfterClick;
	boolean outOfPlace;
	int lastMouseX;

	public void setup() {
		size(1280, 800);
		background(0);
		smooth();
		bool = false;
		outOfPlace = false;
		index = null;
	}

	public void draw() {
		bodies[0] = loadShape("../images/SlashTagProcessingHeadFoot.svg");
		bodies[1] = loadShape("../images/bodyBlue.svg");
		bodies[2] = loadShape("../images/bodyBlueDark.svg");
		bodies[3] = loadShape("../images/bodyRed.svg");
		middles[0] = loadShape("../images/SlashTagProcessingMiddle.svg");
		middles[1] = loadShape("../images/middleBlue.svg");
		middles[2] = loadShape("../images/middleBlueDark.svg");
		middles[3] = loadShape("../images/middleRed.svg");
		
		
		/*headAndFoot = loadShape("../images/SlashTagProcessingHeadFoot.svg");
		middle = loadShape("../images/SlashTagProcessingMiddle.svg");*/
		text = loadShape("../images/SlashTagProcessingText.svg");
		background(0);

		if (frameCount <= 1) {
			if (Slashing.length >= 0) {
				for (int i = 0; i < this.aantal; i++) {
					float randomColor = random(0, 4);
					headAndFoot = bodies[(int) randomColor];
					middle = middles[(int) randomColor];

					if (i == 0) {
						Slashing[i] = new Slashing(random(0, 100), random(0,
								100), 0, 255, 1, headAndFoot, middle, text,
								bool);

					}

					if (i < 5 && i > 0) {
						Slashing[i] = new Slashing(random(
								Slashing[i - 1].getX() + 150,
								Slashing[i - 1].getX() + 275), random(0, 100),
								0, 255, 1, headAndFoot, middle, text, bool);

					}

					if (i == 5) {
						Slashing[i] = new Slashing(random(0, 100), random(250,
								350), 0, 255, 1, headAndFoot, middle, text,
								bool);

					}

					if (i < 10 && i > 5) {

						Slashing[i] = new Slashing(random(
								Slashing[i - 1].getX() + 150,
								Slashing[i - 1].getX() + 275),
								random(250, 350), 0, 255, 1, headAndFoot,
								middle, text, bool);
					}

					if (i == 10) {
						Slashing[i] = new Slashing(random(0, 100), random(500,
								600), 0, 255, 1, headAndFoot, middle, text,
								bool);
					}

					if (i <= 15 && i > 10) {
						Slashing[i] = new Slashing(random(
								Slashing[i - 1].getX() + 150,
								Slashing[i - 1].getX() + 275),
								random(500, 600), 0, 255, 1, headAndFoot,
								middle, text, bool);
					}

				}
			}
		}
		if (Slashing.length == 15) {
			for (int i = 0; i < Slashing.length; i++) {

				Slashing[i].draw(this);
				// als de muispositie groter is dan de xwaarde en
				// ywaarde van slashtag en kleiner is dan diezelfde
				// waarden + 200

				if (mouseX > Slashing[i].getX()
						&& mouseX < Slashing[i].getX() + 200
						&& mouseY > Slashing[i].getY()
						&& mouseY < Slashing[i].getY() + 200 && mousePressed) {
					
					if (index == null) {
						index = i;

					}// huidige i waarde van slashing object
						// opslaan in index

					else {
						// index = null;

					}
					Slashing[index].setDraggable(true);
				}

				else if (!mousePressed) {
					Slashing[i].mouseReleased(this);
					index = null;

				}
				// System.out.println(mousePressed + "de mousepressed");

				else {
					Slashing[i].setDraggable(false);
				}

			}
			// System.out.println(Slashing[1].getX());
		}
	}
}