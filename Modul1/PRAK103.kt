package Modul1

import java.util.*

fun main ()
{
    val input = Scanner(System.`in`)
    print("Input Bilangan : ")
    val nilai = input.nextInt()
    val list: MutableList<Int> = mutableListOf()
    var Jumlah : Int
    for(i in 1..999) {
        Jumlah = nilai*i
        if(((Jumlah%2)==0)|| ((Jumlah%3)==0)) {
            list.add(Jumlah)
        }
        if(list.size == 5){
            break
        }
    }
    for (hasil in list) {
        print("$hasil ")
    }
}