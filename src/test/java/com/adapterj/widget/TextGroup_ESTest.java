/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 27 16:05:29 GMT 2019
 */

package com.adapterj.widget;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.adapterj.widget.Text;
import com.adapterj.widget.TextGroup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextGroup_ESTest extends TextGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(0);
      // Undeclared exception!
      try { 
        textGroup0.text(91);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // ArrayIndexOutOfBoundsException: index = 91, length = 0
         //
         verifyException("com.adapterj.widget.TextGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(0);
      // Undeclared exception!
      try { 
        textGroup0.text(1144, (Text) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // ArrayIndexOutOfBoundsException: index = 1144, length = 0
         //
         verifyException("com.adapterj.widget.TextGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(0);
      textGroup0.length();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(383);
      // Undeclared exception!
      try { 
        textGroup0.text((-1737), (Text) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1737
         //
         verifyException("com.adapterj.widget.TextGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(3144);
      // Undeclared exception!
      try { 
        textGroup0.text((-983));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -983
         //
         verifyException("com.adapterj.widget.TextGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(0);
      textGroup0.toJSONString();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(2065);
      String string0 = textGroup0.toJSONString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(0);
      // Undeclared exception!
      try { 
        textGroup0.text(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // ArrayIndexOutOfBoundsException: index = 0, length = 0
         //
         verifyException("com.adapterj.widget.TextGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(2268);
      textGroup0.text(0);
      assertEquals(2268, textGroup0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(2268);
      // Undeclared exception!
      try { 
        textGroup0.text(2268, (Text) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // ArrayIndexOutOfBoundsException: index = 2268, length = 2268
         //
         verifyException("com.adapterj.widget.TextGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(2268);
      textGroup0.text(0, (Text) null);
      assertEquals(2268, textGroup0.length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextGroup textGroup0 = new TextGroup(2268);
      int int0 = textGroup0.length();
      assertEquals(2268, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextGroup textGroup0 = null;
      try {
        textGroup0 = new TextGroup((-1539));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.adapterj.widget.TextGroup", e);
      }
  }
}