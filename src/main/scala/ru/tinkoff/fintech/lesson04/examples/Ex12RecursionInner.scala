package ru.tinkoff.fintech.lesson04.examples

import scala.annotation.tailrec

object Ex12RecursionInner {

  def factorial(n: Int) = {
    @tailrec
    def iter(acc: Int, n: Int): Int =
      if (n == 0) acc
      else iter(acc * n, n - 1)

    iter(1, n)
  }
}
