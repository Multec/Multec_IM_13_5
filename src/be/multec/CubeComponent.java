package be.multec;

import org.mt4j.components.MTComponent;
import org.mt4j.util.camera.Icamera;

import processing.core.PApplet;

public class CubeComponent extends MTComponent {
	
	

	public CubeComponent(PApplet pApplet) {
		super(pApplet);
		
	}

	public CubeComponent(PApplet pApplet, String name) {
		super(pApplet, name);
		
	}

	public CubeComponent(PApplet pApplet, Icamera attachedCamera) {
		super(pApplet, attachedCamera);
		
	}

	public CubeComponent(PApplet pApplet, String name, Icamera attachedCamera) {
		super(pApplet, name, attachedCamera);
		
	}

}
