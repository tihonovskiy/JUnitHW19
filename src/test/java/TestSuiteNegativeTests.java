import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({TestSuiteNegativeTests.class})
@Suite.SuiteClasses({CalculatorTest.class, StringWorkerTest.class, PersonTest.class, GeometryTest.class})
public class TestSuiteNegativeTests {
}