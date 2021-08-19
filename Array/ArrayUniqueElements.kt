import java.util.*

fun main() {
    var sc = Scanner(System.`in`)
    var list = arrayListOf<Int>()
    var str = ""

    if (sc.hasNextLine()) { // <-- check if there is a line.
        var line = sc.nextLine(); // <-- read the line.
        if (line.isNotEmpty()) { // <-- make sure there is at least one character.
            //var letter = line.charAt(0);
            //var a = line.length
            str+=line
            //print(a)
        }


//    while (sc.hasNext()){
//        try{
//            list.add(sc.nextInt())
//        } catch (e:Exception) {
//            b = false
//        }
//    }

        //print(list)
    }
    //print(str)
    var ar = str.split(" ")
    for(i in ar) {
        if(list.contains(i.toInt())) list.remove(i.toInt())
        else list.add(i.toInt())
        //println(list)
    }
    for(i in list) print("$i ")
}
