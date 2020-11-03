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

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Guided_Pewarisan_0088 {

    /**
     * @param args the command line arguments
     */
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        // TODO code application logic here
        String noPlat;
        int thnPembuatan, kapasitasPenumpang;
        float dayaAngkut;
        
        Mobil mbl[] = new Mobil[2];
        Truk trk[] = new Truk[2];
        
        try {
            for( int i=0; i<2; i++ ){
                System.out.println("=-=-=-=-= Mobil =-=-=-=-=");
                System.out.println("Masukan No Plat             : "); noPlat = br.readLine();
                System.out.println("Masukan Tahun Pembuatan     : "); thnPembuatan = Integer.parseInt(br.readLine());
                System.out.println("Masukan Kapasitas Penumpang : "); kapasitasPenumpang = Integer.parseInt(br.readLine());
                
                mbl[i] = new Mobil(noPlat, thnPembuatan, kapasitasPenumpang);
                
                System.out.println("=-=-=-=-= Truk =-=-=-=-=");
                System.out.println("Masukan No Plat             : "); noPlat = br.readLine();
                System.out.println("Masukan Tahun Pembuatan     : "); thnPembuatan = Integer.parseInt(br.readLine());
                System.out.println("Masukan Daya Angkut         : "); dayaAngkut = Float.parseFloat(br.readLine());
                
                trk[i] = new Truk(noPlat, thnPembuatan, dayaAngkut);
            }
            
            for( int i=0; i<2; i++ ){
                mbl[i].printDataMobil();
                mbl[i].Bergerak();
                trk[i].printDataTruk();
                trk[i].Bergerak();
            }
        } catch (Exception e) {
        }
    
    }
    
}
