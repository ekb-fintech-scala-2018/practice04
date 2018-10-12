package ru.tinkoff.fintech.lesson04.examples

object Ex09FuncTypeBounds extends App {
  trait Foo
  class Bar extends Foo
  class Baz extends Bar

  def bar1[T <: Bar](x: T): T = x
  def bar2[T >: Bar](x: T): T = x

  //val x11: Foo = bar1(new Foo {}) // won't compile
  val x12: Bar = bar1(new Bar)
  val x13: Baz = bar1(new Baz)

  val x21: Foo = bar2(new Foo {})
  val x22: Bar = bar2(new Bar)
  //val x23: Baz = bar2(new Baz) // won't compile
  val x24: Bar = bar2(new Baz) // compile
}
