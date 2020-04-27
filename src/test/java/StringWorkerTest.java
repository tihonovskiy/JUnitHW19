import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringWorkerTest {

    StringWorker stringWorker = new StringWorker();
    String nameCompany = "Pharmacy #1";

    @BeforeClass
    public static void beforeStringWorkerTest() {
        System.out.println("Before StringWorkerTest");
        String javaVersion = "8";
        Assume.assumeTrue(Integer.valueOf(javaVersion)==8);
    }

    @AfterClass
    public static void afterStringWorkerTest() {
        System.out.println("StringWorkerTest done");
    }

    @Before
    public void beforeTest() {
        System.out.println("Run test");
    }

    @After
    public void afterTest() {
        System.out.println("End test");
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void containsTest() {
        assertTrue(stringWorker.contains("Company"));
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void concatenateTest() {
        assertEquals(stringWorker.cocatenate("My", "test", "junit"), "Mytestjunit");
    }

    @Category(TestSuiteNegativeTests.class)
    @Test
    public void isNullTest() {
        assertNull("This object is not null", stringWorker);
    }

    @Category(TestSuiteNegativeTests.class)
    @Test
    public void isSameTest() {
        assertNotSame("These objects are not equal", stringWorker, stringWorker);
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void assertThatTest() {
        assertThat(nameCompany, is("Pharmacy #1"));
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void deleteSymbolTest() {
        assertEquals(stringWorker.deleteSymbol("My test junit", " "), "Mytestjunit");
    }
}