package Klasy.Przedmioty

abstract class Przedmiot(
    protected val nazwa: String,
    protected val opis: String,
    protected var wytrzymalosc: Int,
    protected val odjemnikWytrzymalosciZaUzycie: Int,
    protected var licznikUzyc: Int = 0
)
{
    val getNazwa: String
        get() {
            return nazwa;
        }

    val getWytrzymalosc: Int
        get() {
            return wytrzymalosc;
        }

    val getLicznikUzyc: Int
        get() {
            return licznikUzyc;
        }

    val getOdjemnikWytrzymalosciZaUzycie: Int
        get() {
            return odjemnikWytrzymalosciZaUzycie;
        }

    open fun uzyj(){
        licznikUzyc++;
        wytrzymalosc -= odjemnikWytrzymalosciZaUzycie;
    }
}

