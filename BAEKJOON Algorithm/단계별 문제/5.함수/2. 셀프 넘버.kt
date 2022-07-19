import java.lang.StringBuilder

fun main() {
    var check= arrayOfNulls<Boolean>(MAX+1)

    for (i in 1..MAX+1) {
        var n: Int = cal(i)
        if (n < MAX+1) {
            check[n] = true;
        }
    }

    var sb: StringBuilder = StringBuilder()

    for (i in 1..MAX) {
        if (check[i] != true) {
            sb.append(i).append('\n')
        }
    }
    println(sb)
}

fun cal(number: Int): Int {
    var sum: Int = number
    var number: Int = number

    while (number != 0) {
        sum += number % 10
        number /= 10
    }

    return sum
}

const val MAX: Int = 9999