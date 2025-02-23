#pragma once
#include <bits/stdc++.h>

using namespace std;

class Petshop{

    private:
        string id;
        string namaProduk;
        string kategoriProduk;
        int hargaProduk;
        bool fotoProduk;

    public:
        //constructor class
        Petshop(string id, string namaProduk, string kategoriProduk, int hargaProduk, bool fotoProduk){
            this->id = id;
            this->namaProduk = namaProduk;
            this->kategoriProduk = kategoriProduk;
            this->hargaProduk = hargaProduk;
            this->fotoProduk = fotoProduk;
        }

        //=========== SETTER AND GETTER SECTIONS ============
        void setId(string id){
            this->id = id;
        }

        void setNamaProduk(string namaProduk){
            this->namaProduk = namaProduk;
        }

        void setKategoriProduk(string kategoriProduk){
            this->kategoriProduk = kategoriProduk;
        }

        void setHargaProduk(int hargaProduk){
            this->hargaProduk = hargaProduk;
        }

        void setFotoProduk(bool fotoProduk){
            this->fotoProduk = fotoProduk;
        }

        string getId(){
            return this->id;
        }

        string getNamaProduk(){
            return this->namaProduk;
        }

        string getKategoriProduk(){
            return this->kategoriProduk;
        }

        int getHargaProduk(){
            return this->hargaProduk;
        }

        bool getFotoProduk(){
            return this->fotoProduk;
        }

        //==================== METHOD SECTION ====================

        //method for showing product information
        void showProduct(){
            cout << "| ID Produk : " << this->id << endl;
            cout << "| Nama Produk : " << this->namaProduk << endl;
            cout << "| Kategori Produk : " << this->kategoriProduk << endl;
            cout << "| Harga Produk : " << this->hargaProduk << endl;
            cout << "| Foto Produk : " << this->fotoProduk << endl;
            cout << "=======================================" << endl;
        }

        //method for editing a product (except ID)
        void editProduct(string namaProduk, string kategoriProduk, int hargaProduk, bool fotoProduk){
            this->namaProduk = namaProduk;
            this->kategoriProduk = kategoriProduk;
            this->hargaProduk = hargaProduk;
            this->fotoProduk = fotoProduk;
        }

        //`destructor class

        ~Petshop(){
        }
        
};