import java.util.*    // required import


fun fishFood (day : String) : String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun main(args: Array<String>) {
//    feedTheFish()
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter
}

//fun feedTheFish() {
//    val day = randomDay()
//    val food = fishFood(day)
//
//    println ("Today is $day and the fish eat $food")
//}
fun swim(speed: String = "fast") {
    println("swimming $speed")
}