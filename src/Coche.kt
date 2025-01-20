import java.util.*

class Coche(var color: String, marca: String, modelo: String, numCaballos: Int, numPuertas: Int, matricula: String) {

    var matricula: String = matricula
        set(value) {
            require(value.isNotBlank()){"La marca no puede estar vacía."}
            require(value.length == 7){"La matrícula debe tener 7 carácteres."}
            field = value
        }

    var modelo: String? =
        modelo.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value) {
            require(!value.isNullOrBlank()){"El modelo no puede estar en blanco."}
            field = value
        }

    var marca: String? = marca.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value){
            require(!value.isNullOrBlank()){"La marca no puede estar en blanco."}
            field = value
        }

    var numCaballos: Int = numCaballos
        set(value){
            require(value in 70..700){"El nº de caballos debe estar entre 70 y 700."}
            field = value
        }

    var numPuertas: Int = numPuertas
        set(value){
            require(value in 3..5){"El nº de puertas debe estar entre 3 y 5."}
            field = value
        }

    init{
        require(!marca.isNullOrBlank()){"La marca no puede estar vacía ni ser nula."}
        require(!modelo.isNullOrBlank()){"El modelo del vehículo no puede estar vacío."}
        require(!matricula.isNullOrBlank()){"La matrícula no puede estar vacía."}
        require(!color.isNullOrBlank()){"El color no puede ser nulo."}
        require(numCaballos in 70..700){"Nº de caballos debe estar entre 70 y 700."}
        require(numPuertas in 3..5){"Nº de puertas debe estar entre 3 y 5."}
    }

    override fun toString(): String {
        return "El coche de color $color y marca $marca, es del modelo $modelo, tiene $numCaballos caballos, $numPuertas puertas y la matrícula $matricula"
    }
}