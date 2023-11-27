package Klasy.UI.Pochodne

import Klasy.UI.UI

class WyborTypuPrzedmiotu(
) : UI(
    Klasy.TypowPrzedmiotow().ToMap().toMutableMap(),
    "Wybierz typ przedmiotu",
    "Cofnij"
)