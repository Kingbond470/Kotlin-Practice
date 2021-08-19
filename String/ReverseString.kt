fun main(){
    var str="Masai"
    val arr=str.toCharArray()
    var res=""
    for(i in arr.indices) res += arr[arr.lastIndex-i]
    print(res)
}
