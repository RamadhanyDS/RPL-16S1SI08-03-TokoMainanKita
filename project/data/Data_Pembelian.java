/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpl_03;

/**
 *
 * @author ASUS ROG
 */
public class Data_Pembelian {

    /**
     * @return the id_Pembelian
     */
    public int getId_Pembelian() {
        return id_Pembelian;
    }

    /**
     * @param id_Pembelian the id_Pembelian to set
     */
    public void setId_Pembelian(int id_Pembelian) {
        this.id_Pembelian = id_Pembelian;
    }

    /**
     * @return the id_Karyawan
     */
    public int getId_Karyawan() {
        return id_Karyawan;
    }

    /**
     * @param id_Karyawan the id_Karyawan to set
     */
    public void setId_Karyawan(int id_Karyawan) {
        this.id_Karyawan = id_Karyawan;
    }

    /**
     * @return the id_Supplier
     */
    public int getId_Supplier() {
        return id_Supplier;
    }

    /**
     * @param id_Supplier the id_Supplier to set
     */
    public void setId_Supplier(int id_Supplier) {
        this.id_Supplier = id_Supplier;
    }

    /**
     * @return the Tanggal
     */
    public char getTanggal() {
        return Tanggal;
    }

    /**
     * @param Tanggal the Tanggal to set
     */
    public void setTanggal(char Tanggal) {
        this.Tanggal = Tanggal;
    }

    /**
     * @return the Total_Pembelian
     */
    public int getTotal_Pembelian() {
        return Total_Pembelian;
    }

    /**
     * @param Total_Pembelian the Total_Pembelian to set
     */
    public void setTotal_Pembelian(int Total_Pembelian) {
        this.Total_Pembelian = Total_Pembelian;
    }
    private int id_Pembelian;
    private int id_Karyawan;
    private int id_Supplier;
    private char Tanggal;
    private int Total_Pembelian;
    
    
    
}
