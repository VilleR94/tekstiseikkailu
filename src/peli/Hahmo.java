package peli;

public class Hahmo {
 
 
 //Atribuutit
 public static String nimi;
 public static String hahmotyyppi;
 public static int hp;
 public static double damage;
 
   //Havainnointimetodit
 
 public static String annaNimi(){
  return nimi;
 }
 public static String annaHahmotyyppi(){
  return hahmotyyppi;
 }
 public static int annaHp(){
  return hp;
 } 
 public static double annaDamage(){
  return damage;
 }
 
 
 //Metodi hahmon luontiin
 public static void luoHahmo(String nimi, String hahmotyyppi, int hp, double damage){
 
  System.out.println("Anna hahmollesi nimi");
  nimi = In.readString();
 
  System.out.println("Valitse hahmotyyppi. Hahmotyyppej� on kolme erilaista; Taistelija, Jousiampuja ja Velho");
  System.out.println("Taistelija: Vahva heppu joka kest�� paljon");
  System.out.println("Jousiampuja: Sukkahoususankari joka tekee paljon vahinkoa");
  System.out.println("Velho: Mysteerinen, mutta heikko j�b� joka pystyy aiheuttamaan vahinkoa moneen viholliseen samaan aikaan");
  System.out.println("Sy�t� yksi n�ist�: 'taistelija', 'jousiampuja', 'jokeri'");
  hahmotyyppi = In.readString();
 
   if (hahmotyyppi.equals("taistelija")){
    hp = 60;
    damage = 5;
   }
   if (hahmotyyppi.equals("jousiampuja")){
    hp = 30;
    damage = 15;
   }
   if (hahmotyyppi.equals("jokeri")){
    hp = 45;
    damage = 7;
 }
 System.out.println(nimi + "," + hahmotyyppi + "," + hp + "," + damage);
 }
 
 
 
}