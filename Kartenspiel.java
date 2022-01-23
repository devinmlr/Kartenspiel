import java.lang.Math;

public class Kartenspiel
{
    Karte[] kartendeck = new Karte[32];
    
    public Kartenspiel()
    {
        String[] farbe = new String[4];
        String[] bild = new String[8];
        farbe[0] = "Pik";
        farbe[1] = "Kreuz";
        farbe[2] = "Karo";
        farbe[3] = "Herz";
        bild[0] = "7";
        bild[1] = "8";
        bild[2] = "9";
        bild[3] = "10";
        bild[4] = "B";
        bild[5] = "D";
        bild[6] = "K";
        bild[7] = "A";
        int z=0;
        for (int i = 0; i<farbe.length; i++) {
            for (int f = 0; f < bild.length; f++) {
                    kartendeck[z] = new Karte(farbe[i], bild[f]);
                    z++;
            }
        }
    }
    
    public void mischen() {
        Karte h;
        for (int i=0; i<32; i++) {
            int num1 = (int)(Math.random()*32);
            int num2 = (int)(Math.random()*32);
            h = kartendeck[num1];
            kartendeck[num1] = kartendeck[num2];
            kartendeck[num2] = h;
        }
    }
    
    public boolean vorhanden(String farbe, String bild) {
        for (int i=0; i<kartendeck.length; i++) {
            if (kartendeck[i].gibFarbe() == farbe) {
                if (kartendeck[i].gibBild() == bild) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void aussortieren (String farbe) {
        for (int i=0; i<kartendeck.length; i++) {
            if (kartendeck[i].gibFarbe() == farbe) {
                kartendeck[i].setFarbe(null);
            }
        }
    }
}
