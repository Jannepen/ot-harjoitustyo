package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void kortinSaldoAlussaOikein() {
        assertEquals("saldo: 0.10", kortti.toString());
    }
    
    @Test
    public void rahanLataaminenToimii() {
        kortti.lataaRahaa(300);
        assertEquals("saldo: 3.10", kortti.toString());
    }
    
    @Test
    public void saldoVaheneeJosRahaaTarpeeksi() {
        kortti.otaRahaa(5);
        assertEquals("saldo: 0.5", kortti.toString());
    }
    
    @Test
    public void saldoEiMuutuJosRahaaEiTarpeeksi() {
        kortti.otaRahaa(20);
        assertEquals("saldo: 0.10", kortti.toString());
    }
    
    @Test
    public void otaRahaaPalauttaaTrueJosRahaaOn() {
        assertEquals(true, kortti.otaRahaa(5));
    }
    
    @Test
    public void otaRahaaPalauttaaFalseJosRahaaEiOle() {
        assertEquals(false, kortti.otaRahaa(20));
    }
    
    @Test
    public void saldoPalauttaaSaldon() {
        assertEquals(10, kortti.saldo());
    }
}
