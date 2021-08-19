import java.util.*

//If the given year is a leap year print "LEAP YEAR" and if it's not a leap year print "NOT LEAP YEAR"
fun main(){
    val sc=Scanner(System.`in`)
    val year=sc.nextInt()
    if(year%4==0 && (year%400==0 || year%100!=0)) print("LEAP YEAR")
    else print("NOT LEAP YEAR")
}
