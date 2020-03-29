/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 27 16:08:23 GMT 2019
 */

package com.adapterj.algo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.adapterj.algo.MD5;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MD5_ESTest extends MD5_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        MD5.encode("^@XdK{+hWYn<m^gO8", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        MD5.encode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.adapterj.algo.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = MD5.encode("_0sOXLh'73av", "4c83c1c2320523e18c4fce5245d5aad9");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MD5 mD5_0 = new MD5();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = MD5.encode("_0sOXLh'73av");
      assertEquals("4c83c1c2320523e18c4fce5245d5aad9", string0);
      assertNotNull(string0);
  }
}