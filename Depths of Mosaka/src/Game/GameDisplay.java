package Game;
/******************************
 * Author: Sam Winkelstein
 * Date: 1/7/2014
 * 
 * This class displays the window and drives the game;
 * ****************************
 */

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

public class GameDisplay{
	
	public void Init() 
	{
			try {
				Display.setDisplayMode(new DisplayMode(1280, 720));
				Display.create();
				Display.setTitle("The Depths of Mosaka");
			} catch (LWJGLException e) {
				e.printStackTrace();
				System.exit(0);
			}
			
			
			while (!Display.isCloseRequested()) {
				float ratio = Display.getWidth()/(float)Display.getHeight();
				int width = Display.getWidth();
				int height = Display.getHeight();
				glViewport(0, 0,  width, height);
				
				glMatrixMode(GL_PROJECTION);
				 glLoadIdentity();
				 glOrtho(ratio * 0, ratio * 16, 0 , 16 ,16 , -16);
				 
				
				glClear(GL_COLOR_BUFFER_BIT);
				
				// any calls go here
				
				// render OpenGL here
				render();
				
				Display.update();
			}
			
			Display.destroy();
		}
	
		public void render()
		{
			BasicBlock b1 = new BasicBlock();
			Vector2 p1Pos = new Vector2(3,5);
			BasicPlatform p1 = new BasicPlatform(p1Pos, 10);
		}
	
		public static void main(String[] argv) {
		GameDisplay myWindow = new GameDisplay();
		myWindow.Init();
	}
}
