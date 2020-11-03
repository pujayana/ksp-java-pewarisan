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
public class Mobil extends KendaraanBermotor{
    
    private int kapasitasPenumpang;
    
    public Mobil(String noPlat, int thnPembuatan, int kapasitasPenumpang){
        super(noPlat, thnPembuatan);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    
    public void printDataMobil(){
        System.out.println("Print Data Mobil :\n No Plat : " + noPlat + "\n Tahun Pembuatan : " + thnPembuatan + "\n Kapasitas : " + kapasitasPenumpang);
    }
    
}
