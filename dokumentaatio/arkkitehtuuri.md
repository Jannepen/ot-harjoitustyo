# Arkkitehtuurikuvaus

## Rakenne

Koodin pakkausrakenne on seuraava:

<img src="https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/kuvat/pakkauskaavio.png">

Pakkauksesta tetris.ui löytyy JavaFX:llä tehty käyttöliittymä ja pakkauksesta tetris.application löytyy sovelluslogiikka.

## Käyttöliittymä

Käyttöliittymä on pyritty eriyttämään täysin sovelluslogiikasta. Se on toteutettu luokassa [tetris.ui.TetrisUI](https://github.com/Jannepen/ot-harjoitustyo/blob/master/Tetris/src/main/java/tetris/ui/TetrisUi.java).

## Sovelluslogiikka

Sovelluslogiikasta vastaavat luokat Piece ja Field.

<img src="https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/kuvat/luokkakaavio.png">
