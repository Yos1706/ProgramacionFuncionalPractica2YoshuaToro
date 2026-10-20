object Ejercicio3 {

    def transformar(numero: Int, operacion: Int => Int): Int = {
        operacion(numero)
    }

    def main(args: Array[String]): Unit = {
        val duplicado = transformar(5, x => x * 2)
        val cuadrado = transformar(5, x => x * x)
        val sumarDiez = transformar(5, x => x + 10)
        val negativo = transformar(5, x => -x)

        println(s"transformar(5, x => x * 2) = $duplicado")       
        println(s"transformar(5, x => x * x) = $cuadrado")       
        println(s"transformar(5, x => x + 10) = $sumarDiez")     
        println(s"transformar(5, x => -x) = $negativo")           
    }
}