package com.sapient;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**

 * Unit test for simple App.

*/


public class ShapesTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ShapesTest( String testName )
    {
        super( testName );
    }

    /**

     * @return the suite of tests being tested

    */
    public static Test suite()
    {
        return new TestSuite( ShapesTest.class );
    }

    /**
    
     * Rigourous Test :-)
    
    */
   
    public void testApp()
    {
        assertTrue( true );
    }

	public void testCase1() {
		
		Shapes shape = new Shapes();
		shape.calculateShapeArea(3, 12);
	}

	public void testCase2() {

		Shapes shape = new Shapes();
		shape.calculateShapeArea(4, 15);
	}

	public void testCase3() {
	
		Shapes shape = new Shapes();
		shape.calculateShapeArea(5, 15);

	}
}
