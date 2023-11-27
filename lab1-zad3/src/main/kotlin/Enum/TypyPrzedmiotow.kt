package Enum

enum class TypyPrzedmiotow(val value: Int) {
    Klucz(1),
    Korona(2),
    Lopata(3),
    Miecz(4),
    Mlotek(5),
    PierscienWladzy(6),
    Pioro(7),
    Telefon(8),
    Wiadro(9),
    Widly(10);

    companion object {
        fun fromValue(value: Int): TypyPrzedmiotow? {
            return values().find { it.value == value }
        }
    }
}