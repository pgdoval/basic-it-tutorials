
String obtenerTextoDeFichero(String fichero){
return new File(fichero).text
}

List <String> separarEnBaseACaracter(String texto, String separador){
return texto.split(separador)
}

String texto = obtenerTextoDeFichero("datos.txt")
def palabras = separarEnBaseACaracter(texto, " ")

println palabras.collect{
it.reverse()
}.join(" ")
