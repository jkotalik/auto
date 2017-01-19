
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test1"); }

    com.google.auto.common.SuperficialValidation superficialValidation0 = new com.google.auto.common.SuperficialValidation();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test2"); }

    javax.lang.model.element.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.auto.common.Visibility visibility1 = com.google.auto.common.Visibility.ofElement(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test3"); }

    com.google.auto.common.Visibility visibility0 = com.google.auto.common.Visibility.PROTECTED;
    org.junit.Assert.assertTrue("'" + visibility0 + "' != '" + com.google.auto.common.Visibility.PROTECTED + "'", visibility0.equals(com.google.auto.common.Visibility.PROTECTED));

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test4"); }

    com.google.auto.common.Visibility visibility0 = com.google.auto.common.Visibility.PUBLIC;
    org.junit.Assert.assertTrue("'" + visibility0 + "' != '" + com.google.auto.common.Visibility.PUBLIC + "'", visibility0.equals(com.google.auto.common.Visibility.PUBLIC));

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test5"); }

    javax.lang.model.element.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.auto.common.Visibility visibility1 = com.google.auto.common.Visibility.effectiveVisibilityOfElement(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test6"); }

    javax.lang.model.element.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b1 = com.google.auto.common.SuperficialValidation.validateElement(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test7"); }

    com.google.auto.common.Visibility visibility0 = com.google.auto.common.Visibility.DEFAULT;
    org.junit.Assert.assertTrue("'" + visibility0 + "' != '" + com.google.auto.common.Visibility.DEFAULT + "'", visibility0.equals(com.google.auto.common.Visibility.DEFAULT));

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test8"); }

    com.google.auto.common.Visibility visibility0 = com.google.auto.common.Visibility.PRIVATE;
    org.junit.Assert.assertTrue("'" + visibility0 + "' != '" + com.google.auto.common.Visibility.PRIVATE + "'", visibility0.equals(com.google.auto.common.Visibility.PRIVATE));

  }

}
