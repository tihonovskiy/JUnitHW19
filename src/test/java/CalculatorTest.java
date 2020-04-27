import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    int a = 25;
    int b = 5;
    String str = "test";
    String str2 = str;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest");
        String javaVersion = "8";
        Assume.assumeTrue(Integer.valueOf(javaVersion)==8);
    }

    @AfterClass
    public static void afterCalculatorTest() {
        System.out.println("CalculatorTest done");
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void sumTest() {
        assertEquals(calculator.sum(a, b), 30);
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void multiplyTest() {
        assertTrue(calculator.multiply(a, b) > 50);
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void subtractTest() {
        assertTrue(calculator.subtract(a, b) > 1);
    }

    @Category(TestSuiteNegativeTests.class)
    @Test
    public void divisionTest() {
        assertSame(15.0, calculator.division(a, b));
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void assertTest() {
        assertThat(str, is(str2));
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void factorialTest() {
        assertEquals(calculator.factorial(b), 120);
    }
}