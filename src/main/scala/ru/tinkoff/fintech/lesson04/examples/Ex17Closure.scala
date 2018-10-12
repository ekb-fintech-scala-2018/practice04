package ru.tinkoff.fintech.lesson04.examples

object Ex17Closure extends App {

  var foo = 0
  def clos1(bar: String) = {
    println(bar + foo)
  }
  clos1("Hello")
  foo = 42
  clos1("world")



  var counter = 0

  val count0: () => Unit = {() =>
    counter += 1
  }
  //the same as count0
  val count = {() =>
    counter += 1
  }

  List(1,2,3,4,5).foreach(_ => count())
  println(counter)
}