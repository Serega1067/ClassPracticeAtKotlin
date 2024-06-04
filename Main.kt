interface ValueChangeListener {
    fun onNewValue(num: Int)
}

public final class Holder private constructor(number: Int) {
    var number: Int = number
        set(value) {
            listener?.onNewValue(value)
            field = value
        }

    var listener: ValueChangeListener? = null

    companion object {
        const val DEFAUlT_NUMBER = -1
        fun createHolder(defaultNumber: Int): Holder {
            return Holder(defaultNumber)
        }
    }
}

fun main() {
    val holder = Holder.createHolder(Holder.DEFAULT_NUMBER)
    holder.listener = object : ValueChangeListener {
        override fun onNewValue(number: Int) {
            println("New value is $number")
        }
    }
    holder.number = 1
}
