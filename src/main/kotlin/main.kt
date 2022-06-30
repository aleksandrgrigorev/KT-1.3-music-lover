fun main() {
    val itemCount: Int
    val itemPrice = 100
    val discount1 = 100
    val discount2 = 0.05
    val discount3 = 0.01
    val discount1Start = 1_000
    val discount2Start = 10_000

    println("Введите количество песен, которое хотите приобрести:")
    try {
        itemCount = readln().toInt()
    } catch (NumberFormatException: Throwable) {
        println("Ошибка: введено не число")
        return
    }
    if (itemCount <= 0) {
        println("Ошибка: введено число 0 или меньше нуля")
        return
    }

    println("Вы постоянный пользователь (покупаете музыку каждый месяц)?")
    val answer = readln()
    val musicLover: Boolean = (answer == "Да" || answer ==  "да" || answer == "ДА")

    var result = itemPrice.toDouble() * itemCount
    println("Стоимость покупки: $result рублей →")

    if (result >= discount1Start) {
        result -= discount1.toDouble()
        println()
        println("После применения фиксированной скидки - $result рублей →")
    }

    if (result >= discount2Start) {
        result -= result * discount2
        println()
        println("После применения 5% скидки - $result рублей →")
    }

    if (musicLover) {
        result -= result * discount3
        println()
        println("После применения 1% меломанской скидки - $result рублей →")
    }

    println()
    println("Итоговая стоимость: $result рублей")
}