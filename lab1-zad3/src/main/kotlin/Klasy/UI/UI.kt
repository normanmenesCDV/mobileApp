package Klasy.UI

import java.io.Console

open class UI(
    val mapaOperacji: MutableMap<String, String>,
    val polecenie: String,
    val tekstAnulowania: String
) {
    init {
        mapaOperacji.put("q", tekstAnulowania);
    }

    internal fun WyborOperacjiDoSukcesu(): String {
        var opcja: String;
        while (true) {
            println(polecenie);
            wyswietlOpcje();
            print("Wybrana opcja: ");
            opcja = readln();
            print("\n");
            if (czyJestDostepnaTakaOpcja(opcja)) {
                return opcja;
            } else {
                println("Podano nieprawidłową operację. Dokonaj ponownego wyboru.")
                print("\n");
            }
        }
    }

    private fun wyswietlOpcje() {
        mapaOperacji.forEach { x ->
            println("${x.key}. ${x.value}")
        };
    }

    private fun czyJestDostepnaTakaOpcja(opcjaKlucz: String): Boolean {
        return (opcjaKlucz in mapaOperacji);
    }
}