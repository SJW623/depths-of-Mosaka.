package Game;

public class Vector2 {
	
	public float X;
	public float Y;
	
	public Vector2()
	{
		this.X = 0;
		this.Y = 0;
	}
	public Vector2(float X, float Y)
	{
		this.X = X;
		this.Y = Y;
	}
	public Vector2(Vector2 toCopy)
	{
		this.X = toCopy.X;
		this.Y = toCopy.Y;
	}
}
