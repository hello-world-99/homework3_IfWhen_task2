fun main() {
    while (true){
        println("Тип карты:")
        val type = readln()
        println("Текущий Баланс:")
        val sum = readln().toDouble()
        println("Пополнить на сумму:")
        val pay = readln().toDouble()

        println("Баланс на карте: ${transaction(type,sum,pay)}")

    }
}
fun transaction(type: String,sum: Double,pay: Double): Double {

    return when(type){
        "Mastercard","Maestro"->if (sum+pay<75000) sum+pay else sum+(pay/100*100.6)+20
        "Visa","Мир"->if (sum+pay<75000) sum+pay else sum+pay*100.6+20
        "VK Pay"->if (sum+pay<75000) sum+pay else sum+pay*100.6+20
        else -> 0.0
    }

}