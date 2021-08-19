fun main(){
    val arr= arrayOf(1500,500,250)
    for(price in arr){

        if(price<300) println(price)
        else {
            val discount=price*0.1f
            val discountedPrice= if(discount<100) price-discount
            else price-100
            println(discountedPrice)
        }
    }
}
