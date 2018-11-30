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
public class Supplier {

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
     * @return the Nama_Toko
     */
    public char getNama_Toko() {
        return Nama_Toko;
    }

    /**
     * @param Nama_Toko the Nama_Toko to set
     */
    public void setNama_Toko(char Nama_Toko) {
        this.Nama_Toko = Nama_Toko;
    }

    /**
     * @return the Alamat
     */
    public char getAlamat() {
        return Alamat;
    }

    /**
     * @param Alamat the Alamat to set
     */
    public void setAlamat(char Alamat) {
        this.Alamat = Alamat;
    }
    private int id_Supplier;
    private char Nama_Toko;
    private char Alamat;
}
