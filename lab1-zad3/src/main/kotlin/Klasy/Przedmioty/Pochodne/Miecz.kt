package Klasy

import Klasy.Przedmioty.Przedmiot

class Miecz(
    wytrzymalosc: Int,
    nazwa: String = "Miecz rycerza",
    opis: String = "Opis miecza",
    odjemnikWytrzymalosciZaUzycie: Int = 3,
    licznikUzyc: Int = 0
) : Przedmiot(nazwa, opis, wytrzymalosc, odjemnikWytrzymalosciZaUzycie, licznikUzyc)
{
    override fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}