/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 27 16:09:41 GMT 2019
 */

package com.adapterj.logging;

import org.junit.Test;
import static org.junit.Assert.*;
import com.adapterj.logging.Debugger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Debugger_ESTest extends Debugger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Debugger debugger0 = new Debugger();
      assertTrue(Debugger.DEBUG);
  }
}
