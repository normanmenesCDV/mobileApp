package Klasy.UI.Pochodne

import Klasy.UI.UI

class MenuGlowne(
) : UI(
    mapOf(
        "1" to "Dodaj przedmiot",
        "2" to "Usuń przedmiot",
        "3" to "Użyj przedmiotu",
        "4" to "Wyświetl szczegóły przedmiotu",
        "5" to "Wyświetl cały ekwipunek"
    ).toMutableMap(),
    "Operacje na ekwipunku",
    "Wyjdź z programu."
)