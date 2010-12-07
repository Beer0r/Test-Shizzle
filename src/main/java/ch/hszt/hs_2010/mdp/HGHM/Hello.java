package main.java.ch.hszt.hs_2010.mdp.HGHM;

/** 
 * @author Simon
 * @category TestClass
 * Hello Testclass 
 * Shows a simple class with code/style conventions 
 * Describe your class here
 */
public class Hello {
	String m_Hello = null;
	
	/**
	 * Default Constructor
	 * Initialize member vars
	 */
	public Hello() {
		m_Hello = "Hello "; 
	}
	
	/**
	 * Get a Hello string with given input name
	 * @param name custom name 
	 * @return Return Hello 'input Name'
	 */
	public String getHelloName(String name)
	{
		return m_Hello + name;
	}
	
	/**
	 * Get a Hello World String
	 * @return Return Hello World String
	 */
	public String getHelloWorld()
	{
		return m_Hello + "World";
	}
	
}
