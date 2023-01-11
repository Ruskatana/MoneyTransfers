import java.util.*

fun main() {
    val value = 0.75
    val MinCommission = 35
    println("введите сумму на счету")
    val scanner = Scanner(System.`in`)
    val amount = scanner.nextInt()
    println("У вас на счету " + amount + " рублей")
    var d = amount * value / 100
    if (d <= MinCommission) println("Ваша комиссия составит " + MinCommission) else {
        println("Ваша комиссия при переводе составит " + d)
    }


}

