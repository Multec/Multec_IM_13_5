/*import be.pandapp.ehb.SlashTag;

import processing.core.PApplet;
import processing.core.PShape;

*//**
 * 
 *//*

*//**
 * @author AdrienSchautteet
 * 
 *//*
public class MainSlashTag extends PApplet {

	*//**
	 * @param args
	 *//*
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
		
			stop();
		}
	}

}*/

import be.pandapp.ehb.Slashing;
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

		for (int i = 0; i < this.aantal; i++) {
			
			
			if (i == 0) {
				Slashing[i] = new Slashing(random(0, 100),
						random(0, 100), 0, 255, 1, headAndFoot, middle,
						text,this);

				Slashing[i].draw(this);
			}

			if (i < 5 && i > 0) {
				Slashing[i] = new Slashing(random(Slashing[i - 1].getX() + 150,
						Slashing[i - 1].getX() + 275), random(0, 100),
						0, 255, 1, headAndFoot, middle, text,this);
				Slashing[i].draw(this);

				

			}
			
			if (i == 5) {
				Slashing[i] = new Slashing(random(0, 100),
						random(250, 350), 0, 255, 1, headAndFoot, middle,
						text,this);

				Slashing[i].draw(this);
			}
			
			if (i < 10 && i > 5) {
				
				
				Slashing[i] = new Slashing(random(Slashing[i - 1].getX() + 150,
						Slashing[i - 1].getX() + 275), random(250, 350),
						0, 255, 1, headAndFoot, middle, text,this);
				Slashing[i].draw(this);

				System.out.println(Slashing[i].getX());

			}
			
			if (i == 10) {
				Slashing[i] = new Slashing(random(0, 100),
						random(500, 600), 0, 255, 1, headAndFoot, middle,
						text,this);

				Slashing[i].draw(this);
			}
			
			
			if (i <= 15 && i > 10) {
				Slashing[i] = new Slashing(random(Slashing[i - 1].getX() + 150,
						Slashing[i - 1].getX() + 275), random(500, 600),
						0, 255, 1, headAndFoot, middle, text,this);
				Slashing[i].draw(this);

				System.out.println(Slashing[i].getX());

			}
		
			stop();
		}
	}

}