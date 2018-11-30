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
public class Barang {
    private int id_barang;
    private int id_supplier;
    private String nama;
    private char stok_barang;

    /**
     * @return the id_barang
     */
    public int getId_barang() {
        
        return id_barang;
    }

    /**
     * @param id_barang the id_barang to set
     */
    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    /**
     * @return the id_supplier
     */
    public int getId_supplier() {
        return id_supplier;
    }

    /**
     * @param id_supplier the id_supplier to set
     */
    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the stok_barang
     */
    public char getStok_barang() {
        return stok_barang;
    }

    /**
     * @param stok_barang the stok_barang to set
     */
    public void setStok_barang(char stok_barang) {
        this.stok_barang = stok_barang;
    }
    
}
