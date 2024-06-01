fun main() {
    val holder = Holder.createHolder(Holder.DEFAULT_NUMBER)
    holder.listener = object : ValueChangeListener {
        override fun onNewValue(number: Int) {
            println("New value is $number")
        }
    }
    holder.number = 1
}
