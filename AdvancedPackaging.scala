

package country {
  abstract class Region1

  import customutil.{Util1 => u}

  class Country1(val name: String) extends Region {

    val populationsMap  = scala.collection.mutable.Map[Int, Double]()

    def showAveragePopulation = println(u.averagePopulation(this.populationsMap.values))
  }

  package state {

    class State1(val name: String) extends Region {

      import u.{averagePopulation => ap}

      val populationsMap  = scala.collection.mutable.Map[Int, Double]()

      def showAveragePopulation = println(ap(this.populationsMap.values))
    }

  }
}

package customutil {
  object Util1 {

    def averagePopulation(populations: Iterable[Double]) = populations.sum / populations.size

  }
}


package day3{

object CountryApp1 extends App {
  import country.Country1
  import customutil.Util1.averagePopulation

  val aCountry = new Country1("France")
  aCountry.populationsMap.put(2017, 64.94)
  aCountry.populationsMap.put(2016, 64.66)
  aCountry.populationsMap.put(2015, 64.395)

  println(averagePopulation(aCountry.populationsMap.values))

}
}