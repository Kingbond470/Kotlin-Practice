//the day in long format like "Monday", "Tuesday" ... print in short format "Mon", "Tue"
fun main(){
    val day="Monday"
    when(day){
        "Monday"-> print("Mon")
        "Tuesday" ->print("Tue")
        "Wednesday" ->print("Wed")
        "Thursday" ->print("Thu")
        "Friday" ->print("Fri")
        "Saturday" ->print("sat")
        "Sunday" ->print("Sun")
    }
}
