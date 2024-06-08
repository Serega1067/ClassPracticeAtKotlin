fun printOperationResult(operation: Operation) {
    val result = operation.calculate()
    println(result)
}

sealed interface Operation {
    fun calculate(): Double
}

class Value(val value: Double) : Operation {
    override fun calculate(): Double = value
}

class Multiply(val left: Operation, val right: Operation) : Operation {
    override fun calculate(): Double = left.calculate() * right.calculate()
}

class Plus(val left: Operation, val right: Operation) : Operation {
    override fun calculate(): Double = left.calculate() + right.calculate()
}

fun main() {
    printOperationResult(
        Plus(
            Value(4.0), 
            Multiply(
                Value(2.5), 
                Value(2.0)
            )
        )
    )

    printOperationResult(
        Multiply(
            Plus(
                Value(1.0), 
                Value(3.5)
            ), 
            Plus(
                Value(2.5), 
                Value(2.0)
            )
        )
    )

    printOperationResult(
        Value(10.0)
    )
}
