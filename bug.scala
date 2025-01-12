```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect use of foldLeft, attempting to sum and find the maximum simultaneously
  val result = list.foldLeft((0, 0)) { (acc, elem) =>
    (acc._1 + elem, math.max(acc._2, elem))
  }

  println(s"Sum and max: $result") // Output is incorrect
}
```