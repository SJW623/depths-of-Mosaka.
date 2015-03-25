package Game;

/******************************
 * Author: Sam Winkelstein Date: 1/7/2014 This class creates a basic building
 * block
 ****************************/
import static org.lwjgl.opengl.GL11.*;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author David
 *  @version Mar 25, 2015
 */
public class BasicBlock
{
    private float   width;
    private float   height;
    private Vector2 position;


    // ----------------------------------------------------------
    /**
     * Create a new BasicBlock object.
     */
    public BasicBlock()
    {
        this.position = new Vector2(5, 3);
        this.width = 1;
        this.height = 1;
        draw();
    }


    // ----------------------------------------------------------
    /**
     * Create a new BasicBlock object.
     * @param position
     */
    public BasicBlock(Vector2 position)
    {
        this.position = position;
        this.width = 1;
        this.height = 1;
        draw();
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     */
    public void draw()
    {
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();

        glColor3f(0.3f, .075f, 0.85f);
        glBegin(GL_QUADS);
        glVertex2f(position.X - (width / 2), position.Y - (height / 2));
        glVertex2f(position.X + (width / 2), position.Y - (height / 2));
        glVertex2f(position.X + (width / 2), position.Y + (height / 2));
        glVertex2f(position.X - (width / 2), position.Y + (height / 2));
        glEnd();

    }
}
