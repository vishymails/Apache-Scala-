
import scala.io.Source

object FIleIO3 {
   def main(args: Array[String]) {
      println("Following is the content read:" )

      Source.fromFile("test.txt" ).foreach { 
         print 
      }
   }
}