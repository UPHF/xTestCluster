import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(1.6481559849923735d, (double) (-1L), (-1.01885404374415d), (-0.06415703545444096d), true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D32 = rotation31.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D25, vector3D32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D25, (double) 100L);
        double double36 = rotation35.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = rotation18.applyInverseTo(rotation35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = rotation12.applyInverseTo(rotation35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = rotation38.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(116.90457705856772d, (-0.5d), 17.66239947251099d, 0.047917108096983706d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) (byte) 0, 0.01922366120271981d, 0.9949879346007117d, true);
        double double52 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation45, rotation51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation38.applyInverseTo(rotation51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = rotation5.applyTo(rotation38);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(vector3D32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-0.0d) + "'", double36 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation37);
        org.junit.Assert.assertNotNull(rotation38);
        org.junit.Assert.assertNotNull(rotation39);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertNotNull(rotation54);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.9412132394660416d, (-0.1730129508244783d), 2.7755575615628914E-17d, 0.2199735373126486d, false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double47 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation39, rotation46);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation62.applyInverseTo(rotation68);
        double double70 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation46, rotation62);
        double double71 = rotation62.getQ3();
        double double72 = rotation62.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = rotation32.applyInverseTo(rotation62);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D74 = rotation32.getAxis();
        double double75 = rotation32.getQ3();
        double double76 = rotation32.getQ3();
        double[][] doubleArray77 = rotation32.getMatrix();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D40);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(rotation69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 3.141592653589793d + "'", double70 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertNotNull(rotation73);
        org.junit.Assert.assertNotNull(vector3D74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 9.649660284921133d + "'", double75 == 9.649660284921133d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 9.649660284921133d + "'", double76 == 9.649660284921133d);
        org.junit.Assert.assertNotNull(doubleArray77);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double28 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation27);
        double double29 = rotation27.getAngle();
        double double30 = rotation27.getAngle();
        double double31 = rotation27.getQ0();
        double double32 = rotation27.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D46 = rotation45.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D39, vector3D46);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D39, (double) 100L);
        double double50 = rotation49.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation49.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double58 = rotation57.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = rotation51.applyInverseTo(rotation57);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation27.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D61, 3.1216925665368036d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation14.applyInverseTo(vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation83.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D77, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D86 = rotation70.applyTo(vector3D77);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D64, vector3D77);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 3.141592653589793d + "'", double29 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.141592653589793d + "'", double30 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D39);
        org.junit.Assert.assertNotNull(vector3D46);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-0.0d) + "'", double50 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(rotation59);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(vector3D64);
        org.junit.Assert.assertNotNull(vector3D77);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertNotNull(vector3D86);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        double double37 = rotation28.getQ3();
        double double38 = rotation28.getAngle();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation16.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double25 = rotation24.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = rotation18.applyInverseTo(rotation24);
        double[][] doubleArray27 = rotation24.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) '4', (-10.0d), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        double double35 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation24, rotation33);
        java.lang.Class<?> wildcardClass36 = rotation33.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation18);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(rotation26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 5.970211935275038d, 0.0d, (-0.9707361041235048d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 1, 0.9953708042224798d, 10.315768314846704d, 10.315768314846704d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation6 = rotation5.revert();
        org.junit.Assert.assertNotNull(rotation6);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(2.7755575615628914E-17d, (double) (-1L), 0.20120377604668613d, 0.33900504942104487d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation11.applyTo(vector3D18);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        double double34 = rotation33.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation33.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        double double43 = rotation41.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation35.applyInverseTo(vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, (double) 10L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation5.applyTo(vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D49, 0.0d);
        double double52 = rotation51.getAngle();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.9996303825414301d + "'", double43 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D49);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 1, (double) (byte) -1, (double) ' ', (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation22.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double31 = rotation30.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation24.applyInverseTo(rotation30);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation44.applyTo(vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation38.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation30.applyInverseTo(vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation5.applyTo(vector3D62);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation81.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D89 = rotation88.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D82, vector3D89);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D82, (double) 100L);
        double double93 = rotation92.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = rotation75.applyInverseTo(rotation92);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = rotation69.applyInverseTo(rotation92);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation96 = rotation5.applyInverseTo(rotation92);
        double[][] doubleArray97 = rotation5.getMatrix();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(vector3D62);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D82);
        org.junit.Assert.assertNotNull(vector3D89);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-0.0d) + "'", double93 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation94);
        org.junit.Assert.assertNotNull(rotation95);
        org.junit.Assert.assertNotNull(rotation96);
        org.junit.Assert.assertNotNull(doubleArray97);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation14.applyTo(rotation29);
        double double31 = rotation30.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D38, vector3D45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation46.applyInverseTo(rotation52);
        double double54 = rotation52.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double68 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation60, rotation67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation81.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D75, vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = rotation83.applyInverseTo(rotation89);
        double double91 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation67, rotation83);
        double double92 = rotation83.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = rotation52.applyInverseTo(rotation83);
        double double94 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation30, rotation83);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = rotation83.revert();
        double[][] doubleArray96 = rotation83.getMatrix();
        double double97 = rotation83.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 3.141592653589793d + "'", double54 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(vector3D75);
        org.junit.Assert.assertNotNull(vector3D82);
        org.junit.Assert.assertNotNull(rotation90);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 3.141592653589793d + "'", double91 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertNotNull(rotation93);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertNotNull(rotation95);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        double double37 = rotation12.getAngle();
        double double38 = rotation12.getQ1();
        double double39 = rotation12.getQ1();
        double double40 = rotation12.getQ1();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 3.141592653589793d + "'", double37 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation5.applyTo(vector3D12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, (double) 100L);
        double double51 = rotation50.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation33.applyInverseTo(rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation27.applyInverseTo(rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = rotation53.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = rotation56.revert();
        double double58 = rotation57.getQ0();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D40);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-0.0d) + "'", double51 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertNotNull(rotation54);
        org.junit.Assert.assertNotNull(vector3D55);
        org.junit.Assert.assertNotNull(rotation57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.7917653948360558d) + "'", double58 == (-0.7917653948360558d));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 3.082566122054968d, (-5.727097351514677E-5d), 3.1396027778778115d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(115.23483371416586d, (-12.771588128375658d), 0.7881701093115124d, 0.09900971983887621d, true);
        double[][] doubleArray6 = rotation5.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray6, 0.9524892191720237d);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation5.applyTo(vector3D12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) (byte) 0);
        double double24 = rotation23.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = rotation23.revert();
        double[][] doubleArray26 = rotation23.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray26, 0.5914138605204349d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray26, 0.016784652862817887d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D37, vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D37, (double) 1L);
        double double48 = rotation47.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder49 = null;
        double[] doubleArray50 = rotation47.getAngles(rotationOrder49);
        double double51 = rotation47.getAngle();
        double double52 = rotation47.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation30.applyTo(rotation47);
        double double54 = rotation30.getQ2();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(rotation25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.33900504942104487d + "'", double48 == 0.33900504942104487d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[2.356194490192345, 0.9999999999999999, -2.356194490192345]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.33900504942104487d + "'", double52 == 0.33900504942104487d);
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation29.applyTo(vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D45, vector3D59, vector3D77);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation5.applyInverseTo(vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D81, 10.0d);
        double[][] doubleArray84 = rotation83.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray84, (double) 10L);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D77);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(doubleArray84);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 10924.868355180524d, (-0.06415703545444096d), 2.7755575615628914E-17d, true);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ3();
        double double18 = rotation16.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation16.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation16.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0d) + "'", double18 == (-0.0d));
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D20);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.011384871683009012d, (double) (-1.0f), 0.24789995758802838d, (-0.06549968080510009d), false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', 0.2199735373126486d, 0.09900971983887621d, 8.62318872287684d, true);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.06415703545444096d, (-0.8775825618903728d), 2.566370614359173d, 0.9856688089870894d, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        double double29 = rotation12.getQ3();
        double double30 = rotation12.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation36.applyTo(vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, (double) (byte) 0);
        double double55 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation54);
        double double56 = rotation54.getQ0();
        double double57 = rotation54.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation63.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double71 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation63, rotation70);
        double double72 = rotation70.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = rotation54.applyInverseTo(rotation70);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 3.141592653589793d + "'", double55 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D64);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 3.141592653589793d + "'", double72 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation73);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(10.0d, 0.9950846276202212d, (double) '#', (double) 1L, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        double double53 = rotation52.getQ1();
        double[][] doubleArray54 = rotation52.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = rotation52.revert();
        double double56 = rotation52.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation52.getAxis();
        double double58 = rotation52.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(rotation55);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation16.revert();
        double double19 = rotation18.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation26.applyInverseTo(vector3D33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D41, vector3D48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D41, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D34, vector3D41);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D34, (double) 'a');
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D34, 0.9028084065328048d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation18.applyTo(vector3D34);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.0d) + "'", double19 == (-0.0d));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertNotNull(vector3D57);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation5.applyTo(vector3D12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) (byte) 0);
        double double24 = rotation23.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = rotation23.revert();
        double[][] doubleArray26 = rotation23.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray26, 0.5914138605204349d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray26, 0.016784652862817887d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(rotation25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(vector3D31);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 0, (double) ' ', (double) (byte) 100, 17.66239947251099d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation48.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, vector3D49);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation35.applyTo(rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation20.applyTo(rotation51);
        double[][] doubleArray53 = rotation52.getMatrix();
        double double54 = rotation52.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation5.applyInverseTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double63 = rotation62.getQ2();
        double double64 = rotation62.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = rotation5.applyInverseTo(rotation62);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D87 = rotation71.applyTo(vector3D78);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D88 = rotation71.getAxis();
        double double89 = rotation71.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = rotation71.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = rotation71.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation5.applyInverseTo(rotation71);
        double double93 = rotation5.getQ1();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D49);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D55);
        org.junit.Assert.assertNotNull(vector3D56);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 100.0d + "'", double64 == 100.0d);
        org.junit.Assert.assertNotNull(rotation65);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertNotNull(vector3D87);
        org.junit.Assert.assertNotNull(vector3D88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 3.1216925665368036d + "'", double89 == 3.1216925665368036d);
        org.junit.Assert.assertNotNull(rotation90);
        org.junit.Assert.assertNotNull(rotation91);
        org.junit.Assert.assertNotNull(rotation92);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.30055282826141555d + "'", double93 == 0.30055282826141555d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        double double32 = rotation5.getQ3();
        double double33 = rotation5.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = rotation39.revert();
        double double41 = rotation39.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation48.getAxis();
        double double50 = rotation48.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation48.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation5.applyTo(vector3D51);
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(rotation40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.9996303825414301d + "'", double50 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D53);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(3.1031429627612512d, 3.124250928329183d, 28.016837073341897d, (double) 1.0f, false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        double double46 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double60 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation52, rotation59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double74 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation66, rotation73);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = rotation59.applyInverseTo(rotation66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = rotation12.applyInverseTo(rotation66);
        double double77 = rotation66.getQ2();
        double[][] doubleArray78 = rotation66.getMatrix();
        double double79 = rotation66.getQ0();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 3.141592653589793d + "'", double46 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(rotation75);
        org.junit.Assert.assertNotNull(rotation76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.01922366120271981d + "'", double77 == 0.01922366120271981d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.9996303825414301d + "'", double79 == 0.9996303825414301d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.09949879346007118d, 0.9996303825414301d, (double) 0L, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double19 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation11, rotation18);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, vector3D33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = rotation34.applyInverseTo(rotation40);
        double double42 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation18, rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation18.getAxis();
        double[][] doubleArray44 = rotation18.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation18.getAxis();
        double double46 = rotation18.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 1, (double) 100L, (double) ' ', 0.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation18.applyInverseTo(rotation52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = rotation5.applyInverseTo(rotation52);
        java.lang.Class<?> wildcardClass55 = rotation5.getClass();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(rotation41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 3.141592653589793d + "'", double42 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertNotNull(rotation54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        double double53 = rotation52.getQ1();
        double double54 = rotation52.getQ2();
        double[][] doubleArray55 = rotation52.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double69 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation61, rotation68);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation75.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double83 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation75, rotation82);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = rotation68.applyInverseTo(rotation75);
        double double85 = rotation68.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = rotation68.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = rotation52.applyTo(rotation86);
        double[][] doubleArray88 = rotation87.getMatrix();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(vector3D62);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertNotNull(rotation84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertNotNull(rotation86);
        org.junit.Assert.assertNotNull(rotation87);
        org.junit.Assert.assertNotNull(doubleArray88);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        double double6 = rotation5.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D50, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D28, vector3D42, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation5.applyTo(vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, 0.7881701093115122d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation68.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation75.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D69, vector3D76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D69, (double) 100L);
        double double80 = rotation79.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation62.applyTo(rotation79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = rotation81.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = rotation82.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = rotation83.revert();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D69);
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-0.1855270382668764d) + "'", double80 == (-0.1855270382668764d));
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(rotation82);
        org.junit.Assert.assertNotNull(rotation83);
        org.junit.Assert.assertNotNull(rotation84);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation16.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double25 = rotation24.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = rotation18.applyInverseTo(rotation24);
        double double27 = rotation24.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        double[][] doubleArray34 = rotation33.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D41, vector3D48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D41, (double) 100L);
        double double52 = rotation51.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation51.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double60 = rotation59.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = rotation53.applyInverseTo(rotation59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = rotation33.applyInverseTo(rotation61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = rotation24.applyTo(rotation62);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation24, rotation64);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation71.applyInverseTo(vector3D78);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D80 = rotation24.applyTo(vector3D78);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation18);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(rotation26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-0.0d) + "'", double52 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(rotation61);
        org.junit.Assert.assertNotNull(rotation62);
        org.junit.Assert.assertNotNull(rotation63);
        org.junit.Assert.assertNotNull(rotation64);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertNotNull(vector3D79);
        org.junit.Assert.assertNotNull(vector3D80);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation5.applyInverseTo(rotation22);
        double double25 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation5.getAxis();
        double double27 = rotation5.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation5.revert();
        double double29 = rotation28.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D66, vector3D73);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = rotation59.applyTo(rotation74);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = rotation44.applyTo(rotation75);
        double[][] doubleArray77 = rotation76.getMatrix();
        double double78 = rotation76.getQ1();
        double[][] doubleArray79 = rotation76.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray79, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation81.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = rotation81.revert();
        double[][] doubleArray84 = rotation83.getMatrix();
        double double85 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation83);
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-100.0d) + "'", double29 == (-100.0d));
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertNotNull(rotation75);
        org.junit.Assert.assertNotNull(rotation76);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertNotNull(vector3D82);
        org.junit.Assert.assertNotNull(rotation83);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D66, vector3D73);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D88 = rotation87.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D81, vector3D88);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D59, vector3D73, vector3D88);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 1);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D37, vector3D59);
        double double94 = rotation93.getAngle();
        double[][] doubleArray95 = rotation93.getMatrix();
        double double96 = rotation93.getAngle();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(vector3D88);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.8890808091523411d + "'", double94 == 0.8890808091523411d);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.8890808091523411d + "'", double96 == 0.8890808091523411d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(3.141592653589793d, (-8.717516503499631d), 9.999000062556641d, 10.0d, true);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder6 = null;
        double[] doubleArray7 = rotation5.getAngles(rotationOrder6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[2.592228918608598, 1.8041726811507741, 1.1581553297104257]");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation14.applyTo(rotation29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = rotation14.applyTo(rotation36);
        double double38 = rotation14.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double52 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation44, rotation51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation67.applyInverseTo(rotation73);
        double double75 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation51, rotation67);
        double double76 = rotation67.getQ3();
        double double77 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation14, rotation67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = rotation67.revert();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(rotation74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 3.141592653589793d + "'", double75 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(rotation78);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(14.405497554001874d, 0.27150322035250896d, 0.165890128604566d, 0.577207977069365d, false);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = rotation5.getAngles(rotationOrder6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        double double15 = rotation12.getAngle();
        double double16 = rotation12.getQ0();
        double double17 = rotation12.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 0, (double) ' ', (double) (byte) 100, 17.66239947251099d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation12.applyInverseTo(rotation23);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        double double26 = rotation24.getQ1();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.141592653589793d + "'", double15 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.1051177169214896d + "'", double26 == 1.1051177169214896d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 0.0d, (-5.727097351514677E-5d), 0.280459243752156d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, (-0.0d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = rotation56.revert();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder59 = null;
        double[] doubleArray60 = rotation56.getAngles(rotationOrder59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = rotation56.revert();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(rotation58);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[2.356194490192345, 0.9999999999999999, -2.356194490192345]");
        org.junit.Assert.assertNotNull(rotation61);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(28.016837073341897d, (double) '4', (double) 10L, 0.0d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.33900504942104487d), 10.015527486617021d, 10.0d, Double.NaN, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D46 = rotation45.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D39, vector3D46);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = rotation32.applyTo(rotation47);
        double double49 = rotation47.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = rotation47.revert();
        double double51 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation17, rotation47);
        double[][] doubleArray52 = rotation17.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        double[][] doubleArray59 = rotation58.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D66, vector3D73);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D66, (double) 100L);
        double double77 = rotation76.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = rotation76.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double85 = rotation84.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = rotation78.applyInverseTo(rotation84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = rotation58.applyInverseTo(rotation86);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation17.applyTo(rotation87);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D89 = rotation87.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation11.applyTo(vector3D89);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D91 = rotation5.applyTo(vector3D89);
        org.junit.Assert.assertNotNull(vector3D24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(vector3D39);
        org.junit.Assert.assertNotNull(vector3D46);
        org.junit.Assert.assertNotNull(rotation48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(rotation50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-0.0d) + "'", double77 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation78);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertNotNull(rotation86);
        org.junit.Assert.assertNotNull(rotation87);
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertNotNull(vector3D89);
        org.junit.Assert.assertNotNull(vector3D90);
        org.junit.Assert.assertNotNull(vector3D91);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) (byte) 0, 0.01922366120271981d, 0.9949879346007117d, true);
        double double6 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D7 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder8 = null;
        double[] doubleArray9 = rotation5.getAngles(rotationOrder8);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation15 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D22 = rotation21.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D22, vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D37, vector3D51, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation15.applyInverseTo(rotation70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = rotation71.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = rotation5.applyInverseTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D74 = rotation5.getAxis();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0019129169749405736d + "'", double6 == 0.0019129169749405736d);
        org.junit.Assert.assertNotNull(vector3D7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[3.0424202697838725, 0.0038258362831782976, 3.0424202697838725]");
        org.junit.Assert.assertNotNull(vector3D22);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(rotation71);
        org.junit.Assert.assertNotNull(rotation72);
        org.junit.Assert.assertNotNull(rotation73);
        org.junit.Assert.assertNotNull(vector3D74);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) '4');
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) 0L);
        double double52 = rotation51.getQ0();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation12.getAxis();
        double[][] doubleArray38 = rotation12.getMatrix();
        double double39 = rotation12.getQ2();
        double double40 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 100L);
        double double70 = rotation69.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation52.applyInverseTo(rotation69);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = rotation46.applyInverseTo(rotation69);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation78.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D86 = rotation85.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D79, vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D79, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation72.applyTo(vector3D79);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D91 = rotation12.applyInverseTo(vector3D79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D91, (double) 1);
        double double94 = rotation93.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 3.141592653589793d + "'", double40 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-0.0d) + "'", double70 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation71);
        org.junit.Assert.assertNotNull(rotation72);
        org.junit.Assert.assertNotNull(vector3D79);
        org.junit.Assert.assertNotNull(vector3D86);
        org.junit.Assert.assertNotNull(vector3D90);
        org.junit.Assert.assertNotNull(vector3D91);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-0.05035334227365157d) + "'", double94 == (-0.05035334227365157d));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(10.015527486617021d, 0.09949879346007118d, (double) 0L, 17.66239947251099d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation48.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, vector3D49);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation35.applyTo(rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation20.applyTo(rotation51);
        double double53 = rotation52.getAngle();
        double double54 = rotation52.getQ3();
        double double55 = rotation52.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double62 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation52, rotation61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = rotation5.applyTo(rotation61);
        double double64 = rotation61.getQ1();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D49);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 3.141592653589793d + "'", double62 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double28 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double42 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation34, rotation41);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = rotation27.applyInverseTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = rotation12.applyTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder45 = null;
        double[] doubleArray46 = rotation44.getAngles(rotationOrder45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        double double54 = rotation52.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = rotation44.applyInverseTo(rotation52);
        double double56 = rotation52.getQ2();
        double double57 = rotation52.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(rotation43);
        org.junit.Assert.assertNotNull(rotation44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-0.31746367442260337, 1.2637009275001716, 3.026886383418824]");
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.9996303825414301d + "'", double54 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(rotation55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.01922366120271981d + "'", double56 == 0.01922366120271981d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.01922366120271981d + "'", double57 == 0.01922366120271981d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation5.applyInverseTo(vector3D12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D38, vector3D45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D38, (double) 1L);
        double double49 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation31, rotation48);
        double[][] doubleArray50 = rotation48.getMatrix();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.6481559849923735d + "'", double49 == 1.6481559849923735d);
        org.junit.Assert.assertNotNull(doubleArray50);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        double double32 = rotation5.getQ3();
        double double33 = rotation5.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(28.016837073341897d, 1.0d, 0.3388903615770647d, (double) 10.0f, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = rotation5.applyInverseTo(rotation39);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(rotation40);
        org.junit.Assert.assertNotNull(vector3D41);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation6 = rotation5.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double20 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation19);
        double double21 = rotation19.getAngle();
        double double22 = rotation19.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D23 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation6.applyInverseTo(rotation19);
        java.lang.Class<?> wildcardClass25 = rotation24.getClass();
        org.junit.Assert.assertNotNull(rotation6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 3.141592653589793d + "'", double21 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.141592653589793d + "'", double22 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D23);
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation5.applyInverseTo(rotation22);
        double double25 = rotation24.getQ1();
        double double26 = rotation24.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = rotation24.revert();
        double[][] doubleArray28 = rotation27.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation27.revert();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 28.016837073341897d + "'", double25 == 28.016837073341897d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(rotation27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(rotation29);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, vector3D54);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation40.applyTo(vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation34.applyTo(vector3D56);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = rotation28.applyTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = rotation28.revert();
        double double60 = rotation59.getQ1();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D56);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(rotation58);
        org.junit.Assert.assertNotNull(rotation59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.015527486617021d + "'", double60 == 10.015527486617021d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.7881701093115124d, (-76.08862863985493d), 3.1030128410395363d, (double) 1.0f, false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) '4');
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) '4');
        double double52 = rotation51.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder53 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = rotation51.getAngles(rotationOrder53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double28 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double42 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation34, rotation41);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = rotation27.applyInverseTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, (-0.280459243752156d));
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(rotation43);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D48);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation16.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double25 = rotation24.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = rotation18.applyInverseTo(rotation24);
        double[][] doubleArray27 = rotation24.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) '4', (-10.0d), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        double double35 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation24, rotation33);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation33.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation18);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(rotation26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(vector3D36);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation32.revert();
        double double34 = rotation33.getQ1();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(rotation33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        double double37 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double51 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation50);
        double double52 = rotation50.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double80 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation72, rotation79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation65.applyInverseTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = rotation50.applyTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D83 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation12.applyInverseTo(vector3D83);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = rotation12.revert();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 3.141592653589793d + "'", double37 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 3.141592653589793d + "'", double52 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(rotation82);
        org.junit.Assert.assertNotNull(vector3D83);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertNotNull(rotation85);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.20557451782484024d), (double) 100, (double) (-1), 97.0d, true);
        java.lang.Class<?> wildcardClass6 = rotation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (-0.4497942902016142d), (-0.012362609385487295d), (-9.502464466516079d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 'a', 1.0d, 0.7555423460632325d, 0.001978792867119834d, false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 1, 0.0d, 17.66239947251099d, (double) '#', true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D41, vector3D48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation55.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D48, vector3D56, vector3D70, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D70);
        double double89 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation16, rotation88);
        double double90 = rotation88.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder91 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray92 = rotation88.getAngles(rotationOrder91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(vector3D24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertNotNull(vector3D56);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.5309649148733836d + "'", double89 == 0.5309649148733836d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.8775825618903728d, (double) 10.0f, (double) (byte) 10, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder7 = null;
        double[] doubleArray8 = rotation5.getAngles(rotationOrder7);
        double double9 = rotation5.getQ1();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[2.356194490192345, 3.017642674795779, -2.356194490192345]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7057492528065779d + "'", double9 == 0.7057492528065779d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation5.applyInverseTo(rotation22);
        double double25 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, (double) 10.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, (double) '#');
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder31 = null;
        double[] doubleArray32 = rotation30.getAngles(rotationOrder31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), 8960.928033465932d, (double) 100L, (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = rotation30.applyTo(rotation38);
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-0.05546049560495902, 2.6986718947111035, 0.14387680937736505]");
        org.junit.Assert.assertNotNull(rotation39);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), 0.8330717246011861d, 8960.928033465932d, 0.5028407436006902d, false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, (double) 1);
        double double55 = rotation54.getQ1();
        double double56 = rotation54.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation54.getAxis();
        double double58 = rotation54.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.33900504942104487d + "'", double55 == 0.33900504942104487d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.33900504942104487d + "'", double56 == 0.33900504942104487d);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.33900504942104487d + "'", double58 == 0.33900504942104487d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        double[][] doubleArray15 = rotation14.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray15, 0.016784652862817887d);
        java.lang.Class<?> wildcardClass18 = rotation17.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) -1, (-0.1730129508244783d), (-0.1730129508244783d), (double) 10.0f, false);
        double double6 = rotation5.getQ2();
        double double7 = rotation5.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D14 = rotation13.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D14, vector3D21);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation22.applyInverseTo(rotation28);
        double double30 = rotation28.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double44 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation36, rotation43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = rotation59.applyInverseTo(rotation65);
        double double67 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation59);
        double double68 = rotation59.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation28.applyInverseTo(rotation59);
        double double70 = rotation28.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation28.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = rotation5.applyTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation78.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double86 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation78, rotation85);
        double double87 = rotation85.getQ3();
        double double88 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.3388903615770647d, (double) 0L, 9.649660284921133d, (double) (byte) 100, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = rotation85.applyTo(rotation94);
        double double96 = rotation85.getQ1();
        double double97 = rotation85.getQ3();
        double double98 = rotation85.getQ2();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.1730129508244783d) + "'", double6 == (-0.1730129508244783d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(vector3D14);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(rotation29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.141592653589793d + "'", double30 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 3.141592653589793d + "'", double67 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(rotation69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(rotation71);
        org.junit.Assert.assertNotNull(rotation72);
        org.junit.Assert.assertNotNull(vector3D79);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(rotation95);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 1.0d + "'", double97 == 1.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-1.0d) + "'", double98 == (-1.0d));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, (double) 100L);
        double double32 = rotation31.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double40 = rotation39.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = rotation33.applyInverseTo(rotation39);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation12.applyInverseTo(vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.0d) + "'", double32 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation33);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(rotation41);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D43);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.9950846276202212d, 2.7755575615628914E-17d, 0.9456205751905904d, 8960.928033465932d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation48.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, vector3D49);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation35.applyTo(rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation20.applyTo(rotation51);
        double double53 = rotation20.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, (double) 100L);
        double double71 = rotation70.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = rotation70.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double79 = rotation78.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = rotation72.applyInverseTo(rotation78);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation20.applyInverseTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D88 = rotation87.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double95 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation87, rotation94);
        double double96 = rotation94.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation97 = rotation72.applyInverseTo(rotation94);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation98 = rotation5.applyTo(rotation94);
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D49);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-0.0d) + "'", double71 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation72);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertNotNull(rotation80);
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(vector3D88);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
        org.junit.Assert.assertNotNull(rotation97);
        org.junit.Assert.assertNotNull(rotation98);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.7881701093115124d, 0.5309649148733836d, 0.0d, 116.90457705856772d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        double double12 = rotation11.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        double double19 = rotation18.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, vector3D33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D48, vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D33, vector3D41, vector3D55, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation18.applyTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D55, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation11.applyInverseTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation5.applyTo(vector3D76);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertNotNull(vector3D55);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertNotNull(vector3D77);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        double double15 = rotation12.getAngle();
        double double16 = rotation12.getQ0();
        double double17 = rotation12.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, (double) 100L);
        double double35 = rotation34.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = rotation34.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double43 = rotation42.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = rotation36.applyInverseTo(rotation42);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D46 = rotation12.applyInverseTo(vector3D45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D46, 3.1216925665368036d);
        double double49 = rotation48.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double51 = rotation50.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation50.revert();
        double double53 = rotation50.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = rotation48.applyTo(rotation50);
        double double55 = rotation48.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.141592653589793d + "'", double15 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.0d) + "'", double35 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation36);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(rotation44);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D46);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.09756195019404022d + "'", double49 == 0.09756195019404022d);
        org.junit.Assert.assertNotNull(rotation50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(rotation54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.00975619501940402d + "'", double55 == 0.00975619501940402d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (double) (-1.0f), (-0.9998152766216806d), 0.7368621407866713d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = rotation38.revert();
        double double40 = rotation38.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        double double49 = rotation47.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D41, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation32.applyTo(vector3D50);
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(rotation39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.9996303825414301d + "'", double49 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D52);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) (short) -1, (double) '4', 0.9996303825414301d, false);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = rotation5.getAngles(rotationOrder6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.005755946541407356d), 0.09949879346007118d, (-0.5d), (double) 1L, true);
        double double6 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, vector3D26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, (double) 100L);
        double double30 = rotation29.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation12.applyInverseTo(rotation29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D38, vector3D45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D53, vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation67.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D68, vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = rotation61.applyTo(rotation76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = rotation46.applyTo(rotation77);
        double[][] doubleArray79 = rotation78.getMatrix();
        double double80 = rotation78.getQ1();
        double[][] doubleArray81 = rotation78.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray81, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray81, 0.7881701093115122d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray81, 0.9456205751905904d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation31.applyInverseTo(rotation87);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = rotation5.applyTo(rotation88);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.4454472216916607d) + "'", double6 == (-0.4454472216916607d));
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.0d) + "'", double30 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D68);
        org.junit.Assert.assertNotNull(vector3D75);
        org.junit.Assert.assertNotNull(rotation77);
        org.junit.Assert.assertNotNull(rotation78);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertNotNull(rotation89);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) 100.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation55.applyInverseTo(vector3D62);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation49.applyTo(vector3D63);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, 0.0d);
        double double67 = rotation66.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(vector3D62);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D64);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.31538323081891095d, (double) 10.0f, 0.30408632088084614d, 1.3713780210687443d, false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = rotation20.applyTo(rotation35);
        double double37 = rotation35.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = rotation35.revert();
        double double39 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation35);
        double[][] doubleArray40 = rotation5.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        double[][] doubleArray47 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, (double) 100L);
        double double65 = rotation64.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = rotation64.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double73 = rotation72.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation66.applyInverseTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = rotation46.applyInverseTo(rotation74);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = rotation5.applyTo(rotation75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(rotation36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(rotation38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-0.0d) + "'", double65 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(rotation74);
        org.junit.Assert.assertNotNull(rotation75);
        org.junit.Assert.assertNotNull(rotation76);
        org.junit.Assert.assertNotNull(vector3D77);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        double double6 = rotation5.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, vector3D26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, (double) 100L);
        double double30 = rotation29.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation12.applyInverseTo(rotation29);
        double double32 = rotation31.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation31.getAxis();
        double double34 = rotation31.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation5.applyTo(rotation31);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.009949879346007117d) + "'", double6 == (-0.009949879346007117d));
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.0d) + "'", double30 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 28.016837073341897d + "'", double32 == 28.016837073341897d);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-76.08862863985493d) + "'", double34 == (-76.08862863985493d));
        org.junit.Assert.assertNotNull(rotation35);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation71.getAxis();
        double double73 = rotation71.getQ1();
        double double74 = rotation71.getAngle();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D72);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation32.revert();
        double double34 = rotation32.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation32.getAxis();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(rotation33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 9.649660284921133d + "'", double34 == 9.649660284921133d);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D36);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double47 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation39, rotation46);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation62.applyInverseTo(rotation68);
        double double70 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation46, rotation62);
        double double71 = rotation62.getQ3();
        double double72 = rotation62.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = rotation32.applyInverseTo(rotation62);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = rotation32.applyTo(rotation74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D40);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(rotation69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 3.141592653589793d + "'", double70 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertNotNull(rotation73);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.33900504942104487d), (double) 100.0f, (double) 10L, 3.1216925665368036d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double34 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation26, rotation33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double48 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation40, rotation47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = rotation33.applyInverseTo(rotation40);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, 3.082566122054968d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation5.applyInverseTo(vector3D12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, 3.1390038567388605d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = rotation56.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double60 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(rotation49);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(rotation58);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        double double53 = rotation52.getQ1();
        double double54 = rotation52.getQ2();
        double[][] doubleArray55 = rotation52.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = rotation52.applyTo(rotation61);
        double double64 = rotation61.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder65 = null;
        double[] doubleArray66 = rotation61.getAngles(rotationOrder65);
        double[][] doubleArray67 = rotation61.getMatrix();
        double double68 = rotation61.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(vector3D62);
        org.junit.Assert.assertNotNull(rotation63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[2.356194490192345, 0.0543794248094174, -2.356194490192345]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.01922366120271981d + "'", double68 == 0.01922366120271981d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation29.applyTo(vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D45, vector3D59, vector3D77);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation5.applyInverseTo(vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D81, 10.0d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation83.getAxis();
        double double85 = rotation83.getAngle();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D77);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 2.566370614359173d + "'", double85 == 2.566370614359173d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) -1, (double) 10.0f, (double) (byte) 100, (-0.005755946541407356d), true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) '4', (-10.0d), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D33, vector3D40);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = rotation26.applyTo(rotation41);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = rotation26.applyTo(rotation48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = rotation49.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation50.applyTo(vector3D57);
        double double59 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation11, rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = rotation5.applyTo(rotation11);
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D40);
        org.junit.Assert.assertNotNull(rotation42);
        org.junit.Assert.assertNotNull(rotation49);
        org.junit.Assert.assertNotNull(rotation50);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(rotation60);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation14.applyTo(rotation29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = rotation14.applyTo(rotation36);
        double double38 = rotation14.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double52 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation44, rotation51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation67.applyInverseTo(rotation73);
        double double75 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation51, rotation67);
        double double76 = rotation67.getQ3();
        double double77 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation14, rotation67);
        double double78 = rotation67.getQ2();
        java.lang.Class<?> wildcardClass79 = rotation67.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(rotation74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 3.141592653589793d + "'", double75 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, vector3D54);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation40.applyTo(vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation34.applyTo(vector3D56);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = rotation28.applyTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = rotation28.revert();
        double[][] doubleArray60 = rotation28.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation28.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D56);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(rotation58);
        org.junit.Assert.assertNotNull(rotation59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertNotNull(vector3D61);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) 0, 100.0d, (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double20 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation19);
        double double21 = rotation19.getAngle();
        double double22 = rotation19.getAngle();
        double double23 = rotation19.getQ0();
        double double24 = rotation19.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D31, vector3D38);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D31, (double) 100L);
        double double42 = rotation41.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = rotation41.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double50 = rotation49.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation43.applyInverseTo(rotation49);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation19.applyInverseTo(vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation5.applyTo(vector3D53);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation5.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 3.141592653589793d + "'", double21 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.141592653589793d + "'", double22 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.0d) + "'", double42 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation43);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D55);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation5.applyInverseTo(rotation22);
        double double25 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, (double) 10.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, 2.7755575615628914E-17d);
        double[][] doubleArray31 = rotation30.getMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray31, (-0.9707361041235048d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException; message: unable to orthogonalize matrix in 10 iterations");
        } catch (org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(doubleArray31);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) (short) -1);
        double double74 = rotation73.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder75 = null;
        double[] doubleArray76 = rotation73.getAngles(rotationOrder75);
        double double77 = rotation73.getAngle();
        double double78 = rotation73.getQ2();
        double double79 = rotation73.getQ0();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.33900504942104487d) + "'", double74 == (-0.33900504942104487d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-0.7853981633974483, 0.9999999999999999, 0.7853981633974483]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-0.33900504942104487d) + "'", double78 == (-0.33900504942104487d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.8775825618903728d + "'", double79 == 0.8775825618903728d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        double double15 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D16 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D17 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation12.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double32 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation24, rotation31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double46 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation38, rotation45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = rotation31.applyInverseTo(rotation38);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, (double) 1L);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation38, rotation64);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation18, rotation38);
        double[][] doubleArray67 = rotation18.getMatrix();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.141592653589793d + "'", double15 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D16);
        org.junit.Assert.assertNotNull(vector3D17);
        org.junit.Assert.assertNotNull(rotation18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(vector3D39);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(rotation47);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.9456205751905904d + "'", double65 == 0.9456205751905904d);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(doubleArray67);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.8775825618903728d, (double) 10.0f, (double) (byte) 10, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        double double7 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder8 = null;
        double[] doubleArray9 = rotation5.getAngles(rotationOrder8);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder10 = null;
        double[] doubleArray11 = rotation5.getAngles(rotationOrder10);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[2.356194490192345, 3.017642674795779, -2.356194490192345]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[2.356194490192345, 3.017642674795779, -2.356194490192345]");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 0.054379424809409445d, (double) 0L, 0.4293897276747127d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.06415703545444096d), (-108.9963038254143d), (double) 0L, (double) ' ', false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation6 = rotation5.revert();
        double double7 = rotation6.getQ3();
        double double8 = rotation6.getQ3();
        double double9 = rotation6.getQ3();
        org.junit.Assert.assertNotNull(rotation6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = rotation14.applyInverseTo(rotation20);
        double double22 = rotation14.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation37.applyTo(rotation52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = rotation37.applyTo(rotation59);
        double double61 = rotation59.getAngle();
        double double62 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation14, rotation59);
        java.lang.Class<?> wildcardClass63 = rotation14.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(rotation21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertNotNull(rotation60);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double double47 = rotation14.getQ3();
        double[][] doubleArray48 = rotation14.getMatrix();
        double double49 = rotation14.getQ1();
        double double50 = rotation14.getQ0();
        double double51 = rotation14.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (double) 0.0f, 0.7739829449345762d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(17.66239947251099d, 28.016837073341897d, (double) 100, Double.NaN, false);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder6 = null;
        double[] doubleArray7 = rotation5.getAngles(rotationOrder6);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D14 = rotation13.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D14, vector3D21);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = rotation22.applyTo(rotation37);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation22.applyTo(rotation44);
        double double46 = rotation22.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 100L);
        double double70 = rotation69.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation52.applyInverseTo(rotation69);
        double double72 = rotation52.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D73, 0.33900504942104487d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation22.applyInverseTo(vector3D73);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation5.applyInverseTo(vector3D76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D76, 0.01922366120271981d);
        double double80 = rotation79.getAngle();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[NaN, NaN, NaN]");
        org.junit.Assert.assertNotNull(vector3D14);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(rotation38);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-0.0d) + "'", double70 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertNotNull(vector3D77);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.019223661202719813d + "'", double80 == 0.019223661202719813d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(116.90457705856772d, (-0.5d), 17.66239947251099d, 0.047917108096983706d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double19 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation11, rotation18);
        double double20 = rotation18.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation48.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, vector3D49);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation35.applyTo(rotation50);
        double double52 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation18, rotation51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double80 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation72, rotation79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation65.applyInverseTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = rotation18.applyInverseTo(rotation72);
        double double83 = rotation72.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder84 = null;
        double[] doubleArray85 = rotation72.getAngles(rotationOrder84);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D86 = rotation72.getAxis();
        double double87 = rotation72.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation5.applyInverseTo(rotation72);
        double double89 = rotation72.getQ1();
        java.lang.Class<?> wildcardClass90 = rotation72.getClass();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.141592653589793d + "'", double20 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D49);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 3.141592653589793d + "'", double52 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(rotation82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.01922366120271981d + "'", double83 == 0.01922366120271981d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[2.356194490192345, 0.0543794248094174, -2.356194490192345]");
        org.junit.Assert.assertNotNull(vector3D86);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.01922366120271981d + "'", double87 == 0.01922366120271981d);
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.01922366120271981d + "'", double89 == 0.01922366120271981d);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        double double48 = rotation46.getQ1();
        double[][] doubleArray49 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray49, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray49, (double) 0);
        double[][] doubleArray54 = rotation53.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray54, 6.052676660945175d);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray54);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0019129169749405736d, (-0.009949438965141721d), 0.7881701093115122d, 97.0d, false);
        double double6 = rotation5.getQ3();
        double double7 = rotation5.getAngle();
        double double8 = rotation5.getAngle();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.137766817306627d + "'", double7 == 3.137766817306627d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.137766817306627d + "'", double8 == 3.137766817306627d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.33900504942104487d), (double) 100.0f, (double) 10L, 3.1216925665368036d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double34 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation26, rotation33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double48 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation40, rotation47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = rotation33.applyInverseTo(rotation40);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, 3.082566122054968d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation5.applyInverseTo(vector3D12);
        double double55 = rotation5.getAngle();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(rotation49);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 3.1348494788015624d + "'", double55 == 3.1348494788015624d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        double double29 = rotation12.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation12.revert();
        double double31 = rotation30.getQ1();
        double[][] doubleArray32 = rotation30.getMatrix();
        double double33 = rotation30.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (-1), 0.5309649148733836d, (double) (-1), (double) 1, true);
        double[][] doubleArray6 = rotation5.getMatrix();
        double double7 = rotation5.getQ0();
        double double8 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D15 = rotation14.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double22 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation14, rotation21);
        double double23 = rotation21.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double37 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation29, rotation36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = rotation52.applyInverseTo(rotation58);
        double double60 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation36, rotation52);
        double double61 = rotation52.getQ3();
        double double62 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation21, rotation52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100, (double) (byte) -1, (double) (short) 10, 0.9456205751905904d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation52.applyTo(rotation68);
        double[][] doubleArray70 = rotation69.getMatrix();
        double double71 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation69);
        double double72 = rotation69.getAngle();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.5519957795875582d) + "'", double7 == (-0.5519957795875582d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5519957795875582d) + "'", double8 == (-0.5519957795875582d));
        org.junit.Assert.assertNotNull(vector3D15);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(rotation59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 3.141592653589793d + "'", double60 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 3.141592653589793d + "'", double62 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation69);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.849966407676733d + "'", double71 == 1.849966407676733d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.20120377604668613d + "'", double72 == 0.20120377604668613d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) 'a', 0.9985901652033286d, 1.7182776971514875d, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        double double7 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(1.0d, (-0.001227201364295339d), 0.33900504942104487d, 3.7105407653375275d, true);
        double double14 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation13);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7182776971514875d + "'", double7 == 1.7182776971514875d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 1.0f, 100.0d, (-0.009949438965141721d), (double) 1.0f, false);
        double double6 = rotation5.getAngle();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (double) 1.0f, 0.9999995049998724d, (-1579.617450290328d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.9649660284921133d), (double) (short) 100, 0.0d, (double) 1.0f, false);
        double double6 = rotation5.getAngle();
        double[][] doubleArray7 = rotation5.getMatrix();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, (double) 1);
        double double55 = rotation54.getQ1();
        double double56 = rotation54.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation54.getAxis();
        double double58 = rotation54.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder59 = null;
        double[] doubleArray60 = rotation54.getAngles(rotationOrder59);
        java.lang.Class<?> wildcardClass61 = rotation54.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.33900504942104487d + "'", double55 == 0.33900504942104487d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.33900504942104487d + "'", double56 == 0.33900504942104487d);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[2.356194490192345, 0.9999999999999999, -2.356194490192345]");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(28.016837073341897d, (double) '4', (double) 10L, 0.0d, true);
        double[][] doubleArray6 = rotation5.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder7 = null;
        double[] doubleArray8 = rotation5.getAngles(rotationOrder7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.7607846147136124, 2.168295864876348, -1.7607846147136124]");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 3.1216925665368036d, 0.280459243752156d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation73.revert();
        double double75 = rotation73.getQ1();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(rotation74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.33900504942104487d + "'", double75 == 0.33900504942104487d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation2 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D9 = rotation8.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation15 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D16 = rotation15.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D9, vector3D16);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D9, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, vector3D33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D48, vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D33, vector3D41, vector3D55, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D9, vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D74 = rotation0.applyInverseTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D74, (double) (byte) 1);
        java.lang.Class<?> wildcardClass77 = vector3D74.getClass();
        org.junit.Assert.assertNotNull(rotation0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(rotation2);
        org.junit.Assert.assertNotNull(vector3D9);
        org.junit.Assert.assertNotNull(vector3D16);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertNotNull(vector3D55);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D74);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, (double) 1L);
        double double46 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = rotation19.revert();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder48 = null;
        double[] doubleArray49 = rotation19.getAngles(rotationOrder48);
        double double50 = rotation19.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation19.revert();
        double double52 = rotation51.getAngle();
        double double53 = rotation51.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D66, vector3D73);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation59.applyTo(vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation51.applyTo(vector3D66);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9456205751905904d + "'", double46 == 0.9456205751905904d);
        org.junit.Assert.assertNotNull(rotation47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[2.356194490192345, 0.0543794248094174, -2.356194490192345]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.054379424809409445d + "'", double50 == 0.054379424809409445d);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.054379424809409445d + "'", double52 == 0.054379424809409445d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.9996303825414301d) + "'", double53 == (-0.9996303825414301d));
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertNotNull(vector3D75);
        org.junit.Assert.assertNotNull(vector3D76);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.33900504942104487d), 0.8890808091523411d, (-0.20557451782484024d), 0.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.09949879346007118d, (-0.0d), (double) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation26.applyInverseTo(rotation32);
        double double34 = rotation32.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation11.applyInverseTo(rotation32);
        double double36 = rotation35.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = rotation5.applyTo(rotation35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, 0.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, 0.7368621407866713d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation37.applyInverseTo(vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, (-5.7519881927834584E-5d));
        double double70 = rotation69.getAngle();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(rotation33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 3.141592653589793d + "'", double34 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 9.999000062556641d + "'", double36 == 9.999000062556641d);
        org.junit.Assert.assertNotNull(rotation37);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 5.751988192783459E-5d + "'", double70 == 5.751988192783459E-5d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        double double53 = rotation52.getQ3();
        double double54 = rotation52.getQ0();
        double double55 = rotation52.getQ2();
        double[][] doubleArray56 = rotation52.getMatrix();
        double[][] doubleArray57 = rotation52.getMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray57, 0.7071067811865476d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException; message: unable to orthogonalize matrix in 10 iterations");
        } catch (org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray57);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(1.0d, 2.7755575615628914E-17d, (double) (-1), 0.9996303825414301d, true);
        double double6 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = rotation5.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D8 = rotation7.getAxis();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.577207977069365d + "'", double6 == 0.577207977069365d);
        org.junit.Assert.assertNotNull(rotation7);
        org.junit.Assert.assertNotNull(vector3D8);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 97.0d, 0.0d, 0.5914138605204349d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation2 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D3 = rotation2.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation9 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D10 = rotation9.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D17 = rotation16.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D10, vector3D17);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D32 = rotation31.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D25, vector3D32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = rotation33.applyTo(rotation48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = rotation18.applyTo(rotation49);
        double double51 = rotation50.getAngle();
        double double52 = rotation50.getAngle();
        double double53 = rotation50.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        double double60 = rotation59.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = rotation59.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation67.getAxis();
        double double69 = rotation67.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation67.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation61.applyInverseTo(vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation50.applyInverseTo(vector3D71);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D3, vector3D71);
        java.lang.Class<?> wildcardClass74 = vector3D71.getClass();
        org.junit.Assert.assertNotNull(rotation0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(rotation2);
        org.junit.Assert.assertNotNull(vector3D3);
        org.junit.Assert.assertNotNull(vector3D10);
        org.junit.Assert.assertNotNull(vector3D17);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(vector3D32);
        org.junit.Assert.assertNotNull(vector3D40);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertNotNull(rotation49);
        org.junit.Assert.assertNotNull(rotation50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(rotation61);
        org.junit.Assert.assertNotNull(vector3D68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.9996303825414301d + "'", double69 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D71);
        org.junit.Assert.assertNotNull(vector3D72);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D65 = rotation64.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D58, vector3D65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D36, vector3D50, vector3D65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation68.revert();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder70 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray71 = rotation69.getAngles(rotationOrder70);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(vector3D65);
        org.junit.Assert.assertNotNull(rotation69);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100, (double) (byte) -1, (double) (short) 10, 0.9456205751905904d, true);
        double double6 = rotation5.getQ0();
        double[][] doubleArray7 = rotation5.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation9 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray7, 0.3388903615770647d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9949438965141721d + "'", double6 == 0.9949438965141721d);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D74 = rotation73.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D74, vector3D81);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = rotation67.applyTo(rotation82);
        double double84 = rotation83.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = rotation52.applyInverseTo(rotation83);
        double double86 = rotation52.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 0.9456205751905904d, (double) 'a', 3.082566122054968d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = rotation52.applyTo(rotation92);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation93.getAxis();
        double double95 = rotation93.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D74);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(rotation83);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
        org.junit.Assert.assertNotNull(rotation85);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertNotNull(rotation93);
        org.junit.Assert.assertNotNull(vector3D94);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
    }
}

