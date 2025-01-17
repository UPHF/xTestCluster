/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 22:57:57 GMT 2022
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.MinimizeExitPoints;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.rhino.Node;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MinimizeExitPoints_ESTest extends MinimizeExitPoints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = Node.newString("");
      minimizeExitPoints0.tryMinimizeExits(node0, 49, "");
      assertEquals(53, Node.INPUT_ID);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node(1300);
      Node node1 = new Node(114, node0);
      minimizeExitPoints0.process(node1, node1);
      assertFalse(node1.isCatch());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node((-923));
      minimizeExitPoints0.process((Node) null, node0);
      assertEquals(0, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.visit((NodeTraversal) null, (Node) null, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MinimizeExitPoints", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "k");
      node0.putBooleanProp((-12), true);
      Node node1 = new Node(46, node0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.tryMinimizeExits(node1, 46, "k");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unexpected prop id -12
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.process((Node) null, (Node) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints((AbstractCompiler) null);
      Node node0 = Node.newString("e3^blA]DTL<w`)[~H@");
      // Undeclared exception!
      try { 
        minimizeExitPoints0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node(20);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, minimizeExitPoints0);
      minimizeExitPoints0.visit(nodeTraversal0, node0, node0);
      assertFalse(node0.isExprResult());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "9");
      Node node1 = new Node(46, node0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.tryMinimizeExits(node1, 46, "9");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // SCRIPT 1 [synthetic: com.google.javascript.rhino.Node$IntPropListItem@0000000690] [source_file: com.google.javascript.rhino.Node$ObjectPropListItem@0000000691] [input_id: com.google.javascript.rhino.Node$ObjectPropListItem@0000000692] is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node(20);
      minimizeExitPoints0.tryMinimizeExits(node0, 20, "");
      assertEquals(47, Node.IS_DISPATCHER);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node((-1027));
      Node node1 = new Node(126, node0);
      minimizeExitPoints0.tryMinimizeExits(node1, (-2936), "");
      assertFalse(node1.isIn());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node(1);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.tryMinimizeExits(node0, 1, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node((-557));
      Node node1 = new Node(126, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, minimizeExitPoints0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.visit(nodeTraversal0, node1, node1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -557
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node(1061);
      Node node1 = new Node(115, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, minimizeExitPoints0);
      minimizeExitPoints0.visit(nodeTraversal0, node1, node0);
      assertEquals(55, Node.INFERRED_FUNCTION);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node(1300);
      Node node1 = new Node(114, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, minimizeExitPoints0);
      minimizeExitPoints0.visit(nodeTraversal0, node1, node0);
      assertFalse(node0.isCase());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, minimizeExitPoints0);
      Node node1 = new Node(105, node0);
      minimizeExitPoints0.visit(nodeTraversal0, node1, node0);
      assertFalse(node0.isThrow());
  }
}
