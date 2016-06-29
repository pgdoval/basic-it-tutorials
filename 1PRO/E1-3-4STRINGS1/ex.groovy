

Boolean esPalindromo(String palabra)
{
    palabra.reverse() == palabra
}

void printPalindromo(String palabra, String msg1, msg2)
{
    if (esPalindromo(palabra))
    {
        println msg1
    }
    else
    {
        println msg2
    }
}

printPalindromo("ese", "lo es", "po va a ser que no")
printPalindromo("esa", "lo es", "po va a ser que no")
printPalindromo("esertrese", "lo es", "po va a ser que no")
