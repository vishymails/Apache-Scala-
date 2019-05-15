
import scala.collection.mutable._
import net.liftweb.json._
import net.liftweb.json.Serialization.write

case class Person(name: String, address: Address)
case class Address(city: String, state: String)

object LiftJsonTest extends App {

  val p = Person("JOHN DOE", Address("Talkeetna", "AK"))

  // create a JSON string from the Person, then print it
  implicit val formats = DefaultFormats
  val jsonString = write(p)
  println(jsonString)

}