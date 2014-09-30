package com.aguywithacomputer.vecta;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 * The Class VectaApplication.
 */
public abstract class VectaApplication
{

	/** a VectorConfig object containing the application configuration values. */
	private VectaConfig cfg;

	/**
	 * Instantiates a new VectaApplication and calls the onCreate() method.
	 *
	 * @param cfg
	 *            sets the VectorConfig field to the VectorConfig that is passed
	 *            in on instantiation.
	 * 
	 */
	public VectaApplication(VectaConfig cfg)
	{
		this.cfg = cfg;
		onCreate();
	}

	/**
	 * Game loop that is run every frame.
	 */
	public void loop()
	{
		while (!Display.isCloseRequested())
		{
			update();
			render();
			Display.update();
		}
		onClose();
	}

	/**
	 * Runs once on creation of a new VectaApplication. Creates the Display and
	 * calls the init() method of the subclass.
	 */
	public void onCreate()
	{
		try
		{
			Display.setDisplayMode(new DisplayMode(cfg.getWidth(), cfg
					.getHeight()));
			Display.setTitle(cfg.getTitle());
			Display.create();
		}
		catch (LWJGLException e)
		{
			e.printStackTrace();
		}
		init();
		loop();
	}

	/**
	 * Runs once on destruction of a VectaApplication. Calls the clean() method
	 * of the subclass and destroys the Application.
	 */
	public void onClose()
	{
		clean();
		Display.destroy();
	}

	/**
	 * Called when the application is initialized. Must be implemented by any
	 * class that extends VectaApplication.
	 */
	public abstract void init();

	/**
	 * Called every frame before the render method. Should be used to update
	 * game logic. Must be implemented by any class that extends
	 * VectaApplication.
	 */
	public abstract void update();

	/**
	 * Called every frame after the update method. Must be implemented by any
	 * class that extends VectaApplication.
	 */
	public abstract void render();

	/**
	 * Called when the application is closed. Must be implemented by any class
	 * that extends VectaApplication.
	 */
	public abstract void clean();

}
