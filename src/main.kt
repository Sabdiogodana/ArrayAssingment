fun main(){
    Cars(arrayOf("Subaru","Harrier","Jeep","V8"))
    arrayNames()
    arrayNumbers()
    returnString(arrayOf("Conslate","Brenda","Joyce"))

}
fun Cars(name:Array<String>){
    println(name.contentToString())


}
fun arrayNames(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach {x->
        println(x.capitalize())

    }
    
}
fun arrayNumbers(){
    var numbers =arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
       var sum =(numbers[1]+numbers[4])
        println(sum)

    var index = numbers.indexOf(158)
    println(index)

    var sortednumbers=numbers.sortedArray()
    println(sortednumbers.contentToString())

}
fun returnString(num :Array<String>):Array<String>{
    var x =num
     println(num.contentToString())
    return x
}