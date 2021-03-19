
fecha []
hora de registro []
nivel de bienestar []   (nivel 1 - nivel 5)
temperatura[]
humedad[]

Agregar los siguientes métodos:

  obtener promedios nivel de bienestar
obtener temperatura mayor (junto con nivel de bienestar, fecha, etc.)
obtener temperatura menor (junto con nivel de bienestar, fecha, etc.)



class Paciente(val nombre:String,val primerAp:String,val segundoAP:String, var edad:Byte){

}

object PruebaClasesYObjetos {
  def main(args: Array[String]): Unit = {

    var paciente1=new Paciente("1","1","1",1)

  }

}
