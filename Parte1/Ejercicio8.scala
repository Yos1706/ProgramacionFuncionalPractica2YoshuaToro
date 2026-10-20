object Ejercicio8 {

    val limpiar: String => String = (texto: String) => texto.trim()
    val convertirMinusculas: String => String = (texto: String) => texto.toLowerCase()
    val longitud: String => Int = (texto: String) => texto.length()
    val esLongitudValida: Int => Boolean = (num: Int) => num >= 5

    val validarTexto: String => Boolean = limpiar
        .andThen(convertirMinusculas)
        .andThen(longitud)
        .andThen(esLongitudValida)

    def main(args: Array[String]): Unit = {
        println(s"validarTexto('  Scala  ') = ${validarTexto("  Scala  ")}")     
        println(s"validarTexto('  Hola  ') = ${validarTexto("  Hola  ")}")       
        println(s"validarTexto('Programación') = ${validarTexto("Programación")}") 
    }
}
