# Tetris

## Sovelluksen tämänhetkinen tila

Tällä hetkellä sovellus ainoastaan luo yhden satunnaisesti valitun palikan. Palikkoja on 7 erilaista. Sovelluksessa ei ole vielä testejä.

## Sovelluksen käyttö

## Komentorivitoiminnot

### Koodin suorittaminen

Koodin pystyy suorittamaan komennolla
```
mvn compile exec:java -Dexec.mainClass=tetris.Main
```

###Testaus

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

[määrittelydokumentti](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/vaatimusmaarittely.md)

[työaikakirjanpito](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/tuntikirjanpito.md)
