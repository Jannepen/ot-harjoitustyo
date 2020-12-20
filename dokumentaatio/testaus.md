# Testausdokumentti

## Yksikkö- ja integraatiotestaus

### Sovelluslogiikka

Sovelluslogiikkaa, eli pakkauksen [tetris.application](https://github.com/Jannepen/ot-harjoitustyo/tree/master/Tetris/src/main/java/tetris/application) luokkia testaavat seuraavat testit:

- [PieceCreatingTest.java](https://github.com/Jannepen/ot-harjoitustyo/blob/master/Tetris/src/test/java/application/PieceCreatingTest.java)
- [PieceMovementTest.java](https://github.com/Jannepen/ot-harjoitustyo/blob/master/Tetris/src/test/java/application/PieceMovementTest.java)
- [PieceRotatingTest.java](https://github.com/Jannepen/ot-harjoitustyo/blob/master/Tetris/src/test/java/application/PieceRotatingTest.java)
- [PlayingFieldTest.java](https://github.com/Jannepen/ot-harjoitustyo/blob/master/Tetris/src/test/java/application/PlayingFieldTest.java)
- [RectangleHandlingTest.java](https://github.com/Jannepen/ot-harjoitustyo/blob/master/Tetris/src/test/java/application/RectangleHandlingTest.java)

### Testauskattavuus

Käyttöliittymä on jätetty pois testauskattavuusraportista. Sovelluksen testauksen rivikattavuus on 78% ja rivikattavuus 51%

<img src="https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/kuvat/jacoco.png">

Kappaleiden liikkumiseen ja pyörimiseen liittyvät testit ovat hyvin samantyyppisiä toistensa kanssa, jonka vuoksi osa testeistä on jätetty tekemättä. Tämän vuoksi kattavuudet ovat matalia.

## Järjestelmätestaus

Sovellusta on testattu Linux-ympäristössä [käyttöohjeen](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/kayttoohje.md) mukaisesti.

## Mahdolliset ongelmat

Sovellusta on kokeiltu mahdollisimman monilla syötteillä (palikoiden liikuttaminen ja kääntäminen), eikä sitä olla saatu kaatumaan.
