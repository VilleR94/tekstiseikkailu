package peli;

class Isku {
  public static int pelaajaIsku(){
        int omaisku = (1 + (int)(Math.random() * ((6 - 1) + 1)));       // Omat iskut
        return omaisku;
    }
  
  public static int vihollisIsku(){
        int vihuisku = ((1 + (int)(Math.random() * ((6 - 1) + 1)))/3);   // Vihollisen tekem� damage, 1/3 pelaajan tekem�st�    
        return vihuisku;
  }
  public static int annaHp(){            // Pelaajan oma hp;     pelaaja1??
    return 200;
  }
  

  }

  
  
  

