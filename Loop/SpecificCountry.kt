import java.util.*

fun main(){
    val sc=Scanner(System.`in`)
    var list= arrayListOf<String>()
    for(i in 1..10) list.add(sc.next())
    val country=sc.next()
    var value=false
    for( i in list.size-1 downTo 0){
        if(list.get(i).equals(country)){
            value=true
            break
        }
    }
    if(value) print("Country Found") else print("Contry not found")
}
