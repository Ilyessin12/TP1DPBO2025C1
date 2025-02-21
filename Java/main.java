import java.util.ArrayList; //for dynamically storing multiple objects, similar to vector in C++
import java.util.Scanner; //for handling input (similar to scanf or std::cin in nature)

//main function
public class main {
    public static void main(String[] args) {
        boolean status = false;
        ArrayList<PetShop> petshop = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (!status) {
            int option = 0;
            boolean idAvailable = false; 

            System.out.println("=============================================");
            System.out.println("|Selamat Datang di Program Manajemen Petshop|");
            System.out.println("=============================================");
            System.out.println("| 1. Tambah Produk                          |");
            System.out.println("| 2. Hapus Produk                           |");
            System.out.println("| 3. Lihat Produk                           |");
            System.out.println("| 4. Cari Produk                            |");
            System.out.println("| 5. Ubah Produk                            |");
            System.out.println("| 6. Keluar                                 |");
            System.out.println("=============================================");
            System.out.print("Pilih Menu > ");
            option = scan.nextInt(); //scan for options here
            scan.nextLine(); // Consume newline for safer input handling

            String id, namaProduk, kategoriProduk;
            int hargaProduk;
            boolean fotoProduk;

            if (option == 1) {
                System.out.println("Anda Memilih Untuk Tambah Produk");
                System.out.print("ID > ");
                id = scan.nextLine();
                
                for (PetShop prod : petshop) { //checking if id is already used
                    if (prod.getId().equals(id)) {
                        idAvailable = true;
                    }
                }

                if (idAvailable) { //if id is already used, use a different one
                    System.out.println("ID sudah digunakan, silahkan gunakan ID lain");
                    continue;
                }

                System.out.print("Nama Produk > ");
                namaProduk = scan.nextLine();
                System.out.print("Kategori Produk > ");
                kategoriProduk = scan.nextLine();
                System.out.print("Harga Produk > ");
                hargaProduk = scan.nextInt();
                scan.nextLine(); // Consume newline for safer input handlin
                System.out.print("Foto Produk (1/0) > ");
                //check if the input is "1 0r 0, if it is then change it to true or false
                int tempFotoProduk = scan.nextInt();
                if(tempFotoProduk != 0 && tempFotoProduk != 1){
                    System.out.println("Invalid Input, don't do anything weird bro");
                    continue;
                }
                fotoProduk = (tempFotoProduk == 1) ? true : false;
                scan.nextLine(); // Consume newline for safer input handling

                PetShop produk = new PetShop(id, namaProduk, kategoriProduk, hargaProduk, fotoProduk);
                petshop.add(produk);
                System.out.println("Produk dengan id " + id + " berhasil ditambahkan");

            } 
            else if (option == 2) { //option for deleting a product
                System.out.println("Anda Memilih Untuk Hapus Produk");
                System.out.print("ID Produk yang akan dihapus > ");
                id = scan.nextLine();

                for (int i = 0; i < petshop.size(); i++) { //find the product with the id
                    if (petshop.get(i).getId().equals(id)) {
                        petshop.remove(i);
                        idAvailable = true;
                    }
                }

                //check for if the product is found or not with that specific id
                if (!idAvailable) {
                    System.out.println("Produk dengan id " + id + " tidak ditemukan");
                } 
                else {
                    System.out.println("Produk dengan id " + id + " berhasil dihapus");
                }

            } 
            else if (option == 3) { //option for showing all products
                System.out.println("\nAnda Memilih Untuk Lihat Produk");
                System.out.println("=======================================");
                System.out.println("| Katalog Produk                      |");
                System.out.println("=======================================");
                
                for (PetShop prod : petshop) { //show all products
                    prod.showProduct();
                }

            } 
            else if (option == 4) { //option for searching products by name
                System.out.println("Anda Memilih Untuk Cari Produk");
                System.out.print("Nama Produk yang dicari : ");
                String searchName = scan.nextLine();
                boolean found = false;
            
                for (PetShop prod : petshop) { //find all products with matching names (case insensitive)
                    if (prod.getNamaProduk().toLowerCase().contains(searchName.toLowerCase())) {
                        prod.showProduct();
                        found = true;
                    }
                }
            
                //if no product names are found
                if (!found) {
                    System.out.println("Tidak ada produk dengan nama \"" + searchName + "\""); //its using quotes within it, so i used escape characters
                }

            } 
            else if (option == 5) { //option for editing a product
                System.out.println("Ubah Produk");
                System.out.print("ID Produk yang akan diubah : ");
                id = scan.nextLine();

                //check if the id is available
                for (PetShop prod : petshop) {
                    if (prod.getId().equals(id)) {
                        idAvailable = true;
                    }
                }

                //if the id is not found
                if (!idAvailable) {
                    System.out.println("Produk dengan id " + id + " tidak ditemukan");
                    continue;
                }

                System.out.print("Nama Produk > ");
                namaProduk = scan.nextLine();
                System.out.print("Kategori Produk > ");
                kategoriProduk = scan.nextLine();
                System.out.print("Harga Produk > ");
                hargaProduk = scan.nextInt();
                System.out.print("Foto Produk (0/1) > ");
                //check if the input is "1 0r 0, if it is then change it to true or false
                int tempFotoProduk = scan.nextInt();
                if(tempFotoProduk != 0 && tempFotoProduk != 1){
                    System.out.println("Invalid Input, don't do anything weird bro");
                    continue;
                }
                fotoProduk = (tempFotoProduk == 1) ? true : false;
                scan.nextLine(); // Consume newline for safer input handling

                for (PetShop prod : petshop) {
                    if (prod.getId().equals(id)) {
                        prod.editProduct(namaProduk, kategoriProduk, hargaProduk, fotoProduk);
                    }
                }

                System.out.println("Produk dengan id " + id + " berhasil diubah");

            } 
            else if (option == 6) { //exit the program
                status = true;
            } 
            else{ //for any weird ahh input
                System.out.println("Invalid Input");
            }

            System.out.println();
        }

        //close the scanner (only in java bruh)
        scan.close();
    }
}
