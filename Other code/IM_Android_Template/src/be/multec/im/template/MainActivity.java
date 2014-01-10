package be.multec.im.template;

import be.multec.im.template.Tile;
import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import apwidgets.APButton;
import apwidgets.APImageButton;
import apwidgets.APVideoView;
import apwidgets.APWidget;
import apwidgets.APWidgetContainer;
import apwidgets.OnClickWidgetListener;

public class MainActivity extends PApplet {

	private int AppMode = 0;
	// Mode 0: Grid
	// Mode 1: Slashtags

	// *********************************************************************************************
	// Attributes:
	// ---------------------------------------------------------------------------------------------

	public static final String M = "MULTEC";

	// ---------------------------------------------------------------------------------------------

	private APWidgetContainer container;
	private APVideoView videoView;

	// Let op: gebruik loadImage pas vanaf de setup-functie of later.
	
	private PImage menu;
	private PImage social;

	private boolean canPlay = true;

	private boolean showingVideo = false;

	private int totalTiles = 15;
	private Tile[] tile = new Tile[totalTiles];

	private int selected;

	private int offset = 0;

	public int getOffset() {
		return offset;
	}

	//

	private int aantal = 15;
	private Slashing Slashing[] = new Slashing[aantal];
	private PShape[] bodies = new PShape[4];
	private PShape[] middles = new PShape[4];
	private PShape headAndFoot;
	private PShape middle;
	private PShape text;
	private boolean bool;
	private Integer index;
	private boolean mouseAfterClick;
	private boolean outOfPlace;
	private int lastMouseX;

	// *********************************************************************************************
	// PApplet methods:
	// ---------------------------------------------------------------------------------------------

	public void setup() {
		Log.v(M, ">> MainActivity.setup()");
		frameRate(30);
		size(1280, 800); // size for Acer Iconia A200 tablet
		background(0);

		smooth();
		bool = false;
		outOfPlace = false;
		index = null;

		bodies[0] = loadShape("images/SlashTagProcessingHeadFoot.svg");
		bodies[1] = loadShape("images/bodyBlue.svg");
		bodies[2] = loadShape("images/bodyBlueDark.svg");
		bodies[3] = loadShape("images/bodyRed.svg");
		middles[0] = loadShape("images/SlashTagProcessingMiddle.svg");
		middles[1] = loadShape("images/middleBlue.svg");
		middles[2] = loadShape("images/middleBlueDark.svg");
		middles[3] = loadShape("images/middleRed.svg");
		text = loadShape("images/SlashTagProcessingText.svg");

		menu = loadImage("images/menu.png");
		social = loadImage("images/social.png");

		for (int i = 0; i < totalTiles; i++) {
			String photoPath = "images/" + i + ".jpeg";
			String videoPath = "/sdcard/" + i + "_big.mov";
			tile[i] = new Tile((i * 256) % 1280, (int) (i / 5) * 256,
					photoPath, videoPath, this);
		}

		container = new APWidgetContainer(this); // create a new widget
													// container
		videoView = new APVideoView(0, 0 - offset, 768, 768, false) {
			/*
			 * @see
			 * apwidgets.APVideoView#onCompletion(android.media.MediaPlayer)
			 */
			@Override
			public void onCompletion(MediaPlayer mediaPlayer) {
				super.onCompletion(mediaPlayer);
				hideVideo();

			}
		};
		// videoView.setVideoPath("/sdcard/0_big.mp4"); // uses mpeg 4 codec
		container.addWidget(videoView);
		container.show();

		// if (frameCount <= 1) {
		if (Slashing.length >= 0) {
			for (int i = 0; i < this.aantal; i++) {
				float randomColor = random(0, 4);
				headAndFoot = bodies[(int) randomColor];
				middle = middles[(int) randomColor];

				if (i == 0) {
					Slashing[i] = new Slashing(random(0, 100), random(0, 100),
							0, 255, 1, headAndFoot, middle, text, bool);

				}

				if (i < 5 && i > 0) {
					Slashing[i] = new Slashing(random(
							Slashing[i - 1].getX() + 150,
							Slashing[i - 1].getX() + 275), random(0, 100), 0,
							255, 1, headAndFoot, middle, text, bool);

				}

				if (i == 5) {
					Slashing[i] = new Slashing(random(0, 100),
							random(250, 350), 0, 255, 1, headAndFoot, middle,
							text, bool);

				}

				if (i < 10 && i > 5) {

					Slashing[i] = new Slashing(random(
							Slashing[i - 1].getX() + 150,
							Slashing[i - 1].getX() + 275), random(250, 350), 0,
							255, 1, headAndFoot, middle, text, bool);
				}

				if (i == 10) {
					Slashing[i] = new Slashing(random(0, 100),
							random(500, 600), 0, 255, 1, headAndFoot, middle,
							text, bool);
				}

				if (i <= 15 && i > 10) {
					Slashing[i] = new Slashing(random(
							Slashing[i - 1].getX() + 150,
							Slashing[i - 1].getX() + 275), random(500, 600), 0,
							255, 1, headAndFoot, middle, text, bool);
				}

			}
		}
		// }

		/*
		 * container = new APWidgetContainer(this); // create a new widget
		 * container
		 * 
		 * APImageButton logoButton = new APImageButton(80, 222,
		 * multec_logo_groot, false); logoButton.addOnClickWidgetListener(new
		 * OnClickWidgetListener() { public void onClickWidget(APWidget widget)
		 * { if (!showingVideo) showVideo(); else hideVideo(); } });
		 * container.addWidget(logoButton);
		 */

		// // create a new video view that fills the screen, without a media
		// controller
		// videoView = new APVideoView(false) {
		// /* @see apwidgets.APVideoView#onCompletion(android.media.MediaPlayer)
		// */
		// @Override
		// public void onCompletion(MediaPlayer mediaPlayer) {
		// super.onCompletion(mediaPlayer);
		// hideVideo();
		// }
		// };
		// videoView.setVideoPath("/sdcard/spiderman.mp4"); // uses mpeg 4 codec
		// //videoView.setVideoPath("/sdcard/IM_template/Multec_1280_mpeg.mp4");
		// // uses mpeg 4 codec
		// //container.addWidget(videoView); // place the video view in the
		// container
		// // videoView.start(); // start playing the video
		// container.show();
	}

	boolean state1Initialized = false;

	public void draw() {
		// in setup?

		background(0);
		// image(multec_logo_groot, 80, 222);

		if (AppMode == 0) {
			for (int i = 0; i < totalTiles; i++) {
				tile[i].draw();
			}
			image(menu, 0, -128 + getOffset());

			if (showingVideo) {
				tile[selected + 1].drawSpecific(0);
				tile[selected + 2].drawSpecific(256);
				tile[selected + 3].drawSpecific(512);
				image(social, 1024, 0);
			}
		}

		else if (AppMode == 1) {
			if (!state1Initialized) {
				state1Initialized = true;
				videoView.stopPlayBack();
				container.hide();
				container.removeWidget(videoView);

				runOnUiThread(new Runnable() {
					public void run() {
						container.scrollView.removeAllViews();
						videoView = null;
					}
				});
				tile = null;
				
				/*
				 * getWindow().addContentView( container.scrollView, new
				 * ViewGroup.LayoutParams( ViewGroup.LayoutParams.FILL_PARENT,
				 * ViewGroup.LayoutParams.FILL_PARENT));
				 * 
				 * layout = new RelativeLayout(pApplet);
				 */
				// container.release();
			}
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

		}

	}

	// *********************************************************************************************
	// APWidget methods:
	// ---------------------------------------------------------------------------------------------

	// public void onClickWidget(APWidget source) {
	// Log.v(M, ">> MainActivity.onClickWidget(" + source + ")");
	// }

	// *********************************************************************************************
	// Other methods:
	// ---------------------------------------------------------------------------------------------

	private void showVideo(int selected) {
		container.show();
		Log.v(M, ">> MainActivity.showVideo()");
		videoView.setVideoPath("/sdcard/" + selected + "_big.mov"); // uses mpeg
																	// 4 codec
		showingVideo = true;
		// container.addWidget(videoView);
		videoView.start(); // start playing the video
	}

	private void hideVideo() {
		Log.v(M, ">> MainActivity.hideVideo()");
		showingVideo = false;
		videoView.stopPlayBack(); // start playing the video
		// videoView.setVideoPath("/sdcard/1_big.mov");
		container.hide();
	}

	public void mousePressed() {

	}

	public void mouseReleased() {
		if (AppMode == 0) {
			if (offset == 0) {
				if (showingVideo) {
					hideVideo();

				} else if (canPlay) {
					// int selected = 0;
					for (int i = 0; i < totalTiles; i++) {
						if (tile[i].isSelected()) {
							selected = i;
						}
					}

					showVideo(selected);
					Log.v(M, ">> PLAYING");
				} else {
					canPlay = true;
				}
			} else if (this.mouseX > 1024 && this.mouseX < 1280
					&& this.mouseY > 0 && this.mouseY < 128) {
				AppMode = 1;
			}
		}

	}

	public void mouseDragged() {
		if (AppMode == 0) {
			offset -= (pmouseY - mouseY);
			if (offset > 128) {
				offset = 128;
			}
			if (offset < 0) {
				offset = 0;
			}
			canPlay = false;
		}
	}

	// public void mouseClicked() {
	// showVideo();
	// }

}
