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
class siswa extends induksekolah {
    private int absen;
    private String kelas;
    
    public siswa(int absen, String kelas, String namasiswa, int umur){
        super(namasiswa, umur);
        this.absen = absen;
        this.kelas = kelas;
    }
    public void info(){
        System.out.println("Absen: "+this.absen);
        System.out.println("kelas: "+this.kelas);
        super.info();
    }
}
