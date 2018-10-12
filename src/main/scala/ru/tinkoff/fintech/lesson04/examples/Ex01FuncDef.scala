package ru.tinkoff.fintech.lesson04.examples

object Ex01FuncDef {
  def funky1(foo: String, bar: Int): String = {
    foo + bar
  }

  def funky2(foo: String, bar: Int): Unit = {
    foo + bar
  }

  private def funky3(foo: String, bar: Int) = {
    foo + bar
  }

  //depecated
  private def funky4(foo: String, bar: Int) {
    foo + bar
  }
}
