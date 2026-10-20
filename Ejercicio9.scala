import scala.annotation.tailrec

object Ejercicio9 {

    def sumar(
        desde: Int,
        hasta: Int,
        transformar: Int => Int
    ): Int = {
        @tailrec
        def aux(actual: Int, acumulado: Int): Int = {
            if actual > hasta then acumulado
            else aux(actual + 1, acumulado + transformar(actual))
        }
        aux(desde, 0)
    }

    def producto(
        desde: Int,
        hasta: Int,
        transformar: Int => Int
    ): Int = {
        @tailrec
        def aux(actual: Int, acumulado: Int): Int = {
            if actual > hasta then acumulado
            else aux(actual + 1, acumulado * transformar(actual))
        }
        aux(desde, 1)
    }

    def main(args: Array[String]): Unit = {
        println(s"sumar(1, 4, x => x) = ${sumar(1, 4, x => x)}")                     
        println(s"sumar(1, 3, x => x * x) = ${sumar(1, 3, x => x * x)}")             
        println(s"sumar(1, 3, x => x * x * x) = ${sumar(1, 3, x => x * x * x)}")     
        println(s"producto(1, 4, x => x) = ${producto(1, 4, x => x)}")               
    }
}