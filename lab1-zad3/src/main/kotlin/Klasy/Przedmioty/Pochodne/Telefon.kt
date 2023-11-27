package Klasy

import Klasy.Przedmioty.Przedmiot

class Telefon(
    wytrzymalosc: Int,
    nazwa: String = "Telefon łącznika",
    opis: String = "Opis telefonu",
    odjemnikWytrzymalosciZaUzycie: Int = 3,
    licznikUzyc: Int = 0
) : Przedmiot(nazwa, opis, wytrzymalosc, odjemnikWytrzymalosciZaUzycie, licznikUzyc)
{
    override fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}