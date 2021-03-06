/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 27 16:04:18 GMT 2019
 */

package com.adapterj.logging;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.adapterj.logging.Log;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Log_ESTest extends Log_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Log.i("Xnn04TvH", (String) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      Log.w("/fkV)o[", "/fkV)o[", (Throwable) mockThrowable0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Log.w("</ul>", "</ul>");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("</ul>");
      Log.v("Iq&/ <H", "L?e`iVJ", (Throwable) mockThrowable0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: </ul>", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.w((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.v((String) null, ";>@F*:T55CL*1NfV", (Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.v((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.i((String) null, "", (Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.i((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.getStackTraceString((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.adapterj.logging.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.getStackTraceHTMLString((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.adapterj.logging.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.e((String) null, "/cH34]g7(FM*)RP@gO");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("qISpz$RAo");
      // Undeclared exception!
      try { 
        Log.d((String) null, "qISpz$RAo", (Throwable) mockThrowable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.d((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.e("aB[pA2", "aB[pA2", (Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.adapterj.logging.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Log.e("NjRW=7l", "Bf'KMN3I>R7 WCs9)B");
      MockThrowable mockThrowable0 = new MockThrowable();
      Log.i("Bf'KMN3I>R7 WCs9)B", "Bf'KMN3I>R7 WCs9)B", (Throwable) mockThrowable0);
      Log.v("", "Sc*C{9gUt)>F!kle}Q", (Throwable) mockThrowable0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("qISpz$RAo");
      Log.e("qISpz$RAo\n(null:-1) newInstance: \n(<evosuite>:-1) <evosuite>: \n(<evosuite>:-1) <evosuite>: \n", "", (Throwable) mockThrowable0);
      assertEquals("qISpz$RAo", mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("/3t*)oZ");
      Log.w("/3t*)oZ", "bVk]%qzgL", (Throwable) mockThrowable0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: /3t*)oZ", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.w("", "iQ'U 9C", (Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.adapterj.logging.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      Log.i("7*3xK}\"/^Ur.lGf=", "", (Throwable) mockThrowable0);
      assertNull(mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      Log.d("sd%8]?#A]m<=|.VA i", "", (Throwable) mockThrowable0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Log.d(";>@F*:T55CL*1NfV", (String) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Log.v(" _/viZ!K]V9ah", "</li>");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      String string0 = Log.getStackTraceHTMLString(mockThrowable0);
      assertEquals("<ul><li>null<ul><li>(null:-1) newInstance: </li>\n<li>(<evosuite>:-1) <evosuite>: </li>\n<li>(<evosuite>:-1) <evosuite>: </li>\n</ul>\n</li>\n</ul>", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("qISpz$RAo");
      String string0 = Log.getStackTraceString(mockThrowable0);
      assertEquals("qISpz$RAo\n(null:-1) newInstance: \n(<evosuite>:-1) <evosuite>: \n(<evosuite>:-1) <evosuite>: \n", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Log log0 = new Log();
  }
}
