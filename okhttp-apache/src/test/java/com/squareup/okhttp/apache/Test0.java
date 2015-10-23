package com.squareup.okhttp.apache;

import junit.framework.*;

public class Test0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nTest0.test1");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    org.apache.http.params.HttpParams var1 = var0.getParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var2 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nTest0.test2");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var1 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nTest0.test3");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    org.apache.http.params.HttpParams var1 = var0.getParams();
    org.apache.http.params.HttpParams var2 = var0.getParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var3 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nTest0.test4");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.putEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nTest0.test5");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    org.apache.http.params.HttpParams var1 = var0.getParams();
    org.apache.http.params.HttpParams var2 = var0.getParams();
    org.apache.http.params.HttpParams var3 = var0.getParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var4 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nTest0.test6");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nTest0.test7");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nTest0.test8");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nTest0.test9");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nTest0.test10");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.success();
    var0.putEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nTest0.test11");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentEncoding();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nTest0.test12");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nTest0.test13");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nTest0.test14");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nTest0.test15");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.headers();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nTest0.test16");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nTest0.test17");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nTest0.test18");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nTest0.test19");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentEncoding();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nTest0.test20");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nTest0.test21");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nTest0.test22");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    org.apache.http.params.HttpParams var1 = var0.getParams();
    org.apache.http.params.HttpParams var2 = var0.getParams();
    org.apache.http.params.HttpParams var3 = var0.getParams();
    org.apache.http.params.HttpParams var4 = var0.getParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var5 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nTest0.test23");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.success();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nTest0.test24");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nTest0.test25");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.sessionExpired();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nTest0.test26");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.putEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nTest0.test27");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nTest0.test28");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nTest0.test29");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.sessionExpired();
    var0.redirect();

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nTest0.test30");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.sessionExpired();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nTest0.test31");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nTest0.test32");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nTest0.test33");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.contentType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nTest0.test34");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nTest0.test35");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    org.apache.http.params.HttpParams var1 = var0.getParams();
    org.apache.http.params.HttpParams var2 = var0.getParams();
    org.apache.http.params.HttpParams var3 = var0.getParams();
    org.apache.http.params.HttpParams var4 = var0.getParams();
    org.apache.http.params.HttpParams var5 = var0.getParams();
    org.apache.http.params.HttpParams var6 = var0.getParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var7 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nTest0.test36");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postByteEntity();
    var0.redirect();

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nTest0.test37");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentType();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nTest0.test38");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nTest0.test39");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.sessionExpired();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.putEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nTest0.test40");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.setUp();
    var0.contentEncoding();

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nTest0.test41");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentType();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nTest0.test42");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.sessionExpired();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nTest0.test43");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
    var0.postEmptyEntity();

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nTest0.test44");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.success();

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nTest0.test45");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.postEmptyEntity();
    var0.postEmptyEntity();
    var0.contentEncoding();

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nTest0.test46");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    org.apache.http.params.HttpParams var1 = var0.getParams();
    org.apache.http.params.HttpParams var2 = var0.getParams();
    org.apache.http.params.HttpParams var3 = var0.getParams();
    org.apache.http.params.HttpParams var4 = var0.getParams();
    org.apache.http.params.HttpParams var5 = var0.getParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var6 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nTest0.test47");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nTest0.test48");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.putEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nTest0.test49");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.sessionExpired();
    var0.tearDown();

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nTest0.test50");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nTest0.test51");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nTest0.test52");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nTest0.test53");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nTest0.test54");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nTest0.test55");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nTest0.test56");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nTest0.test57");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nTest0.test58");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nTest0.test59");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonTransparentGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nTest0.test60");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nTest0.test61");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.postOverrideContentType();

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nTest0.test62");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.success();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nTest0.test63");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nTest0.test64");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nTest0.test65");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.redirect();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nTest0.test66");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.contentType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nTest0.test67");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.contentType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nTest0.test68");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();
    var0.headers();

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nTest0.test69");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.success();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nTest0.test70");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.contentEncoding();
    var0.sessionExpired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nTest0.test71");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentEncoding();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nTest0.test72");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonTransparentGzipResponse();
    var0.setUp();

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nTest0.test73");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.jsonTransparentGzipResponse();

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nTest0.test74");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.sessionExpired();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nTest0.test75");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.headers();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nTest0.test76");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.sessionExpired();
    var0.jsonGzipResponse();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nTest0.test77");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nTest0.test78");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.redirect();
    var0.postEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nTest0.test79");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.success();
    var0.success();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nTest0.test80");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.headers();

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nTest0.test81");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postOverrideContentType();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nTest0.test82");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postByteEntity();
    var0.headers();

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nTest0.test83");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.contentEncoding();
    var0.redirect();
    var0.contentTypeIsCaseInsensitive();
    var0.success();
    var0.sessionExpired();

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nTest0.test84");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nTest0.test85");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.tearDown();

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nTest0.test86");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postByteEntity();
    var0.contentType();
    var0.headers();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nTest0.test87");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.jsonGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.redirect();

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nTest0.test88");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.contentEncoding();

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nTest0.test89");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nTest0.test90");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.sessionExpired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nTest0.test91");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.sessionExpired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nTest0.test92");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.redirect();

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nTest0.test93");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentTypeIsCaseInsensitive();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nTest0.test94");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.sessionExpired();
    var0.contentTypeIsCaseInsensitive();
    var0.putEmptyEntity();
    var0.jsonGzipResponse();

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nTest0.test95");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.putEmptyEntity();

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nTest0.test96");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nTest0.test97");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.contentType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nTest0.test98");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.headers();
    var0.putEmptyEntity();

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nTest0.test99");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    var0.tearDown();

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nTest0.test100");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.setUp();

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nTest0.test101");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nTest0.test102");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.contentEncoding();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nTest0.test103");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nTest0.test104");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.contentType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nTest0.test105");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nTest0.test106");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.headers();

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nTest0.test107");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentEncoding();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nTest0.test108");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentTypeIsCaseInsensitive();
    var0.success();

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nTest0.test109");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.headers();
    var0.putEmptyEntity();
    var0.jsonGzipResponse();
    var0.jsonTransparentGzipResponse();

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nTest0.test110");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentEncoding();
    var0.success();

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nTest0.test111");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.headers();

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nTest0.test112");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.putEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nTest0.test113");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.putEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nTest0.test114");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nTest0.test115");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.headers();

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nTest0.test116");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nTest0.test117");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.jsonTransparentGzipResponse();
    var0.contentType();

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nTest0.test118");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.redirect();
    var0.setUp();
    var0.postOverrideContentType();

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nTest0.test119");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.tearDown();
    var0.setUp();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nTest0.test120");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postByteEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonGzipResponse();
    var0.contentType();

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nTest0.test121");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();
    var0.putEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nTest0.test122");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.success();
    var0.jsonTransparentGzipResponse();

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nTest0.test123");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    org.apache.http.params.HttpParams var1 = var0.getParams();
    org.apache.http.params.HttpParams var2 = var0.getParams();
    org.apache.http.params.HttpParams var3 = var0.getParams();
    org.apache.http.params.HttpParams var4 = var0.getParams();
    org.apache.http.params.HttpParams var5 = var0.getParams();
    org.apache.http.params.HttpParams var6 = var0.getParams();
    org.apache.http.params.HttpParams var7 = var0.getParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var8 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nTest0.test124");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.redirect();
    var0.success();

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nTest0.test125");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.success();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nTest0.test126");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.jsonGzipResponse();
    var0.jsonGzipResponse();
    var0.headers();

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nTest0.test127");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.contentType();
    var0.tearDown();

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nTest0.test128");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nTest0.test129");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.postByteEntity();
    var0.postOverrideContentType();

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nTest0.test130");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.contentType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nTest0.test131");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.postEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nTest0.test132");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.contentEncoding();

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nTest0.test133");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nTest0.test134");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.headers();
    var0.success();

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nTest0.test135");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.redirect();
    var0.success();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nTest0.test136");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.contentType();
    var0.jsonGzipResponse();

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nTest0.test137");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentEncoding();
    var0.headers();

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nTest0.test138");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.headers();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nTest0.test139");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.postInputStreamEntity();
    var0.postEmptyEntity();
    var0.success();

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nTest0.test140");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nTest0.test141");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.jsonGzipResponse();

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nTest0.test142");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.headers();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonGzipResponse();

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nTest0.test143");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.headers();

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nTest0.test144");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nTest0.test145");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.postEmptyEntity();

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nTest0.test146");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nTest0.test147");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.redirect();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nTest0.test148");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.jsonTransparentGzipResponse();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nTest0.test149");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.postEmptyEntity();
    var0.setUp();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postOverrideContentType();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nTest0.test150");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nTest0.test151");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.success();

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nTest0.test152");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.success();
    var0.redirect();
    var0.jsonTransparentGzipResponse();

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nTest0.test153");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.contentType();
    var0.setUp();
    var0.contentEncoding();

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nTest0.test154");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.redirect();
    var0.setUp();
    var0.postByteEntity();

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nTest0.test155");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.jsonGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.success();

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nTest0.test156");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nTest0.test157");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nTest0.test158");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.headers();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nTest0.test159");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.contentEncoding();
    var0.headers();
    var0.jsonTransparentGzipResponse();

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nTest0.test160");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.jsonGzipResponse();

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nTest0.test161");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonGzipResponse();
    var0.jsonTransparentGzipResponse();

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nTest0.test162");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.jsonGzipResponse();
    var0.postEmptyEntity();

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nTest0.test163");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postOverrideContentType();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nTest0.test164");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.contentType();
    var0.jsonGzipResponse();

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nTest0.test165");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.jsonGzipResponse();
    var0.sessionExpired();

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nTest0.test166");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.postEmptyEntity();
    var0.tearDown();

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nTest0.test167");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nTest0.test168");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonTransparentGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nTest0.test169");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.tearDown();
    var0.setUp();
    var0.postInputStreamEntity();

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nTest0.test170");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.jsonTransparentGzipResponse();
    var0.redirect();

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nTest0.test171");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.jsonGzipResponse();
    var0.sessionExpired();

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nTest0.test172");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.sessionExpired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nTest0.test173");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.contentType();
    var0.tearDown();
    var0.setUp();

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nTest0.test174");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentEncoding();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nTest0.test175");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.redirect();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nTest0.test176");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nTest0.test177");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nTest0.test178");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.success();
    var0.contentType();

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nTest0.test179");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    var0.tearDown();

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nTest0.test180");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.tearDown();
    var0.setUp();
    var0.redirect();
    var0.contentEncoding();

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nTest0.test181");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.contentTypeIsCaseInsensitive();
    var0.setUp();

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nTest0.test182");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.headers();
    var0.putEmptyEntity();
    var0.putEmptyEntity();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nTest0.test183");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.setUp();
    var0.redirect();

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nTest0.test184");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonTransparentGzipResponse();

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nTest0.test185");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.contentType();
    var0.setUp();

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nTest0.test186");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.putEmptyEntity();
    var0.setUp();

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nTest0.test187");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postByteEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonGzipResponse();
    var0.tearDown();

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nTest0.test188");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.success();
    var0.redirect();
    var0.postEmptyEntity();

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nTest0.test189");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.contentType();
    var0.headers();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nTest0.test190");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nTest0.test191");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.postEmptyEntity();
    var0.headers();
    var0.postEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nTest0.test192");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.putEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nTest0.test193");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
    var0.postInputStreamEntity();

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nTest0.test194");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.contentType();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nTest0.test195");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentTypeIsCaseInsensitive();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nTest0.test196");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.postByteEntity();

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nTest0.test197");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nTest0.test198");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.headers();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nTest0.test199");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nTest0.test200");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.sessionExpired();
    var0.jsonGzipResponse();

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nTest0.test201");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.sessionExpired();
    var0.headers();
    var0.contentType();

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nTest0.test202");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postByteEntity();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.tearDown();

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nTest0.test203");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.contentType();

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nTest0.test204");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.contentType();
    var0.success();
    var0.success();

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nTest0.test205");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nTest0.test206");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postOverrideContentType();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nTest0.test207");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonTransparentGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nTest0.test208");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.contentType();
    var0.contentEncoding();

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nTest0.test209");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nTest0.test210");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.success();
    var0.putEmptyEntity();
    var0.putEmptyEntity();

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nTest0.test211");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.contentEncoding();
    var0.jsonGzipResponse();
    var0.redirect();

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nTest0.test212");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nTest0.test213");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.contentTypeIsCaseInsensitive();
    var0.sessionExpired();
    var0.headers();
    var0.headers();

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nTest0.test214");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.jsonTransparentGzipResponse();

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nTest0.test215");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentEncoding();
    var0.postEmptyEntity();

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nTest0.test216");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.headers();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postOverrideContentType();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nTest0.test217");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.setUp();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nTest0.test218");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.redirect();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.success();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nTest0.test219");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.putEmptyEntity();
    var0.postEmptyEntity();

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nTest0.test220");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nTest0.test221");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.jsonGzipResponse();

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nTest0.test222");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nTest0.test223");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nTest0.test224");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.putEmptyEntity();

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nTest0.test225");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.contentType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nTest0.test226");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.sessionExpired();

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nTest0.test227");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.postEmptyEntity();
    var0.headers();
    var0.postEmptyEntity();
    var0.setUp();

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nTest0.test228");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.contentTypeIsCaseInsensitive();
    var0.sessionExpired();
    var0.setUp();

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nTest0.test229");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.contentEncoding();

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nTest0.test230");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();
    var0.contentEncoding();
    var0.jsonGzipResponse();

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nTest0.test231");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postOverrideContentType();
    var0.sessionExpired();

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nTest0.test232");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.success();
    var0.putEmptyEntity();
    var0.contentType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nTest0.test233");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.postEmptyEntity();
    var0.sessionExpired();
    var0.sessionExpired();

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nTest0.test234");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.success();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nTest0.test235");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.headers();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.putEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nTest0.test236");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.headers();
    var0.putEmptyEntity();
    var0.jsonGzipResponse();
    var0.sessionExpired();

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nTest0.test237");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonGzipResponse();
    var0.jsonGzipResponse();

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nTest0.test238");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.putEmptyEntity();
    var0.putEmptyEntity();
    var0.putEmptyEntity();
    var0.jsonGzipResponse();
    var0.contentType();

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nTest0.test239");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postInputStreamEntity();
    var0.setUp();

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nTest0.test240");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.sessionExpired();
    var0.tearDown();

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nTest0.test241");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.success();
    var0.contentType();

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nTest0.test242");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.redirect();
    var0.contentTypeIsCaseInsensitive();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nTest0.test243");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.setUp();
    var0.postByteEntity();

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nTest0.test244");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.success();

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nTest0.test245");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.postByteEntity();

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nTest0.test246");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.success();
    var0.putEmptyEntity();
    var0.contentType();
    var0.contentEncoding();

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nTest0.test247");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.sessionExpired();
    var0.jsonGzipResponse();
    var0.jsonGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentTypeIsCaseInsensitive();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nTest0.test248");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.postEmptyEntity();
    var0.headers();

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nTest0.test249");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.contentEncoding();
    var0.headers();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nTest0.test250");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.redirect();
    var0.redirect();

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nTest0.test251");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.success();
    var0.success();
    var0.jsonGzipResponse();

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nTest0.test252");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentEncoding();
    var0.redirect();
    var0.jsonGzipResponse();

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nTest0.test253");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nTest0.test254");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.postEmptyEntity();
    var0.headers();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nTest0.test255");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.contentType();
    var0.redirect();
    var0.putEmptyEntity();
    var0.postEmptyEntity();

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nTest0.test256");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postByteEntity();
    var0.setUp();
    var0.sessionExpired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nTest0.test257");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.redirect();
    var0.setUp();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nTest0.test258");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.postByteEntity();

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nTest0.test259");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.contentEncoding();

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nTest0.test260");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nTest0.test261");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postOverrideContentType();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nTest0.test262");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentEncoding();
    var0.headers();

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nTest0.test263");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.putEmptyEntity();
    var0.contentEncoding();
    var0.headers();
    var0.headers();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nTest0.test264");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.sessionExpired();

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nTest0.test265");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.setUp();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.headers();

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nTest0.test266");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.sessionExpired();
    var0.contentTypeIsCaseInsensitive();
    var0.tearDown();

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nTest0.test267");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.headers();
    var0.putEmptyEntity();
    var0.jsonGzipResponse();
    var0.contentEncoding();
    var0.redirect();

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nTest0.test268");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.contentEncoding();
    var0.contentType();
    var0.tearDown();

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nTest0.test269");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.redirect();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nTest0.test270");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.success();

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nTest0.test271");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.sessionExpired();
    var0.jsonGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.postEmptyEntity();

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nTest0.test272");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.redirect();
    var0.redirect();
    var0.setUp();
    var0.contentEncoding();
    var0.contentType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nTest0.test273");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.redirect();

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nTest0.test274");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.tearDown();

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nTest0.test275");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nTest0.test276");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.sessionExpired();

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nTest0.test277");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nTest0.test278");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.jsonGzipResponse();

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nTest0.test279");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentEncoding();
    var0.redirect();
    var0.jsonTransparentGzipResponse();

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nTest0.test280");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.success();
    var0.jsonGzipResponse();
    var0.contentType();

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nTest0.test281");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.setUp();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonGzipResponse();

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nTest0.test282");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.contentEncoding();
    var0.headers();
    var0.redirect();
    var0.success();
    var0.contentEncoding();

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nTest0.test283");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.headers();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nTest0.test284");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.putEmptyEntity();

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nTest0.test285");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nTest0.test286");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.sessionExpired();
    var0.headers();
    var0.success();

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nTest0.test287");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.sessionExpired();
    var0.putEmptyEntity();
    var0.jsonGzipResponse();

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nTest0.test288");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentTypeIsCaseInsensitive();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nTest0.test289");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.success();

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nTest0.test290");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentTypeIsCaseInsensitive();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nTest0.test291");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nTest0.test292");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.success();
    var0.success();

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nTest0.test293");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.contentType();
    var0.sessionExpired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nTest0.test294");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentEncoding();

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nTest0.test295");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nTest0.test296");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
    var0.contentType();
    var0.jsonTransparentGzipResponse();

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nTest0.test297");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.contentEncoding();

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nTest0.test298");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentType();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nTest0.test299");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.putEmptyEntity();
    var0.contentEncoding();
    var0.headers();
    var0.jsonGzipResponse();

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nTest0.test300");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.postInputStreamEntity();

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nTest0.test301");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.sessionExpired();
    var0.contentType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nTest0.test302");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.success();

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nTest0.test303");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();
    var0.contentEncoding();
    var0.sessionExpired();

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nTest0.test304");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonGzipResponse();
    var0.setUp();

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nTest0.test305");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonTransparentGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nTest0.test306");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.headers();
    var0.putEmptyEntity();
    var0.postEmptyEntity();
    var0.sessionExpired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nTest0.test307");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    org.apache.http.params.HttpParams var1 = var0.getParams();
    org.apache.http.params.HttpParams var2 = var0.getParams();
    org.apache.http.params.HttpParams var3 = var0.getParams();
    org.apache.http.params.HttpParams var4 = var0.getParams();
    org.apache.http.params.HttpParams var5 = var0.getParams();
    org.apache.http.params.HttpParams var6 = var0.getParams();
    org.apache.http.params.HttpParams var7 = var0.getParams();
    org.apache.http.params.HttpParams var8 = var0.getParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var9 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nTest0.test308");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.contentEncoding();
    var0.contentEncoding();
    var0.jsonGzipResponse();

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nTest0.test309");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.redirect();
    var0.redirect();

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nTest0.test310");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nTest0.test311");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.headers();
    var0.putEmptyEntity();
    var0.postEmptyEntity();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nTest0.test312");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.setUp();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.success();

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nTest0.test313");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonGzipResponse();
    var0.setUp();

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nTest0.test314");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.success();
    var0.postEmptyEntity();
    var0.redirect();

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nTest0.test315");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.success();
    var0.setUp();
    var0.putEmptyEntity();

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nTest0.test316");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.postEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nTest0.test317");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();
    var0.putEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nTest0.test318");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.contentTypeIsCaseInsensitive();
    var0.sessionExpired();
    var0.contentEncoding();
    var0.sessionExpired();
    var0.putEmptyEntity();
    var0.sessionExpired();

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nTest0.test319");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.headers();
    var0.contentEncoding();

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nTest0.test320");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.setUp();

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nTest0.test321");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.tearDown();

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nTest0.test322");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.jsonGzipResponse();
    var0.success();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nTest0.test323");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postInputStreamEntity();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nTest0.test324");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.sessionExpired();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nTest0.test325");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.sessionExpired();
    var0.contentType();
    var0.redirect();

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nTest0.test326");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.postOverrideContentType();

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nTest0.test327");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.postByteEntity();

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nTest0.test328");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nTest0.test329");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.success();

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nTest0.test330");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postByteEntity();
    var0.contentType();
    var0.headers();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nTest0.test331");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.postEmptyEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.contentTypeIsCaseInsensitive();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nTest0.test332");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.success();

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nTest0.test333");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.contentEncoding();
    var0.headers();
    var0.contentTypeIsCaseInsensitive();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nTest0.test334");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nTest0.test335");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nTest0.test336");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postByteEntity();
    var0.putEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentEncoding();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nTest0.test337");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    org.apache.http.params.HttpParams var1 = var0.getParams();
    org.apache.http.params.HttpParams var2 = var0.getParams();
    org.apache.http.params.HttpParams var3 = var0.getParams();
    org.apache.http.params.HttpParams var4 = var0.getParams();
    org.apache.http.params.HttpParams var5 = var0.getParams();
    org.apache.http.params.HttpParams var6 = var0.getParams();
    org.apache.http.params.HttpParams var7 = var0.getParams();
    org.apache.http.params.HttpParams var8 = var0.getParams();
    org.apache.http.params.HttpParams var9 = var0.getParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var10 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nTest0.test338");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.contentType();
    var0.setUp();

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nTest0.test339");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.headers();
    var0.redirect();
    var0.jsonGzipResponse();

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nTest0.test340");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nTest0.test341");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonTransparentGzipResponse();
    var0.headers();
    var0.putEmptyEntity();

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nTest0.test342");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.postEmptyEntity();
    var0.sessionExpired();
    var0.redirect();

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nTest0.test343");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.sessionExpired();
    var0.headers();

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nTest0.test344");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.headers();
    var0.contentTypeIsCaseInsensitive();
    var0.setUp();

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nTest0.test345");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.tearDown();
    var0.setUp();
    var0.redirect();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nTest0.test346");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.postEmptyEntity();
    var0.success();
    var0.jsonGzipResponse();

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nTest0.test347");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.sessionExpired();
    var0.contentTypeIsCaseInsensitive();
    var0.tearDown();

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nTest0.test348");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nTest0.test349");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.success();
    var0.headers();
    var0.sessionExpired();
    var0.postEmptyEntity();

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nTest0.test350");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.success();
    var0.jsonTransparentGzipResponse();

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nTest0.test351");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.contentType();
    var0.redirect();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nTest0.test352");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nTest0.test353");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();
    var0.putEmptyEntity();
    var0.tearDown();

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nTest0.test354");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nTest0.test355");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.headers();
    var0.jsonTransparentGzipResponse();

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nTest0.test356");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.postEmptyEntity();
    var0.setUp();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nTest0.test357");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postByteEntity();
    var0.putEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.putEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nTest0.test358");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nTest0.test359");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.setUp();
    var0.postByteEntity();

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nTest0.test360");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.setUp();

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nTest0.test361");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.sessionExpired();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonTransparentGzipResponse();

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nTest0.test362");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.jsonTransparentGzipResponse();

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nTest0.test363");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.redirect();
    var0.putEmptyEntity();

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nTest0.test364");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.postEmptyEntity();
    var0.setUp();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirect();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nTest0.test365");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.putEmptyEntity();
    var0.contentEncoding();
    var0.headers();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nTest0.test366");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.redirect();

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nTest0.test367");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.contentType();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nTest0.test368");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.redirect();
    var0.contentEncoding();
    var0.sessionExpired();

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nTest0.test369");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.headers();
    var0.contentTypeIsCaseInsensitive();
    var0.postEmptyEntity();
    var0.setUp();

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nTest0.test370");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.postEmptyEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonTransparentGzipResponse();

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nTest0.test371");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.contentEncoding();
    var0.sessionExpired();
    var0.redirect();

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nTest0.test372");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postOverrideContentType();
    var0.postOverrideContentType();

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nTest0.test373");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonGzipResponse();
    var0.contentType();

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nTest0.test374");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.putEmptyEntity();

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nTest0.test375");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();
    var0.postEmptyEntity();

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nTest0.test376");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postByteEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonGzipResponse();
    var0.postEmptyEntity();
    var0.headers();

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nTest0.test377");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.tearDown();
    var0.tearDown();
    var0.tearDown();

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nTest0.test378");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.postEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nTest0.test379");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.postOverrideContentType();

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nTest0.test380");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.setUp();
    var0.headers();
    var0.setUp();

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nTest0.test381");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.contentType();
    var0.sessionExpired();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentTypeIsCaseInsensitive();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nTest0.test382");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.headers();
    var0.putEmptyEntity();
    var0.contentEncoding();

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nTest0.test383");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.contentEncoding();
    var0.redirect();
    var0.jsonGzipResponse();

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nTest0.test384");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonTransparentGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nTest0.test385");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.jsonGzipResponse();
    var0.redirect();

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nTest0.test386");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.redirect();
    var0.redirect();
    var0.setUp();
    var0.jsonGzipResponse();

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nTest0.test387");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postByteEntity();
    var0.postOverrideContentType();

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nTest0.test388");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nTest0.test389");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.contentType();
    var0.putEmptyEntity();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nTest0.test390");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.contentEncoding();
    var0.contentType();
    var0.jsonTransparentGzipResponse();

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nTest0.test391");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.headers();
    var0.contentTypeIsCaseInsensitive();
    var0.contentType();
    var0.contentType();
    var0.postEmptyEntity();

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nTest0.test392");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.postEmptyEntity();

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nTest0.test393");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nTest0.test394");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.contentTypeIsCaseInsensitive();
    var0.headers();
    var0.success();

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nTest0.test395");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.contentEncoding();
    var0.headers();
    var0.tearDown();

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nTest0.test396");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nTest0.test397");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.success();
    var0.setUp();
    var0.success();
    var0.contentEncoding();

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nTest0.test398");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postOverrideContentType();

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nTest0.test399");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.sessionExpired();
    var0.jsonGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.headers();

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nTest0.test400");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.contentEncoding();

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nTest0.test401");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.postEmptyEntity();

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nTest0.test402");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.postEmptyEntity();
    var0.postEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nTest0.test403");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonTransparentGzipResponse();
    var0.redirect();

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nTest0.test404");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nTest0.test405");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.contentEncoding();
    var0.headers();
    var0.jsonGzipResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nTest0.test406");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.tearDown();
    var0.setUp();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.putEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nTest0.test407");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.headers();
    var0.putEmptyEntity();
    var0.headers();
    var0.jsonTransparentGzipResponse();

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nTest0.test408");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.sessionExpired();
    var0.tearDown();

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nTest0.test409");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nTest0.test410");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.contentType();
    var0.redirect();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nTest0.test411");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
    var0.postByteEntity();
    var0.jsonTransparentGzipResponse();

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nTest0.test412");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postOverrideContentType();
    var0.postEmptyEntity();

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nTest0.test413");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.jsonTransparentGzipResponse();

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nTest0.test414");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.postEmptyEntity();
    var0.postEmptyEntity();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nTest0.test415");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nTest0.test416");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.contentEncoding();
    var0.putEmptyEntity();

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nTest0.test417");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.postEmptyEntity();
    var0.postEmptyEntity();

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nTest0.test418");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.contentType();
    var0.setUp();

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nTest0.test419");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.putEmptyEntity();
    var0.contentEncoding();
    var0.headers();
    var0.headers();
    var0.putEmptyEntity();

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nTest0.test420");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.sessionExpired();
    var0.contentType();
    var0.contentType();

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nTest0.test421");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nTest0.test422");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.contentType();
    var0.jsonTransparentGzipResponse();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nTest0.test423");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.redirect();
    var0.redirect();
    var0.setUp();
    var0.contentEncoding();
    var0.tearDown();

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nTest0.test424");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.contentTypeIsCaseInsensitive();
    var0.sessionExpired();
    var0.headers();
    var0.tearDown();

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nTest0.test425");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.redirect();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nTest0.test426");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.postOverrideContentType();

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nTest0.test427");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.contentTypeIsCaseInsensitive();
    var0.success();

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nTest0.test428");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.redirect();
    var0.sessionExpired();

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nTest0.test429");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.contentType();
    var0.jsonTransparentGzipResponse();
    var0.headers();

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nTest0.test430");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postByteEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonGzipResponse();
    var0.postEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.contentEncoding();
    var0.redirect();

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nTest0.test431");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postByteEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.postEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postByteEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nTest0.test432");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.setUp();
    var0.sessionExpired();

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nTest0.test433");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.postEmptyEntity();
    var0.headers();

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nTest0.test434");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.contentType();
    var0.tearDown();

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nTest0.test435");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.tearDown();

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nTest0.test436");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.putEmptyEntity();

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nTest0.test437");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.sessionExpired();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nTest0.test438");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.putEmptyEntity();
    var0.redirect();

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nTest0.test439");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.sessionExpired();

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nTest0.test440");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();
    var0.jsonGzipResponse();

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nTest0.test441");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nTest0.test442");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.setUp();
    var0.jsonGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonTransparentGzipResponse();

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nTest0.test443");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nTest0.test444");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.headers();
    var0.setUp();

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nTest0.test445");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nTest0.test446");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonGzipResponse();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nTest0.test447");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentEncoding();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.contentType();
    var0.contentEncoding();

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nTest0.test448");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.setUp();

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nTest0.test449");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.sessionExpired();
    var0.setUp();

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nTest0.test450");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.contentEncoding();
    var0.contentEncoding();

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nTest0.test451");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postByteEntity();
    var0.putEmptyEntity();
    var0.headers();
    var0.contentType();

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nTest0.test452");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.redirect();
    var0.postEmptyEntity();

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nTest0.test453");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.contentEncoding();
    var0.contentType();
    var0.headers();
    var0.headers();

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nTest0.test454");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.headers();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nTest0.test455");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.contentType();
    var0.sessionExpired();
    var0.sessionExpired();

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nTest0.test456");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nTest0.test457");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.setUp();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.postByteEntity();
    var0.postOverrideContentType();

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nTest0.test458");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.headers();
    var0.contentType();
    var0.contentEncoding();

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nTest0.test459");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();
    var0.setUp();

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nTest0.test460");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.redirect();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nTest0.test461");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.contentType();

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nTest0.test462");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.jsonTransparentGzipResponse();
    var0.success();

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nTest0.test463");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.contentTypeIsCaseInsensitive();
    var0.redirect();

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nTest0.test464");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.sessionExpired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nTest0.test465");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentTypeIsCaseInsensitive();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nTest0.test466");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nTest0.test467");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.jsonTransparentGzipResponse();
    var0.postEmptyEntity();
    var0.contentEncoding();

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nTest0.test468");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.contentEncoding();
    var0.contentEncoding();
    var0.success();

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nTest0.test469");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.postEmptyEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nTest0.test470");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.setUp();
    var0.postOverrideContentType();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.contentType();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nTest0.test471");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.postInputStreamEntity();

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nTest0.test472");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.redirect();
    var0.tearDown();

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nTest0.test473");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.putEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nTest0.test474");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.contentType();
    var0.jsonGzipResponse();
    var0.headers();
    var0.contentEncoding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nTest0.test475");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.contentEncoding();
    var0.jsonTransparentGzipResponse();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.setUp();
    var0.jsonTransparentGzipResponse();

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nTest0.test476");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.contentType();
    var0.headers();
    var0.jsonGzipResponse();

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nTest0.test477");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.contentTypeIsCaseInsensitive();
    var0.sessionExpired();
    var0.contentEncoding();
    var0.sessionExpired();
    var0.putEmptyEntity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nTest0.test478");


    com.squareup.okhttp.apache.OkApacheClient var0 = new com.squareup.okhttp.apache.OkApacheClient();
    org.apache.http.params.HttpParams var1 = var0.getParams();
    org.apache.http.params.HttpParams var2 = var0.getParams();
    org.apache.http.params.HttpParams var3 = var0.getParams();
    org.apache.http.params.HttpParams var4 = var0.getParams();
    org.apache.http.params.HttpParams var5 = var0.getParams();
    org.apache.http.params.HttpParams var6 = var0.getParams();
    org.apache.http.params.HttpParams var7 = var0.getParams();
    org.apache.http.params.HttpParams var8 = var0.getParams();
    org.apache.http.params.HttpParams var9 = var0.getParams();
    org.apache.http.params.HttpParams var10 = var0.getParams();
    org.apache.http.params.HttpParams var11 = var0.getParams();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.http.conn.ClientConnectionManager var12 = var0.getConnectionManager();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nTest0.test479");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonGzipResponse();
    var0.putEmptyEntity();
    var0.contentType();

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nTest0.test480");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.contentType();
    var0.putEmptyEntity();
    var0.jsonGzipResponse();
    var0.contentEncoding();

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nTest0.test481");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.contentEncoding();
    var0.redirect();
    var0.contentTypeIsCaseInsensitive();
    var0.success();
    var0.redirect();
    var0.contentEncoding();

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nTest0.test482");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.jsonGzipResponse();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nTest0.test483");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.headers();
    var0.contentTypeIsCaseInsensitive();
    var0.putEmptyEntity();

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nTest0.test484");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.setUp();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.postByteEntity();
    var0.tearDown();

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nTest0.test485");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.headers();
    var0.putEmptyEntity();
    var0.postEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nTest0.test486");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.putEmptyEntity();
    var0.jsonTransparentGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    var0.contentTypeIsCaseInsensitive();
    var0.tearDown();

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nTest0.test487");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.postEmptyEntity();
    var0.headers();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.contentTypeIsCaseInsensitive();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nTest0.test488");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postInputStreamEntity();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nTest0.test489");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nTest0.test490");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentEncoding();
    var0.tearDown();
    var0.setUp();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.contentType();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentEncoding();
    var0.putEmptyEntity();

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nTest0.test491");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.contentType();
    var0.success();
    var0.contentType();
    var0.success();

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nTest0.test492");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.headers();
    var0.setUp();

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nTest0.test493");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.tearDown();
    var0.tearDown();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.success();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nTest0.test494");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.redirect();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonTransparentGzipResponse();

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nTest0.test495");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.headers();
    var0.tearDown();
    var0.tearDown();

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nTest0.test496");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentTypeIsCaseInsensitive();
    var0.postEmptyEntity();
    var0.contentTypeIsCaseInsensitive();
    var0.success();

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nTest0.test497");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.contentEncoding();
    var0.headers();
    var0.jsonGzipResponse();
    var0.sessionExpired();

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nTest0.test498");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.putEmptyEntity();

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nTest0.test499");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();
    var0.contentTypeIsCaseInsensitive();
    var0.jsonTransparentGzipResponse();

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nTest0.test500");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.contentType();
    var0.redirect();
    var0.success();
    var0.contentTypeIsCaseInsensitive();
    var0.contentTypeIsCaseInsensitive();

  }

}

