public class Rectangle(var weight: Double, var height: Double) {
    public fun Input()
    {
        println("Введите высоту премоугольника:")
        weight = readLine()!!.toDouble()
        while (weight < 0) {
            println("Высота должна быть больше нуля")
            weight = readLine()!!.toDouble()
        }
        println("Введите ширину премоугольника:")
        height = readLine()!!.toDouble()
        while (height < 0){
            println("Ширина должны быть больше нуля")
            height = readLine()!!.toDouble()
        }
    }
    public fun S() {
        println("Площать прямоугольника: ${weight * height}" )
    }
    public fun P() {
        println("Периметр прямоугольника: ${(weight + height) * 2}")
    }
}