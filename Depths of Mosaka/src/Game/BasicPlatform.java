package Game;

/******************************
 * Author: Sam Winkelstein Date: 1/7/2014 This creates a basic platform of any
 * length up to 40 meters; ****************************
 */
public class BasicPlatform
{

    private int          length;
    private Vector2      startpoint;
    private BasicBlock[] buildingBlocks;


    // ----------------------------------------------------------
    /**
     * Create a new BasicPlatform object.
     * @param startpoint
     * @param Platformlength
     */
    public BasicPlatform(Vector2 startpoint, int Platformlength)
    {
        buildingBlocks = new BasicBlock[39];
        this.startpoint = startpoint;

        if (Platformlength > 39)
            Platformlength = 39;

        if (Platformlength < 1)
            Platformlength = 1;

        this.length = Platformlength;

        for (int i = 0; i < length; i++)
        {
            Vector2 blockPos = new Vector2(startpoint.X + i, startpoint.Y);
            buildingBlocks[i] = new BasicBlock(blockPos);
        }
    }
}
