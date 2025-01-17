class Coche(var color: String, val marca: String, val modelo: String, val numCaballos: Int, val numPuertas: Int, val matricula: String) {

    init{
        require(marca){"La marca no puede estar vacía ni ser nula."}
        require(numCaballos !=)
    }
}