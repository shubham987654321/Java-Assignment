package MetaCubeAssignment.Assignment1;

/*
echo "# Java-Assignment" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/shubham987654321/Java-Assignment.git
git push -u origin main
*/
import java.util.HashMap;

public   class ShoppingCart {
    private HashMap<Item, Integer> storedItem = new HashMap<Item, Integer>();
    private double totalBillAmount;

    // Add an item to a cart with the given quantity .
    public void addToCart(Item item, Integer quantity) {
        storedItem.put(item, quantity);
    }

    // Show quantity for added item .
    public Integer displayQty(Item item) {
        return storedItem.get(item);
        
    }

    // Update quantity of added item.
    public void updateQty(Item item, Integer quantity) {
        if(storedItem.containsKey(item)){
            storedItem.put(item,quantity);
        }
    }

    // Delete Item from cart.
    public void deleteItem(Item item) {
        storedItem.remove(item);
    }

    
    // Display cart total value (Total bill Amount)
    public Double displayBill() {
     for (Item item : storedItem.keySet()) {
         totalBillAmount +=item.getPrice()*storedItem.get(item);   
     }
     return totalBillAmount;

    }


    // Display Item and its quantity 
    public void  showItemOnShoppingCart() {
        int i=1;
        for (Item item : storedItem.keySet()) {
            System.out.println(i++ +" Item Id : "+item.getItemId() + " Item Name: "+item.getName()+ " Item Price : "+item.getPrice() + " qunatity: "+storedItem.get(item));
       }
    }



}
