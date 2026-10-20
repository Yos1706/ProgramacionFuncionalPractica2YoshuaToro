object Ejercicio4 {

    def calcular(
        a: Double,
        b: Double,
        operacion: (Double, Double) => Double
    ): Double = {
        operacion(a, b)
    }

    def main(args: Array[String]): Unit = {
        val suma: (Double, Double) => Double = (x, y) => x + y
        val resta: (Double, Double) => Double = (x, y) => x - y
        val multiplicacion: (Double, Double) => Double = (x, y) => x * y
        val division: (Double, Double) => Double = (x, y) => if y != 0.0 then x / y else 0.0
        val promedio: (Double, Double) => Double = (x, y) => (x + y) / 2.0

        val val1 = 10.0
        val val2 = 4.0

        println(s"Suma ($val1 + $val2) = ${calcular(val1, val2, suma)}")
        println(s"Resta ($val1 - $val2) = ${calcular(val1, val2, resta)}")
        println(s"Multiplicación ($val1 * $val2) = ${calcular(val1, val2, multiplicacion)}")
        println(s"División ($val1 / $val2) = ${calcular(val1, val2, division)}")
        println(s"Promedio ($val1 y $val2) = ${calcular(val1, val2, promedio)}")
    }
}
