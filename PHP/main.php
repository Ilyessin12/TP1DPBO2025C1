<?php
require_once 'PetShop.php';

// PHP Function to display products in a table
function displayProducts($products, $title) {
    echo "<h3>$title</h3>";
    echo "<table border='1'>
            <tr>
                <th>ID</th>
                <th>Nama Produk</th>
                <th>Kategori</th>
                <th>Harga</th>
                <th>Foto</th>
            </tr>";
    
    foreach ($products as $product) {
        echo "<tr>
                <td>" . $product->getId() . "</td>
                <td>" . $product->getNamaProduk() . "</td>
                <td>" . $product->getKategoriProduk() . "</td>
                <td>" . $product->getHargaProduk() . "</td>
                <td><img src='" . $product->getFotoProduk() . "' width='100'></td>
            </tr>";
    }
    echo "</table>";
    echo "<hr>";
}

// Array to store products, just like with c++ vector or java arraylist or python list
$products = array();

// ADD PRODUCTS SECTION
echo "<h1>Pet Shop Totally not from SERN</h1>";
echo "<h2>Inital</h2>";
if (empty($products)) echo "<p>Kosong For Now.</p>";
else echo "<p>Ada Isinya.</p>"; // just in case
echo "<hr>";

echo "<h2>Forma De ADD</h2>";


$products[] = new PetShop(1, "JohnEldenRing", "ER", 122245, "er.jpg");


$products[] = new PetShop(2, "JohnBloodBorne", "BB", 255789, "bb.jpg");


$products[] = new PetShop(3, "JohnDarkSouls", "DS", 177103, "ds.jpg");

// Display initial products
displayProducts($products, "Setelah Add");

// DELETING PRODUCTS SECTION ============
echo "<h2>Forma De DELETE</h2>";
echo "<p>Deleting product with ID: 3...</p>";
echo "<p>Delete Complete!</p>";

// Display before deletion
displayProducts($products, "Sebelum Before Delete");

// Delete product with ID 3
$products = array_filter($products, function($product) {
    return $product->getId() != 3;
});

// Display after deletion
displayProducts($products, "Sesudah After Delete");

// UPDATING PRODUCTS SECTION ===========
echo "<h2>Forma DE UPDATE/EDIT</h2>";
echo "<p>Updating product with ID: 1...</p>";
echo "<p>Update Complete!</p>";

// Update product with ID 1
foreach ($products as $product) {
    if ($product->getId() == 1) {
        $product->editProduct("JohnSekiro", "SKR", 392976, "skr.jpg");
    }
}

// Display updated products
displayProducts($products, "Sesudah Update");

// SEARCHING SECTION ===================
echo "<h2>Forma Search</h2>";
echo "<p>Searching for product: JohnSekiro...</p>";
echo "<p>Search Complete, Hasil Pencarianmu:</p>";

// Search for product
$searchResults = array_filter($products, function($product) {
    return $product->getNamaProduk() == "JohnSekiro";
});

// Display search results
displayProducts($searchResults, "Hasil Pencarianmu");

?>

<!-- A little bit of css so that the table looks good -->
<style>
    table {
        border-collapse: collapse;
        margin: 10px 0;
    }
    th, td {
        padding: 8px;
        text-align: left;
    }
    hr {
        margin: 20px 0;
        border: 1px solid #ccc;
    }
    h2 {
        color: #333;
        margin-top: 30px;
    }
</style>

<?php
echo "<h2>El Psy Kongroo</h2>";
?>