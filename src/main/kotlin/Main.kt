fun main(args: Array<String>) {
    // Program 1
    println("Program 1")
    println("Hello Kotlin")

    //Program 2
    //print nilai
    println("Program 2")
    val name = "Rizki"
    print("Hello my name is ")
    println(name)
    println(if (true) "Always True" else "Always False")

    //Program 3
    //operasi numerik pada string
    println("Program 3")
    val firstWord = "Dicoding "
    val lastWord = "Academy"
    println(firstWord + lastWord)

    //Program 4
    //menentukan type data dan nilai serta operasi numerik
    println("Program 4")
    val valueA: Int = 10
    val valueB = 20
    println(valueA + valueB)

    //Program 5
    //increment dan decrement pada type data Char
    println("Program 5")
    var vocal = 'A'
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)

    //Program 6
    //Mengambil nilai dari Index 0
    println("Program 6")
    val text = "Kotlin"
    val firstChar = text[0]
    println("First Character of $text is $firstChar")

    //Program 7
    //Loop Indexing Dimulai dari 0
    println("Program 7")
    for (char in text) {
        print("$char,")
    }
    println()

    //Program 8
    //Escaped String
    // \t: menambah tab ke dalam teks.
    // \n: membuat baris baru di dalam teks.
    // \’: menambah karakter single quote kedalam teks.
    // \”: menambah karakter double quote kedalam teks.
    // \\: menambah karakter backslash kedalam teks.

    println("Program 8")
    val statement = "Kotlin is \"Awesome!\""

    //menambahkan unicode pada string
    val nameUnicode = "Unicode Test: \u00A9"
    println(nameUnicode)

    //Program 9
    //Raw String
    println("Program 9")
    val line = """
    Baris 1
    Baris 2
    Baris 3
    Baris 4
    """.trimIndent()
    print(line)
    println()

    //Program 10
    //Membuat parameter pada function
    println("Program 10")
    fun setUserNotReturnValue(name: String, age: Int) = "Your name is $name, and you $age years old"
    fun setUserReturnValue(name: String, age: Int): String {

        return "Your name is $name, and you $age years old"
    }
    //pemanggilan fungsi
    val userFunction = setUserNotReturnValue("Rizki", 20)
    println(userFunction)

    //Program 11
    //If Expression 1 Kondisi
    println("Program 11")
    val openHours = 7
    val nowHours = 20
    val ketTokoA: String
    val ketTokoB: String
    if (nowHours > openHours) {
        ketTokoA = "TOKO A BUKA"
    } else {
        ketTokoA = "TOKO A TUTUP"
    }
    println(ketTokoA)

    //If Expression Lebih dari 1 Kondisi
    ketTokoB = if (nowHours > 7) {
        "Toko B Buka"
    } else if (nowHours == openHours) {
        "Tunggu Sebentar Toko B akan Segera buka"
    } else {
        "Toko B tutup"
    }
    println(ketTokoB)

    //Program 12
    //Conjunction atau AND (&&)
    println("Program 12")
    val tokoAOpen = 7
    val tokoAClose = 16
    val nowHour = 20

    val tokoBuka = if (nowHour >= tokoAOpen && nowHour <= tokoAClose) {
        true
    } else {
        false
    }
    // disederhanakan
    //val tokoBuka = nowHour >= tokoAOpen && nowHour <= tokoAClose

    println("TOko A Buka: $tokoBuka")

    //Disjucntion atau OR (||)
    val tokoTutup = nowHour < tokoAOpen || nowHour > tokoAClose
    println("TOko A Tutup: $tokoTutup")

    //Negation atau NOT (!)
    val tokoItuBuka = nowHour > tokoAOpen
    if (!tokoItuBuka) {
        println("Toko Tutup")
    } else {
        println("Toko Buka")
    }

    //Program 13
    //Numbers
    //Int (32 Bit)
    //Long (64 Bit)
    //Short (16 Bit)
    //Byte (8 Bit)
    //Double (64 Bit) desimal 0.1
    //Float (32 Bit) Desimal 0.1234567
    println("Program 13")
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println(maxInt)
    println(minInt)

    //Operasi Matematika
    val numberOne = 4
    val numberTwo = 2
    println(numberOne + numberTwo)
    println(numberOne - numberTwo)
    println(numberOne / numberTwo)
    println(numberOne * numberTwo)
    println(numberOne % numberTwo)

    //konversi type data to numbers
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt()
    val stringNumber = "23"
    println(intNumber + stringNumber.toInt())

    //Program 14
    //Arrays
    //    intArrayOf() : IntArray
    //    booleanArrayOf() : BooleanArray
    //    charArrayOf() : CharArray
    //    longArrayOf() : LongArray
    //    shortArrayOf() : ShortArray
    //    byteArrayOf() : ByteArray
    println("Program 14")
    val intArray = intArrayOf(1, 3, 5, 7)
    print(intArray[2])
    //output index 2 adalah 5. perhitungan index dimulai dari 0

    //Program 15
    //Nullable types (?)
    println("Program 15")
    val textnull:String? = null
    if (textnull!=null){
        val textLength = textnull!!.length
        println(textLength)
    }

    //program 16
    //Safe Calls dan elvis (? dan ?:)
    val textSafe:String? = null
    textSafe?.length
    val textLengthElvis = textnull?.length ?:7 //sama dengan val textLengthElvis = if(textLengthElvis != null) textNull.length else 7
    val textLengthElvis2 = textnull!!.length

    //Program 17

}