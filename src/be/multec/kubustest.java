package be.multec;
import org.mt4j.MTApplication;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Properties;

//import javax.media.opengl.GL;
import javax.swing.ImageIcon;

//import org.apache.log4j.ConsoleAppender;
//import org.apache.log4j.Level;
//import org.apache.log4j.Logger;
//import org.apache.log4j.SimpleLayout;
import org.mt4j.input.InputManager;
import org.mt4j.input.inputData.AbstractCursorInputEvt;
import org.mt4j.input.inputData.ActiveCursorPool;
import org.mt4j.input.inputData.InputCursor;
import org.mt4j.input.inputProcessors.globalProcessors.AbstractGlobalInputProcessor;
import org.mt4j.input.inputSources.AbstractInputSource;
import org.mt4j.sceneManagement.ISceneChangeListener;
import org.mt4j.sceneManagement.Iscene;
import org.mt4j.sceneManagement.SceneChangeEvent;
import org.mt4j.sceneManagement.transition.ITransition;
import org.mt4j.util.MT4jSettings;
import org.mt4j.util.SettingsMenu;
import org.mt4j.util.animation.AnimationManager;
import org.mt4j.util.math.Tools3D;
import org.mt4j.util.opengl.GLFBO;

import processing.core.*;


public class kubustest extends MTApplication {

		private static final long serialVersionUID = 1L;

		public static void main(String[] args) {
			MT4jSettings.getInstance().renderer = MT4jSettings.OPENGL_MODE;
			
			initialize();
			
		}
		
		@Override
		public void startUp() {
			addScene(new MainPandApp(this, "PandApp"));
			
			
			
		}


}
