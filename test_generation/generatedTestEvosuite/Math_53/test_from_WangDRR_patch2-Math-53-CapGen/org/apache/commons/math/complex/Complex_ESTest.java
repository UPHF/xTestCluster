/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 12:02:10 GMT 2022
 */

package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.complex.ComplexField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Complex_ESTest extends Complex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      try { 
        complex0.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      complex1.sqrt();
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.cosh();
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.ONE.hashCode();
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      complex0.equals(complex1);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ZERO;
      complex0.equals(complex1);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.tanh();
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.ZERO.tan();
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      complex0.subtract(complex1);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.sqrt1z();
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.sqrt1z();
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.sqrt1z();
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex((-441137.4654485348), (-441137.4654485348));
      complex1.sqrt();
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.ZERO.sinh();
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Complex complex0 = new Complex((-1095.285), 112.1841061);
      Complex complex1 = complex0.sqrt1z();
      complex1.sin();
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.sin();
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.sin();
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Complex complex0 = new Complex(1526.12629, 446.523771);
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.subtract(complex0);
      complex0.pow(complex2);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.pow(complex0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Complex complex0 = new Complex(129.7787045986, 129.7787045986);
      complex0.negate();
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-867.0439516609359), 911.488283);
      complex0.multiply(complex1);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.log();
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Complex complex0 = new Complex((-2651.319124), (-2651.319124));
      complex0.log();
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.acos();
      complex1.isNaN();
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.log();
      complex1.isInfinite();
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.getReal();
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.getReal();
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      complex0.getImaginary();
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.getImaginary();
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Complex complex0 = new Complex((-2651.319124), (-2651.319124));
      complex0.getImaginary();
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Complex complex0 = new Complex(885.7, 885.7);
      complex0.INF.getArgument();
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Complex complex0 = new Complex((-2651.319124), (-2651.319124));
      complex0.getArgument();
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Complex complex0 = new Complex(885.7, 885.7);
      complex0.exp();
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply((-1534.0));
      complex1.exp();
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-2.0));
      complex1.exp();
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.createComplex(0.0, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.createComplex(0.0, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      complex0.createComplex(4.056605940147844E-4, 0.0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Complex complex0 = new Complex((-2523), (-2523));
      complex0.cosh();
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.createComplex(0.9999785924696087, (-843.21));
      complex1.cos();
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Complex complex0 = new Complex(153.28, 153.28);
      complex0.cos();
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      complex0.cos();
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Complex complex0 = new Complex(1.2599210498948732, 823.562);
      complex0.INF.conjugate();
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Complex complex0 = new Complex((-720.0761534887), (-720.0761534887));
      complex0.conjugate();
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.conjugate();
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      complex1.atan();
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.asin();
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Complex complex0 = new Complex((-1095.285), 112.1841061);
      Complex complex1 = complex0.sin();
      complex1.asin();
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.add(complex0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      complex0.add(complex0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.acos();
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Complex complex0 = new Complex((-221.921311913959), 0.0);
      Complex complex1 = complex0.acos();
      complex1.atan();
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Complex complex0 = new Complex((-0.5893944868932843), (-0.5893944868932843));
      try { 
        complex0.ONE.subtract((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.pow((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(628983398);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.multiply((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Complex complex0 = new Complex(5.0, 5.0);
      try { 
        complex0.divide((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Complex complex0 = Complex.INF;
      // Undeclared exception!
      try { 
        complex0.INF.add((Complex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.exp();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Complex complex0 = new Complex(1526.12629, 446.523771);
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(446.523771, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1526.12629, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.negate();
      assertFalse(complex1.isInfinite());
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ONE.multiply(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertTrue(complex1.equals((Object)complex0));
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.multiply(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.add(complex0);
      Complex complex2 = complex0.INF.divide(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Complex complex0 = new Complex(885.7, 885.7);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.ONE.divide(complex1);
      Complex complex3 = complex0.divide(complex2);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(885.7, complex3.getImaginary(), 0.01);
      assertEquals((-885.7), complex3.getReal(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.add(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Complex complex0 = new Complex((-221.921311913959), 0.0);
      double double0 = complex0.abs();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals((-221.921311913959), complex0.getReal(), 0.01);
      assertEquals(221.921311913959, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Complex complex0 = new Complex(1526.12629, 446.523771);
      double double0 = complex0.I.abs();
      assertFalse(complex0.isNaN());
      assertEquals(1.0, double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1526.12629, complex0.getReal(), 0.01);
      assertEquals(446.523771, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Complex complex0 = new Complex((-257.34203), Double.POSITIVE_INFINITY);
      assertEquals((-257.34203), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, 0.2919265817264288);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(0.2919265817264288, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, Double.NaN);
      Complex complex1 = complex0.log();
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Complex complex0 = new Complex((-0.9999785924696087), Double.NaN);
      assertTrue(complex0.isNaN());
      assertEquals((-0.9999785924696087), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      double double0 = complex0.getReal();
      assertEquals((-339.52593), double0, 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals((-339.52593), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = complex0.exp();
      Complex complex2 = complex1.pow(complex0);
      complex2.nthRoot(1094);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals((-8.14456326750933E-149), complex1.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = (Complex)complex0.NaN.readResolve();
      List<Complex> list0 = complex1.nthRoot(1698);
      assertEquals((-339.52593), complex0.getImaginary(), 0.01);
      assertTrue(list0.contains(complex1));
      assertFalse(list0.contains(complex0));
      assertFalse(complex0.isInfinite());
      assertEquals((-339.52593), complex0.getReal(), 0.01);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      try { 
        complex0.nthRoot((-785));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -785
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      List<Complex> list0 = complex0.nthRoot(1698);
      assertEquals(1698, list0.size());
      assertEquals((-339.52593), complex0.getImaginary(), 0.01);
      assertEquals((-339.52593), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.tanh();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = complex0.tanh();
      assertFalse(complex0.isInfinite());
      assertEquals((-339.52593), complex0.getReal(), 0.01);
      assertEquals((-1.1135189772071802E-295), complex1.getImaginary(), 0.01);
      assertEquals((-339.52593), complex0.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = (Complex)complex0.NaN.readResolve();
      Complex complex2 = complex1.tan();
      assertEquals((-339.52593), complex0.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertEquals((-339.52593), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Complex complex0 = new Complex((-1.512994405980773), (-1.512994405980773));
      Complex complex1 = complex0.tan();
      assertEquals((-0.012352222448808224), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.512994405980773), complex0.getReal(), 0.01);
      assertEquals((-1.1011783534852302), complex1.getImaginary(), 0.01);
      assertEquals((-1.512994405980773), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.sinh();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = complex0.sinh();
      assertEquals((-339.52593), complex0.getReal(), 0.01);
      assertEquals((-1.3842532721577643E147), complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-3.29847752880796E146), complex1.getImaginary(), 0.01);
      assertEquals((-339.52593), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.cosh();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.sinh();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-3.29847752880796E146), complex1.getImaginary(), 0.01);
      assertEquals(1.3842532721577643E147, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.atan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.ZERO.subtract(complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.subtract(complex0);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-0.0013888888689039883));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = (Complex)complex0.NaN.readResolve();
      Complex complex2 = complex1.multiply((-339.52593));
      assertFalse(complex0.isNaN());
      assertEquals((-339.52593), complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-339.52593), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.I.multiply(complex1);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = (Complex)complex0.NaN.readResolve();
      Complex complex2 = complex0.multiply(complex1);
      assertEquals((-339.52593), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertTrue(complex2.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-339.52593), complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.I.hashCode();
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.atan();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.createComplex((-441137.4654485348), (-441137.4654485348));
      boolean boolean0 = complex1.equals(complex0);
      assertEquals((-441137.4654485348), complex1.getImaginary(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertFalse(complex1.isInfinite());
      assertEquals((-441137.4654485348), complex1.getReal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      boolean boolean0 = complex0.equals(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertTrue(boolean0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = Complex.ZERO;
      boolean boolean0 = complex1.equals(complex0);
      assertTrue(boolean0);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = (Complex)complex0.NaN.readResolve();
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-339.52593), complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertEquals((-339.52593), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = complex0.atan();
      assertEquals((-0.0014726394449669005), complex1.getImaginary(), 0.01);
      assertEquals((-1.569323683091692), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.divide(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.conjugate();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.cosh();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.ONE.getArgument();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      ComplexField complexField0 = complex0.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.pow(complex0);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      String string0 = complex0.INF.toString();
      assertEquals("(Infinity, Infinity)", string0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      Complex complex0 = new Complex((-339.52593), (-339.52593));
      Complex complex1 = (Complex)complex0.NaN.readResolve();
      Complex complex2 = complex0.add(complex1);
      assertTrue(complex2.isNaN());
      assertEquals((-339.52593), complex0.getImaginary(), 0.01);
      assertEquals((-339.52593), complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
  }
}
