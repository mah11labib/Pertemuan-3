/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labib;

/**
 *
 * @author UsEr
 */
public class RunNilai {
  public static void main(String[] args) {
        labib.MasterNilai P = new labib.MasterNilai();
        System.out.println("=========================================");
        
        //prosedure
        System.out.println("\t\tHasil Nilai Kelulusan");
        P.kelulusan("Mahlabib kafi Rizal", 80);
        System.out.println("=========================================");
        
        //fungsi
        System.out.println("\t\tHasil Nilai Kelulusan");
        System.out.println(P.nilailulus("Mahlabib Kafi Rizal", 80, ""));
        System.out.println("=========================================");
        
        //static prosedure
        System.out.println("\t\tHasil Nilai Kelulusan");
        labib.MasterNilai.hasilkelulusan("Mahlabib Kafi Rizal", 80);
        System.out.println("=========================================");
        
        //static fungsi
        System.out.println("\t\tHasil Nilai Kelulusan");
        System.out.println(labib.MasterNilai.nilailulusan("Mahlabib kafi rizal", 80, ""));
        System.out.println("=========================================");
    }
}   

