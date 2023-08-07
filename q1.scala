@main def init() ={
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }

  val input1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val evenNumbers = filterEvenNumbers(input1)
  println(evenNumbers)
}