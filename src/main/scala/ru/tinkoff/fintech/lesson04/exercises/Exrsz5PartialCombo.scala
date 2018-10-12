package ru.tinkoff.fintech.lesson04.exercises

object Exrsz5PartialCombo extends App {
  def combo[I,T](funcs: List[PartialFunction[I,T]]): Option[T] = ???


  /*
  val f1: PartialFunction[Int,Int] = {case x if x % 2 == 0 => x / 2}
  val f2: PartialFunction[Int,Int] = {case x if x % 3 == 0 => x / 2}
  val f3: PartialFunction[Int,Int] = {case x if x % 4 == 0 => x / 2}

  val combed = combo(List(f1, f2, f3))

  println(combed(2))
  println(combed(6))
  println(combed(8))
  println(combed(10))
   */
}
