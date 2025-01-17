/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 22:12:30 GMT 2022
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckSideEffects;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CheckSideEffects_ESTest extends CheckSideEffects_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SyntheticAst syntheticAst0 = new SyntheticAst("1zw/E:^@O");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0);
      Node node1 = new Node(37, node0);
      CheckSideEffects.StripProtection checkSideEffects_StripProtection0 = new CheckSideEffects.StripProtection(compiler0);
      checkSideEffects_StripProtection0.visit(nodeTraversal0, node1, node1);
      assertFalse(node1.isContinue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckSideEffects.StripProtection checkSideEffects_StripProtection0 = new CheckSideEffects.StripProtection(compiler0);
      SyntheticAst syntheticAst0 = new SyntheticAst("<rh;2oYZ");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      Node node1 = new Node(43, node0);
      checkSideEffects_StripProtection0.process(node0, node1);
      assertFalse(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "nc,A", "nc,A");
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, false);
      Node node1 = new Node(85, node0);
      // Undeclared exception!
      try { 
        checkSideEffects0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0);
      // Undeclared exception!
      try { 
        checkSideEffects0.visit(nodeTraversal0, (Node) null, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CheckSideEffects", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, false);
      // Undeclared exception!
      try { 
        checkSideEffects0.hotSwapScript((Node) null, (Node) null);
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
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "nc,A", "nc,A");
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects((AbstractCompiler) null, checkLevel0, true);
      // Undeclared exception!
      try { 
        checkSideEffects0.hotSwapScript((Node) null, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SyntheticAst syntheticAst0 = new SyntheticAst("1zw/E:^@O");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0);
      Node node1 = new Node(125, node0);
      checkSideEffects0.visit(nodeTraversal0, node0, node1);
      assertEquals(35, Node.PARENTHESIZED_PROP);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("L!(Fb:(bXIev");
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0);
      Node node1 = new Node(130, node0);
      checkSideEffects0.visit(nodeTraversal0, node0, node1);
      assertFalse(node1.isContinue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "nc,A", "nc,A");
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, false);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0, typedScopeCreator0);
      nodeTraversal0.traverseInnerNode(node0, node0, (Scope) null);
      assertEquals(2, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SyntheticAst syntheticAst0 = new SyntheticAst(")>");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      checkSideEffects0.visit((NodeTraversal) null, node0, (Node) null);
      assertEquals(39, Node.EMPTY_BLOCK);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SyntheticAst syntheticAst0 = new SyntheticAst("1zw/E:^@O");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      Node node1 = new Node(37, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0);
      CheckSideEffects.StripProtection checkSideEffects_StripProtection0 = new CheckSideEffects.StripProtection(compiler0);
      checkSideEffects_StripProtection0.visit(nodeTraversal0, node1, node0);
      assertEquals(40, Node.ORIGINALNAME_PROP);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "b%", "b%");
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      checkSideEffects0.process(node0, node0);
      assertEquals(46, Node.IS_NAMESPACE);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "nc,A", "nc,A");
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      Node node1 = new Node(125, node0);
      // Undeclared exception!
      try { 
        checkSideEffects0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("1zw/E:^@O");
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, false);
      Node node1 = new Node(8, node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0);
      Node node2 = new Node(125, node1);
      checkSideEffects0.visit(nodeTraversal0, node0, node2);
      assertFalse(node2.isFor());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SyntheticAst syntheticAst0 = new SyntheticAst(")>");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, false);
      Node node1 = new Node(115, node0);
      checkSideEffects0.visit((NodeTraversal) null, node0, node1);
      assertFalse(node0.isThis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("1zw/E:^@$O");
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0);
      Node node1 = new Node(125, node0);
      checkSideEffects0.visit(nodeTraversal0, node0, node1);
      assertFalse(node0.isExprResult());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.CheckSideEffects$StripProtection", "com.google.javascript.jscomp.CheckSideEffects$StripProtection");
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, false);
      checkSideEffects0.process(node0, node0);
      assertTrue(compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "PR,A", "PR,A");
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      Node node1 = new Node(49, node0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0, syntacticScopeCreator0);
      nodeTraversal0.traverseInnerNode(node0, node0, (Scope) null);
      assertEquals(16, Node.FLAG_LOCAL_RESULTS);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SyntheticAst syntheticAst0 = new SyntheticAst(")>");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, false);
      checkSideEffects0.hotSwapScript(node0, node0);
      assertEquals(46, Node.IS_NAMESPACE);
  }
}
