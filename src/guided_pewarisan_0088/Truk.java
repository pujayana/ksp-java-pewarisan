/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guided_pewarisan_0088;

/**
 *
 * @author pujayana
 */
public class Truk extends KendaraanBermotor {
    
    private float dayaAngkut;
    
    public Truk(String noPlat, int thnPembuatan, float dayaAngkut){
        super(noPlat, thnPembuatan);
        this.dayaAngkut = dayaAngkut;
    }
    
    public void printDataTruk(){
        System.out.println("Print Data Mobil :\n No Plat :" + noPlat + "\n Tahun Pembuatan : " + thnPembuatan + "\n Daya : " + dayaAngkut);
    }
    
}
