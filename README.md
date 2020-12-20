# Tetris

## Sovellus

Sovellus on klassikkopeli tetris. Pelin tarkoituksena on kerätä pisteitä poistamalla vaakasuoraan muodostuvia kokonaisia rivejä.

## Komentorivitoiminnot

### Koodin suorittaminen

Koodin pystyy suorittamaan komennolla
```
mvn compile exec:java -Dexec.mainClass=tetris.Main
```

### Testaus

Sovellusta testataan komennolla
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
nyt hakemistosta target löytyy jar-tiedosto Tetris-1.0-SNAPSHOT.jar

### Checkstyle

checkstyle.xml määrittelemät tarkistukset suoritetaan komennolla
```
mvn jxr:jxr checkstyle:checkstyle
```

### JavaDoc

JavaDoc luodaan komennolla
```
mvn javadoc:javadoc
```

## Dokumentaatio

[Määrittelydokumentti](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/vaatimusmaarittely.md)

[Työaikakirjanpito](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/tuntikirjanpito.md)

[Arkkitehtuurikuvaus](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/arkkitehtuuri.md)

[Testausdokumentti](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/testaus.md)

[Käyttöohje](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/kayttoohje.md)

## Releaset

[Viikko 5](https://github.com/Jannepen/ot-harjoitustyo/releases/tag/viikko5)

[Loppupalautus](https://github.com/Jannepen/ot-harjoitustyo/releases/tag/Loppupalautus)
