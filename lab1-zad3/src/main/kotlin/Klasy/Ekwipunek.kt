package Klasy

import Enum.TypyPrzedmiotow
import Klasy.Przedmioty.Przedmiot

class Ekwipunek(
    private val przedmiotyWEkwipunku: ArrayList<Przedmiot> = arrayListOf<Przedmiot>()
) {
    public fun get(): ArrayList<Przedmiot> {
        return przedmiotyWEkwipunku;
    }

    public fun getItem(indexItem: Int): Przedmiot {
        return przedmiotyWEkwipunku.elementAt(indexItem);
    }

    public fun addItem(przedmiot: Przedmiot) {
        przedmiotyWEkwipunku.add(przedmiot);
    }

    public fun addItem(typPrzedmiotu: TypyPrzedmiotow) {
        when (typPrzedmiotu) {
            TypyPrzedmiotow.Klucz -> {
                val klucz = Klucz(Kostka().wykonajRzut());
                przedmiotyWEkwipunku.add(klucz);
            };
            TypyPrzedmiotow.Korona -> {
                val korona = Korona(Kostka().wykonajRzut());
                przedmiotyWEkwipunku.add(korona);
            };
            TypyPrzedmiotow.Lopata -> {
                val lopata = Lopata(Kostka().wykonajRzut());
                przedmiotyWEkwipunku.add(lopata);
            };
            TypyPrzedmiotow.Miecz -> {
                val miecz = Miecz(Kostka().wykonajRzut());
                przedmiotyWEkwipunku.add(miecz);
            };
            TypyPrzedmiotow.Mlotek -> {
                val mlotek = Mlotek(Kostka().wykonajRzut());
                przedmiotyWEkwipunku.add(mlotek);
            };
            TypyPrzedmiotow.PierscienWladzy -> {
                val pierscienWladzy = PierscienWladzy(Kostka().wykonajRzut());
                przedmiotyWEkwipunku.add(pierscienWladzy);
            };
            TypyPrzedmiotow.Pioro -> {
                val pioro = Pioro(Kostka().wykonajRzut());
                przedmiotyWEkwipunku.add(pioro);
            };
            TypyPrzedmiotow.Telefon -> {
                val telefon = Telefon(Kostka().wykonajRzut());
                przedmiotyWEkwipunku.add(telefon);
            };
            TypyPrzedmiotow.Wiadro -> {
                val wiadro = Wiadro(Kostka().wykonajRzut());
                przedmiotyWEkwipunku.add(wiadro);
            };
            TypyPrzedmiotow.Widly -> {
                val widly = Widly(Kostka().wykonajRzut());
                przedmiotyWEkwipunku.add(widly);
            };
        }
    }

    public fun removeItem(indexItem: Int) {
        przedmiotyWEkwipunku.removeAt(indexItem);
    }

    public fun useItem(indexItem: Int) {
        przedmiotyWEkwipunku[indexItem].uzyj();
        if (przedmiotyWEkwipunku[indexItem].getWytrzymalosc <= 0)
        {

            przedmiotyWEkwipunku.removeAt(indexItem);
        }
    }

    public fun itemDetails(indexItem: Int) {
        val item = przedmiotyWEkwipunku[indexItem];
        println("Przedmiot: ${item.getNazwa}");
        println("Wytrzymałość: ${item.getWytrzymalosc}");
        println("Licznik użyć: ${item.getLicznikUzyc}");
        println("Odjemnik za użycie: ${item.getOdjemnikWytrzymalosciZaUzycie}");
    }
}