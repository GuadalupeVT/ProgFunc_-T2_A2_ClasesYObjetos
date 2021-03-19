import scala.io.StdIn._

class Paciente(nombre:String, primerAp:String,segundoAP:String, edad:Byte,
               val fecha:Array[String], val horaDeRegistro:Array[String],val nivelBienestar:Array[Byte],
               val temperaturas:Array[Double],val humedad:Array[Double]) {


  def imprimir(n:Int): Unit = {
    println("------- Paciente "+ n+" -------")
    println("Nombre: " + nombre)
    println("Primer Apellido: " + primerAp)
    println("Segundo Apellido: " + segundoAP)
    println("Edad: " + edad)
    println("Fechas: ")
    fecha.foreach(println)
    println("Hora de registro: ")
    horaDeRegistro.foreach(println)
    println("Nivel de bienestar: ")
    nivelBienestar.foreach(println)
    println("Temperaturas: ")
    temperaturas.foreach(println)
    println("Humedad: ")
    humedad.foreach(println)
  }

  //obtener promedios nivel de bienestar
  def obtenerPromedioNivelBienestar(): Double = {
    var sum = 0
    for (i <- 0 until nivelBienestar.length) {
      sum += nivelBienestar(i)
    }
    sum / nivelBienestar.length
  }

  //obtener temperatura mayor (junto con nivel de bienestar, fecha, etc.)
  def obtenerMayor(): Unit = {
    var mayor = 0
    for (i <- 0 until temperaturas.length) {
      if (temperaturas(i) > mayor) {
        mayor = i
      }
    }
    println("********+*******************************")
    println("La temperatura mayor es: " + temperaturas(mayor)+" °C")
    println("Registrada el dia: " + fecha(mayor) + " a las: " + horaDeRegistro(mayor))
    println("La cual corresponde al nivel de bienestar: " + nivelBienestar(mayor))
    print("Con una humedad de: " + humedad(mayor)+" %")
  }

  //obtener temperatura menor (junto con nivel de bienestar, fecha, etc.)
  def obtenerMenor(): Unit = {
    var menor = 0
    for (i <- 0 until temperaturas.length) {
      if (temperaturas(i) < menor) {
        menor = i
      }
    }
    println("********+*******************************")
    println("La temperatura mayor es: " + temperaturas(menor)+" °C")
    println("Registrada el dia: " + fecha(menor) + " a las: " + horaDeRegistro(menor))
    println("La cual corresponde al nivel de bienestar: " + nivelBienestar(menor))
    print("Con una humedad de: " + humedad(menor)+" %")

  }
}


object PruebaClasesYObjetos {

  def numeroRandom(inicio: Int, fin: Int): Int = {
    (inicio + Math.random * (fin - inicio)).toInt
  }

  def llenarFechas(n: Int) = {
    var fechas = new Array[String](n)
    for (i <- 0 until fechas.length) {
      val dia = numeroRandom(1, 31)
      val mes = numeroRandom(1, 12)
      val año = numeroRandom(1900, 2021)
      fechas(i) = dia + "/" + mes + "/" + año
    }
    fechas
  }

  def llenarHoraRegistro(n: Int) = {
    var horaRegistro = new Array[String](n)
    for (i <- 0 until horaRegistro.length) {
      val hora = numeroRandom(0, 23)
      val min = numeroRandom(0, 59)
      horaRegistro(i) = hora + ":" + min
    }
    horaRegistro
  }

  def llenarNivelBienestar(n: Int) = {
    var nivelBienestar = new Array[Byte](n)
    for (i <- 0 until nivelBienestar.length) {
      nivelBienestar(i) = numeroRandom(1, 5).toByte
    }
    nivelBienestar
  }

  def llenartemperaturas(n: Int) = {
    var temperaturas = new Array[Double](n)
    for (i <- 0 until temperaturas.length) {
      temperaturas(i) = numeroRandom(-20, 50)
    }
    temperaturas
  }

  def llenarHumedad(n: Int) = {
    var humedad = new Array[Double](n)
    for (i <- 0 until humedad.length) {
      humedad(i) = numeroRandom(0, 100)
    }
    humedad
  }


  def main(args: Array[String]): Unit = {

    println(" ################# PACIENTE 1 #####################")
    println("Ingrese el nombre del paciente: ")
    val nombre = readLine()
    println("Ingrese primer apellido del paciente: ")
    val primerAp = readLine()
    println("Ingrese segundo apellido del paciente: ")
    val segundoAp = readLine()
    println("Ingrese edad del paciente: ")
    val edad = readByte()
    println("Numero de mediciones: ")
    val m = readInt()
    var paciente1 = new Paciente(nombre, primerAp, segundoAp, edad, llenarFechas(m), llenarHoraRegistro(m), llenarNivelBienestar(m), llenartemperaturas(m), llenarHumedad(m))

    println(" ################# PACIENTE 2 #####################")
    println("Ingrese el nombre del paciente 2: ")
    val nombre2 = readLine()
    println("Ingrese primer apellido del paciente 2: ")
    val primerAp2 = readLine()
    println("Ingrese segundo apellido del paciente 2: ")
    val segundoAp2 = readLine()
    println("Ingrese edad del paciente 2: ")
    val edad2 = readByte()
    println("Numero de mediciones para el paciente 2: ")
    val m2 = readInt()
    var paciente2 = new Paciente(nombre2, primerAp2, segundoAp2, edad2, llenarFechas(m2), llenarHoraRegistro(m2), llenarNivelBienestar(m2), llenartemperaturas(m2), llenarHumedad(m2))


    paciente1.imprimir(1)
    println("El promedio de Bienestar es: Nivel "+paciente1.obtenerPromedioNivelBienestar())
    paciente1.obtenerMayor()
    println()
    paciente1.obtenerMenor()
    println()


    paciente2.imprimir(2)
    println("El promedio de Bienestar es: Nivel "+paciente2.obtenerPromedioNivelBienestar())
    paciente2.obtenerMayor()
    println()
    paciente2.obtenerMenor()
    println()


  }
}
