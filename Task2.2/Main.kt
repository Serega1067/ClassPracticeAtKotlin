sealed interface Operation {
    class Value(val value: Double) : Operation {
    }

    class Plus(val op1: Operation, val op2: Operation) : Operation {
    }

    class Multiply(
        val op1: Operation, 
        val op2: Operation
    ) : Operation {
    }
}

fun calculate(operation: Operation): Double {
    return when (operation) {
        is Operation.Value -> operation.value
        is Operation.Multiply -> calculate(operation.op1) * 
                       calculate(operation.op2)
        is Operation.Plus -> calculate(operation.op1) + 
                   calculate(operation.op2)
    }
}

fun printOperationResult(operation: Operation) {
    val result = calculate(operation)
    println(result)
}

fun main() {
    // Соответствует формуле 4 + 2.5 * 2
    printOperationResult(
        Operation.Plus(
            Operation.Value(4.0),
            Operation.Multiply(
                Operation.Value(2.5),
                Operation.Value(2.0)
            )
        )
    )

    // Соответствует формуле (1 + 3.5) * (2.5 + 2)
    printOperationResult(
        Operation.Multiply(
            Operation.Plus(
                Operation.Value(1.0),
                Operation.Value(3.5)
            ),
            Operation.Plus(
                Operation.Value(2.5),
                Operation.Value(2.0)
            )
        )
    )

    // Соответствует формуле 10
    printOperationResult(
        Operation.Value(10.0)
    )
}
