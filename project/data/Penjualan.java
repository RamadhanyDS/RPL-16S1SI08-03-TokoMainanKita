/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokomainankita;



/**
 *
 * @author windows10
 */
public class Penjualan {
    private int id_penjualan;
    private int id_karyawan;
    private char tanggal;
    private int total;
    private int id_pelanggan;

    /**
     * @return the id_penjualan
     */
    public int getId_penjualan() {
        return id_penjualan;
    }

    /**
     * @param id_penjualan the id_penjualan to set
     */
    public void setId_penjualan(int id_penjualan) {
        this.id_penjualan = id_penjualan;
    }

    /**
     * @return the id_karyawan
     */
    public int getId_karyawan() {
        return id_karyawan;
    }

    /**
     * @param id_karyawan the id_karyawan to set
     */
    public void setId_karyawan(int id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    /**
     * @return the tanggal
     */
    public char getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(char tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the id_pelanggan
     */
    public int getId_pelanggan() {
        return id_pelanggan;
    }

    /**
     * @param id_pelanggan the id_pelanggan to set
     */
    public void setId_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }
    
}
