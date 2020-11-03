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
public class KendaraanBermotor {
    protected String noPlat;
    protected int thnPembuatan;
    
    public KendaraanBermotor(String noPlat, int thnPembuatan){
        this.noPlat = noPlat;
        this.thnPembuatan = thnPembuatan;
    }
    
    public String getNoPlat(){
        return noPlat;
    }
    
    public int getThnPembuatan(){
        return thnPembuatan;
    }
    
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    
    public void setNoPlat(int thnPembuatan){
        this.thnPembuatan = thnPembuatan;
    }
    
    public void Bergerak(){
        System.out.println("Kendaraan Bermotor : Bergerak");
    }
}
