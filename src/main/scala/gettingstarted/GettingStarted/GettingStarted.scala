package gettingstarted.GettingStarted

class GettingStarted {
  def fib(n: Int): Int = {
    def loop(n: Int, last: Int, cur: Int): Int = {
      if (n == 0) last
      else loop(n - 1, cur, last + cur)
    }
    loop(n, 0, 1)
  }
}
