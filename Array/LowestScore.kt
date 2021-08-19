fun main(){
           val arr= arrayOf(1,2,5,0,8,6)
           var low=arr[0]
           for(i in arr){
               if(low>i) low=i
           }
           print(low)

}
