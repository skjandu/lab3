import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {3, 12, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 12, 3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {3, 2, 1};
    assertArrayEquals(new int[]{1, 2, 3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {2.0, -1.0, 3.0, 0};
    double expected = (double)5/3;
    assertEquals(expected, ArrayExamples.averageWithoutLowest(input1), 0); // or set delta to 0.01 to account for rounding
  }

}
