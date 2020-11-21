/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan57.vehicle;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class Vehicle {
     private String myBrand;
    private String myMOdel;

    public Vehicle(String myBrand, String myMOdel) {
        this.myBrand = myBrand;
        this.myMOdel = myMOdel;
    }

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMyMOdel() {
        return myMOdel;
    }

    public void setMyMOdel(String myMOdel) {
        this.myMOdel = myMOdel;
    } 
}
