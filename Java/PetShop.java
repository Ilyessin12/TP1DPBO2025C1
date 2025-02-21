public class PetShop {
    // Attributes
    private String id;
    private String namaProduk;
    private String kategoriProduk;
    private int hargaProduk;
    private boolean fotoProduk;

    // Constructor
    public PetShop(String id, String namaProduk, String kategoriProduk, int hargaProduk, boolean fotoProduk) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.kategoriProduk = kategoriProduk;
        this.hargaProduk = hargaProduk;
        this.fotoProduk = fotoProduk;
    }

    // Setter and Getter
    public void setId(String id) {
        this.id = id;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setKategoriProduk(String kategoriProduk) {
        this.kategoriProduk = kategoriProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public void setFotoProduk(boolean fotoProduk) {
        this.fotoProduk = fotoProduk;
    }

    // Getters
    public String getId() {
        return this.id;
    }

    public String getNamaProduk() {
        return this.namaProduk;
    }

    public String getKategoriProduk() {
        return this.kategoriProduk;
    }

    public int getHargaProduk() {
        return this.hargaProduk;
    }

    public boolean getFotoProduk() {
        return this.fotoProduk;
    }

    // Methods
    public void showProduct() {
        System.out.println("| ID Produk : " + this.id);
        System.out.println("| Nama Produk : " + this.namaProduk);
        System.out.println("| Kategori Produk : " + this.kategoriProduk);
        System.out.println("| Harga Produk : " + this.hargaProduk);
        System.out.println("| Foto Produk : " + (this.fotoProduk ? "Ada" : "Tidak Ada"));
        System.out.println("=======================================");
    }

    public void editProduct(String namaProduk, String kategoriProduk, int hargaProduk, boolean fotoProduk) {
        this.namaProduk = namaProduk;
        this.kategoriProduk = kategoriProduk;
        this.hargaProduk = hargaProduk;
        this.fotoProduk = fotoProduk;
    }
}
