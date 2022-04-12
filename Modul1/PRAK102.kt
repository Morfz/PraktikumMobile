package Modul1

fun main(args : Array<String>) {
    rumus()
}

fun rumus() {
    print("Nilai x = ")
    var x = Integer.valueOf(readLine())
    var hasil = 2*(x*x)+5*x-8
    println("$hasil")
}