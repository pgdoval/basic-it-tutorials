

Boolean esPalindromo(String palabra)
{
    palabra.reverse() == palabra
}

void printPalindromo(String palabra, String msg1, msg2)
{
    if (esPalindromo(palabra))
    {
        println "La palabra $palabra $msg1"
    }
    else
    {
        println "La palabra $palabra $msg2"
    }
}

String esPalindromo = "es palíndromo"
String noEsPalindromo = "no es palíndromo"

printPalindromo("ese", esPalindromo, noEsPalindromo)
printPalindromo("esa", esPalindromo, noEsPalindromo)
printPalindromo("esertrese", esPalindromo, noEsPalindromo)
