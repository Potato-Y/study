import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var alphabet = IntArray(26) { -1 }
    val str = readLine()

    for (i in str.indices)
        if (alphabet[str[i] - 'a'] == -1) {
            alphabet[str[i] - 'a'] = i
        }
    alphabet.forEach { print("$it ") }
}