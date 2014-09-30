package com.aguywithacomputer.vecta;

// TODO: Auto-generated Javadoc
/**
 * The Class VectaConfig.
 */
public class VectaConfig
{

	/** The title. */
	private String title;

	/** The width. */
	private int width;

	/** The height. */
	private int height;

	/** The version. */
	private String version;

	/**
	 * Instantiates a new vecta config.
	 */
	public VectaConfig()
	{
		this.title = "Vecta Engine";
		this.width = 1280;
		this.height = 720;
		this.version = "0.0.1";
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title
	 *            the new title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth()
	{
		return width;
	}

	/**
	 * Sets the width.
	 *
	 * @param width
	 *            the new width
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight()
	{
		return height;
	}

	/**
	 * Sets the height.
	 *
	 * @param height
	 *            the new height
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}

	/**
	 * Sets the size.
	 *
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public void setSize(int width, int height)
	{
		setWidth(width);
		setHeight(height);
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion()
	{
		return version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version
	 *            the new version
	 */
	public void setVersion(String version)
	{
		this.version = version;
	}

}
