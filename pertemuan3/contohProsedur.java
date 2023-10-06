/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author pc20
 */
public class contohProsedur {

    int alas = 10;
    int tinggi = 12;
    void hitungLuasJajargenjang (){
        int luas = alas * tinggi;
        System.out.println("alas = " + tinggi );
        System.out.println("Luas Jajargenjang" + luas);
    }
    public static void main(String[] args){
        contohProsedur P = new contohProsedur();
        P.hitungLuasJajargenjang();
    }
}

