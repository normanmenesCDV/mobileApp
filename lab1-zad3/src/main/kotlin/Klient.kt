import Enum.TypyPrzedmiotow
import Klasy.*
import Klasy.UI.Pochodne.MenuGlowne
import Klasy.UI.Pochodne.WyborPrzedmiotuZEkwipunku
import Klasy.UI.Pochodne.WyborTypuPrzedmiotu

class Klient {

    private val ekwipunek = Ekwipunek();

    public fun start() {
        do {
            val operacja = MenuGlowne().WyborOperacjiDoSukcesu();

            when (operacja) {
                "1" -> dodajPrzedmiot();
                "2" -> usunPrzedmiot();
                "3" -> uzyjPrzedmiotu();
                "4" -> wyswietlSzczegolyPrzedmiotu();
                "5" -> wyswietlCalyEkwipunek();
                "q" -> System.exit(1);
            }
        } while (operacja != "q")
    }

    private fun dodajPrzedmiot() {
        println("Dodawanie przedmiotu");
        val operacja = WyborTypuPrzedmiotu().WyborOperacjiDoSukcesu();

        when (operacja) {
            "q" -> {
                print("\n");
                return;
            }
            else -> {
                val wybranyTypPrzedmiotu = TypyPrzedmiotow.fromValue(operacja.toInt());
                ekwipunek.addItem(wybranyTypPrzedmiotu!!);
                println("Dodano przedmiot typu ${wybranyTypPrzedmiotu}")
                print("\n");
            };
        }
    }

    private fun usunPrzedmiot() {
        println("Usuwanie przedmiotu");

        val mapaPrzedmiotowZEkwipunku : MutableMap<String, String> = mutableMapOf()
        for ((index, item) in ekwipunek.get().withIndex())
        {
            mapaPrzedmiotowZEkwipunku[index.toString()] = item.getNazwa;
        }
        val operacja = WyborPrzedmiotuZEkwipunku(mapaPrzedmiotowZEkwipunku).WyborOperacjiDoSukcesu();

        when (operacja) {
            "q" -> {
                print("\n");
                return;
            }
            else -> {
                val wybranyIndeksPrzedmiotu = operacja.toInt();
                val przedmiot = ekwipunek.getItem(wybranyIndeksPrzedmiotu);
                ekwipunek.removeItem(wybranyIndeksPrzedmiotu);
                println("Usunięto przedmiot ${przedmiot.getNazwa}");
                print("\n");
            };
        }
    }

    private fun uzyjPrzedmiotu() {
        println("Wykorzystanie przedmiotu");
        val mapaPrzedmiotowZEkwipunku : MutableMap<String, String> = mutableMapOf()
        for ((index, item) in ekwipunek.get().withIndex())
        {
            mapaPrzedmiotowZEkwipunku[index.toString()] = item.getNazwa;
        }
        val operacja = WyborPrzedmiotuZEkwipunku(mapaPrzedmiotowZEkwipunku).WyborOperacjiDoSukcesu();

        when (operacja) {
            "q" -> {
                print("\n");
                return;
            }
            else -> {
                val wybranyIndeksPrzedmiotu = operacja.toInt();
                val przedmiot = ekwipunek.getItem(wybranyIndeksPrzedmiotu);
                ekwipunek.useItem(wybranyIndeksPrzedmiotu);
                println("Użyto przedmiotu ${przedmiot.getNazwa}");
                print("\n");
            };
        }
    }

    private fun wyswietlSzczegolyPrzedmiotu() {
        println("Wyświetl szczegóły przedmiotu");
        val mapaPrzedmiotowZEkwipunku : MutableMap<String, String> = mutableMapOf()
        for ((index, item) in ekwipunek.get().withIndex())
        {
            mapaPrzedmiotowZEkwipunku[index.toString()] = item.getNazwa;
        }
        val operacja = WyborPrzedmiotuZEkwipunku(mapaPrzedmiotowZEkwipunku).WyborOperacjiDoSukcesu();

        when (operacja) {
            "q" -> {
                print("\n");
                return;
            }
            else -> {
                println("Szczegóły przedmiotu");
                val wybranyIndeksPrzedmiotu = operacja.toInt();
                ekwipunek.itemDetails(wybranyIndeksPrzedmiotu);
                print("\n");
            };
        }
    }

    private fun wyswietlCalyEkwipunek() {
        println("Oto Twój ekwipunek");
        ekwipunek.get().forEachIndexed { index, przedmiot ->
            println("${index}. ${przedmiot.getNazwa} | " + "Wytrzymałość: ${przedmiot.getWytrzymalosc}")
        }
        print("\n");
    }
}