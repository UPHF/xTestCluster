/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 13:45:24 GMT 2022
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ProcessClosurePrimitives_ESTest extends ProcessClosurePrimitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = new Node(86, 86, 86);
      Node node1 = new Node(3591, node0, node0, node0, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0, (ScopeCreator) null);
      processClosurePrimitives0.visit(nodeTraversal0, node0, node1);
      assertEquals(32, Node.MEMBER_TYPE_PROP);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("goog.inherits", "m;mpRZ7\"N%C|H_`");
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node1 = new Node(38, node0, node0, node0, node0);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node0);
      assertEquals(46, Node.IS_DISPATCHER);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node0 = new Node(37, 37, 37);
      // Undeclared exception!
      try { 
        processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ProcessClosurePrimitives", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      // Undeclared exception!
      try { 
        processClosurePrimitives0.process((Node) null, (Node) null);
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
  public void test04()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = null;
      try {
        processClosurePrimitives0 = new ProcessClosurePrimitives((AbstractCompiler) null, checkLevel0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ProcessClosurePrimitives", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ProcessClosurePrimitives$ProvidedName");
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node1 = new Node(33, node0, node0, node0, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0, (ScopeCreator) null);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node1);
      assertEquals(2, Node.ATTRIBUTE_FLAG);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("9w");
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      Node node1 = new Node(30, node0, node0, node0);
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(typedScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0, memoizedScopeCreator0);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node0);
      assertEquals(11, Node.USES_PROP);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("goog.inherits", "goog.inherits");
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      nodeTraversal0.traverse(node0);
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("9w");
      Node node1 = new Node(30, node0, node0, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      processClosurePrimitives0.process(node0, node1);
      assertEquals(38, Node.EMPTY_BLOCK);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = new Node(105, (-23), 105);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node1 = new Node(4, node0, node0, node0, node0);
      processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
      assertEquals("", nodeTraversal0.getSourceName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = new Node(105, (-23), 105);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      // Undeclared exception!
      try { 
        processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = new Node(86, 86, 86);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0, (ScopeCreator) null);
      processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
      assertEquals((-3), Node.LOCAL_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("goog.inherits", "goog.inherits");
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node1 = new Node(37, node0, node0, node0, node0);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node0);
      assertEquals(15, Node.CASEARRAY_PROP);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("9w");
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      Node node1 = new Node(30, node0, node0, node0);
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      processClosurePrimitives0.process(node1, node1);
      assertEquals(31, Node.SIDE_EFFECTS_FLAGS_MASK);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = new Node(0, 0, 0);
      processClosurePrimitives0.process(node0, node0);
      assertFalse(node0.isUnscopedQualifiedName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      Node node0 = compiler0.parseSyntheticCode("goog.base", "goog.base");
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      processClosurePrimitives0.process(node0, node0);
      assertTrue(compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
  }
}
