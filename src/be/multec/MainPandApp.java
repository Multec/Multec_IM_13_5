package be.multec;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;

import org.mt4j.sceneManagement.AbstractScene;
import org.mt4j.util.MT4jSettings;
import org.mt4j.util.MTColor;
import org.mt4j.util.math.ToolsMath;
import org.mt4j.util.math.Vector3D;
import org.mt4j.MTApplication;
import org.mt4j.components.MTLight;
import org.mt4j.components.visibleComponents.widgets.MTBackgroundImage;
import org.mt4j.components.visibleComponents.shapes.MTRectangle;
import org.mt4j.components.visibleComponents.shapes.mesh.MTCube;
import org.mt4j.util.math.ToolsMath;





import processing.core.PApplet;
import processing.core.PImage;

public class MainPandApp extends AbstractScene {
	//variabele mtApp van het type MTApplication
	private MTApplication mtApp;
	private GLU glu;
	private GL gl;

	//Constructor
	public MainPandApp(MTApplication mtApplication, String name) {
		//standaard
		super(mtApplication, name);
		
		System.out.println(MT4jSettings.getInstance().renderer);
		
		this.mtApp = mtApplication;
		//PImage bg_img = mtApplication.loadImage("../images/frontpage.jpg");
		//MTBackgroundImage bg = new MTBackgroundImage(mtApp, bg_img, false);
		//Altijd toevoegen op het canvas! Applicatie is 1 grote arraylist.
		//this.getCanvas().addChild(bg);
		//MTBackground bg = new MTBackground(0);
		//this.getCanvas().addChild(bg);
		
		//set the light
		this.setClearColor(new MTColor(146, 150, 188, 255)); 
		MTLight.enableLightningAndAmbient(mtApp, 1, 1, 1, 1);
		MTLight light = new MTLight(mtApp, GL.GL_LIGHT3, new Vector3D(mtApp.width/5f,-mtApp.height/10f,0));
		
		
		/*gl.glEnable(GL.GL_BLEND);
		gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
		gl.glColor4f(1.0f, 0.0f, 0.0f, 0.6f);
		/*
		glu.gluPerspective(45, 1280/800, 1, 100);*/
		
		
		
		kubusMaken(light);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub

	}
	
	public void kubusMaken(MTLight light) {
		for(int i = 0; i <= 15; i++) {
			MTCube c = new MTCube(getMTApplication(), 256);
			c.setLight(light);
			getCanvas().addChild(c);
			//glu.gluPerspective(45, 1280/800, 1, 100);
			//c.setPositionGlobal(new Vector3D(ToolsMath.getRandom(0, MT4jSettings.getInstance().getWindowWidth(), ToolsMath.getRandom(0, MT4jSettings.getInstance().getWindowHeight()))));
		}
	}

}
