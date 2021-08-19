fun main(){
    val arr= arrayOf(1, 2, 3, 4, 5)
    print(avgArray(arr))
}
fun avgArray(arr:Array<Int>):Double{
    var sum=0
    var avg=0.0
    for(i in arr.indices){
        sum += arr[i]
    }
    avg= (sum/arr.size).toDouble()
    return  avg
}
