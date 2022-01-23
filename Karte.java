public class Karte
{
    private String farbe; 
    private String bild;
    
    public Karte()
    {
        new Karte("Pik", "A");
    }
    
    public Karte(String farbe, String bild) {
        this.farbe = farbe;
        this.bild = bild;
    }
    
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    
    public String gibFarbe() {
        return farbe;
    }
    
    public String gibBild() {
        return bild;
    }
}
