package Modul1

class Hewan(nama: String, habitat: String, Makanan: String, alatGerak: String, Pernapasan: String){
    var nama = nama
    var habitat = habitat
    var Makanan = Makanan
    var alatGerak = alatGerak
    var Pernapasan = Pernapasan

    fun cetak(){
        println("Nama Hewan : $nama")
        println("Habitat : $habitat")
        println("Makanan : $Makanan")
        println("Bergerak Dengan: $alatGerak")
        println("Alat Pernapasan : $Pernapasan")
    }
}

fun main(args: Array<String>) {
    val kucing = Hewan("Kucing ","Darat", "Karnivora","4 Kaki", "Paru-Paru");
    kucing.cetak();
}