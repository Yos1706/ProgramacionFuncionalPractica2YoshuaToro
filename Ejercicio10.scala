object Ejercicio10 {

    def transformarTexto(
        texto: String,
        transformacion: Char => Char
    ): String = {
        def aux(index: Int, acumulado: String): String = {
            if index >= texto.length then acumulado
            else aux(index + 1, acumulado + transformacion(texto(index)))
        }
        aux(0, "")
    }

    def buscarCaracter(
        texto: String,
        condicion: Char => Boolean
    ): Boolean = {
        def aux(index: Int): Boolean = {
            if index >= texto.length then false
            else if condicion(texto(index)) then true
            else aux(index + 1)
        }
        aux(0)
    }

    def main(args: Array[String]): Unit = {
        val resultadoTransformacion = transformarTexto("scala", c => c.toUpper)
        println(s"""transformarTexto("scala", c => c.toUpper) = "$resultadoTransformacion"""") 
        val buscarDigito = buscarCaracter("Scala2026", c => c.isDigit)
        println(s"""buscarCaracter("Scala2026", c => c.isDigit) = $buscarDigito""") 
        val buscarLetraZ = buscarCaracter("Scala", c => c == 'z')
        println(s"""buscarCaracter("Scala", c => c == 'z') = $buscarLetraZ""") 
    }
}