import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GeometryTest {
    Geometry geometry = new Geometry();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before GeometryTest");
    }

    @AfterClass
    public static void afterPGeometryTest() {
        System.out.println("GeometryTest done");
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void squarAreaTest() {
        assertEquals(geometry.squarArea(4), 16);
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void squarePerimeterTest() {
        assertTrue(geometry.squarePerimeter(10) > 20);
    }

    @Category(TestSuitePassedTests.class)
    @Test
    public void rectangleAreaTest() {
        assertSame(geometry.rectangleArea(5, 7), 35);
    }

    @Category(TestSuiteNegativeTests.class)
    @Test
    public void rectanglePerimeterTest() {
        assertThat(geometry.rectanglePerimeter(4, 5), is(20));
    }

    @Category(TestSuiteNegativeTests.class)
    @Test
    public void areaCircleTest() {
        assertNull(geometry.areaCircle(15));
    }
}
