package homeworkOne2022_09_23;

public class Invoice {

    private String number;
    private String description;
    private int quantityOfPurchasedItems;
    private int pricePerItem;

    public Invoice(String number, String description, int quantityOfPurchasedItems, int pricePerItem) {
        this.number = number;
        this.description = description;
        this.quantityOfPurchasedItems = quantityOfPurchasedItems;
        this.pricePerItem = pricePerItem;
    }

    public static void main(String[] args) {

        Invoice invoiceForMilk = new Invoice("1", "Milk", 2, 3);

        System.out.println("Invoice No." + invoiceForMilk.getNumber() + " for " + invoiceForMilk.getDescription()
                + " has a total amount " + invoiceForMilk.getInvoiceAmount(invoiceForMilk.getQuantityOfPurchasedItems(),
                invoiceForMilk.getPricePerItem()) + " eur (" + invoiceForMilk.getQuantityOfPurchasedItems() + " packs, "
                + invoiceForMilk.getPricePerItem() + " eur per item).");

        Invoice invoiceForCoffee = new Invoice("2", "Coffee", 0, 3);

        System.out.println("Invoice No." + invoiceForCoffee.getNumber() + " for " + invoiceForCoffee.getDescription()
                + " has a total amount " + invoiceForCoffee.getInvoiceAmount(invoiceForCoffee.getQuantityOfPurchasedItems(),
                invoiceForCoffee.getPricePerItem()) + " eur (" + invoiceForCoffee.getQuantityOfPurchasedItems() + " packs, "
                + invoiceForCoffee.getPricePerItem() + " eur per item).");

        Invoice invoiceForTea = new Invoice("3", "Tea", 2, 0);

        System.out.println("Invoice No." + invoiceForTea.getNumber() + " for " + invoiceForTea.getDescription()
                + " has a total amount " + invoiceForTea.getInvoiceAmount(invoiceForTea.getQuantityOfPurchasedItems(),
                invoiceForTea.getPricePerItem()) + " eur (" + invoiceForTea.getQuantityOfPurchasedItems() + " packs, "
                + invoiceForTea.getPricePerItem() + " eur per item).");

        Invoice invoiceForButter = new Invoice("4", "Butter", 0, 0);

        System.out.println("Invoice No." + invoiceForButter.getNumber() + " for " + invoiceForButter.getDescription()
                + " has a total amount " + invoiceForButter.getInvoiceAmount(invoiceForButter.getQuantityOfPurchasedItems(),
                invoiceForButter.getPricePerItem()) + " eur (" + invoiceForButter.getQuantityOfPurchasedItems() + " packs, "
                + invoiceForButter.getPricePerItem() + " eur per item).");

        Invoice invoiceForBread = new Invoice("5", "Bread", -2, 3);

        System.out.println("Invoice No." + invoiceForBread.getNumber() + " for " + invoiceForBread.getDescription()
                + " has a total amount " + invoiceForBread.getInvoiceAmount(invoiceForBread.getQuantityOfPurchasedItems(),
                invoiceForBread.getPricePerItem()) + " eur (" + invoiceForBread.getQuantityOfPurchasedItems() + " packs, "
                + invoiceForBread.getPricePerItem() + " eur per item).");

        Invoice invoiceForBananas = new Invoice("6", "Bananas", 2, -3);

        System.out.println("Invoice No." + invoiceForBananas.getNumber() + " for " + invoiceForBananas.getDescription()
                + " has a total amount " + invoiceForBananas.getInvoiceAmount(invoiceForBananas.getQuantityOfPurchasedItems(),
                invoiceForBananas.getPricePerItem()) + " eur (" + invoiceForBananas.getQuantityOfPurchasedItems() + " packs, "
                + invoiceForBananas.getPricePerItem() + " eur per item).");
    }

    public int getInvoiceAmount(int quantityOfPurchasedItems, int pricePerItem) {
        if (quantityOfPurchasedItems < 0 || pricePerItem < 0) {
            return 0;
        } else {
            return quantityOfPurchasedItems * pricePerItem;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOfPurchasedItems() {
        return quantityOfPurchasedItems;
    }

    public void setQuantityOfPurchasedItems(int quantityOfPurchasedItems) {
        this.quantityOfPurchasedItems = quantityOfPurchasedItems;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
