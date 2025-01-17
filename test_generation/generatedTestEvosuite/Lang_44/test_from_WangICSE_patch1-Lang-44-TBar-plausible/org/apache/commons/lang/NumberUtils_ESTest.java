/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 10:27:42 GMT 2022
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x1fy7G\"E]NP4a2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xb9a?TL<(@8s'+.ba");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = NumberUtils.minimum(1985L, (-2870L), 1L);
      assertEquals((-2870L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = NumberUtils.minimum((-208L), 1922L, 0L);
      assertEquals((-208L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      try { 
        NumberUtils.createNumber("1fy\"E]NP4a2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("zvIN0CaMrP15Vq", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("", (-2461));
      assertEquals((-2461), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("1");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = NumberUtils.maximum((long) 0, (-1L), 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Long long0 = NumberUtils.createLong("0");
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Long long0 = NumberUtils.createLong("8");
      assertEquals(8L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("0x0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("4");
      assertEquals(4, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0x80");
      assertEquals((-128), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("0");
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("4");
      assertEquals(4.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("0");
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("4");
      assertEquals(4.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("0");
      assertEquals((byte)0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("1");
      assertEquals((byte)1, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("0");
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("80");
      assertEquals((byte)80, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createNumber("~CdE~N;<d3[r`?e;");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger("]WF");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"]WF\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat("liF($adEr!pWtm");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createLong("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger("^~$HoB\"[9Rnf7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"^~$HoB\"[9Rnf7\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble("vuw_z[gEpQ-.0Y t'LY");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("l");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4L");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2%");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--G!b#*744");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("EMv7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..u.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0ex");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xAtlFMc%/a)nz/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("*sRCL%I6.&@e\"aF4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("0e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = NumberUtils.compare((-420.9F), (-1614.23F));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int int0 = NumberUtils.compare((-0.14893876F), 0.0F);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = NumberUtils.compare((-1650.6027F), (-1650.6027F));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0, 0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0, 1863.9039127146);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      int int0 = NumberUtils.compare(2180.73178002007, (double) (-360));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      int int0 = NumberUtils.maximum(4, 0, 2813);
      assertEquals(2813, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int int0 = NumberUtils.maximum((-256476957), (-1305), (-256476957));
      assertEquals((-1305), int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      long long0 = NumberUtils.maximum((-1985L), (-1985L), (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      long long0 = NumberUtils.maximum(0L, (long) 101, (long) 0);
      assertEquals(101L, long0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      int int0 = NumberUtils.minimum(48, 48, (-360));
      assertEquals((-360), int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      int int0 = NumberUtils.minimum(4, (-594), 2028);
      assertEquals((-594), int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      int int0 = NumberUtils.minimum(49, 101, 109);
      assertEquals(49, int0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      long long0 = NumberUtils.minimum((-1L), (-1L), (-4L));
      assertEquals((-4L), long0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      long long0 = NumberUtils.minimum(2073L, (long) 0, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      long long0 = NumberUtils.minimum(1L, 1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      try { 
        NumberUtils.createNumber("..u.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ..u. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      try { 
        NumberUtils.createNumber("ZSaN^L@.2=^Ep =Qm1");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      try { 
        NumberUtils.createNumber("bJ5Z`9k/Z5");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"b\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      try { 
        NumberUtils.createNumber("q4J?a&^-%6l^mQd");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // q4J?a&^-%6l^mQd is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      try { 
        NumberUtils.createNumber("NL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"N\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      try { 
        NumberUtils.createNumber("W]4+LhkXF");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // W]4+LhkXF is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" 0\"1<rD");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  0\"1<rD is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e2x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e2x is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      try { 
        NumberUtils.createNumber("m{asu4-E24,e89AZd+2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Illegal embedded sign character
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0x0");
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--Bw");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Strings must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Strin\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0x-+^");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Sign character in wrong position
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("8'/Le1]6qOZdyMMSO!");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("*sRCL%I6.&@e\"aF4", 3337);
      assertEquals(3337, int0);
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Q^f");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Q^f is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test99()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }
}
