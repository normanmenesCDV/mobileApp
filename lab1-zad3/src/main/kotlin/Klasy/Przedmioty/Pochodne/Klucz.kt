package Klasy

import Klasy.Przedmioty.Przedmiot

class Klucz(
    wytrzymalosc: Int,
    nazwa: String = "Klucz supermocy",
    opis: String = "Opis klucza",
    odjemnikWytrzymalosciZaUzycie: Int = 5,
    licznikUzyc: Int = 0
) : Przedmiot(nazwa, opis, wytrzymalosc, odjemnikWytrzymalosciZaUzycie, licznikUzyc)
{
    override fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}