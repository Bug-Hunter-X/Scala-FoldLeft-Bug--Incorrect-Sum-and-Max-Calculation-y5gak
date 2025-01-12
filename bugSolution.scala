```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct approach: calculate sum and max separately
  val sum = list.sum
  val max = list.max

  println(s"Sum: $sum, Max: $max") // Correct output
}
```