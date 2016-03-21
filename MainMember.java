package bab4;

import java.util.ArrayList;

/**
 *
 * @author JERRY
 */
public class MainMember {
  static ArrayList<Member> listMember = new ArrayList();
 
     public static void main(String[] args) {
         inputData("Jerry", "B", "18",90,80,95);
         inputData("Eko", "A", "15",87,90,93);
         inputData("Widianto", "B", "17",85,90,80);
         inputData("X Silent", "A", "18",80,83,90);
         System.out.println("Data Member :");
         System.out.println("=================================");
         for (Member data : getAll()) {
             System.out.println("Nama: " + data.getNama());
             System.out.println("Team: " + data.getTeam());
             System.out.println("Umur: " + data.getUmur());
             System.out.println("Rata-rata nilai: " + data.getTotal());
             System.out.println("-----------------------------");
         }
     }
     
     public static void inputData(String n, String t, String u, int a, int b, int c) {
         Member data = new Member();
         data.setNama(n);
         data.setTeam(t);
         data.setUmur(u);
         data.setTampil(a);
         data.setSuara(b);
         data.setA(c);
         listMember.add(data);
     }
 
     public static ArrayList<Member> getAll() {
         return listMember;
     }
 }


