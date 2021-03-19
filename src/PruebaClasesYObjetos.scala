import java.util.GregorianCalendar
/*

 obtener promedios nivel de bienestar
obtener temperatura mayor (junto con nivel de bienestar, fecha, etc.)
obtener temperatura menor (junto con nivel de bienestar, fecha, etc.)*/


class Paciente(val nombre:String, val primerAp:String,val segundoAP:String, var edad:Byte,
               val fecha:Array[String], horaDeRegistro:Array[String],nivelBienestar:Array[Byte],
               temperaturas:Array[Double],humedad:Array[Double]){


  override def toString: String = "-------- Paciente -------"+
    "\nNombre: "+nombre+
    "\nPrimer Apellido: "+primerAp+
    "\nSegundo Apellido: "+segundoAP+
    "\nEdad: "+edad+
    "\nfechas: "+fecha+
    "\nHoras de registro: "+horaDeRegistro+
    "\nNivel de bienestar: "+nivelBienestar.foreach(println)+
    "\nTemperaturas: "+temperaturas.foreach(println)+
    "\nHumedad: "+humedad.foreach(println)




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


  def main(args: Array[String]): Unit = {

    var paciente1=new Paciente("1","1","1",1,llenarFechas(4),llenarHoraRegistro(4),llenarNivelBienestar())
    println(paciente1)
    llenarFechas(4).foreach(println)



  }

}
