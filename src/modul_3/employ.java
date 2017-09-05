/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_3;

/**
 *
 * @author Ser Veresta
 */
class employ extends person{
    private String nokaryawan;
    
    public employ(String nokaryawan, String nama, int usia){
        super(nama, usia);
        this.nokaryawan = nokaryawan;
    }
    
    public void info(){
        System.out.println("No.Karyawan : "+this.nokaryawan);
        super.info();
    }
}
