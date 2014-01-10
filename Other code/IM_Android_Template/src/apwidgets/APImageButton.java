/**
 * Copyright 2010 Rikard Lundstedt
 * Copyright 2014 Wouter Van den Broeck
 * 
 * This file is based on APButton, which is part of APWidgets.
 * 
 * APWidgets is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * APWidgets is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with APWidgets. If not, see <http://www.gnu.org/licenses/>.
 */

package apwidgets;

import processing.core.PApplet;
import processing.core.PImage;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
/**
 * A button that uses an image. Add instances to {@link apwidgets.APWidgetContainer}.<br>
 * <br>
 * To capture onClick events, declare in sketch: <br>
 * <br>
 * void onClickWidget(PWidget source)<br>
 * {<br>
 * 	// Your code here.<br>
 * }<br>
 * 
 * 
 * @author Rikard Lundstedt
 * @author Wouter Van den Broeck
 *
 */
public class APImageButton extends APWidget {
	
	private PImage image;
	
	private boolean border = true;
	
	/**
	 * Creates a button.<br>
	 * 
	 * @param x The button's x position.
	 * @param y The button's y position.
	 * @param image The image.
	 * @param border True when a border should be drawn.
	 */
	public APImageButton(int x, int y, PImage image, boolean border) {
		this(x, y, ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT, image, border);
	}
	
	/**
	 * Creates a button.<br>
	 * 
	 * @param x The button's x position.
	 * @param y The button's y position.
	 * @param width The button's width.
	 * @param height The button's height.
	 * @param image The image.
	 * @param border True when a border should be drawn.
	 */
	public APImageButton(int x, int y, int width, int height,
			PImage image, boolean border) {
		super(x, y, width, height);
		this.image = image;
		this.border = border;
	}
	
	/**
	 * Initializes the button. Is called by {@link APWidgetContainer} 
	 * as it is added to it.
	 * 
	 */
	public void init(PApplet pApplet) {
		this.pApplet = pApplet;

		if (view == null) {
			view = new ImageButton(pApplet);
			((ImageButton) view).setImageBitmap(((Bitmap) image.getNative()));
			if (!border) ((ImageButton) view).setBackgroundResource(0);
		}

		super.init(pApplet);
	}
}