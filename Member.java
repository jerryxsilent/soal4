package bab4;

/**
 *
 * @author JERRY
 */
public class Member {
  private String nama;
     private String team, umur;
     private int tampil, suara, att;
    
    
     
     public void setNama(String n) {
         nama = n;
     }
     
     public String getNama() {
         return nama;
     }
     
     public void setTeam(String t){
         team = t;
     }
     
     public String getTeam(){
         return team;
     }
     
     public void setUmur(String u){
         umur = u;
     }
     
     public String getUmur(){
         return umur;
     }
     
     public void setTampil(int t){
         tampil = t;
     }
     
     public void setSuara(int s){
         suara = s;
     }
     
     public void setA(int a){
         att = a;
     }
     
     public double getTotal(){
         return (tampil+suara+att) / 3;
     }
 }