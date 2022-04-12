package Modul1

import java.util.concurrent.ThreadLocalRandom

fun main(args : Array<String>) {
    print("Waktu Sekarang: ")
    var waktu = readLine()
    print("Nama Anda: ")
    var nama = readLine()
    print("Umur Anda: ")
    var umur = readLine()
    print("Suhu Tubuh Anda: ")
    val suhu = String.format("%.1f", ThreadLocalRandom.current().nextDouble(35.0, 37.0))
    println(suhu)
    println("Selamat $waktu, $nama.")
    println("Umur anda $umur Tahun.")
    println("Suhu Tubuh anda $suhu derajat Celsius.")
}
