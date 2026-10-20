object Ejercicio7 {

    def elevar(exponente: Int)(base: Int): Int = {
        def pow(a: Int, b: Int): Int = {
            if b == 0 then 1
            else a * pow(a, b - 1)
        }
        pow(base, exponente)
    }

    def main(args: Array[String]): Unit = {
        val cuadrado = elevar(2)
        val cubo = elevar(3)
        val cuartaPotencia = elevar(4)

        println(s"cuadrado(5) = ${cuadrado(5)}")               
        println(s"cubo(3) = ${cubo(3)}")                     
        println(s"cuartaPotencia(2) = ${cuartaPotencia(2)}")   
    }
}
