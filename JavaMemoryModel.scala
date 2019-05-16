package day3.concurr


object JMMPublicationWrong extends App {
  class Num(var x: Int)
  var num = new Num(-1)
  val t = thread {
    for (i <- 1 until 10000000) num = new Num(i)
  }
  while (t.isAlive) assert(num.x != 0)
}


object JMMPublicationRight extends App {
  class Num(val x: Int)
  @volatile var num = new Num(-1)
  val t = thread {
    for (i <- 1 until 10000000) num = new Num(i)
  }
  while (t.isAlive) assert(num.x != 0)
}

