fun main(){
    val coches = listOf(
        Coche("blanco", "Finstone", "Rocamovil", 70, 5, "1234321"),
        Coche("gris", "toyota", "yaris", 125, 5, "123xcvb"),
        Coche("azul","Dacia", "Logan", 120, 5, "ESDR123"),
        Coche("verde", "Subaru", "Impressa", 245, 3, "ASSY403"),
        Coche("negro", "Hotwheels", "Arponero", 323, 4, "POOWEER")
    )

    for (coche in coches){
        println(coche)
    }

    coches[1].numCaballos = 230
    coches[1].numPuertas = 4
    coches[1].color = "Plateado"
    coches[1].marca = "Boobaloo"
    coches[1].modelo = "Fresa"

    println(coches[1])
    println("---------------------------------------------------------------------------------------")
    coches[1].marca = ""
    println(coches[1])


    coches[1].modelo = ""
    println(coches[1])


    coches[1].numCaballos = 701
    println(coches[1])

    coches[1].numPuertas = 2
    println(coches[1])


    coches[1].matricula = "222222"
    println(coches[1])


    coches[1].numCaballos = -1
    coches[1].numPuertas = -1
    coches[1].color = ""
    coches[1].matricula = ""
    println(coches[1])

}