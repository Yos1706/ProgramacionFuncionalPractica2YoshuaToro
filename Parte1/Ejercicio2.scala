object Ejercicio2 {
    val cubo: Int => Int = (num: Int) => num * num * num
    val promedio: (Double, Double) => Double = (a: Double, b: Double) => (a + b) / 2.0
    val mayor: (Int, Int) => Int = (a: Int, b: Int) => if a >= b then a else b
    val esMultiploDeTres: Int => Boolean = (num: Int) => num % 3 == 0

    def main(args: Array[String]): Unit = {
        println(s"cubo(3) = ${cubo(3)}")                             
        println(s"promedio(10.0, 20.0) = ${promedio(10.0, 20.0)}")     
        println(s"mayor(15, 8) = ${mayor(15, 8)}")                     
        println(s"esMultiploDeTres(9) = ${esMultiploDeTres(9)}")       
        println(s"esMultiploDeTres(10) = ${esMultiploDeTres(10)}")     
    }
}
