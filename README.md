# Tetris

## Sovelluksen tämänhetkinen tila

Tällä hetkellä sovellus ainoastaan luo yhden satunnaisesti valitun palikan, jota voi pyörittää ympäri(painamalla ylös nuolinäppäintä). Palikkoja on 7 erilaista.

## Komentorivitoiminnot

### Koodin suorittaminen

Koodin pystyy suorittamaan komennolla
```
mvn compile exec:java -Dexec.mainClass=tetris.Main
```

### Testaus

Testit suoritetaan komennolla
```
mvn test
```
Testikattavuusraportti saadaan komennolla
```
mvn jacoco:report
```

### Suoritettavan jar-tiedoston tekeminen

Suoritetaan komento 
```
mvn package
```
nyt hakemistossa target on suoritettava jar-tiedosto Tetris-1.0-SNAPSHOT.jar

## Dokumentaatio

[Määrittelydokumentti](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/vaatimusmaarittely.md)

[Työaikakirjanpito](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/tuntikirjanpito.md)

[Arkkitehtuurikuvaus](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/arkkitehtuuri.md)
