import kotlin.random.Random

fun main() {
    println("please enter your score from 0-100: ")
    var score = readln()!!.toDouble()

    if(score <= 59.9){
        println ("your score is an F, you should pay more attention in class")
    }
    else if (score >= 60.0 && score < 70.0){
        println("you got a D...you need to study a LOT more")
    }
    else if (score >=70.0 && score < 80.0){
        println("you got a c, it's still a passing grade")
    }
    else if (score >=80.0 && score < 90.0){
        println ("you got a B, GOOD JOB!")
    }
    else if (score >= 90.0 && score <= 99.9){
        println("you got an A, you know your stuff :D")
    }
    else if (score == 100.0){
        println ("you got a PERFECT score!!")
    }
    else if (score > 100.0){
        println("the max is 100 :)")
    }


}