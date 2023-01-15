import java.util.*

fun main() {


    println("""введите карту с которой планируете произвести перевод
        |1. Mastercard
        |2. Maestro
        |3. Visa
        |4. Мир
        |5. VK PAY
    """.trimMargin())

    val typeCard = readLine()
    println("Введите сумму переводов за текущий месяц ")
    val nomber2 = Scanner(System.`in`)
    var amount2:Int = nomber2.nextInt()
    println("Введите сумму, которую хотите сейчас перевести ")
    val nomber1 = Scanner(System.`in`)
    var amount:Int = nomber1.nextInt()
    println("вы выбрали карту " + typeCard)
    println ("в этом месяце вы уже перевели " + amount2 + " рублей")
    println ("сумма для перевода сейчас " + amount + " рублей")



        if (amount > 300 && amount < 75000 && amount + amount2 < 600000 && amount < 150000 && typeCard == "Mastercard") {
            println("комиссия при переводе не взимается")
        } else if (amount < 300 || amount > 75000 && amount + amount2 < 600000 && amount < 150000 && typeCard == "Mastercard") {
            var comission1 = amount * 0.6 / 100 + 20
            println("комиссия составляет " + comission1 + " рублей")
        } else if (amount > 300 && amount < 75000 && amount + amount2 < 600000 && amount < 150000 && typeCard == "Maestro") {
            println("комиссия при переводе не взимается")
        } else if (amount < 300 || amount > 75000 && amount + amount2 < 600000 && amount < 150000 && typeCard == "Maestro") {
            var comission1 = amount * 0.6 / 100 + 20
            println("комиссия составляет " + comission1 + " рублей")
        } else if (amount >= 4667 && amount + amount2 < 600000 && amount < 150000 && typeCard == "Visa") {
            var comission2 = amount * 0.75 / 100
            println("комиссия составляет " + comission2 + " рублей")
        } else if (amount < 4667 && amount + amount2 < 600000 && amount < 150000 && typeCard == "Visa") {
            var comission2 = 35
            println("комиссия составляет " + comission2)
        } else if (amount >= 4667 && amount + amount2 < 600000 && amount < 150000 && typeCard == "Мир") {
            var comission2 = amount * 0.75 / 100
            println("комиссия составляет " + comission2 + " рублей")
        } else if (amount < 4667 && amount + amount2 < 600000 && amount < 150000 && typeCard == "Мир") {
            var comission2 = 35
            println("комиссия составляет " + comission2)
        } else if (amount + amount2 > 600000 && amount > 150000 && typeCard == "Mastercard" || typeCard == "Maestro" || typeCard == "Visa" || typeCard == "Мир") {
            println("Вы исчерпали лимит переводов, Сэр!")
        } else if (typeCard == "VK PAY" && amount + amount2 < 40000 && amount < 15000) {
            println("комиссия при переводе не взимается")
        } else if (typeCard == "VK PAY" && amount + amount2 > 40000 && amount > 15000) {
            println("Вы исчерпали лимит переводов, Сэр!")
        } else if (typeCard != "VK PAY" || typeCard != "Mastercard" || typeCard != "Maestro" || typeCard != "Visa" || typeCard != "Мир"){
            println("такой нет карты, Сэр!")
        }



}








