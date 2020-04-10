package com.sapient;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Check Even.
 */
public class CheckEvenTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CheckEvenTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCheckEven()
    {
        assertTrue( CheckEven.check(4) );
    }

    public void testCheckZeroEven()
    {
        assertTrue( CheckEven.check(0) );
    }
    
    public void testCheckNegativeEven()
    {
        assertTrue( CheckEven.check(-4) );
    }

    public void testCheckOdd()
    {
        assertFalse( CheckEven.check(77) );
    }
}
