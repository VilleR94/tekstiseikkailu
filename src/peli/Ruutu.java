public class Ruutu{
   
  // ATTRIBUUTIT
  private String vihollinen; //Kuvailee vihollisen (esim. "L?ski ?rkki ilmestyy (50 hp)")
  private int vihHp;
  private String kuvaus; //Taistelun j?lkeen, tai jos ei taistelua, kerrotaan mit? ruudussa on
  private Ruutu poh;
  private Ruutu ita;
  private Ruutu ete;
  private Ruutu lan;
   
  // KONSTRUKTORIT
  //Jos ruudussa vihollinen
  public Ruutu(String vihollinen, int vihHp, String kuvaus){
    this.vihollinen = vihollinen;
    this.vihHp = vihHp;
    this.kuvaus = kuvaus;
  }
  //Jos ei vihollista
  public Ruutu(String kuvaus){
    this.vihollinen = null;
    this.vihHp = 0;
    this.kuvaus = kuvaus;
  }
  //Jos ei edes kuvausta
  public Ruutu(){
    this.vihollinen = null;
    this.vihHp = 0;
    this.kuvaus = "";
  }
   
  //Asetetaan viereiset ruudut
  public void asetaPoh(Ruutu r){
    this.poh = r;
    r.asetaEte(this);
  }
  public void asetaIta(Ruutu r){
    this.ita = r;
    r.asetaLan(this);
  }
  public void asetaEte(Ruutu r){
    this.ete = r;
    r.asetaPoh(this);
  }
  public void asetaLan(Ruutu r){
    this.lan = r;
    r.asetaIta(this);
  }
 
  //Run-metodi, jossa k?yd??n ruutu l?pi.
  public void Run(){
    if (this.vihollinen != null){ //Jos ruudussa vihollinen
      int nykHp = this.vihHp; //Vihollisen hp taistelun ajaksi
      System.out.println(this.vihollinen); //Vihollisen kohtaamisilmoitus
      while (nykHp > 0){ //Taistellaan niin kauan kuin vihollisen hp yli 0
        int omaOsuma = Isku.pelaajaIsku();
        nykHp -= omaOsuma; //V?hennet??n pelaajan isku vihollisen hpsta
        int vihOsuma = Isku.vihollisIsku();
     //   Pelaaja1.asetaHp(Pelaaja1.annaHp()- vihOsuma); //V?hennet??n vihollisen isku omasta hpsta
        if (Pelaaja1.annaHp() <= 0){ //Jos vihollisen ly?nnin j?lkeen pelaajan hp 0, peli loppuu
          System.out.println("Kuolit, h?visit pelin..");
          return;
        }
      }
      System.out.println("Voitit vihollisen!");
      System.out.println(this.kuvaus); //Taistelun votettua tulostetaan ruudun kuvaus, jos sellainen on
    } else{
      System.out.println(this.kuvaus);
    }
    boolean apu = true;
    String valinta = "";
    while (apu){ //Toistetaan kunnes pelaajan seuraava komento oikeanlainen
      valinta = In.readString();
      if (!valinta.equals("pohjoinen")||!valinta.equals("it?")||!valinta.equals("etel?")||!valinta.equals("l?nsi")||
          !valinta.equals("help")||!valinta.equals("tallenna")||!valinta.equals("lataa")){
        System.out.println("V??r? komento. Kirjoita help avataksesi komentolistan");
      } else{
        if (valinta.equals("pohjoinen")){ //Jos pelaaja haluaa liikkua pohjoiseen
          if (this.poh = null){ //Tarkistaa onko t?m?n hetken ruudulla pohjoista ruutua
            System.out.println("Et p??se pohjoiseen");
          } else{
            apu = false; //Komento oikeanlainen, while-loop voidaan keskeytt??
            this.poh.Run();
          }
        }
        if (valinta.equals("it?")){ //Jos it??n jne..
          if (this.ita = null){
            System.out.println("Et p??se it??n");
          } else{
            apu = false;
            this.ita.Run();
          }
        }
        if (valinta.equals("etel?")){
          if (this.ete = null){
            System.out.println("Et p??se etel??n");
          } else{
            apu = false;
            this.ete.Run();
          }
        }
        if (valinta.equals("l?nsi")){
          if (this.lan = null){
            System.out.println("Et p??se l?nteen");
          } else{
            apu = false;
            this.lan.Run();
          }
        }
        if (valinta.equals("help")){ //Tulostus, jos pelaaja kirjoittaa help
          //Jotain...
        }
        if (valinta.equals("tallenna")){ //...
          //Jotain...
        }
        if (valinta.equals("lataa")){
          //Jotain...
        }
      }
    }
  }
}