import java.util.*

fun main() {
    val str = "Transformation in education and kia seltos"
    val map: HashMap<Char, Int> = LinkedHashMap()
    for (ch in str) {
        if (map.containsKey(ch)) {
            val count: Int? = map[ch]
            if (count != null) map[ch] = count + 1
        } else if (ch != ' ') {
            map[ch] = 1
        }
    }
    for (key in map.keys) {
        println("$key - ${map[key]}")
    }
}
