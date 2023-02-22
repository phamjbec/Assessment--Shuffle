import java.io.File

fun main() {
    val inputLines = File("input.txt").readLines()

    val firstWord = inputLines[0]
    val secondWord = inputLines[1]
    val shuffle = inputLines[2]

    val output = if (isShuffle(firstWord, secondWord, shuffle)) "CORRECT" else "INCORRECT"

    File("output.txt").writeText(output)
}

fun isShuffle(firstWord: String, secondWord: String, shuffle: String): Boolean {
    if (firstWord.length + secondWord.length != shuffle.length) {
        return false
    }
//Valued as started variables and intake
    var i = 0
    var j = 0

    for (k in 0 until shuffle.length) {
        if (i < firstWord.length && shuffle[k] == firstWord[i]) {
            i++
        } else if (j < secondWord.length && shuffle[k] == secondWord[j]) {
            j++
        } else {
            return false
        }
    }

    return true
}
