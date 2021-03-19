
class Paciente(nombre:String, primerAp:String,segundoAP:String, edad:Byte,
               val fecha:Array[String], val horaDeRegistro:Array[String],val nivelBienestar:Array[Byte],
               val temperaturas:Array[Double],val humedad:Array[Double]){


  def imprimir(): Unit ={
    println("------- Paciente -------")
    println("Nombre: "+nombre)
    println("Primer Apellido: "+primerAp)
    println("Segundo Apellido: "+segundoAP)
    println("Edad: "+edad)
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
  def obtenerPromedioNivelBienestar(): Double ={
    var sum=0
    for(i <- 0 until nivelBienestar.length){
      sum+=nivelBienestar(i)
    }
    sum/nivelBienestar.length
  }

  //obtener temperatura mayor (junto con nivel de bienestar, fecha, etc.)
  def obtenerMayor(): Int ={
    var mayor=0
    for(i <- 0 until temperaturas.length){
      if(temperaturas(i)>mayor){
        mayor=i
      }
    }
    mayor
  }

  //obtener temperatura menor (junto con nivel de bienestar, fecha, etc.)


}


object PruebaClasesYObjetos {

  def numeroRandom(inicio: Int, fin: Int): Int = {
    (inicio + Math.random * (fin - inicio)).toInt
  }

  def llenarFechas(n:Int) ={
    var fechas=new Array[String](n)
    for(i <- 0 until fechas.length){
      val dia=numeroRandom(1,31)
      val mes=numeroRandom(1,12)
      val año=numeroRandom(1900,2021)
      fechas(i)=dia+"/"+mes+"/"+año
    }
    fechas
  }

  def llenarHoraRegistro(n:Int) ={
    var horaRegistro=new Array[String](n)
    for(i <- 0 until horaRegistro.length){
      val hora=numeroRandom(0,23)
      val min=numeroRandom(0,59)
      horaRegistro(i)=hora+":"+min
    }
    horaRegistro
  }

  def llenarNivelBienestar(n:Int) ={
    var nivelBienestar=new Array[Byte](n)
    for(i <- 0 until nivelBienestar.length){
      nivelBienestar(i)=numeroRandom(1,5).toByte
    }
    nivelBienestar
  }

  def llenartemperaturas(n:Int) ={
    var temperaturas=new Array[Double](n)
    for(i <- 0 until temperaturas.length){
      temperaturas(i)=numeroRandom(-20,50)
    }
    temperaturas
  }

  def llenarHumedad(n:Int) ={
    var humedad=new Array[Double](n)
    for(i <- 0 until humedad.length){
      humedad(i)=numeroRandom(0,100)
    }
    humedad
  }


  def main(args: Array[String]): Unit = {

    var paciente1=new Paciente("1","1","1",1,llenarFechas(4),llenarHoraRegistro(4),llenarNivelBienestar(4),llenartemperaturas(4),llenarHumedad(4))
    paciente1.imprimir()



  }

}
