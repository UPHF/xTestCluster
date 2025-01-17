/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 01:56:22 GMT 2022
 */

package org.apache.commons.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.ConcurrentModificationException;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.util.DummyLocalizable;
import org.apache.commons.math.exception.util.Localizable;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MathRuntimeException_ESTest extends MathRuntimeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.ROW_INDEX;
      Object[] objectArray0 = new Object[4];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null, localizedFormats0, objectArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      mathRuntimeException0.printStackTrace((PrintStream) mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Localizable) null, (Object[]) null);
      String string0 = mathRuntimeException0.getLocalizedMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null);
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        mathRuntimeException0.getMessage(locale0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null);
      // Undeclared exception!
      try { 
        mathRuntimeException0.getMessage();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null);
      // Undeclared exception!
      try { 
        mathRuntimeException0.getLocalizedMessage();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.SHAPE;
      Object[] objectArray0 = new Object[1];
      ConcurrentModificationException concurrentModificationException0 = MathRuntimeException.createConcurrentModificationException(localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        MathRuntimeException.createInternalError(concurrentModificationException0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathRuntimeException.createIOException((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      EOFException eOFException0 = MathRuntimeException.createEOFException((Localizable) null, objectArray0);
      MathRuntimeException mathRuntimeException0 = null;
      try {
        mathRuntimeException0 = new MathRuntimeException(eOFException0, (Localizable) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Localizable) null, objectArray0);
      Locale locale0 = Locale.UK;
      String string0 = mathRuntimeException0.getMessage(locale0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null);
      // Undeclared exception!
      try { 
        mathRuntimeException0.getMessage((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RuntimeException runtimeException0 = MathRuntimeException.createInternalError((Throwable) null);
      MathRuntimeException mathRuntimeException0 = null;
      try {
        mathRuntimeException0 = new MathRuntimeException(runtimeException0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RuntimeException runtimeException0 = MathRuntimeException.createInternalError((Throwable) null);
      // Undeclared exception!
      try { 
        MathRuntimeException.createIllegalArgumentException((Throwable) runtimeException0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.POSITION_SIZE_MISMATCH_INPUT_ARRAY;
      Object[] objectArray0 = new Object[0];
      ParseException parseException0 = MathRuntimeException.createParseException(3728, localizedFormats0, objectArray0);
      MathRuntimeException mathRuntimeException0 = null;
      try {
        mathRuntimeException0 = new MathRuntimeException(parseException0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      IllegalStateException illegalStateException0 = MathRuntimeException.createIllegalStateException((Localizable) null, objectArray0);
      // Undeclared exception!
      try { 
        MathRuntimeException.createIllegalArgumentException((Throwable) illegalStateException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.ARRAY_ELEMENT;
      IllegalArgumentException illegalArgumentException0 = MathRuntimeException.createIllegalArgumentException((Localizable) localizedFormats0, (Object[]) null);
      MathRuntimeException mathRuntimeException0 = null;
      try {
        mathRuntimeException0 = new MathRuntimeException(illegalArgumentException0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0 = MathRuntimeException.createArrayIndexOutOfBoundsException((Localizable) null, (Object[]) null);
      MathRuntimeException mathRuntimeException0 = null;
      try {
        mathRuntimeException0 = new MathRuntimeException(arrayIndexOutOfBoundsException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS;
      ArithmeticException arithmeticException0 = MathRuntimeException.createArithmeticException(localizedFormats0, (Object[]) null);
      MathRuntimeException mathRuntimeException0 = null;
      try {
        mathRuntimeException0 = new MathRuntimeException(arithmeticException0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.ROW_INDEX;
      Object[] objectArray0 = new Object[4];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null, localizedFormats0, objectArray0);
      mathRuntimeException0.printStackTrace();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null, (Localizable) null, (Object[]) null);
      String string0 = mathRuntimeException0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA;
      IllegalArgumentException illegalArgumentException0 = MathRuntimeException.createIllegalArgumentException((Localizable) localizedFormats0, (Object[]) null);
      // Undeclared exception!
      try { 
        MathRuntimeException.createIOException(illegalArgumentException0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.NAN_VALUE_CONVERSION;
      Object[] objectArray0 = new Object[0];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        mathRuntimeException0.addMessage(localizedFormats0, objectArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This class is deprecated; calling this method is a bug.
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DummyLocalizable dummyLocalizable0 = new DummyLocalizable(">*{fi~X?1%_[z#(H3W");
      Object[] objectArray0 = new Object[2];
      ArithmeticException arithmeticException0 = MathRuntimeException.createArithmeticException(dummyLocalizable0, objectArray0);
      // Undeclared exception!
      try { 
        MathRuntimeException.createIllegalArgumentException((Throwable) arithmeticException0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      IllegalArgumentException illegalArgumentException0 = MathRuntimeException.createIllegalArgumentException((Throwable) mockThrowable0);
      IOException iOException0 = MathRuntimeException.createIOException(illegalArgumentException0);
      assertNotNull(iOException0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null);
      // Undeclared exception!
      try { 
        mathRuntimeException0.setContext("", (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This class is deprecated; calling this method is a bug.
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.DISTRIBUTION_NOT_LOADED;
      IllegalStateException illegalStateException0 = MathRuntimeException.createIllegalStateException(localizedFormats0, (Object[]) null);
      MathRuntimeException mathRuntimeException0 = null;
      try {
        mathRuntimeException0 = new MathRuntimeException(illegalStateException0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null);
      // Undeclared exception!
      try { 
        mathRuntimeException0.getContextKeys();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This class is deprecated; calling this method is a bug.
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null);
      // Undeclared exception!
      try { 
        mathRuntimeException0.getContext((String) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This class is deprecated; calling this method is a bug.
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConcurrentModificationException concurrentModificationException0 = MathRuntimeException.createConcurrentModificationException((Localizable) null, (Object[]) null);
      // Undeclared exception!
      try { 
        MathRuntimeException.createInternalError(concurrentModificationException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      IllegalArgumentException illegalArgumentException0 = MathRuntimeException.createIllegalArgumentException((Throwable) mockThrowable0);
      DummyLocalizable dummyLocalizable0 = new DummyLocalizable("%[m-{,xSlZv");
      Object[] objectArray0 = new Object[7];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(illegalArgumentException0, dummyLocalizable0, objectArray0);
      // Undeclared exception!
      try { 
        mathRuntimeException0.getLocalizedMessage();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX;
      Object[] objectArray0 = new Object[0];
      ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0 = MathRuntimeException.createArrayIndexOutOfBoundsException(localizedFormats0, objectArray0);
      // Undeclared exception!
      try { 
        MathRuntimeException.createIllegalArgumentException((Throwable) arrayIndexOutOfBoundsException0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_FORMAT_OBJECT_TO_FRACTION;
      Object[] objectArray0 = new Object[1];
      NoSuchElementException noSuchElementException0 = MathRuntimeException.createNoSuchElementException(localizedFormats0, objectArray0);
      MathRuntimeException mathRuntimeException0 = null;
      try {
        mathRuntimeException0 = new MathRuntimeException(noSuchElementException0, localizedFormats0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null);
      // Undeclared exception!
      try { 
        mathRuntimeException0.printStackTrace((PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
