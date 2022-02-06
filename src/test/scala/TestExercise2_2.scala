import org.junit.Test
import org.junit.Assert.*
import Exercise2_2._

class TestExercise2_2:
  @Test def testIsSorted(): Unit = {
    assertEquals(true, isSorted(Array[Int](), (a: Int, b: Int) => a < b))
    assertEquals(true, isSorted(Array[Int](), (a: Int, b: Int) => a >= b))
    assertEquals(true, isSorted(Array[Int](0), (a: Int, b: Int) => a < b))
    assertEquals(true, isSorted(Array[Int](0), (a: Int, b: Int) => a >= b))
    assertEquals(true, isSorted(Array[Int](0, 1), (a: Int, b: Int) => a < b))
    assertEquals(false, isSorted(Array[Int](0, 1), (a: Int, b: Int) => a >= b))
    assertEquals(false, isSorted(Array[Int](1, 0), (a: Int, b: Int) => a < b))
    assertEquals(true, isSorted(Array[Int](1, 0), (a: Int, b: Int) => a >= b))
  }
