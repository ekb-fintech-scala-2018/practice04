package ru.tinkoff.fintech.lesson04.exercises.answers
import scala.annotation.tailrec

object Exrsz5PartialCombo extends App {
  def combo[I,T](funcs: List[PartialFunction[I,T]]): I => Option[T] = {
    @tailrec
    def makePartial(acc: PartialFunction[I,T],
                   fs: List[PartialFunction[I,T]]): PartialFunction[I,T] = fs match {
      case x :: xs =>
        makePartial(acc.orElse(x), xs)
      case Nil => acc
    }

    makePartial(Map.empty, funcs).lift
  }

  val f1: PartialFunction[Int,Int] = {case x if x % 2 == 0 => x / 2}
  val f2: PartialFunction[Int,Int] = {case x if x % 3 == 0 => x / 2}
  val f3: PartialFunction[Int,Int] = {case x if x % 4 == 0 => x / 2}

  val combed = combo(List(f1, f2, f3))

  println(combed(2))
  println(combed(6))
  println(combed(8))
  println(combed(10))

  val emptyCombed = combo[Int,Int](List.empty)
  println(emptyCombed(2))
  println(emptyCombed(6))
  println(emptyCombed(8))
  println(emptyCombed(10))
}
