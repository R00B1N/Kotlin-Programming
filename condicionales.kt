//Jugando con condicionales en Kotlin.
fun main(){
    val num1 = 5
    val num2 = 10
    if (num1 + num2 == 15){
        println("El resultado es ${num1 + num2}")
    } else{
        println("El resultado es incorrecto")
    }
    //llamar a la funcion de suma
    suma()
    resta()
    multiplicacion()
    division()
}
fun suma(){
    val num1 = (1..10).random()
    val num2 = (1..10).random()
    val resultado = num1 + num2
    println("El resultado de la suma es: ${resultado}")
}
fun resta(){
    val num1 = (1..10).random()
    val num2 = (1..10).random()
    val resultado = num1 - num2
    println("El resultado de la resta es: " + resultado)
}
fun multiplicacion(){
    val num1 = (1..10).random()
    val num2 = (1..10).random()
    val resultado = num1 * num2
    println("El resultado de la multiplicacion es: ${resultado}")
}
fun division(){
    val num1 = (1..10).random()
    val num2 = (1..10).random()
    val resultado = num1 / num2
    println("El resultado de la division es: ${resultado}")
}
