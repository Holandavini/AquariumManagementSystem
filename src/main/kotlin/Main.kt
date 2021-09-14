import java.util.*

fun main(args: Array<String>) {
    println("Hello, Vinicius!")
    feedTheFish()
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20) : Boolean{
    return true
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food!")
    if (shouldChangeWater(day)) {
        println("Change the water today")
    }

}

// Caso não recebe um valor no parametro, por padrão vai adotar o Fast
fun swim(speed : String = "fast"){
    println("swimming $speed")
}

fun randomDay() : String {
    val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {

    return when (day){
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

}

// Exercicio proposto
fun canAddFish(tankSize: Double, currentFish: Array<Int>, fishSize: Int, hasDecoration: Boolean ){

}