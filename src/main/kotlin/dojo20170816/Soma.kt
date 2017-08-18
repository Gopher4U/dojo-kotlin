package sum

fun sum(a: IntArray): Int {
    // Write your solution here

    var total = 0
    a.forEach {
        item -> total += item
    }

    return total
}

