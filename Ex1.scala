
object Ex1 {
  class Animal
  
  class Frog extends Animal with Philosophical {
    override def toString = "green"
  }

  def main(args: Array[String]) {
    println("new Frog [" + (new Frog) + "]")
  }
}
