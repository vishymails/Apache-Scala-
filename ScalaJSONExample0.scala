import net.liftweb.json._

object ScalaJSONExample0 {

implicit val formats = DefaultFormats

case class Mailserver(url: String, username: String, password: String)

val json = parse(
"""
{ 
  "url": "imap.yahoo.com",
  "username": "myusername",
  "password": "mypassword"
}
"""
)

  def main(args: Array[String]) {
    val m = json.extract[Mailserver]
    println(m.url)
    println(m.username)
    println(m.password)
  }

}