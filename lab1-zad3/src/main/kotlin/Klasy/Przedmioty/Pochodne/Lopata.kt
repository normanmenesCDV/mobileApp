package Klasy

import Klasy.Przedmioty.Przedmiot

class Lopata(
    wytrzymalosc: Int,
    nazwa: String = "Łopata grabarza",
    opis: String = "Opis łopaty",
    odjemnikWytrzymalosciZaUzycie: Int = 1,
    licznikUzyc: Int = 0
) : Przedmiot(nazwa, opis, wytrzymalosc, odjemnikWytrzymalosciZaUzycie, licznikUzyc)
{
    override fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}