package be.pandapp.ehb;

import processing.core.PApplet;
import processing.video.Movie;



/**
 * @author
 * 
 */

public class MainPandapp extends PApplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PApplet.main(new String[] { "be.pandapp.ehb.MainPandapp" });
	}

	private int totalTiles = 15;
	private Tile[] tile = new Tile[totalTiles];

	private int offset = 0;
	
	public int getOffset() {
		return offset;
	}
	 
	 public void setup() {
		 size(1280, 800);
		  background(0);
		  for (int i = 0; i < totalTiles; i++) {
		      String photoPath = "data/" + i + ".jpeg";
		      String videoPath = "data/" + i + ".mov";
		      tile[i] = new Tile((i * 256) % 1280, (int) (i / 5) * 256, photoPath, videoPath, this);
		  }
	 
	 }
	 
	 public void draw() { 
		 background(0);
		  for (int i = 0; i < totalTiles; i++) {
		      tile[i].draw();
		  }
	 
	 }
	 
	 public void movieEvent(Movie m) {
		  m.read();
		}
	 
	 public void mouseClicked() {
		   for (int i = 0; i < totalTiles; i++) {
		      tile[i].mouseClicked();
		  }
		  
		  
		}
	 
	 public void mouseDragged() {
		  offset -= (pmouseY-mouseY);
		}
	
	
	

} // end MainPandapp
