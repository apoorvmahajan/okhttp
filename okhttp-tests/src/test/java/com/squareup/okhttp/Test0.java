package com.squareup.okhttp;

import junit.framework.*;

public class Test0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nTest0.test1");


    com.squareup.okhttp.internal.framed.HuffmanTest var0 = new com.squareup.okhttp.internal.framed.HuffmanTest();

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nTest0.test2");


    com.squareup.okhttp.internal.http.RouteExceptionTest var0 = new com.squareup.okhttp.internal.http.RouteExceptionTest();
    var0.getConnectionIOException_single();

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nTest0.test3");


    com.squareup.okhttp.internal.http.ThreadInterruptTest var0 = new com.squareup.okhttp.internal.http.ThreadInterruptTest();

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nTest0.test4");


    com.squareup.okhttp.InterceptorTest var0 = new com.squareup.okhttp.InterceptorTest();
    java.lang.Object[] var1 = new java.lang.Object[] { var0};
    java.util.Set var2 = com.squareup.okhttp.TestUtil.setOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nTest0.test5");


    com.squareup.okhttp.DispatcherTest var0 = new com.squareup.okhttp.DispatcherTest();
    var0.maxRequestsEnforced();

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nTest0.test6");


    com.squareup.okhttp.internal.http.HttpDateTest var0 = new com.squareup.okhttp.internal.http.HttpDateTest();
    var0.parseStandardFormats();
    var0.format();

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nTest0.test7");


    java.net.ProxySelector var0 = java.net.ProxySelector.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nTest0.test8");


    com.squareup.okhttp.TestLogHandler var0 = new com.squareup.okhttp.TestLogHandler();
    var0.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setEncoding("");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nTest0.test9");


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var2 = com.squareup.okhttp.TestUtil.headerEntries(var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nTest0.test10");


    com.squareup.okhttp.InterceptorTest var0 = new com.squareup.okhttp.InterceptorTest();
    var0.networkInterceptorThrowsRuntimeExceptionAsynchronous();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.networkInterceptorsCannotCallProceedMultipleTimes();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nTest0.test11");


    com.squareup.okhttp.URLConnectionTest var0 = new com.squareup.okhttp.URLConnectionTest();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connectViaHttpProxyToHttpsUsingBadProxyAndHttpResponseCache();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nTest0.test12");


    java.lang.Object[] var1 = new java.lang.Object[] { (short)10};
    java.util.Set var2 = com.squareup.okhttp.TestUtil.setOf(var1);
    java.util.Set var3 = com.squareup.okhttp.TestUtil.setOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nTest0.test13");


    com.squareup.okhttp.TestLogHandler var0 = new com.squareup.okhttp.TestLogHandler();
    java.util.logging.Level var1 = var0.getLevel();
    var0.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setEncoding("");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nTest0.test14");


    com.squareup.okhttp.internal.http.HttpOverHttp2Test var0 = new com.squareup.okhttp.internal.http.HttpOverHttp2Test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.readResponseHeaderTimeout();
      fail("Expected exception of type java.net.SocketTimeoutException");
    } catch (java.net.SocketTimeoutException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nTest0.test15");


    com.squareup.okhttp.internal.http.HttpOverHttp2Test var0 = new com.squareup.okhttp.internal.http.HttpOverHttp2Test();
    var0.readAfterLastByte();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.serverSendsPushPromise_GET();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nTest0.test16");


    com.squareup.okhttp.TestLogHandler var0 = new com.squareup.okhttp.TestLogHandler();
    java.util.logging.Filter var1 = var0.getFilter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }



  public void test18() throws Throwable {

    if (debug) System.out.printf("%nTest0.test18");


    com.squareup.okhttp.internal.http.HttpOverHttp2Test var0 = new com.squareup.okhttp.internal.http.HttpOverHttp2Test();
    var0.readAfterLastByte();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.get();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nTest0.test19");


    com.squareup.okhttp.internal.http.HttpOverHttp2Test var0 = new com.squareup.okhttp.internal.http.HttpOverHttp2Test();
    var0.readAfterLastByte();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUp();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nTest0.test20");


    java.util.List var0 = com.squareup.okhttp.WebPlatformUrlTest.parameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nTest0.test21");


    com.squareup.okhttp.InterceptorTest var0 = new com.squareup.okhttp.InterceptorTest();
    var0.networkInterceptorsRewriteResponseFromServer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.applicationInterceptorsCanMakeMultipleRequestsToServer();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nTest0.test22");


    com.squareup.okhttp.internal.http.HttpOverHttp2Test var0 = new com.squareup.okhttp.internal.http.HttpOverHttp2Test();
    var0.readAfterLastByte();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.responseCachedWithoutConsumingFullBody();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nTest0.test23");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.patch_HTTP_2();
    var0.postRedirectsToGet();

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nTest0.test24");


    com.squareup.okhttp.internal.http.HttpOverHttp2Test var0 = new com.squareup.okhttp.internal.http.HttpOverHttp2Test();
    var0.readAfterLastByte();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.noDefaultContentLengthOnStreamingPost();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nTest0.test25");


    com.squareup.okhttp.internal.http.HttpDateTest var0 = new com.squareup.okhttp.internal.http.HttpDateTest();
    var0.parseStandardFormats();
    var0.tearDown();
    var0.parseStandardFormats();

  }


  public void test27() throws Throwable {

    if (debug) System.out.printf("%nTest0.test27");


    com.squareup.okhttp.internal.DoubleInetAddressNetwork var0 = new com.squareup.okhttp.internal.DoubleInetAddressNetwork();

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nTest0.test28");


    com.squareup.okhttp.InterceptorTest var0 = new com.squareup.okhttp.InterceptorTest();
    var0.networkInterceptorThrowsRuntimeExceptionAsynchronous();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.networkInterceptorsCanChangeRequestMethodFromGetToPost();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nTest0.test29");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.canceledAfterResponseIsDeliveredBreaksStreamButSignalsOnce_HTTP_2();
    var0.canceledBeforeIOSignalsOnFailure();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.reusedSourcesGetIndependentTimeoutInstances();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nTest0.test30");


    com.squareup.okhttp.DispatcherTest var0 = new com.squareup.okhttp.DispatcherTest();
    var0.maxPerHostZero();

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nTest0.test31");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.replyWithNoData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.closeCancelsPings();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nTest0.test32");


    com.squareup.okhttp.internal.framed.SettingsTest var0 = new com.squareup.okhttp.internal.framed.SettingsTest();
    var0.setFields();

  }



  public void test34() throws Throwable {

    if (debug) System.out.printf("%nTest0.test34");


    com.squareup.okhttp.internal.framed.Http2ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Http2ConnectionTest();
    var0.pushPromiseStreamsAutomaticallyCancel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.pushPromiseStream();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nTest0.test35");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.replyWithNoData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.serverClosesClientOutputStream();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nTest0.test36");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.post_SPDY_3();
    var0.timeoutsUpdatedOnReusedConnections();

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nTest0.test37");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.connectionReuseWhenResponseBodyConsumed_Async();
    var0.timeoutsUpdatedOnReusedConnections();
    var0.timeoutsNotRetried();

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nTest0.test38");


    com.squareup.okhttp.internal.framed.SettingsTest var0 = new com.squareup.okhttp.internal.framed.SettingsTest();
    var0.isPersisted();
    var0.setFields();

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nTest0.test39");


    com.squareup.okhttp.InterceptorTest var0 = new com.squareup.okhttp.InterceptorTest();
    var0.applicationInterceptorsRewriteRequestToServer();
    var0.applicationInterceptorThrowsRuntimeExceptionAsynchronous();

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nTest0.test40");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.readTimesOut();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.unexpectedPingIsNotReturned();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nTest0.test41");


    com.squareup.okhttp.OkHttpClientTest var0 = new com.squareup.okhttp.OkHttpClientTest();
    var0.copyWithDefaultsCacheIsNull();

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nTest0.test42");


    com.squareup.okhttp.internal.http.HttpOverHttp2Test var0 = new com.squareup.okhttp.internal.http.HttpOverHttp2Test();
    var0.readAfterLastByte();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFixedLengthStreamingModeSetsContentLength();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nTest0.test43");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.patch_HTTP_2();
    var0.matchingPinnedCertificate();

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nTest0.test44");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.connectionReuseWhenResponseBodyConsumed_Async();
    var0.put();
    var0.postEmptyBodyRetransmittedAfterAuthorizationFail();

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nTest0.test45");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.canceledAfterResponseIsDeliveredBreaksStreamButSignalsOnce_HTTP_2();
    var0.gzip();
    var0.invalidScheme();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete_HTTP_2();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nTest0.test46");


    com.squareup.okhttp.OkHttpClientTest var0 = new com.squareup.okhttp.OkHttpClientTest();
    var0.copyWithDefaultsWhenDefaultIsGlobal();

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nTest0.test47");


    com.squareup.okhttp.OkHttpClientTest var0 = new com.squareup.okhttp.OkHttpClientTest();
    var0.copyWithDefaultsDoesNotHonorGlobalResponseCache();

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nTest0.test48");


    com.squareup.okhttp.CacheTest var0 = new com.squareup.okhttp.CacheTest();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.requestMaxStale();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }



  public void test50() throws Throwable {

    if (debug) System.out.printf("%nTest0.test50");


    com.squareup.okhttp.FormEncodingBuilderTest var0 = new com.squareup.okhttp.FormEncodingBuilderTest();

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nTest0.test51");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.connectionReuseWhenResponseBodyConsumed_Async();
    var0.timeoutsUpdatedOnReusedConnections();
    var0.canceledBeforeIOSignalsOnFailure_SPDY_3();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.follow20Redirects_Async();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nTest0.test52");


    com.squareup.okhttp.CacheControlTest var0 = new com.squareup.okhttp.CacheControlTest();
    var0.computedHeaderValueIsCached();
    var0.parseEmpty();
    var0.parseIgnoreCacheControlExtensions();

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nTest0.test53");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.connectionReuseWhenResponseBodyConsumed_Async();
    var0.timeoutsUpdatedOnReusedConnections();
    var0.canceledBeforeIOSignalsOnFailure_SPDY_3();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.cancelBeforeBodyIsRead();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nTest0.test54");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.canceledAfterResponseIsDeliveredBreaksStreamButSignalsOnce_HTTP_2();
    var0.canceledBeforeIOSignalsOnFailure();
    var0.canceledBeforeIOSignalsOnFailure_SPDY_3();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.cancelBeforeBodyIsRead();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nTest0.test55");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.connectionReuseWhenResponseBodyConsumed_Async();
    var0.postZeroLength();
    var0.put_HTTP_2();
    var0.http205WithBodyDisallowed();
    var0.tearDown();

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nTest0.test56");


    com.squareup.okhttp.CacheTest var0 = new com.squareup.okhttp.CacheTest();
    var0.postInvalidatesCacheWithUncacheableResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.conditionalCacheHitIsNotDoublePooled();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nTest0.test57");


    com.squareup.okhttp.URLConnectionTest var0 = new com.squareup.okhttp.URLConnectionTest();
    okio.Buffer var2 = var0.gzip("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connectViaHttpProxyToHttpsUsingBadProxyAndHttpResponseCache();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nTest0.test58");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.bogusReplyFrameDoesNotDisruptConnection();

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nTest0.test59");


    com.squareup.okhttp.internal.framed.Http2ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Http2ConnectionTest();
    var0.peerHttp2ServerLowersInitialWindowSize();

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nTest0.test60");


    com.squareup.okhttp.CacheControlTest var0 = new com.squareup.okhttp.CacheControlTest();
    var0.computedHeaderValueIsCached();
    var0.parseIgnoreCacheControlExtensions();
    var0.secondsMustBeNonNegative();

  }



  public void test62() throws Throwable {

    if (debug) System.out.printf("%nTest0.test62");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.connectionReuseWhenResponseBodyConsumed_Async();
    var0.conditionalCacheHit();

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nTest0.test63");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.replyWithNoData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.clientCreatesStreamAndServerRepliesWithFin();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nTest0.test64");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.blockedStreamDoesntStarveNewStream();

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nTest0.test65");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.canceledAfterResponseIsDeliveredBreaksStreamButSignalsOnce_HTTP_2();
    var0.canceledBeforeIOSignalsOnFailure();
    var0.canceledBeforeIOSignalsOnFailure_SPDY_3();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFollowRedirectsFalse();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nTest0.test66");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.canceledAfterResponseIsDeliveredBreaksStreamButSignalsOnce_HTTP_2();
    var0.canceledBeforeIOSignalsOnFailure();
    var0.canceledBeforeIOSignalsOnFailure_SPDY_3();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.get_HTTP_2();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nTest0.test67");


    com.squareup.okhttp.CacheTest var0 = new com.squareup.okhttp.CacheTest();
    var0.postInvalidatesCacheWithUncacheableResponse();
    var0.temporaryRedirectNotCachedWithoutCacheHeader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.requestMethodGetIsCached();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nTest0.test68");


    com.squareup.okhttp.internal.http.HttpOverSpdy3Test var0 = new com.squareup.okhttp.internal.http.HttpOverSpdy3Test();
    var0.spdyConnectionTimeout();

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nTest0.test69");


    com.squareup.okhttp.DispatcherTest var0 = new com.squareup.okhttp.DispatcherTest();
    var0.maxRequestsZero();
    var0.maxRequestsEnforced();

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nTest0.test70");


    com.squareup.okhttp.CacheControlTest var0 = new com.squareup.okhttp.CacheControlTest();
    var0.completeBuilder();
    var0.parseEmpty();

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nTest0.test71");


    javax.net.ServerSocketFactory var0 = javax.net.ServerSocketFactory.getDefault();
    com.squareup.okhttp.DelegatingServerSocketFactory var1 = new com.squareup.okhttp.DelegatingServerSocketFactory(var0);
    com.squareup.okhttp.DelegatingServerSocketFactory var2 = new com.squareup.okhttp.DelegatingServerSocketFactory(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nTest0.test72");


    com.squareup.okhttp.internal.ConnectionSpecSelectorTest var0 = new com.squareup.okhttp.internal.ConnectionSpecSelectorTest();
    var0.someFallbacksSupported();

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nTest0.test73");


    com.squareup.okhttp.CacheTest var0 = new com.squareup.okhttp.CacheTest();
    var0.postInvalidatesCacheWithUncacheableResponse();
    var0.temporaryRedirectNotCachedWithoutCacheHeader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.expiresDateBeforeModifiedDate();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nTest0.test74");


    com.squareup.okhttp.InterceptorTest var0 = new com.squareup.okhttp.InterceptorTest();
    var0.networkInterceptorThrowsRuntimeExceptionAsynchronous();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.interceptorMakesAnUnrelatedRequest();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nTest0.test75");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.readTimesOut();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.clientPingsServer();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nTest0.test76");


    javax.net.ServerSocketFactory var0 = javax.net.ServerSocketFactory.getDefault();
    com.squareup.okhttp.DelegatingServerSocketFactory var1 = new com.squareup.okhttp.DelegatingServerSocketFactory(var0);
    java.net.ServerSocket var2 = var1.createServerSocket();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nTest0.test77");


    com.squareup.okhttp.internal.http.HeadersTest var0 = new com.squareup.okhttp.internal.http.HeadersTest();
    var0.ofRejectsNulChar();

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nTest0.test78");


    com.squareup.okhttp.CacheTest var0 = new com.squareup.okhttp.CacheTest();
    var0.postInvalidatesCacheWithUncacheableResponse();
    var0.temporaryRedirectNotCachedWithoutCacheHeader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.redirectToCachedResult();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nTest0.test79");


    com.squareup.okhttp.internal.http.RouteSelectorTest var0 = new com.squareup.okhttp.internal.http.RouteSelectorTest();
    var0.setUp();
    var0.getHostString();
    var0.proxySelectorReturnsNull();

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nTest0.test80");


    com.squareup.okhttp.CacheControlTest var0 = new com.squareup.okhttp.CacheControlTest();
    var0.computedHeaderValueIsCached();
    var0.parseCacheControlHeaderValueIsRetained();
    var0.completeBuilder();

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nTest0.test81");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.connectionReuseWhenResponseBodyConsumed_Async();
    var0.doesNotFollow21Redirects_Async();
    var0.timeoutsUpdatedOnReusedConnections();

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nTest0.test82");


    com.squareup.okhttp.CacheTest var0 = new com.squareup.okhttp.CacheTest();
    var0.postInvalidatesCacheWithUncacheableResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.varyMatchesAbsentRequestHeaderField();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nTest0.test83");


    com.squareup.okhttp.internal.OptionalMethodTest var0 = new com.squareup.okhttp.internal.OptionalMethodTest();
    var0.invokeBadArgs();
    var0.invokeOptionalBadArgs();

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nTest0.test84");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.canceledAfterResponseIsDeliveredBreaksStreamButSignalsOnce_HTTP_2();
    var0.invalidScheme();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postZeroLength_SPDY_3();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nTest0.test85");


    com.squareup.okhttp.CacheTest var0 = new com.squareup.okhttp.CacheTest();
    var0.postInvalidatesCacheWithUncacheableResponse();
    var0.requestMethodHeadIsNotCached();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.nonIdentityEncodingAndConditionalCache();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nTest0.test86");


    com.squareup.okhttp.internal.http.HttpOverSpdy3Test var0 = new com.squareup.okhttp.internal.http.HttpOverSpdy3Test();
    var0.readAfterLastByte();

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nTest0.test87");


    com.squareup.okhttp.InterceptorTest var0 = new com.squareup.okhttp.InterceptorTest();
    var0.networkInterceptorsRewriteResponseFromServer();
    var0.applicationInterceptorThrowsRuntimeExceptionAsynchronous();

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nTest0.test88");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.connectionReuseWhenResponseBodyConsumed_Async();
    var0.timeoutsUpdatedOnReusedConnections();
    var0.responseHeaderParsingIsLenient();
    var0.canceledBeforeResponseReadSignalsOnFailure_SPDY_3();

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nTest0.test89");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.clientPingsServer();

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nTest0.test90");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.readTimesOut();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.closeCancelsPings();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nTest0.test91");


    com.squareup.okhttp.internal.OptionalMethodTest var0 = new com.squareup.okhttp.internal.OptionalMethodTest();
    var0.invokeBadArgs();
    var0.isSupported();

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nTest0.test92");


    com.squareup.okhttp.internal.http.CookiesTest var0 = new com.squareup.okhttp.internal.http.CookiesTest();
    var0.setUp();
    var0.testCookiesSentIgnoresCase();
    var0.testRedirectsDoNotIncludeTooManyCookies();

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nTest0.test93");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.connectionReuseWhenResponseBodyConsumed_Async();
    var0.head_HTTP_2();

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nTest0.test94");


    com.squareup.okhttp.CacheTest var0 = new com.squareup.okhttp.CacheTest();
    var0.postInvalidatesCacheWithUncacheableResponse();
    var0.temporaryRedirectNotCachedWithoutCacheHeader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.varyMatchesUnchangedRequestHeaderField();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nTest0.test95");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.post_SPDY_3();
    var0.getWithRequestBody();

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nTest0.test96");


    com.squareup.okhttp.internal.framed.Http2ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Http2ConnectionTest();
    var0.readSendsWindowUpdateHttp2();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.peerHttp2ClientDisablesPush();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nTest0.test97");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.readTimesOut();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.bogusReplyFrameDoesNotDisruptConnection();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nTest0.test98");


    com.squareup.okhttp.CacheTest var0 = new com.squareup.okhttp.CacheTest();
    var0.postInvalidatesCacheWithUncacheableResponse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.defaultExpirationDateConditionallyCached();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nTest0.test99");


    com.squareup.okhttp.internal.http.RecordingProxySelector var0 = new com.squareup.okhttp.internal.http.RecordingProxySelector();
    java.net.ProxySelector.setDefault((java.net.ProxySelector)var0);
    java.net.ProxySelector.setDefault((java.net.ProxySelector)var0);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nTest0.test100");


    com.squareup.okhttp.internal.http.HttpOverHttp2Test var0 = new com.squareup.okhttp.internal.http.HttpOverHttp2Test();
    var0.noDefaultContentLengthOnStreamingPost();
    var0.emptyResponse();

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nTest0.test101");


    com.squareup.okhttp.internal.framed.Http2ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Http2ConnectionTest();
    var0.clientPingsServerHttp2();

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nTest0.test102");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.clientClosesClientInputStream();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nTest0.test103");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.canceledAfterResponseIsDeliveredBreaksStreamButSignalsOnce_HTTP_2();
    var0.gzip();
    var0.cancelDuringHttpsConnect();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.postEmptyBodyRetransmittedAfterAuthorizationFail();
      fail("Expected exception of type org.junit.ComparisonFailure");
    } catch (org.junit.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nTest0.test104");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.sendGoAway();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.receiveGoAway();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nTest0.test105");


    com.squareup.okhttp.CallTest var0 = new com.squareup.okhttp.CallTest();
    var0.connectionReuseWhenResponseBodyConsumed_Async();
    var0.tearDown();

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nTest0.test106");


    com.squareup.okhttp.internal.framed.Spdy3ConnectionTest var0 = new com.squareup.okhttp.internal.framed.Spdy3ConnectionTest();
    var0.readTimesOut();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.bogusDataFrameDoesNotDisruptConnection();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nTest0.test107");


    com.squareup.okhttp.TestLogHandler var0 = new com.squareup.okhttp.TestLogHandler();
    java.util.logging.Level var1 = var0.getLevel();
    com.squareup.okhttp.TestLogHandler var2 = new com.squareup.okhttp.TestLogHandler();
    java.util.logging.Level var3 = var2.getLevel();
    java.util.logging.ErrorManager var4 = var2.getErrorManager();
    var0.setErrorManager(var4);
    var0.flush();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }



}

