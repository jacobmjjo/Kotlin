package chap8.section1

fun <T> find(a: Array<T>, Target: T): Int{
    for (i in a.indices) {
        if (a[i] == Target) return i
    }
    return -1
}
fun main() {
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry", "Durain")
    val arr2: Array<Int> = arrayOf(1, 2, 3, 4)
}