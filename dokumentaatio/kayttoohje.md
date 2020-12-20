# Käyttöohje

## Ohjelman lataus

Lataa tiedosto Tetris.jar

## Ohjelman käynnistys

Ohjelma käynnistyy komennolla

```
java -jar Tetris.jar
```

Peli alkaa heti ohjelman käynnistyttyä.


## Pelaaminen

### Pelin idea

Tarkoituksena on kasata palikoita niin, että saadaan muodostettua kokonaisia rivejä. Kun kentälle muodostuu yksi tai useampi kokonainen rivi, se poistuu kentältä ja sen yläpuolella olevat palikat tippuvat alaspäin.

<img src="https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/kuvat/midgame.png">

### Palikoiden ohjaaminen ja kääntäminen

Palikoiden liikuttelu tapahtuu nuolinäppäimillä.

<img src="https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/kuvat/arrowkeys.jpg">

Nuoli ylös: Palikkaa voi kääntää ympäri, painamalla useasti pääsee takaisin alkuperäiseen muotoon.
Nuoli oikealle: Palikka liikkuu yhdellä oikealle
Nuoli vasemmalle: Palikka liikkuu yhdellä vasemmalle
Nuoli alas: Palikka putoaa yhdellä alaspäin
