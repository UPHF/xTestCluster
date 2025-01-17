/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 15 17:35:48 GMT 2022
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CollapseVariableDeclarations;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CollapseVariableDeclarations_ESTest extends CollapseVariableDeclarations_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CollapseVariableDeclarations collapseVariableDeclarations0 = new CollapseVariableDeclarations(compiler0);
      Node node0 = compiler0.parseTestCode(";M_[B_1c6s");
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      Node node1 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      collapseVariableDeclarations0.process(node0, node1);
      assertEquals(52, Node.LENGTH);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Compiler compiler1 = new Compiler();
      CollapseVariableDeclarations collapseVariableDeclarations0 = new CollapseVariableDeclarations(compiler1);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.CollapseVariableDeclarations$1");
      // Undeclared exception!
      try { 
        collapseVariableDeclarations0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CollapseVariableDeclarations collapseVariableDeclarations0 = null;
      try {
        collapseVariableDeclarations0 = new CollapseVariableDeclarations((AbstractCompiler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CollapseVariableDeclarations", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CollapseVariableDeclarations collapseVariableDeclarations0 = new CollapseVariableDeclarations(compiler0);
      // Undeclared exception!
      try { 
        collapseVariableDeclarations0.process((Node) null, (Node) null);
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
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      CollapseVariableDeclarations collapseVariableDeclarations0 = null;
      try {
        collapseVariableDeclarations0 = new CollapseVariableDeclarations(compiler0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
