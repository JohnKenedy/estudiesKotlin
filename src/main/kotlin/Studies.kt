fun main() {
    forever()
}

fun forever(): Nothing {

    while (true) {
        Thread.sleep(1000)
        println("Hello")
    }

// basic operators
/*        println("Hello Kotlin")
        3 + 2
        3 * 2
        3 - 2
        3 / 2
        3 % 2

        println(3.0 / 2.0)

        "%.4f".format(29.0 / 10.0)

//         16   8   4   2   1
//         0    1   0   0   0 = 8

//         16   8   4   2   1
//         1    0   0   0   0 = 16

        8 shl 1
        8 shr 1

        kotlin.math.sqrt(2.0)
        kotlin.math.sqrt(10.0)
        kotlin.math.sin(90 * PI)
        2.coerceAtLeast(3)
        2.coerceAtMost(3)

        val x = 3
        val pi: Float = 3.14159f
        val pi = 3.14159f
        var y = 10
            y = 1
        println(y)
        y = 1_000_000
        println(y)

        y += 1
        println(y)

        var count = 10
        count *= 2
        count

        var text = "Hello Kotlin"

        val rate: Double = 19.5
        val hours: Int = 10
        val total = rate * hours
        println(total)

        'c'.toInt()
        'o'.toInt()
        'd'.toInt()
        'e'.toInt()

        val c = 99
        c.toChar()

        val text: String = "Code"
        "Hello" + " Kotlin"
        "Hello ${c.toChar()} Kotlin"
        "Price is ${10.0 / 3.0}"

        val texts = """
        Hello Kotlin
        in
        Several lines!
        """.trimIndent()
        println(texts)

        val coordinates = Pair(1.3, 2)
        println(coordinates)

        coordinates.first
        coordinates.second

        val coord = 2 to 3
        coord

        val(x, _) = coord

        println(x)

        val coord3 = Triple(1,2,3)

        val byte: Byte = 1      //1 byte
        val short: Short = 1    //2 bytes
        val int: Int = 1        //4 bytes
        val long: Long = 1      //8 bytes

        val float: Float = 1.0f     //1 byte  | 6  digits
        val double: Double = 1.0    //2 bytes | 15 digits

        //Any, Unit, Nothing

        //Any - receive any kind of voucher
        val numberAny: Any = 10
        val textAny: Any = "10"

        //Unit - no return, used as function
        fun addUnit(x: Int, y: Int) : Int {
          val result = 2 + 2
         println(result)
         return result
        }

        //Function
        fun add(x: Int, y: Int) : Int {
            val result = 2 + 2
            println(result)
            return result
        }

        add(2, 2)
        add(10, 3)

        //Nothing - Eternal loop function // in main -> kotlin -> Studies

        //Boolean
        val yes = true
        val no = false

        (1 == 1)
        (1 == 2)
        (1 != 2)
        (1 > 1)
        (1 >= 1)
        (1 < 1)
        (1 <= 1)

       !(1 != 2)

        val andTrue = true && true
        andTrue

        val andFalse = true && false
        andFalse

        val orTrue = true || false
        orTrue

        val orFalse = false || false
        orFalse

        val zz = 0 > 1 || 1 > 0
        zz

        val password = "1234"
        val correct = "123"

        password == correct

        "flower" < "house"

        //if, else
        val age = 15
        if(age > 18) {
            println("older")
        } else {
            println("still a baby, go to study")
        }

        val a = 10
        val b = 20
        val max = if(a > b) a else b
        max

        val bankAccount = 1600
        val product = if (bankAccount > 1900) {
            "iPhone"
        } else if (bankAccount > 1500){
            "Motorola"
        } else if (bankAccount > 1000){
            "Samsung"
        }else {
            "Candy"
        }

        product

        val range = 0..5
        println(range)

        val decrease = 5 downTo 0
        println(decrease)

        val rangeTil = 0 until 5
        println(rangeTil)

        for (x in range) {
            println(x)
        }

        decrease.forEach {
            println(it)
        }

        var sum = 1
        var lastSum = 0
        repeat(10) {
            val temp = sum
            sum += lastSum
            lastSum = temp
            println("sum: $sum last: $lastSum")
        }


        sum = 0
        for (i in 0..32 step 2) {
            println(i)
        }

        var sum = 0

        for (y in 0 until 8) {
//            println(y)

            if (y % 2 == 0)
                continue

            for (x in 0 until 8) {
                sum += x * y
                println("x $x, y $y")
            }
        }



        col@ for (y in 0 until 8) {
//                 println(y)
            row@ for (x in 0 until 8) {
                sum += x * y
                if (x == y)
                    continue@col
                println("x $x, y $y")
                }
            }

        val user = "Samsung"
        when(user) {
            "Samsung", "Motorola" -> println("Android")
            else -> println("iOS")
        }

        val number = 7
        val numberToText =  when(number) {
            0 -> "zero"
            1 -> "one"
            2 -> "two"
            3 -> "three"
            else -> {
                println("unknown")
                "unknown"
            }
        }

        println(numberToText)

        var hour = 5
        val time = when(hour) {
            in 6..11 -> "Morning"
            in 12..17 -> "Afternoon"
            in 18..24 -> "Night"
            else -> "unknown"
        }
        println(time)

        fun printHello() {
            println("Hello")
        }

        printHello()
        printHello()
                //params
        fun add(x: Int, y: Int) {
            println(x + y)
        }
            //arguments
        add(10, 5)
        add(5, 2)

        add(x = 2, y = 3)

        fun discount(x: Int, percent: Int = 10) {
            println(x - (x * percent / 100))
        }

        discount(100)

        fun multiply(x: Int, y: Int) : Int {
            return x * y
        }

        fun divide(x: Int, y: Int) : Int {
            return x / y
        }

        println(multiply(3, 6))

//        fun multiplyDivide(x: Int, y: Int) : Pair<Int, Int> {
//            return Pair(x * y, x / y)
//        }

        fun multiplyDivide(x: Int, y: Int) = Pair(x * y, x / y)

        println(multiplyDivide(10, 5))

        fun getValue(value: Int) : Int {
            return value
        }

        fun getValue(value: String) : String {
         return value
        }

        fun getValue(value: Int, def: Int = 2) : Int {
            return value
        }

        getValue(2, 3)
        getValue("Armadillo")

        fun add(x: Int, y: Int) {
            println(x + y)
        }

        fun multiply(x: Int, y: Int) : Int {
            return x * y
        }

        fun divide(x: Int, y: Int) : Int {
            return x / y
        }

        var funSum = ::add
        funSum(2, 4)

        fun genericCalc(function: (Int, Int) -> Int, x: Int, y: Int){
            println(function(x, y))
        }

        genericCalc(::divide, 3, 2)
        genericCalc(::multiply, 3, 2)
 */
    var errorCode = 0
    //NULL

    var errCode: Int? = null

    var text: String? = "Hello"

    var msg: String = ""

    if (text != null) {
        msg = text + " World"
        println("$msg!")
    }

//        text.let {
//            println(text?.length?.plus(10))
//        }

//        text = null
    println(text?.length ?: 0)







}