object Ejercicio1 {
    val duplicar: Int => Int = (num: Int) => num * 2
    val cuadrado: Int => Int = (num: Int) => num * num
    val esPar: Int => Boolean = (num: Int) => num % 2 == 0

    def main(args: Array[String]): Unit = {
        println(s"duplicar(5) = ${duplicar(5)}")   
        println(s"cuadrado(4) = ${cuadrado(4)}")   
        println(s"esPar(8) = ${esPar(8)}")         
        println(s"esPar(7) = ${esPar(7)}")         
    }
}
