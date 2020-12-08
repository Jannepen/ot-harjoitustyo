# Tetris

## Viikko 6 tarkastaja: tällä viikolla työ ei ole edennyt joten voit pistää 0p.

## Sovelluksen tämänhetkinen tila

Tällä hetkellä sovellus luo satunnaisesti valittuja palikoita, joita voidaan pudottaa pohjalle painamalla alas nuolinäppäintä. Palikoita pystyy myös liikuttamaan oikealle ja vasemmalle nuolinäppäimillä, sekä pyörittää palikkaa ympäri painamalla ylös nuolinäppäintä. Uusi palikka syntyy, kun palikka osuu maahan ja käyttäjä painaa alas nuolinäppäintä. Palikoita ei vielä pysty kasaamaan, sillä ne eivät reagoi toisiinsa.

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

### Checkstyle

checkstyle.xml määrittelemät tarkistukset suoritetaan komennolla
```
mvn jxr:jxr checkstyle:checkstyle
```
Virheilmoitukset saadaan avaamalla tiedosto target/site/checkstyle.html

## Dokumentaatio

[Määrittelydokumentti](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/vaatimusmaarittely.md)

[Työaikakirjanpito](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/tuntikirjanpito.md)

[Arkkitehtuurikuvaus](https://github.com/Jannepen/ot-harjoitustyo/blob/master/dokumentaatio/arkkitehtuuri.md)

## Releaset

[Viikko 5](https://github.com/Jannepen/ot-harjoitustyo/releases/tag/viikko5)
