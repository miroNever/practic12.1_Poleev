import kotlin.coroutines.*

suspend fun main()= coroutineScope{
    println("Введите кол-во функций: ")
    var n = readLine()!!.toInt()
    while (true)
    {
        if(n > 0){
            break
        }
        else{
            println("Кол-во функций должно быть больше нуля")
            n = readLine()!!.toInt()
        }
    }
    var rec: Rectangle = Rectangle(0.0,0.0)
    launch {
        for (i in 1..n) {
            rec.Input()
            rec.S()
            rec.P()
            delay(5100)
        }
    }
    for (i in 1..n) {
        println("$i прямоугольник")
        delay(5000)
    }
}