/*

 obtener promedios nivel de bienestar
obtener temperatura mayor (junto con nivel de bienestar, fecha, etc.)
obtener temperatura menor (junto con nivel de bienestar, fecha, etc.)*/


class Paciente(val nombre:String, val primerAp:String,val segundoAP:String, var edad:Byte){

  //atributos
  var fecha=new Array[String](edad)
  var horaDeRegistro=new Array[String](edad)
  var nivelBienestar=new Array[Byte](edad)
  var temperatura=new Array[Double](edad)
  var humedad=new Array[Double](edad)

  override def toString: String = "-------- Paciente -------"+
    "\nNombre: "+nombre+
    "\nPrimer Apellido: "+primerAp+
    "\nSegundo Apellido: "+segundoAP+
    "\nEdad: "+edad+
    "\nfechas: "+fecha.foreach(println)+
    "\nHoras de registro: "+horaDeRegistro.foreach(println)+
    "\nNivel de bienestar: "+nivelBienestar.foreach(println)+
    "\nTemperaturas: "+temperatura.foreach(println)+
    "\nHumedad: "+humedad.foreach(println)

}

object PruebaClasesYObjetos {
  def main(args: Array[String]): Unit = {

    var paciente1=new Paciente("1","1","1",1)
    println(paciente1)



  }

}
