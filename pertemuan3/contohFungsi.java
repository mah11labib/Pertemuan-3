/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author pc20
 */
public class contohFungsi {
        int alas = 5, tinggi= 8;
        
        int hitungLuasJajargenjang(){
            int luas = alas * tinggi;
        System.out.println("alas =" + tinggi);
        return luas;
    }
  public static void main(String[] args){
      contohFungsi F = new contohFungsi ();
        System.out.println("Luas Jajargenjang =" + F.hitungLuasJajargenjang());
    }
}
