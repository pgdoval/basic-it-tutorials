

def esBisiesto(int year){
return(year%4==0) && (year%100!=0)
}

def cogerPorPantalla(){
  return System.console().readLine().toInteger()
}

println "Escribe un número"
int anio = cogerPorPantalla()

if(esBisiesto(anio))
println "Es bisiesto"
else
println "No es bisiesto"
