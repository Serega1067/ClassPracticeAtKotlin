fun printOperationResult(operation: Operation) {
    val result = operation.calculate()
    println(result)
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
