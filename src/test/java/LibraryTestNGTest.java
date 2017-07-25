import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LibraryTestNGTest {
  @Test(groups = { "testng" })
  public void f() {
	  Library classUnderTest = new Library();
      assertTrue(!classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
  }
}
