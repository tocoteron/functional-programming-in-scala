package Exercise2_1

def fib(n: Int): Int = {
  @annotation.tailrec
  def go(n: Int, cur: Int, next: Int): Int =
    if (n == 0) cur
    else go(n - 1, next, cur + next)
  go(n, 0, 1)
}
