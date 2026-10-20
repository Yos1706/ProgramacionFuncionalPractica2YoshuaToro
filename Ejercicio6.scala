object Ejercicio6 {

    def aplicarDescuento(precio: Double, porcentaje: Double): Double = {
        precio - (precio * porcentaje)
    }

    def main(args: Array[String]): Unit = {
        val descuento10: Double => Double = (precio: Double) => aplicarDescuento(precio, 0.1)
        val descuento20: Double => Double = (precio: Double) => aplicarDescuento(precio, 0.2)
        val descuento50: Double => Double = (precio: Double) => aplicarDescuento(precio, 0.5)

        println(s"descuento10(500) = ${descuento10(500)}") 
        println(s"descuento20(500) = ${descuento20(500)}") 
        println(s"descuento50(500) = ${descuento50(500)}") 
    }
}