
object Animals {
  class Food
  abstract class Animal {
    type SuitableFood <: Food
    def eat(food: SuitableFood)
  }

  class Grass extends Food
  class Cow extends Animal {
    type SuitableFood = Grass
    override def eat(food: Grass) = {}
  }

  class Pasture {
    var animals: List[Animal { type SuitableFood = Grass }] = Nil
    // ...
  }
}
