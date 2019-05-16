
package day3


import scala.concurrent._



package object concurr {

  def thread(body: =>Unit): Thread = {
    val t = new Thread {
      override def run() = body
    }
    t.start()
    t
  }
  
  def log(msg: String) {
    println(s"${Thread.currentThread.getName}: $msg")
  }
  
  
  def execute(body: =>Unit) = ExecutionContext.global.execute(new Runnable {
    def run() = body
  })

}

