/*
// Día 5: Kotlin
// Clase en vídeo: https://youtu.be/T3ugOYTRF7c

fun main() {

    // Hola mundo

    println("Hola, Kotlin!")

    // Variables

    var myString = "Esto es una cadena de texto"
    myString = "Aquí cambio el valor de la cadena de texto"
    // myString = 6 Error
    println(myString)

    var myString2: String = "Esta es otra cadena de texto"
    println(myString2)

    var myInt = 7
    println("Este es el valor de la variable myInt: $myInt")
    myInt = myInt + 4
    println(myInt)
    println(myInt - 1)
    println(myInt)

    var myInt2 : Int = 5
    println(myInt2)

    var myDouble = 6.5
    println(myDouble)

    myDouble = 6.0
    println(myDouble)

    var myDouble2: Double = 6.0
    var myFloat = 6.5f
    println(myFloat)

    var myBool = true
    println(myBool)

    //Constantes
    val myConst = "Mi propiedad constante"

    //Control de flujo
    myInt = 11
    myString = "Hola"
    if (myInt == 10 && myString == "Hola"){
        println("El valor es 11")
    } else if (myInt == 11 || myString == "Hola"){
        println("El valor es 10")
    } else {
        println("El valor es distinto de 10 y 11")
    }

    val myList = mutableListOf("Gray", "Moure", "@Mouredev")
    println(myList[0])
    myList.add("Ray")
    println(myList)

    // Sets

    val mySet = setOf(1, 3, 46.7)
    println(mySet)

    // Maps
    val myMap = mutableMapOf("Brais" to 30, "Stradibus" to 27, "Mars" to 46)
    myMap["Roswell"] = 17
    println(myMap["Brais"])

    // Bucles
    for (value in myList){
        println(value)
    }

    for (value in mySet){
        println(value)
    }

    for (value in myMap){
        println(value)
    }

    var myCounter = 0
    while (myCounter < myList.count()){
        println(myList[myCounter])
        myCounter++
    }

    // Opcionales
    var myOptional: String? = null
    println(myOptional)
    myOptional = "Why?"
    println(myOptional)

    //Funciones
    myFunction()
}

    //Clases
    var myClass = MyClass(name = "Louis", age = 30)



fun myFunction(){
    println("Esto es una funcion")

}

// Clases
class MyClass(val name: String, val age: Int)
*/

fun main(){
    //Imprimir Hello World
    //println("Hello World")
    //print("Hello World")

    //VARIABLES
    var variableMutable = ""
    val variableInMutable = ""

    //STRING TEMPLATES
    val name = "Mary"
    val age = 20
    println("$name is $age years old")

    //BASIC TYPES
    var customers = 8

    //CUSTOMERS LEAVE THE QUEUE
    //NUMERICS AND OPERATORS
    customers = customers + 3
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3

    //STRINGS
    val myString = "What's up?"

    //BOOL
    val myTrue = true
    val myFalse = false

    //CHAR
    val myChar = "My name is\nRoberto"


    //COLLECTIONS: List/ Sets/ Maps
    var whatList = "Una lista es una coleccion de items ordenados"

    val myList: MutableList<String> = mutableListOf("Yoshua", "Maki", myString)  //Inmutable list
    println(myList)
    var yourList = mutableListOf("Georgia", "Item", myString) //Mutable List
    println(yourList)
    //EXTRACT DATA OF LIST MUTABLE
    var listExtract: List<String> = myList
    println(listExtract)

    //INDEX OPERARTOR AND COLLECTORS
    println("The first item of the list is: ${yourList[0]} ")
    //COUNT FUNC
    println("The list have ${myList.count()} items")
    //in Operator to Check
    println("Georgia" in yourList)

    //ADD or REMOVE Func to COLLECTORS
    myList.add("pentagon")
    println(myList)
    myList.remove("pentagon")
    println(myList)

    //SET
    val readOnlySet = setOf("Apple", "Pear", "Pear", "Coconut")
    println(readOnlySet)
    val mSet: MutableSet<String> = mutableSetOf("Apple", "Pear", "Coconut", "Coconut")
    println(mSet)

    //SET NUMBER OF ELEMENTS
    println(readOnlySet.count())
    //CHECK ITEMS IN SET
    println("Pear" in readOnlySet)
    println("Suggar" in readOnlySet)

    //SET ADD and REMOVE
    mSet.add("Pineaple")
    println(mSet)
    mSet.remove("Pineaple")
    println(mSet)


    //MAP OR DICTIONARIES
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    //ACCES VALUE IN MAP
    println("The value of apple juice is ${readOnlyJuiceMenu["apple"]}")

    //COUNT A MAP
    println(juiceMenu.count())

    //ADD and REMOVE items
    //add
    juiceMenu.put("coconut", 150)
    println(juiceMenu)
    //remove
    juiceMenu.remove("orange")
    println(juiceMenu)

    //Check if a Key in map
    println(readOnlyJuiceMenu.containsKey("kiwi"))

    //Obtain Keys or Values
    println(readOnlyJuiceMenu.keys)
    println(readOnlyJuiceMenu.values)

    //CHECK IF A KEY/VALUE in a MAP
    println("orange" in readOnlyJuiceMenu.keys)
    println(200 in readOnlyJuiceMenu.values)

    //EXERCISE 1
    val greenNumbers = listOf(1,4,23)
    val redNumbers = listOf(17,2)
    val totalNumbers = (greenNumbers + redNumbers)
    println(totalNumbers.count())

    //EXERCISE 2
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "FTP"
    val isSupported = requested in SUPPORTED
    println("Support for $requested: $isSupported")

    //EXERCISE 3
    val numberWord = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 1
    println("$n is spelt as '${numberWord[n]}'")


    //CONDITIONALS
    val d: Int
    val check = false
    if (check) {
        d=1
    }else{
        d=2
    }
    println(d)


    val a = 1
    val b = 2
    println(if(a < b) a else b)


    val obj = "Hello"

    when (obj) {
        "1" -> println("one")
        "Hello" -> println("greeting")
        else -> println("unknown")
    }

    val result = when (obj) {
        "1" -> "one"
        "Hello" -> "greetin"
        else -> "unknown"
    }
    println(result)

    val temp = 18

    val description = when{
        temp < 0 -> "very cold"
        temp < 10 -> "a bit cold"
        temp < 20 -> "warm"
        else -> "hot"
    }
    println(description)


    //LOOPS AND RANGES
    //FOR
    for (number in 1..5){
        println(number)
    }

    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes){
        println("Yummy, its a $cake cake!")
    }

    //WHILE - DO*WhileD

    var cakesEaten = 0
    var cakesBaked = 0
    while(cakesEaten < 3) {
        println("Eat a cake"    )
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    //EXERCISE 1
    val Button = "C"
    println(
        when (Button){
            "A" -> "YES"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )

    //EXERCISE 2
    var pizzaSlices= 0
    while (pizzaSlices < 8){
        println("La caja tiene $pizzaSlices trozos de pizza")
        pizzaSlices++
    }
    do {
        println("Enhorabuena, la pizza está completa: $pizzaSlices trozos de pizza.")
        pizzaSlices++
    } while (pizzaSlices == 8)

    var pizzaTrozos = 0
    while (pizzaTrozos != 8) {
        println("Bro, tu pizza tiene $pizzaTrozos trozos")

}




