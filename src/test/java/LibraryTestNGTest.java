import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LibraryTestNGTest {
  @Test(groups = { "testng" })
  public void checkSomeLibraryMethodAgainstFalseShouldFailSinceItReturnsTrueAllTheTime() {
	  Library classUnderTest = new Library();
      assertTrue(!classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
  }
	
  @Test(groups = { "testng" })
  public void checkSomeLibraryMethodAgainstTrueShouldSucceedSinceItReturnsTrueAllTheTime() {
	  Library classUnderTest = new Library();
      assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
  }
}
