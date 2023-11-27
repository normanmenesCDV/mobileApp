package Klasy

import Klasy.Przedmioty.Przedmiot

class Korona(
    wytrzymalosc: Int,
    nazwa: String = "Korona władcy",
    opis: String = "Opis korony",
    odjemnikWytrzymalosciZaUzycie: Int = 10,
    licznikUzyc: Int = 0
) : Przedmiot(nazwa, opis, wytrzymalosc, odjemnikWytrzymalosciZaUzycie, licznikUzyc)
{
    override fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}