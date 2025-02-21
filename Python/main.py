from PetShop import PetShop #import class

def main():
    status = False
    petshop = []  # Python list for storing objects, similar to vector in C++ and ArrayList in Java

    while not status:
        option = 0
        id_available = False

        # tampilan
        print("=============================================")
        print("|Selamat Datang di Program Manajemen Petshop|")
        print("=============================================")
        print("| 1. Tambah Produk                          |")
        print("| 2. Hapus Produk                           |")
        print("| 3. Lihat Produk                           |")
        print("| 4. Cari Produk                            |")
        print("| 5. Ubah Produk                            |")
        print("| 6. Keluar                                 |")
        print("=============================================")
        
        # why do we even have this weird try-except thing lol
        try:
            option = int(input("Pilih Menu > "))
        except ValueError: #Error handling if the user input is not a number
            print("Invalid Input")
            print()
            continue
        

        if option == 1: #option for adding product
            print("Anda Memilih Untuk Tambah Produk")
            id = input("ID > ")
            
            # Check if ID exists
            for prod in petshop:
                if prod.get_id() == id:
                    id_available = True
                    break

            if id_available:
                print("ID sudah digunakan, silahkan gunakan ID lain")
                continue

            nama_produk = input("Nama Produk > ")
            kategori_produk = input("Kategori Produk > ")

            #Another try-except
            try:
                harga_produk = int(input("Harga Produk > "))
                temp_foto_produk = int(input("Foto Produk (1/0) > "))
                
                if temp_foto_produk not in [0, 1]:
                    print("Invalid Input, don't do anything weird bro")
                    continue
                
                foto_produk = True if temp_foto_produk == 1 else False
                
                produk = PetShop(id, nama_produk, kategori_produk, harga_produk, foto_produk)
                petshop.append(produk)
                print(f"Produk dengan id {id} berhasil ditambahkan")
            
            except ValueError: #Error handling if the user input is not a number
                print("Invalid Input")
                continue

        elif option == 2: #option for deleting product
            print("Anda Memilih Untuk Hapus Produk")
            id = input("ID Produk yang akan dihapus > ")

            for i, prod in enumerate(petshop):
                if prod.get_id() == id:
                    del petshop[i]
                    id_available = True

            #check if the product is available or not
            if not id_available:
                print(f"Produk dengan id {id} tidak ditemukan")
            else:
                print(f"Produk dengan id {id} berhasil dihapus")

        elif option == 3: #option for showing all products
            print("\nAnda Memilih Untuk Lihat Produk")
            print("=======================================")
            print("| Katalog Produk                      |")
            print("=======================================")
            
            for prod in petshop:
                prod.show_product()

        elif option == 4: #option for searching product by name
            print("Anda Memilih Untuk Cari Produk")
            search_name = input("Nama Produk yang dicari : ")
            found = False

            #search for the product name (case insensitive)
            for prod in petshop:
                if search_name.lower() in prod.get_nama_produk().lower():
                    prod.show_product()
                    found = True

            if not found:
                print(f'Tidak ada produk dengan nama "{search_name}"')

        elif option == 5: #option for editing product
            print("Ubah Produk")
            id = input("ID Produk yang akan diubah : ")

            #check for id availability
            for prod in petshop:
                if prod.get_id() == id:
                    id_available = True

            if not id_available: 
                print(f"Produk dengan id {id} tidak ditemukan")
                continue

            nama_produk = input("Nama Produk > ")
            kategori_produk = input("Kategori Produk > ")
            #yet another try-except
            try:
                harga_produk = int(input("Harga Produk > "))
                temp_foto_produk = int(input("Foto Produk (0/1) > "))
                
                if temp_foto_produk not in [0, 1]: #Error handling if the user input is not 0 or 1
                    print("Invalid Input, don't do anything weird bro")
                    continue
                
                foto_produk = True if temp_foto_produk == 1 else False

                for prod in petshop: #search for the product with the id
                    if prod.get_id() == id:
                        prod.edit_product(nama_produk, kategori_produk, harga_produk, foto_produk)
                
                print(f"Produk dengan id {id} berhasil diubah")
            
            except ValueError:
                print("Invalid Input")
                continue

        elif option == 6: #option for exiting the program
            status = True

        else: #for any weird ahh number input
            print("Invalid Input")

        print() #for newline

if __name__ == "__main__": #main function
    main()