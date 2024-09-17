fun main() {
    val number = 368

    val units = number % 10
    val tens = (number / 10) % 10
    val hundreds = number / 100

    val sumOfDigits = units + tens + hundreds
    val productOfDigits = units * tens * hundreds

    println("Число единиц: $units")
    println("Число десятков: $tens")
    println("Сумма цифр: $sumOfDigits")
    println("Произведение цифр: $productOfDigits")
}
