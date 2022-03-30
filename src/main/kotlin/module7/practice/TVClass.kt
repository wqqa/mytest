package module7.practice

import kotlin.random.Random

class TVClass(val brand: String, val model: String, val diagonalSize: String) {

    var turnOnTV = false
        private set

    fun turnOnTV() {
        println("TV ON")
        turnOnTV = true
    }

    fun turnOffTV() {
        println("TV OFF")
        turnOnTV = false
    }

    fun channelInput(input: Int) = channelList(input)
    private fun channelList(input: Int): String {

        return when (input) {
            1 -> "First"
            2 -> "Second"
            else -> "no channelInput"
        }
    }


    companion object {
        const val maxVolume = 100
        fun volume(inputVolume: Int): String = when {
            inputVolume < 0 -> "Min volume: 0"
            inputVolume > maxVolume -> "Max volume: $maxVolume"
            else -> {
                "$inputVolume volume"
            }
        }
    }
}