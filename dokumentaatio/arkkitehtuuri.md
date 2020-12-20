# Arkkitehtuurikuvaus

## Rakenne

Koodin pakkausrakenne on seuraava:

<img src="https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/kuvat/pakkauskaavio.png">

Pakkauksesta tetris.ui löytyy JavaFX:llä tehty käyttöliittymä ja pakkauksesta tetris.application löytyy sovelluslogiikka.

## Käyttöliittymä

Käyttöliittymää on pyritty eriyttämään mahdollisimman paljon sovelluslogiikasta. Se on toteutettu luokassa [tetris.ui.TetrisUI](https://github.com/Jannepen/ot-harjoitustyo/blob/master/Tetris/src/main/java/tetris/ui/TetrisUi.java). 

Käyttöliittymä on tehty [Scenen](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/Scene.html) avulla. Lisäämällä tai poistamalla asiota Sceneen sijoitetusta [Group](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/Group.html)-oliosta voidaan muuttaa näkymää halutun kaltaiseksi. Pelin aikana käyttöliittymä kutsuu [Piece](https://github.com/Jannepen/ot-harjoitustyo/blob/master/Tetris/src/main/java/tetris/application/Piece.java)-luokan metodeja.

## Sovelluslogiikka

Sovelluslogiikasta vastaavat luokat Piece ja Field.

<img src="https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/kuvat/luokkakaavio.png">
