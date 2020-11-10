package com.mycompany.unicafe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KassapaateTest {
    
    Kassapaate kassapaate;
    Maksukortti kortti1;
    Maksukortti kortti2;
    
    @Before
    public void setUp() {
        kassapaate = new Kassapaate();
        kortti1 = new Maksukortti(500);
        kortti2 = new Maksukortti(200);
    }
    
    @Test
    public void kassapaatteenRahamaaraOikein() {
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void myytyjenLounaidenMaaraOikein() {
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty()+kassapaate.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void edullisenKateismaksuRiittavaKassanRahamaaraKasvaa() {
        kassapaate.syoEdullisesti(240);
        assertEquals(100240, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void maukkaanKateismaksuRiittavaKassanRahamaaraKasvaa() {
        kassapaate.syoMaukkaasti(400);
        assertEquals(100400, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void edullisenKateismaksuRiittavaVaihtorahaOikein() {
        assertEquals(60, kassapaate.syoEdullisesti(300));
    }
    
    @Test
    public void maukkaanKateismaksuRiittavaVaihtorahaOikein() {
        assertEquals(100, kassapaate.syoMaukkaasti(500));
    }
    
    @Test
    public void edullisenKateismaksuRiittavaMyydytLounaatKasvaa() {
        kassapaate.syoEdullisesti(240);
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void maukkaanKateismaksuRiittavaMyydytLounaatKasvaa() {
        kassapaate.syoMaukkaasti(400);
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void edullisenKateismaksuEiRiittavaKassanRahamaaraEiMuutu() {
        kassapaate.syoEdullisesti(200);
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void maukkaanKateismaksuEiRiittavaKassanRahamaaraEiMuutu() {
        kassapaate.syoMaukkaasti(200);
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void edullisenKateismaksuEiRiittavaKaikkiRahatPalautetaan() {
        assertEquals(200, kassapaate.syoEdullisesti(200));
    }
    
    @Test
    public void maukkaanKateismaksuEiRiittavaKaikkiRahatPalautetaan() {
        assertEquals(300, kassapaate.syoMaukkaasti(300));
    }
    
    @Test
    public void edullisenKateismaksuEiRiittavaMyydytLounaatEiNouse() {
        kassapaate.syoEdullisesti(200);
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void maukkaanKateismaksuEiRiittavaMyydytLounaatEiNouse() {
        kassapaate.syoMaukkaasti(200);
        assertEquals(0, kassapaate.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void edullisenKorttimaksuRiittavaSummaVeloitetaanKortilta() {
        kassapaate.syoEdullisesti(kortti1);
        assertEquals(260, kortti1.saldo());
    }
    
    @Test
    public void maukkaanKorttimaksuRiittavaSummaVeloitetaanKortilta() {
        kassapaate.syoMaukkaasti(kortti1);
        assertEquals(100, kortti1.saldo());
    }
    
    @Test
    public void edullisenKorttimaksuRiittavaPalauttaaTrue() {
        assertEquals(true, kassapaate.syoEdullisesti(kortti1));
    }
    
    @Test
    public void maukkaanKorttimaksuRiittavaPalauttaaTrue() {
        assertEquals(true, kassapaate.syoMaukkaasti(kortti1));
    }
    
    @Test
    public void edullisenKorttimaksuRiittavaMyydytLounaatNousee() {
        kassapaate.syoEdullisesti(kortti1);
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void maukkaanKorttimaksuRiittavaMyydytLounaatNousee() {
        kassapaate.syoMaukkaasti(kortti1);
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void edullisenKorttimaksuEiRiittavaKortinRahamaaraEiMuutu() {
        kassapaate.syoEdullisesti(kortti2);
        assertEquals(200, kortti2.saldo());
    }
    
    @Test
    public void maukkaanKorttimaksuEiRiittavaKortinRahamaaraEiMuutu() {
        kassapaate.syoMaukkaasti(kortti2);
        assertEquals(200, kortti2.saldo());
    }
    
    @Test
    public void edullisenKorttimaksuEiRiittavaMyydytLounaatEiNouse() {
        kassapaate.syoEdullisesti(kortti2);
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void maukkaanKorttimaksuEiRiittavaMyydytLounaatEiNouse() {
        kassapaate.syoMaukkaasti(kortti2);
        assertEquals(0, kassapaate.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void edullisenKorttimaksuEiRiittavaPalauttaaFalse() {
        assertEquals(false, kassapaate.syoEdullisesti(kortti2));
    }
    
    @Test
    public void maukkaanKorttimaksuEiRiittavaPalauttaaFalse() {
        assertEquals(false, kassapaate.syoMaukkaasti(kortti2));
    }
    
    @Test
    public void edullisenKorttimaksuRiittavaKassaPysyySamana() {
        kassapaate.syoEdullisesti(kortti1);
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void maukkaanKorttimaksuRiittavaKassaPysyySamana() {
        kassapaate.syoMaukkaasti(kortti1);
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void ladattaessaRahaaKortilleKortinSaldoMuuttuu() {
        kassapaate.lataaRahaaKortille(kortti1, 100);
        assertEquals(600, kortti1.saldo());
    }
    
    @Test
    public void ladattaessaRahaaKortilleKassanRahamaaraKasvaa() {
        kassapaate.lataaRahaaKortille(kortti1, 100);
        assertEquals(100100, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void josKortilleLadataanNegatiivinenSummaKassanRahamaaraEiKasva() {
        kassapaate.lataaRahaaKortille(kortti1, -10);
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
}
