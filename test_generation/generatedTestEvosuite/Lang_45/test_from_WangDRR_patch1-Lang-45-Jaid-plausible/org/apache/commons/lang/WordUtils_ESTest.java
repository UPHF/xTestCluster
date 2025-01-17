/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 06:47:22 GMT 2022
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WordUtils_ESTest extends WordUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = WordUtils.abbreviate("Zm: !WI", (-4358), 4, "Zm: !WI");
      assertEquals("Zm:Zm: !WI", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.abbreviate("~}.Qb@", (-1), (-1), "~}.Qb@");
      assertEquals("~}.Qb@", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 5, 0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 1812, "6s;ypCsW86It7");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.wrap("", 5);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.initials("org.apache.commons.lang.WordUtils");
      assertEquals("o", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.initials("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("Strings must not be null");
      assertEquals("Strings Must Not Be Null", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = WordUtils.capitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        WordUtils.abbreviate(" ", (-144), (-144), " ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = WordUtils.initials((String) null, (char[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null, (char[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.uncapitalize(" vs ", (char[]) null);
      assertEquals(" vs ", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[5];
      String string0 = WordUtils.capitalizeFully((String) null, charArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("", (char[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.capitalize((String) null, charArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = WordUtils.capitalize("", (char[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.wrap("W`y6bF@)dqZb:*I", 0, "it`*i}_q", false);
      assertEquals("W`y6bF@)dqZb:*I", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.wrap("", (-1888), (String) null, false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 0, "", false);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.abbreviate("$9Gd", 0, 0, "$9gd");
      assertEquals("$9gd", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.abbreviate("Windows 9", 0, (-914), "Windows 9");
      assertEquals("Windows 9", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.abbreviate("\t \t\r\n\b\r \t\r\n\b\n \t\r\n\b\b", 2, (-1), "\t \t\r\n\b\r \t\r\n\b\n \t\r\n\b\b");
      assertEquals("\t \t\r\n\b\r\t \t\r\n\b\r \t\r\n\b\n \t\r\n\b\b", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.abbreviate("Cannot pad a negative amount: ", (-1903), 0, "$9gd");
      assertEquals("$9gd", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, 64, 64, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = WordUtils.abbreviate("_ev5d(9s*0/", 223, 223, "NUk`fMZ*yfW)Z.9/\"QT");
      assertEquals("_ev5d(9s*0/", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[5] = ' ';
      String string0 = WordUtils.initials("Cannot pad a negative amount: ", charArray0);
      assertEquals("Cpana", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("46zIb,L@t~|", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = WordUtils.initials("b{", (char[]) null);
      assertEquals("b", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[6];
      String string0 = WordUtils.initials("", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.swapCase("z-n:<lAk");
      assertEquals("Z-N:<LaK", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("TO]U b?nC/}K\"");
      assertEquals("tO]U b?nC/}K\"", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("02HpRwj)qYAd3U9", charArray0);
      assertEquals("02HpRwj)qYAd3U9", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.uncapitalize("", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.uncapitalize("_ev5d(9s*0/", charArray0);
      assertEquals("_ev5d(9s*0/", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("java.awt.headless", charArray0);
      assertEquals("java.awt.headless", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.capitalizeFully("NUk`fMZ*yfW)Z.9/\"QT", charArray0);
      assertEquals("Nuk`fmz*yfw)z.9/\"qt", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'y';
      String string0 = WordUtils.capitalize("NUk`fMZ*yfW)Z.9/\"QT", charArray0);
      assertEquals("NUk`fMZ*yFW)Z.9/\"QT", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("h?=_4g,Xf", charArray0);
      assertEquals("h?=_4g,Xf", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = WordUtils.wrap("}); ?isttevlo%)&b 3", (-1808), "}); ?isTTevlo%)&b 3", true);
      assertEquals("}}); ?isTTevlo%)&b 3)}); ?isTTevlo%)&b 3;}); ?isTTevlo%)&b 3?}); ?isTTevlo%)&b 3i}); ?isTTevlo%)&b 3s}); ?isTTevlo%)&b 3t}); ?isTTevlo%)&b 3t}); ?isTTevlo%)&b 3e}); ?isTTevlo%)&b 3v}); ?isTTevlo%)&b 3l}); ?isTTevlo%)&b 3o}); ?isTTevlo%)&b 3%}); ?isTTevlo%)&b 3)}); ?isTTevlo%)&b 3&}); ?isTTevlo%)&b 3b}); ?isTTevlo%)&b 33", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = WordUtils.wrap(" \t\r\n\b", (-1), " \t\r\n\b", true);
      assertEquals("\t \t\r\n\b\r \t\r\n\b\n \t\r\n\b\b", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = WordUtils.wrap("Minimum abbreviation width is 4", 4, "Minimum abbreviation width is 4", false);
      assertEquals("MinimumMinimum abbreviation width is 4abbreviationMinimum abbreviation width is 4widthMinimum abbreviation width is 4is 4", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, (-420));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = WordUtils.wrap("NUk`fMZ*yfW)Z.9/\"QT", (-3499));
      assertNotNull(string0);
      assertEquals("NUk`fMZ*yfW)Z.9/\"QT", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = WordUtils.initials((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = WordUtils.capitalize("NUk`fMZ*yfW)Z.9/\"QT");
      assertEquals("NUk`fMZ*yfW)Z.9/\"QT", string0);
  }
}
