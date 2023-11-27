package Klasy

import Klasy.Przedmioty.Przedmiot

class Pioro(
    wytrzymalosc: Int,
    nazwa: String = "Pióro pisarza",
    opis: String = "Opis pióra",
    odjemnikWytrzymalosciZaUzycie: Int = 4,
    licznikUzyc: Int = 0
) : Przedmiot(nazwa, opis, wytrzymalosc, odjemnikWytrzymalosciZaUzycie, licznikUzyc)
{
    override fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}