package Klasy

import Klasy.Przedmioty.Przedmiot

class PierscienWladzy(
    wytrzymalosc: Int,
    nazwa: String = "Pierścień władzy",
    opis: String = "Opis pierścienia",
    odjemnikWytrzymalosciZaUzycie: Int = 8,
    licznikUzyc: Int = 0
) : Przedmiot(nazwa, opis, wytrzymalosc, odjemnikWytrzymalosciZaUzycie, licznikUzyc)
{
    override fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}