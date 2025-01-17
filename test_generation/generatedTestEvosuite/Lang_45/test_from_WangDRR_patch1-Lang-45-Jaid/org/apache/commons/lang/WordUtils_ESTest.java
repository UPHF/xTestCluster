/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 06:44:37 GMT 2022
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
      String string0 = WordUtils.abbreviate("LINUX", 1, (-2727), "/-7fV.)");
      assertEquals("L/-7fV.)", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.abbreviate("\"S7", (-1), (-1), "\"S7");
      assertEquals("\"S7", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.abbreviate("Mb", 2518, 2, "org.apache.commons.lang.WordUtils");
      assertEquals("Mb", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WordUtils.abbreviate("Windows NT", (-914), 3, "windows nT");
      assertEquals("Winwindows nT", string0);
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
      String string0 = WordUtils.initials("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("G}`#{5*c}$7R|");
      assertEquals("G}`#{5*c}$7r|", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = WordUtils.capitalize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = WordUtils.initials("os.arch", (char[]) null);
      assertEquals("o", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WordUtils.initials((String) null, (char[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[6] = '!';
      String string0 = WordUtils.uncapitalize("%0_fm]E'o~u3WI3!", charArray0);
      assertEquals("%0_fm]E'o~u3WI3!", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null, (char[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("<+#*1jor86", (char[]) null);
      assertEquals("<+#*1jor86", string0);
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
      String string0 = WordUtils.wrap("R:1Xb6\u0000`'3dsXhI&*e", (-803), "R:1Xb6\u0000`'3dsXhI&*e", false);
      assertEquals("R:1Xb6\u0000`'3dsXhI&*e", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.wrap("Minimum\nabbreviation\nwidth with\noffset is\n7", 10, (String) null, true);
      assertEquals("Minimum\nab\nbreviation\n\nwidth\nwith\noffse\nt is\n7", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 0, "", false);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        WordUtils.abbreviate(" ", (-1100), (-1100), " ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", 0, 0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = WordUtils.abbreviate("qH", 86, (-1), "");
      assertEquals("qH", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 0, 0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", (-1), 17, " ");
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, 939, 939, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[3] = '1';
      String string0 = WordUtils.initials("1.4", charArray0);
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("Z]hbNrxt|[", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = WordUtils.initials("qw");
      assertEquals("q", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = WordUtils.initials("", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.swapCase("java.specification.vendor");
      assertEquals("JAVA.SPECIFICATION.VENDOR", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WordUtils.swapCase("NUk`fMZ*yfW)Z.9/\"QT");
      assertEquals("nuK`Fmz*YFw)z.9/\"qt", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = WordUtils.uncapitalize(";& JcNX(.Yz-}");
      assertEquals(";& jcNX(.Yz-}", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize(" #", charArray0);
      assertEquals(" #", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[3];
      String string0 = WordUtils.uncapitalize("", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("org.apache.commons.lang.WordUtils", charArray0);
      assertEquals("org.apache.commons.lang.WordUtils", string0);
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
      String string0 = WordUtils.capitalize("2b% 'n/", charArray0);
      assertEquals("2b% 'n/", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = WordUtils.wrap("|/\u0004%e 8NFL", (-823), "|/\u0004%e 8NFL", true);
      assertEquals("||/\u0004%e 8NFL/|/\u0004%e 8NFL\u0004|/\u0004%e 8NFL%|/\u0004%e 8NFLe|/\u0004%e 8NFL8|/\u0004%e 8NFLN|/\u0004%e 8NFLF|/\u0004%e 8NFLL", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = WordUtils.wrap(" vs ", (-803), "Ul*4qiUvJ0^W''E,;W", false);
      assertEquals("vsUl*4qiUvJ0^W''E,;W", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = WordUtils.wrap("R:1Xb6\u0000`'3dsXhI&*e", 2203);
      assertEquals("R:1Xb6\u0000`'3dsXhI&*e", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = WordUtils.wrap("", 0, "eCdxpUB", true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
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
