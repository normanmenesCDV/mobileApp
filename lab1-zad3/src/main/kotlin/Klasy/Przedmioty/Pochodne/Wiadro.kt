package Klasy

import Klasy.Przedmioty.Przedmiot

class Wiadro(
    wytrzymalosc: Int,
    nazwa: String = "Wiadro hydraulika",
    opis: String = "Opis wiadra",
    odjemnikWytrzymalosciZaUzycie: Int = 2,
    licznikUzyc: Int = 0
) : Przedmiot(nazwa, opis, wytrzymalosc, odjemnikWytrzymalosciZaUzycie, licznikUzyc)
{
    override fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}