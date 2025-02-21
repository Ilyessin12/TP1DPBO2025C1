class PetShop:

    # Attributes
    __id = ""
    __nama_produk = ""
    __kategori_produk = ""
    __harga_produk = 0
    __foto_produk = False

    # Constructor
    def __init__(this, id, nama_produk, kategori_produk, harga_produk, foto_produk):
        this.__id = id
        this.__nama_produk = nama_produk
        this.__kategori_produk = kategori_produk
        this.__harga_produk = harga_produk
        this.__foto_produk = foto_produk

    # Setter and Getter methods
    # Setters
    def set_id(this, id):
        this.__id = id
    
    def set_nama_produk(this, nama_produk):
        this.__nama_produk = nama_produk
    
    def set_kategori_produk(this, kategori_produk):
        this.__kategori_produk = kategori_produk
    
    def set_harga_produk(this, harga_produk):
        this.__harga_produk = harga_produk
    
    def set_foto_produk(this, foto_produk):
        this.__foto_produk = foto_produk
    
    # Getters
    def get_id(this):
        return this.__id
    
    def get_nama_produk(this):
        return this.__nama_produk
    
    def get_kategori_produk(this):
        return this.__kategori_produk
    
    def get_harga_produk(this):
        return this.__harga_produk
    
    def get_foto_produk(this):
        return this.__foto_produk
    
    # Methods
    def show_product(this):
        print("| ID Produk :", this.__id)
        print("| Nama Produk :", this.__nama_produk)
        print("| Kategori Produk :", this.__kategori_produk)
        print("| Harga Produk :", this.__harga_produk)
        print("| Foto Produk :", "Ada" if this.__foto_produk else "Tidak Ada")
        print("=======================================")
    
    def edit_product(this, nama_produk, kategori_produk, harga_produk, foto_produk):
        this.__nama_produk = nama_produk
        this.__kategori_produk = kategori_produk
        this.__harga_produk = harga_produk
        this.__foto_produk = foto_produk