import java.util.*

fun main() {
    var sc = Scanner(System.`in`)
    var list = arrayListOf<Int>()
    var str = ""

    if (sc.hasNextLine()) { // <-- check if there is a line.
        str = sc.nextLine(); // <-- read the line.
        if (str.isNotEmpty()) { // <-- make sure there is at least one character.
        }
    }

    var ar = str.split(" ")

    for(i in ar) {
        if(list.contains(i.toInt())) list.remove(i.toInt())
        else list.add(i.toInt())
        //println(list)
    }
    for(i in ar) {
        if(!list.contains(i.toInt())) print("$i ")
    }
}
