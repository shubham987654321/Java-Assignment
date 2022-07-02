package MetaCubeAssignment.Assignment1;

class Item {
    private String ItemId;
    private String Name;
    private String Description;
    private double Price;

    /**
     * Create an Item and taking prameter
     * 
     * @param ItemId      of type String
     * @param Name        of type String
     * @param Description of type String
     * @param Price
     */

    public Item(String ItemId, String Name, String Description, Double Price) {
        this.ItemId = ItemId;
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
    }

    /**
     * return ItemId
     * 
     * @return
     */
    public String getItemId() {
        return ItemId;
    }

    /**
     * Set the ItemId of Item
     * @param itemId
     */
    public void setItemId(String itemId) {
        this.ItemId = itemId;
    }

    /**
     * return the Name of Product
     * 
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the Name of Item
     * 
     * @param name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * getter for Description of Item
     * @return Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Setter for Description of Item
     * @param description
     */
    public void setDescription(String description) {
        Description = description;
    }

    /**
     * getter for Price of Item
     * @return
     */
    public double getPrice() {
        return Price;
    }

    /**
     * Setter the Price of Item
     * @param price
     */
    public void setPrice(double price) {
        Price = price;
    }

}
