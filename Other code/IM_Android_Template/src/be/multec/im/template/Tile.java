package be.multec.im.template;

import processing.core.*;


public class Tile {
	  private int posX;
	  private int posY;
	  
	  private int endX;
	  private int endY;
	  
	  //private boolean playing = false;
	  //private boolean pause = false;
	  
	  private PImage image;
	  //private Movie video;
	  
	  private String videoPath;
	  
	  private MainActivity app;
	  
	  //private static PImage playIcon;
	  
	  
	  public Tile(int posX_, int posY_, String imagePath, String videoPath_, MainActivity app_) {
		
		app = app_;
		//if (playIcon == null) {
		//	playIcon = app.loadImage("data/play.png");
		//}
	    posX = posX_;
	    posY = posY_;
	    endX = posX_ + 256;
	    endY = posY_ + 256;
	    image = app.loadImage(imagePath);
	    //image.resize(256, 256);
	    //video = new Movie(app, videoPath);
	    videoPath = videoPath_;
	    
	  }
	  
	  public void draw() {
	    /*
	    if (this.playing || this.pause) {
	      app.image(video, posX, getY());
	    }
	    if (this.playing == false && this.pause == false) {
	      app.image(image, posX, getY());
	    }
	    if (this.pause) {
	      app.image(playIcon, posX, getY());
	    }
	    if (video.duration() == video.time()) {
	      video.stop();
	      this.playing = false;
	    }
	    */
		  app.image(image, posX, getY(), 256, 256);
	      
	}
	  
	  public void drawSpecific(int specialY) {
		  app.image(image, 768, specialY, 256, 256);
	  }
	  
	  
	  /*
	  public void mouseClicked() {
	    if (app.mouseX > posX && app.mouseX < endX && app.mouseY > getY() && app.mouseY < getEndY()) {
	      if (playing == false) {
	        playing = true;
	        pause = false;
	        video.play();
	      }
	      else {
	        playing = false;
	        pause = true;
	        video.pause();
	      }
	    }
	  }
	  */
	  
	  public int getY() {
	    return this.posY + app.getOffset();
	  }
	  
	  public int getEndY() {
	    return this.endY + app.getOffset();
	  }
	  
	  public String getVideoPath() {
		  return videoPath;
	  }

	public boolean isSelected() {
		if (app.mouseX > posX && app.mouseX < endX && app.mouseY > getY() && app.mouseY < getEndY()) {
			return true;
		}
		else {
			return false;
		}
		
	}

	  
	}