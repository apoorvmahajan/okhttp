package com.squareup.okhttp;
import junit.framework.*;
import junit.textui.*;

public class Test extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public Test(String name) {
    super(name);
  }

  public static TestSuite suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(Test0.class));
    return result;
  }

}

