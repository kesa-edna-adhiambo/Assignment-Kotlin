fun main(args: Array<String>) {
    val name = "Hello Edna"
    println(name)

     var p =  modulus(27,4)
    println(p)


    var x = result(6,8,9,4)
    println(x)


    val string = "I like laughing"
    val sentence ="$string"
    println(sentence)
    //output
}

fun modulus(num1:  Int, num2: Int){
    var remainder =num1 % num2
    println(remainder)
}

fun result(num1: Int, num2: Int,num3: Int, num4: Int): Int{
    var result =num1 +num2 +num3 +num4
    return result
}
