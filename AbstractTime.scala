
object AbstractTime {
  trait AbstractTime1 {
    var hour: Int
    var minute: Int
  }


  trait AbstractTime2 {
    def hour: Int          // getter for `hour'
    def hour_=(x: Int)     // setter for `hour'
    def minute: Int        // getter for `minute'
    def minute_=(x: Int)   // setter for `minute'
  }


  // these traits combine with no conflict
  class AbstractTime extends AbstractTime1 with AbstractTime2 {
    var hour: Int = 10
    var minute: Int = 10
  }
}
