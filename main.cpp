#include "PetShop.cpp"

using namespace std;

int main(){

    bool status = false;
    vector<Petshop> petshop; //uses a vector to store the products

    //use a while loop to display the menu, stop the loop when the user chooses to exit by submitting 6
    while(status == false){
        int option = 0;
        bool idAvailable = false;
        cout << "=============================================" << endl;
        cout << "|Selamat Datang di Program Manajemen Petshop|" << endl;
        cout << "=============================================" << endl;
        cout << "| 1. Tambah Produk                          |" << endl;
        cout << "| 2. Hapus Produk                           |" << endl;
        cout << "| 3. Lihat Produk                           |" << endl;
        cout << "| 4. Cari Produk                            |" << endl;
        cout << "| 5. Ubah Produk                            |" << endl;
        cout << "| 6. Keluar                                 |" << endl;
        cout << "=============================================" << endl;
        cout << "Pilih Menu > ";
        cin >> option;

        string id, namaProduk, kategoriProduk;
        int hargaProduk;
        bool fotoProduk;

        if(option == 1){ //add a product
            cout << "Anda Memilih Untuk Tambah Produk" << endl;
            cout << "ID > ";
            cin >> id;
            for(int i = 0; i < petshop.size(); i++){
                if(petshop[i].getId() == id){
                    idAvailable = true;
                }
            }

            //safeguarding the input for the ID
            if(idAvailable){
                cout << "ID sudah digunakan, silahkan gunakan ID lain" << endl;
                continue;
            }

            cout << "Nama Produk > ";
            cin >> namaProduk;
            cout << "Kategori Produk > ";
            cin >> kategoriProduk;
            cout << "Harga Produk > ";
            cin >> hargaProduk;
            cout << "Foto Produk (1/0) > ";
            cin >> fotoProduk;
            //safeguarding the input for the photo
            if(fotoProduk != 1 && fotoProduk != 0){
                cout << "Invalid Input, don't try anything funny here" << endl;
                continue;
            }


            Petshop produk(id, namaProduk, kategoriProduk, hargaProduk, fotoProduk);
            petshop.push_back(produk);
            cout << "Produk dengan id " << id << " berhasil ditambahkan" << endl;
        }

        else if(option == 2){ //delete a product
            cout << "Anda Memilih Untuk Hapus Produk" << endl;
            cout << "ID Produk yang akan dihapus > ";
            cin >> id;

            //iterate through the vector to find the product with the specified ID
            for(int i = 0; i < petshop.size(); i++){
                if(petshop[i].getId() == id){
                    petshop.erase(petshop.begin() + i);
                    idAvailable = true;
                }
            }
            //for invalid ID input
            if(!idAvailable){
                cout << "Produk dengan id " << id << " tidak ditemukan" << endl;
            }
            else{
                cout << "Produk dengan id " << id << " berhasil dihapus" << endl;
            }
        }

        else if(option == 3){ //display all products
            cout << endl;
            cout << "Anda Memilih Untuk Lihat Produk" << endl;
            cout << "=======================================" << endl;
            cout << "| Katalog Produk                      |" << endl;
            cout << "=======================================" << endl;
            //iterate through the vector to display all products
            for(int i = 0; i < petshop.size(); i++){
                petshop[i].showProduct();
            }
        }

        else if(option == 4){ //search for a product
            cout << "Anda Memilih Untuk Cari Produk" << endl;
            cout << "ID Produk yang dicari : ";
            cin >> id;

            //uses sequential search to find the product with the specified ID
            for(int i = 0; i < petshop.size(); i++){
                if(petshop[i].getId() == id){
                    petshop[i].showProduct();
                    idAvailable = true;
                }
            }
            //for invalid ID input
            if(!idAvailable){
                cout << "Produk dengan id " << id << " tidak ditemukan" << endl;
            }
        }
        else if(option == 5){ //edit the product
            cout << "Ubah Produk" << endl;
            cout << "ID Produk yang akan diubah : ";
            cin >> id;
            
            for(int i = 0; i < petshop.size(); i++){
                if(petshop[i].getId() == id){
                    idAvailable = true;
                }
            }

            if(!idAvailable){ //for invalid ID input
                cout << "Produk dengan id " << id << " tidak ditemukan" << endl;
                continue;
            }

            cout << "Nama Produk > ";
            cin >> namaProduk;
            cout << "Kategori Produk > ";
            cin >> kategoriProduk;
            cout << "Harga Produk > ";
            cin >> hargaProduk;
            cout << "Foto Produk (1/0) > ";
            cin >> fotoProduk;
            if(fotoProduk != 1 && fotoProduk != 0){
                cout << "Invalid Input, don't try anything funny here" << endl;
                continue;
            }

            //edit the product with the specified ID
            for(int i = 0; i < petshop.size(); i++){
                if(petshop[i].getId() == id){
                    petshop[i].editProduct(namaProduk, kategoriProduk, hargaProduk, fotoProduk);
                }
            }

            cout << "Produk dengan id " << id << " berhasil diubah" << endl;
        }
        
        //exit the program
        else if(option == 6){
            status = true;
        }

        //for invalid input
        else{
            cout << "Invalid Input" << endl;
        }

        cout << endl;

    }

    return 0;
}