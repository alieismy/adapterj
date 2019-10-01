/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 27 16:06:31 GMT 2019
 */

package com.adapterj.registry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.adapterj.registry.RegistryFactory;
import com.adapterj.registry.SimpleRegistry;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegistryFactory_ESTest extends RegistryFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("/adpj.properties", "/adpj.properties");
      try { 
        RegistryFactory.getRegistry((File) mockFile0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: java.io.FileNotFoundException
         //
         verifyException("com.adapterj.registry.RegistryFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        RegistryFactory.getRegistry((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.adapterj.registry.RegistryFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleRegistry simpleRegistry0 = (SimpleRegistry)RegistryFactory.getRegistry("");
      assertTrue(simpleRegistry0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      try { 
        RegistryFactory.getRegistry("w.\"x0bxxY/u$mZf|");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("com.adapterj.registry.SimpleRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleRegistry simpleRegistry0 = (SimpleRegistry)RegistryFactory.getRegistry();
      assertFalse(simpleRegistry0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegistryFactory registryFactory0 = new RegistryFactory();
  }
}
