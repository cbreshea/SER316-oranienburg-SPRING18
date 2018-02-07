/**
 * 
 */
package test.main.java.planit.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import main.java.memoranda.util.Local;

/**
 * @author mohammedalbasha
 *
 */
public class TestLocal {

	/*
	 * 	Mohammed: Create new object of Local.java
	 */
	Local loc = new Local();
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetString() {
		
		assertTrue(loc.getString("NON").equals("NON"));
	}

}
