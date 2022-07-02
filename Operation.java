package MetaCubeAssignment.Assignment1;

public class Operation {
    public static void main(String[] args) {
 
        Item laptop = new Item("L101", " Dell 5570", "512 Gb SSD", 50000.00);
        Item pen = new Item("P101", "Link", "1000meter ", 10.00);
        laptop.setName("Hp");

        // Add Item and its  quantity to Map(var name: storedItem) of ShoppingCart Class by using  addToCart method
        ShoppingCart addItem = new ShoppingCart();
        addItem.addToCart(laptop, 2);
        addItem.addToCart(pen, 3);

        // Show Item In Shopping Cart
        System.out.println("Item in Shopping Cart");
        addItem.showItemOnShoppingCart();

        // Display Quantity of a Particular Item
        System.out.println("Qantity  of a Particular Item : laptop");
        System.out.println(addItem.displayQty(laptop));

        // total Cart Bill
        System.out.println("Total cart Bill");
        System.out.println(addItem.displayBill());

        // Update the Qunatity of a Item
        System.out.println("Update the quantity of an Item(laptop)");
        addItem.updateQty(laptop, 10);

        System.out.println("After Update : Item in Shopping Cart");
        addItem.showItemOnShoppingCart();

        // Delete an Item
        System.out.println("Delete an Item from Shopping Cart(pen)");
        addItem.deleteItem(pen);

        // After Delete total Item In Shopping Cart
        System.out.println("After Delete: Item in  Shopping Cart");
        addItem.showItemOnShoppingCart();

    }

}
