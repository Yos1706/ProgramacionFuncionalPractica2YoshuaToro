object Ejercicio5 {

    def crearMultiplicador(factor: Int): Int => Int = {
        (num: Int) => num * factor
    }

    def main(args: Array[String]): Unit = {
        val duplicar = crearMultiplicador(2)
        val triplicar = crearMultiplicador(3)
        val porDiez = crearMultiplicador(10)

        println(s"duplicar(7) = ${duplicar(7)}")     
        println(s"triplicar(7) = ${triplicar(7)}")   
        println(s"porDiez(7) = ${porDiez(7)}")       

    }
}