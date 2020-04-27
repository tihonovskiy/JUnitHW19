import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PersonTest {

    Person person1 = new Person("Tim", "Tomkins", 25, "USA");
    Person person2 = new Person("Ivan", "Ivanov", 22, "Ukraine");
    Person person3;
    Person person4 = person2;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before PersonTest");
        String javaVersion = "8";
        Assume.assumeTrue(Integer.valueOf(javaVersion) == 8);
    }

    @AfterClass
    public static void afterPersonTest() {
        System.out.println("PersonTest done");
    }

    @Category(TestSuiteNegativeTests.class)
    @Test
    public void personEqualsTest() {
        assertEquals(person1.firestName, "Tom");
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void personAssertTrueTest() {
        assertTrue(person2.age<50);
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void personAssertSame() {
       assertSame(person2, person4);
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void personAssertNull() {
        assertNull(person3);
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void personAssertThat() {
        assertThat(person2.country, is(person4.country));
    }
}
