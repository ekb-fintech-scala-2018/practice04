package ru.tinkoff.fintech.lesson04.exercises

object Exrsz2WhileToRec extends App {
  //tail rec it!

  def fff(n: Int) = {
    if (n == 0) 0
    else if (n == 1) 1
    else {
      var n1 = 0
      var n2 = 1
      var n3 = 0
      var x = 2
      while (x <= n) {
        n3 = n1+n2
        n1 = n2
        n2 = n3
        x += 1
      }

      n3
    }
  }

  (0 until 10).foreach(x => println(fff(x)))
}
