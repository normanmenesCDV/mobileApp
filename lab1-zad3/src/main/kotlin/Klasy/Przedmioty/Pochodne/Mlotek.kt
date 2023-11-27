package Klasy

import Klasy.Przedmioty.Przedmiot

class Mlotek(
    wytrzymalosc: Int,
    nazwa: String = "Młotek kowala",
    opis: String = "Opis młotka",
    odjemnikWytrzymalosciZaUzycie: Int = 2,
    licznikUzyc: Int = 0
) : Przedmiot(nazwa, opis, wytrzymalosc, odjemnikWytrzymalosciZaUzycie, licznikUzyc)
{
    override fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}