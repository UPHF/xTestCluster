/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 03:41:00 GMT 2022
 */

package org.apache.commons.math3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.util.DummyLocalizable;
import org.apache.commons.math3.exception.util.ExceptionContext;
import org.apache.commons.math3.exception.util.Localizable;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MathIllegalStateException_ESTest extends MathIllegalStateException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH;
      Object[] objectArray0 = new Object[6];
      MathIllegalStateException mathIllegalStateException0 = new MathIllegalStateException(localizedFormats0, objectArray0);
      String string0 = mathIllegalStateException0.getMessage();
      assertEquals("unable to bracket optimum in line search", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH;
      Object[] objectArray0 = new Object[6];
      MathIllegalStateException mathIllegalStateException0 = new MathIllegalStateException(localizedFormats0, objectArray0);
      String string0 = mathIllegalStateException0.getLocalizedMessage();
      assertEquals("unable to bracket optimum in line search", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      MathIllegalStateException mathIllegalStateException0 = new MathIllegalStateException((Localizable) null, objectArray0);
      // Undeclared exception!
      try { 
        mathIllegalStateException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.exception.util.ExceptionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) localizedFormats0;
      MathIllegalStateException mathIllegalStateException0 = new MathIllegalStateException(localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        mathIllegalStateException0.getMessage();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MathIllegalStateException mathIllegalStateException0 = new MathIllegalStateException((Localizable) null, (Object[]) null);
      // Undeclared exception!
      try { 
        mathIllegalStateException0.getLocalizedMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.exception.util.ExceptionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA;
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      MathIllegalStateException mathIllegalStateException0 = new MathIllegalStateException(localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        mathIllegalStateException0.getLocalizedMessage();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Number
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH;
      Object[] objectArray0 = new Object[6];
      MathIllegalStateException mathIllegalStateException0 = new MathIllegalStateException(localizedFormats0, objectArray0);
      ExceptionContext exceptionContext0 = mathIllegalStateException0.getContext();
      assertNotNull(exceptionContext0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS;
      MathIllegalStateException mathIllegalStateException0 = new MathIllegalStateException();
      Object[] objectArray0 = new Object[2];
      MathIllegalStateException mathIllegalStateException1 = new MathIllegalStateException(mathIllegalStateException0, localizedFormats0, objectArray0);
      assertFalse(mathIllegalStateException1.equals((Object)mathIllegalStateException0));
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DummyLocalizable dummyLocalizable0 = new DummyLocalizable("");
      Object[] objectArray0 = new Object[1];
      MathIllegalStateException mathIllegalStateException0 = new MathIllegalStateException(dummyLocalizable0, objectArray0);
      String string0 = mathIllegalStateException0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DummyLocalizable dummyLocalizable0 = new DummyLocalizable("");
      Object[] objectArray0 = new Object[1];
      MathIllegalStateException mathIllegalStateException0 = new MathIllegalStateException(dummyLocalizable0, objectArray0);
      String string0 = mathIllegalStateException0.getLocalizedMessage();
      assertEquals("", string0);
  }
}
