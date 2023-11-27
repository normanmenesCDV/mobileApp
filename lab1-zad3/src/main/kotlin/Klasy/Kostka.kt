package Klasy

import kotlin.random.Random

const val MAX_LICZBA_OCZEK: Int = 20;

class Kostka(val maxLiczbaOczek: Int = MAX_LICZBA_OCZEK) {

    fun wykonajRzut(): Int {
        return Random.nextInt(1, maxLiczbaOczek);
    }
}