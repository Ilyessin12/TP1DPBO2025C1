<?php

class PetShop {
    // Attributes
    private $id;
    private $namaProduk;
    private $kategoriProduk;
    private $hargaProduk;
    private $fotoProduk; 

    // Constructor
    public function __construct($id, $namaProduk, $kategoriProduk, $hargaProduk, $fotoProduk) {
        $this->id = $id;
        $this->namaProduk = $namaProduk;
        $this->kategoriProduk = $kategoriProduk;
        $this->hargaProduk = $hargaProduk;
        $this->fotoProduk = $fotoProduk;
    }

    // GETTERS AND SETTERS
    // Setters
    public function setId($id) {
        $this->id = $id;
    }

    public function setNamaProduk($namaProduk) {
        $this->namaProduk = $namaProduk;
    }

    public function setKategoriProduk($kategoriProduk) {
        $this->kategoriProduk = $kategoriProduk;
    }

    public function setHargaProduk($hargaProduk) {
        $this->hargaProduk = $hargaProduk;
    }

    public function setFotoProduk($fotoProduk) {
        $this->fotoProduk = $fotoProduk;
    }

    // Getters
    public function getId() {
        return $this->id;
    }

    public function getNamaProduk() {
        return $this->namaProduk;
    }

    public function getKategoriProduk() {
        return $this->kategoriProduk;
    }

    public function getHargaProduk() {
        return $this->hargaProduk;
    }

    public function getFotoProduk() {
        return $this->fotoProduk;
    }

    //METHODS

    public function editProduct($namaProduk, $kategoriProduk, $hargaProduk, $fotoProduk) {
        $this->namaProduk = $namaProduk;
        $this->kategoriProduk = $kategoriProduk;
        $this->hargaProduk = $hargaProduk;
        $this->fotoProduk = $fotoProduk;
    }
}

?>