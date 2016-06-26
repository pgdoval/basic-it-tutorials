
String obtenerTextoDeFichero(String fichero){
return new File(fichero).text
}

List <Integer> separarEnBaseACaracter(String texto, String separador){
return texto.split(separador)*.toInteger()
}

String texto = obtenerTextoDeFichero("datos.txt")
def enteros = separarEnBaseACaracter(texto, ",")

println enteros.collect{
it*it
}.join(", ")
