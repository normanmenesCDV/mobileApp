package Klasy

import Enum.TypyPrzedmiotow

class TypowPrzedmiotow() {
    val mapa: Map<String, String> = mapOf(
        TypyPrzedmiotow.Klucz.value.toString() to "Klucz",
        TypyPrzedmiotow.Korona.value.toString() to "Korona",
        TypyPrzedmiotow.Lopata.value.toString() to "Łopata",
        TypyPrzedmiotow.Miecz.value.toString() to "Miecz",
        TypyPrzedmiotow.Mlotek.value.toString() to "Młotek",
        TypyPrzedmiotow.PierscienWladzy.value.toString() to "Pierścień władzy",
        TypyPrzedmiotow.Pioro.value.toString() to "Pióro",
        TypyPrzedmiotow.Telefon.value.toString() to "Telefon",
        TypyPrzedmiotow.Wiadro.value.toString() to "Wiadro",
        TypyPrzedmiotow.Widly.value.toString() to "Widły"
    )
    public fun ToMap() : Map<String, String>{
        return mapa;
    }
}