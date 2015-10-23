package com.squareup.okhttp.apache;

import junit.framework.*;

public class Test1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nTest1.test1");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
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

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nTest1.test2");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.contentType();
    var0.contentTypeIsCaseInsensitive();
    var0.postEmptyEntity();

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nTest1.test3");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.redirect();
    var0.success();
    var0.setUp();

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nTest1.test4");


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
    var0.sessionExpired();

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nTest1.test5");


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
    var0.headers();

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nTest1.test6");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postEmptyEntity();

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nTest1.test7");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.redirect();
    var0.tearDown();

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nTest1.test8");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.headers();
    var0.putEmptyEntity();
    var0.putEmptyEntity();
    var0.contentType();
    var0.headers();

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nTest1.test9");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.redirect();
    var0.contentTypeIsCaseInsensitive();
    var0.contentType();

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nTest1.test10");


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
    var0.contentType();

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nTest1.test11");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.headers();

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nTest1.test12");


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
      var0.postByteEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nTest1.test13");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
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

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nTest1.test14");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.contentEncoding();
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

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nTest1.test15");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentEncoding();
    var0.redirect();
    var0.setUp();

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nTest1.test16");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.tearDown();

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nTest1.test17");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.contentEncoding();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.tearDown();

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nTest1.test18");


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
    var0.sessionExpired();

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nTest1.test19");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.postEmptyEntity();
    var0.success();
    var0.putEmptyEntity();

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nTest1.test20");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.jsonGzipResponse();
    var0.setUp();
    var0.contentEncoding();
    var0.headers();
    var0.putEmptyEntity();

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nTest1.test21");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.sessionExpired();

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nTest1.test22");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.jsonGzipResponse();
    var0.success();
    var0.contentType();

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nTest1.test23");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.headers();
    var0.contentTypeIsCaseInsensitive();
    var0.contentType();
    var0.contentType();
    var0.setUp();

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nTest1.test24");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.setUp();
    var0.headers();
    var0.redirect();
    var0.putEmptyEntity();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.postEmptyEntity();

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nTest1.test25");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.contentType();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nTest1.test26");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.redirect();
    var0.jsonGzipResponse();
    var0.redirect();
    var0.headers();

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nTest1.test27");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postEmptyEntity();
    var0.sessionExpired();
    var0.redirect();

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nTest1.test28");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.setUp();
    var0.setUp();
    var0.postEmptyEntity();
    var0.jsonGzipResponse();
    var0.headers();

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nTest1.test29");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.contentType();
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

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nTest1.test30");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.jsonTransparentGzipResponse();
    var0.contentEncoding();

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nTest1.test31");


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
    var0.postEmptyEntity();

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nTest1.test32");


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
    var0.jsonTransparentGzipResponse();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nTest1.test33");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.setUp();

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nTest1.test34");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postByteEntity();
    var0.setUp();
    var0.setUp();
    var0.postByteEntity();

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nTest1.test35");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentType();
    var0.sessionExpired();
    var0.headers();
    var0.headers();

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nTest1.test36");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postOverrideContentType();
    var0.contentType();
    var0.sessionExpired();
    var0.headers();

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nTest1.test37");


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
    var0.redirect();
    var0.redirect();

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nTest1.test38");


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
    var0.headers();

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nTest1.test39");


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
      var0.putEmptyEntity();
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nTest1.test40");


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
    var0.redirect();

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nTest1.test41");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.headers();
    var0.setUp();
    var0.contentEncoding();
    var0.redirect();
    var0.putEmptyEntity();

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nTest1.test42");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.jsonTransparentGzipResponse();
    var0.putEmptyEntity();
    var0.sessionExpired();
    var0.contentTypeIsCaseInsensitive();
    var0.contentEncoding();
    var0.sessionExpired();

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nTest1.test43");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.contentType();
    var0.jsonGzipResponse();

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nTest1.test44");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.contentType();
    var0.headers();
    var0.redirect();
    var0.redirect();
    var0.setUp();
    var0.contentEncoding();
    var0.putEmptyEntity();
    var0.tearDown();

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nTest1.test45");


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
    var0.postByteEntity();

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nTest1.test46");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.setUp();
    var0.contentType();
    var0.putEmptyEntity();
    var0.success();
    var0.setUp();

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nTest1.test47");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.setUp();
    var0.setUp();
    var0.success();
    var0.setUp();
    var0.postByteEntity();
    var0.postEmptyEntity();
    var0.sessionExpired();

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nTest1.test48");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
    var0.jsonGzipResponse();
    var0.redirect();

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nTest1.test49");


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
    var0.redirect();

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nTest1.test50");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.sessionExpired();
    var0.postEmptyEntity();
    var0.contentEncoding();
    var0.postEmptyEntity();
    var0.putEmptyEntity();
    var0.headers();
    var0.headers();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nTest1.test51");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postByteEntity();
    var0.postInputStreamEntity();
    var0.redirect();
    var0.headers();

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nTest1.test52");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonGzipResponse();

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nTest1.test53");


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
    var0.jsonGzipResponse();
    var0.success();
    var0.contentTypeIsCaseInsensitive();

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nTest1.test54");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.contentType();
    var0.contentEncoding();
    var0.contentType();

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nTest1.test55");


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
    var0.success();

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nTest1.test56");


    com.squareup.okhttp.apache.OkApacheClientTest var0 = new com.squareup.okhttp.apache.OkApacheClientTest();
    var0.setUp();
    var0.postInputStreamEntity();
    var0.postOverrideContentType();
    var0.jsonTransparentGzipResponse();
    var0.sessionExpired();
    var0.jsonTransparentGzipResponse();
    var0.setUp();
    var0.postOverrideContentType();
    var0.success();
    var0.setUp();

  }

}

