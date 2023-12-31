package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static TestSuite suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test the return with empty parameter
     */
    public void testHelloEmptyParameter()
    {
        assertEquals("Hello World! juju", App.hello());
    }
}

