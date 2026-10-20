// 1. Clase Pelicula
class Pelicula(
    val titulo: String,
    val duracionMinutos: Int,
    val clasificacion: String
)

// 2. Objeto Pelicula
object Pelicula {
    def apply(
        titulo: String,
        duracionMinutos: Int,
        clasificacion: String
    ): Pelicula = {
        val duracionValida: Int = if duracionMinutos > 0 then duracionMinutos else 90
        new Pelicula(titulo, duracionValida, clasificacion)
    }
}
// 3. Clase FuncionCine
class FuncionCine(
    val pelicula: Pelicula,
    val sala: Int,
    val hora: String,
    val precioEntrada: Double,
    val asientosDisponibles: Int
) {
    def puedeReservar(cantidad: Int): Boolean = {
        asientosDisponibles >= cantidad
    }

    def costoReserva(cantidad: Int): Double = {
        cantidad * precioEntrada
    }

    def reservar(cantidad: Int): FuncionCine = {
        if puedeReservar(cantidad) then
            new FuncionCine(
                pelicula,
                sala,
                hora,
                precioEntrada,
                asientosDisponibles - cantidad
            )
        else
            this
    }

    def descripcion: String = {
        s"${pelicula.titulo}\nSala: $sala\nHora: $hora\nPrecio: $precioEntrada Bs\nAsientos disponibles: $asientosDisponibles"
    }
}

//4. Objeto FuncionCine
object FuncionCine {
    def apply(
        pelicula: Pelicula,
        sala: Int,
        hora: String,
        precioEntrada: Double,
        asientosDisponibles: Int
    ): FuncionCine = {
        val salaValida: Int = if sala >= 1 then sala else 1
        val precioValido: Double = if precioEntrada >= 0.0 then precioEntrada else 0.0
        val asientosValidos: Int = if asientosDisponibles >= 0 then asientosDisponibles else 0
        
        new FuncionCine(pelicula, salaValida, hora, precioValido, asientosValidos)
    }

    def funcionEstandar(
        pelicula: Pelicula,
        sala: Int,
        hora: String
    ): FuncionCine = {
        FuncionCine(pelicula, sala, hora, 30.0, 50)
    }
}

// 5. Main
object SistemaCineMain {
    def main(args: Array[String]): Unit = {
        val pelicula1 = Pelicula(
            "Dune",
            155,
            "PG-13"
        )

        val funcion1 = FuncionCine(
            pelicula1,
            3,
            "20:30",
            35.0,
            40
        )

        val funcion2 = FuncionCine.funcionEstandar(
            pelicula1,
            1,
            "16:00"
        )

        println("DESCRIPCIÓN")
        println(funcion1.descripcion)
        println("PUEDE RESERVAR (5) ")
        println(funcion1.puedeReservar(5)) 
        println("COSTO RESERVA (5) ")
        println(funcion1.costoReserva(5))   
        val funcionReservada = funcion1.reservar(5)
        println("ASIENTOS DISPONIBLES (Original vs Reservada) ")
        println(funcion1.asientosDisponibles)          
        println(funcionReservada.asientosDisponibles)  
    }
}
