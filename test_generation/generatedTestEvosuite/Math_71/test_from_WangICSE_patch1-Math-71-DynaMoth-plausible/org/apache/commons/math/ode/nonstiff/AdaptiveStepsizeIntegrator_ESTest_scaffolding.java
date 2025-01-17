/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 15 13:51:19 GMT 2022
 */

package org.apache.commons.math.ode.nonstiff;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AdaptiveStepsizeIntegrator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/mmartinez/xTestCluster/tool_xTestCluster"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AdaptiveStepsizeIntegrator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.ode.DerivativeException",
      "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator",
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ode.sampling.StepHandler",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.Field",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.ode.AbstractIntegrator",
      "org.apache.commons.math.linear.FieldMatrixChangingVisitor",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.ode.sampling.DummyStepInterpolator",
      "org.apache.commons.math.ode.events.EventException",
      "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer",
      "org.apache.commons.math.ode.events.EventHandler",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator",
      "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math.ode.MultistepIntegrator",
      "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator",
      "org.apache.commons.math.linear.FieldLUDecomposition",
      "org.apache.commons.math.ode.nonstiff.AdamsIntegrator",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.fraction.BigFractionField$LazyHolder",
      "org.apache.commons.math.ode.sampling.StepInterpolator",
      "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor",
      "org.apache.commons.math.ode.FirstOrderDifferentialEquations",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.ode.SecondOrderDifferentialEquations",
      "org.apache.commons.math.fraction.FractionConversionException",
      "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator",
      "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator",
      "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator",
      "org.apache.commons.math.ode.events.CombinedEventsManager",
      "org.apache.commons.math.linear.DefaultFieldMatrixChangingVisitor",
      "org.apache.commons.math.fraction.BigFractionField",
      "org.apache.commons.math.ode.FirstOrderIntegrator",
      "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer$1",
      "org.apache.commons.math.linear.FieldLUDecompositionImpl$Solver",
      "org.apache.commons.math.linear.SingularMatrixException",
      "org.apache.commons.math.MaxEvaluationsExceededException",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.linear.FieldDecompositionSolver",
      "org.apache.commons.math.FieldElement",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math.ode.FirstOrderConverter",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.ode.ODEIntegrator",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.linear.BigMatrix",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.ode.IntegratorException",
      "org.apache.commons.math.fraction.BigFraction",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.linear.FieldLUDecompositionImpl",
      "org.apache.commons.math.linear.MatrixUtils$BigFractionMatrixConverter"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math.ode.SecondOrderDifferentialEquations", false, AdaptiveStepsizeIntegrator_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AdaptiveStepsizeIntegrator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.ode.AbstractIntegrator",
      "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math.ode.MultistepIntegrator",
      "org.apache.commons.math.ode.nonstiff.AdamsIntegrator",
      "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator",
      "org.apache.commons.math.ode.events.CombinedEventsManager",
      "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator",
      "org.apache.commons.math.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator",
      "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer",
      "org.apache.commons.math.fraction.BigFraction",
      "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator",
      "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator",
      "org.apache.commons.math.ode.FirstOrderConverter",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ode.IntegratorException",
      "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.fraction.BigFractionField",
      "org.apache.commons.math.fraction.BigFractionField$LazyHolder",
      "org.apache.commons.math.linear.FieldLUDecompositionImpl",
      "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator",
      "org.apache.commons.math.ode.sampling.StepNormalizer",
      "org.apache.commons.math.ode.events.EventState",
      "org.apache.commons.math.linear.FieldLUDecompositionImpl$Solver",
      "org.apache.commons.math.linear.DefaultFieldMatrixChangingVisitor",
      "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer$1",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor",
      "org.apache.commons.math.linear.MatrixUtils$BigFractionMatrixConverter",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.ode.sampling.DummyStepHandler",
      "org.apache.commons.math.ode.sampling.DummyStepHandler$LazyHolder"
    );
  }
}
