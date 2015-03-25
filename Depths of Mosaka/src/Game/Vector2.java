package Game;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author David
 * @version Mar 25, 2015
 */
public class Vector2
{

    /**
     *
     */
    public float X;
    /**
     *
     */
    public float Y;


    // ----------------------------------------------------------
    /**
     * Create a new Vector2 object.
     */
    public Vector2()
    {
        this.X = 0;
        this.Y = 0;
    }


    // ----------------------------------------------------------
    /**
     * Create a new Vector2 object.
     *
     * @param X
     * @param Y
     */
    public Vector2(float X, float Y)
    {
        this.X = X;
        this.Y = Y;
    }


    // ----------------------------------------------------------
    /**
     * Create a new Vector2 object.
     *
     * @param toCopy
     */
    public Vector2(Vector2 toCopy)
    {
        this.X = toCopy.X;
        this.Y = toCopy.Y;
    }
}
