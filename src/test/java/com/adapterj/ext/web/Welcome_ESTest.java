/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 27 16:12:06 GMT 2019
 */

package com.adapterj.ext.web;

import org.junit.Test;
import static org.junit.Assert.*;
import com.adapterj.ext.web.Welcome;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Welcome_ESTest extends Welcome_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Welcome welcome0 = new Welcome();
  }
}
