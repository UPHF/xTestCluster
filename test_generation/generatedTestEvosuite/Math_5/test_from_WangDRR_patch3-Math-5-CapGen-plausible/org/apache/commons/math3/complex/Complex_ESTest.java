/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 09:16:58 GMT 2022
 */

package org.apache.commons.math3.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Complex_ESTest extends Complex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Complex complex0 = Complex.INF;
      try { 
        complex0.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math3.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-20.0));
      complex0.tanh();
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Complex complex0 = Complex.valueOf(20.0);
      complex0.tanh();
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Complex complex0 = Complex.valueOf(20.0, 20.0);
      complex0.tan();
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Complex complex0 = Complex.valueOf(20.0, 20.0);
      complex0.sinh();
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      complex0.equals(complex1);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf((-2170.0));
      complex1.equals(complex0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Complex complex0 = Complex.valueOf(371.737075, 371.737075);
      Complex complex1 = complex0.cosh();
      complex1.reciprocal();
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Complex complex0 = Complex.valueOf(371.737075, 371.737075);
      complex0.reciprocal();
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Complex.valueOf(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2328.0877151));
      complex0.tanh();
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Complex complex0 = new Complex((-19.149162314422256), (-19.149162314422256));
      complex0.tan();
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2083.369778761), (-2083.369778761));
      complex0.ONE.tan();
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.I;
      complex0.subtract(complex1);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2083.369778761), (-2083.369778761));
      Complex complex1 = complex0.negate();
      complex0.subtract(complex1);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.INF.subtract(0.0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.subtract(0.0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.488041639328003, 1.0400267878952942);
      Complex complex1 = complex0.reciprocal();
      complex1.subtract(1.488041639328003);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2328.0877151));
      complex0.sqrt1z();
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1331.16867194, Double.POSITIVE_INFINITY);
      complex0.sqrt1z();
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.POSITIVE_INFINITY, 5.606219651205072E-6);
      complex0.sqrt();
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1888.50634128806), 740.1494147387);
      complex0.sinh();
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Complex complex0 = new Complex(5.8759898326913254E166, Double.POSITIVE_INFINITY);
      complex0.sin();
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Complex complex0 = new Complex((-1.0));
      complex0.sin();
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Complex complex0 = Complex.valueOf(20.0);
      Complex complex1 = complex0.I.reciprocal();
      complex1.sin();
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.subtract(1549.0393);
      complex1.reciprocal();
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Complex complex0 = Complex.valueOf(804.3894696255, 804.3894696255);
      complex0.pow(complex0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2083.369778761), (-2083.369778761));
      complex0.pow(complex0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2083.369778761), (-2083.369778761));
      Complex complex1 = complex0.divide((-2083.369778761));
      complex0.pow(complex1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1331.16867194, Double.POSITIVE_INFINITY);
      complex0.pow(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Complex complex0 = Complex.valueOf(20.0);
      complex0.pow((-3018634.0449471744));
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1888.50634128806), 740.1494147387);
      complex0.pow(3510.6654);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.I.pow(4519.0386);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.INF.negate();
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.negate();
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.multiply(complex0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Complex complex0 = Complex.valueOf(371.737075, 371.737075);
      Complex complex1 = complex0.cos();
      complex1.multiply(complex0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.multiply(0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(1100.3);
      complex1.multiply((-1615.43543451));
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.multiply((-1615.43543451));
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.log();
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2083.369778761), (-2083.369778761));
      complex0.log();
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      complex1.isNaN();
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.isInfinite();
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.getReal();
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Complex complex0 = new Complex((-705.47846741), 376.64276609431846);
      complex0.getReal();
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      complex0.getImaginary();
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.401816502004675E-309));
      complex0.getImaginary();
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      complex0.getArgument();
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Complex complex0 = Complex.valueOf(804.3894696255, 804.3894696255);
      Complex complex1 = complex0.conjugate();
      complex1.getArgument();
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2083.369778761), (-2083.369778761));
      complex0.exp();
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2083.369778761), (-2083.369778761));
      Complex complex1 = complex0.negate();
      complex1.exp();
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1888.50634128806), 740.1494147387);
      Complex complex1 = complex0.I.reciprocal();
      complex1.exp();
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2064.3564), 0.0);
      Complex complex1 = Complex.valueOf(1320.199817, (-2064.3564));
      complex0.divide(complex1);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Complex complex0 = new Complex((-1.0));
      complex0.INF.divide((-2055.5446));
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      complex0.I.createComplex(Double.NaN, 1.0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      complex0.createComplex(Double.POSITIVE_INFINITY, (-20.0));
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      complex0.createComplex(0.0, (-1119.0));
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      complex0.createComplex(20.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.I.createComplex((-1.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.createComplex((-2699.0), 581.78637);
      complex1.cosh();
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.subtract((double) 241);
      complex1.cosh();
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1888.50634128806), 740.1494147387);
      complex0.cos();
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.conjugate();
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1888.50634128806), 740.1494147387);
      complex0.conjugate();
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(1573.728, 1573.728);
      Complex complex2 = complex1.tan();
      Complex complex3 = complex0.subtract(complex2);
      complex3.atan();
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Complex complex0 = Complex.valueOf(20.0);
      Complex complex1 = complex0.sqrt1z();
      complex1.atan();
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Complex complex0 = new Complex(5);
      complex0.atan();
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 7.60791864557102E11);
      complex0.asin();
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2064.3564), 0.0);
      complex0.asin();
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.ZERO.asin();
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      complex1.add(complex0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1888.50634128806), 740.1494147387);
      complex0.add(complex0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Complex complex0 = Complex.valueOf(20.0);
      complex0.add(complex0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.valueOf(1.488041639328003, 1.0400267878952942);
      Complex complex2 = complex1.reciprocal();
      complex0.add(complex2);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1331.16867194, Double.POSITIVE_INFINITY);
      complex0.add((-158.1));
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, (-2.401816502004675E-309));
      complex0.add(0.0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      complex0.add((-2019.915145116176));
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Complex complex0 = new Complex(1.6633478556884994E190, 1083.7816328535916);
      complex0.acos();
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.acos();
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1.7584857940673828);
      try { 
        complex0.subtract((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.INF.pow((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.multiply((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      try { 
        complex0.divide((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.add((Complex) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.pow(1100.3);
      Complex complex2 = complex1.multiply((-1));
      complex2.sqrt();
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0);
      complex0.sqrt();
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt();
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.ONE.log();
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1888.50634128806), 740.1494147387);
      complex0.subtract(complex0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sin();
      complex0.subtract(complex1);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1888.50634128806), 740.1494147387);
      Complex complex1 = complex0.negate();
      complex1.asin();
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.multiply(1.9502718448638916);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.multiply(complex0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.NaN.multiply(complex0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.I;
      complex0.divide(complex1);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      complex0.divide(complex0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.divide(0.42351221182315796);
      complex0.add(complex1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.NaN.add(complex0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.add(complex0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.INF.abs();
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.abs();
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Complex complex0 = new Complex((-2409.924430226), Double.NaN);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.getArgument();
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.isInfinite();
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.getReal();
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      complex0.getImaginary();
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Complex.valueOf(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Complex.valueOf(1856.902, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.nthRoot(729);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.nthRoot(270);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.nthRoot(948);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      try { 
        complex0.nthRoot((-1016));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1,016
         //
         verifyException("org.apache.commons.math3.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Complex complex0 = new Complex((-21.397647493270256), (-21.397647493270256));
      complex0.tanh();
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Complex complex0 = new Complex(1246.52053703293);
      complex0.tanh();
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.tanh();
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN, Double.NaN);
      complex0.tanh();
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-21.397647493270256), (-21.397647493270256));
      complex0.tan();
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.tan();
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.tan();
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.acos();
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.sqrt();
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sinh();
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.sinh();
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.NaN.sin();
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.atan();
      complex1.exp();
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cosh();
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-1.0));
      complex0.cosh();
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cos();
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.I.cos();
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.atan();
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.subtract(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.subtract(2040.00517964095);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.subtract(complex0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      complex1.reciprocal();
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      Complex complex0 = new Complex((-9.686840311651484E12));
      complex0.multiply(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1331.16867194, Double.POSITIVE_INFINITY);
      complex0.multiply(1620.050079);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      complex0.multiply(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.multiply(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.multiply(1.9502718448638916);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.multiply(451);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.multiply((-337));
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.multiply(1);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      complex0.multiply(complex1);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      complex0.multiply(complex1);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.hashCode();
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Object object0 = complex0.readResolve();
      complex0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.conjugate();
      complex1.equals(complex0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.NaN.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.ONE.equals(complex0);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.reciprocal();
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.INF.reciprocal();
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.NaN.reciprocal();
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      complex1.log();
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide((-1.0));
      complex1.sqrt();
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.divide(0.0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.divide(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.divide(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      complex0.divide(complex1);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.atan();
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      Complex complex0 = new Complex((-19.149162314422256), (-19.149162314422256));
      Complex complex1 = Complex.NaN;
      complex0.INF.divide(complex1);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.NaN.divide(complex0);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      complex1.equals(complex0);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.add(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.add((-1429.1054919328));
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.NaN.abs();
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.isNaN();
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.pow(complex0);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.toString();
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.INF.getField();
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      Complex complex0 = Complex.I;
      // Undeclared exception!
      complex0.nthRoot(1073741824);
  }
}
