import org.junit.Test
import org.junit.Assert.*
import Exercise2_1._

class TestExercise2_1:
  @Test def testFib(): Unit = {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(55, fib(10))
  }
