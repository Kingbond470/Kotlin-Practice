//the sum of all the numbers starting from 0 to the given limit that are multiples of 3
fun main(){
    val num=6
    var sum=0
    for(i in 0..num){
        if(i%3==0){
            sum=sum+i
        }
    }
    print(sum)
}
