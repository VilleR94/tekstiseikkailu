class Tekstiseikkailu{
     
    public static void main(String[] args) {
 
    
 
        System.out.println("Hei, tervetuloa peliin");
 
        Hahmo.luoHahmo();
 
        Hahmo hahmo = new Hahmo(Hahmo.annaNimi(), Hahmo.annaHahmotyyppi(), Hahmo.annaHp(), Hahmo.annaDamage());
 
        System.out.println("Hahmosi nimi: " + nimi + ", tyyppi: " + hahmotyyppi + ", hp: " + hp + ", damage: " + damage);
 
    }
     
 
}