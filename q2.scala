@main def init() ={
    def calculateSquare(numbers: List[Int]): List[Int] = {
        numbers.map(num => num * num)
    }

    val input2 = List(1, 2, 3, 4, 5)
    val squares = calculateSquare(input2)
    println(squares)
}