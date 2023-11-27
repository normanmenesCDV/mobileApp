package Klasy

import Klasy.Przedmioty.Przedmiot

class Widly(
    wytrzymalosc: Int,
    nazwa: String = "Widły rolnika",
    opis: String = "Opis wideł",
    odjemnikWytrzymalosciZaUzycie: Int = 6,
    licznikUzyc: Int = 0
) : Przedmiot(nazwa, opis, wytrzymalosc, odjemnikWytrzymalosciZaUzycie, licznikUzyc)
{
    override fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}