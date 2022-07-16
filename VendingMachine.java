package lab4;
/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class VendingMachine
{
        // TODO: implement this class
    private String Coke;
    private String Cheetos_Crunchy;
    private String Red_Bull;
    private String Doritos_Nacho_Cheese;
    private String message;
    private int amountofcoke;
    private int amountofcheetoscrunchy;
    private int amountofredbull;
    private int amountofdoritosnachocheese;
    public VendingMachine()
    {
        this.Coke = "Coke";
        this.Cheetos_Crunchy = "Cheetos Crunchy";
        this.Red_Bull = "Red Bull";
        this.Doritos_Nacho_Cheese = "Doritos Nacho Cheese";
        this.message = "Empty VM Started";
        this.amountofcoke = 0;
        this.amountofcheetoscrunchy = 0;
        this.amountofredbull = 0;
        this.amountofdoritosnachocheese = 0;

    }
    public String getMessage()
    {
        return this.message;
    }
    public String checkStock()
    {
        return String.format("Stock: %s (%d), %s (%d), %s (%d), %s (%d)", this.Cheetos_Crunchy, this.amountofcheetoscrunchy,this.Coke, this.amountofcoke, this.Doritos_Nacho_Cheese, this.amountofdoritosnachocheese, this.Red_Bull,  this.amountofredbull);
    }
    public String checkStock(String item)
    {
        int stock = 0;
        if (item.equals("Coke"))
        {
            stock = this.amountofcoke;
            String stockquantity = String.format("%s (%d)",item,stock);
            return stockquantity;
        }
        else if (item.equals("Cheetos Crunchy"))
        {
            stock = this.amountofcheetoscrunchy;
            String stockquantity = String.format("%s (%d)",item,stock);
            return stockquantity;
        }
        else if (item.equals("Doritos Nacho Cheese"))
        {
            stock = this.amountofdoritosnachocheese;
            String stockquantity = String.format("%s (%d)",item,stock);
            return stockquantity;
        }
        else if (item.equals("Red Bull"))
        {
            stock = this.amountofredbull;
            String stockquantity = String.format("%s (%d)",item,stock);
            return stockquantity;
        }
        else
        {
            String stockquanity = String.format("Invalid product: %s",item);
            return stockquanity;
        }
    }
    public void add(String item, int stock)
    {
        if (item.equals("Coke"))
        {
            this.amountofcoke = this.amountofcoke + stock;
            this.message = String.format("Product added: %s (%d)",item,stock);
        }
        else if (item.equals("Cheetos Crunchy"))
        {
            this.amountofcheetoscrunchy = this.amountofcheetoscrunchy + stock;
            this.message = String.format("Product added: %s (%d)",item,stock);
        }
        else if (item.equals("Doritos Nacho Cheese"))
        {
            this.amountofdoritosnachocheese = this.amountofdoritosnachocheese + stock;
            this.message = String.format("Product added: %s (%d)",item,stock);
        }
        else if(item.equals("Red Bull"))
        {
            this.amountofredbull = this.amountofredbull + stock;
            this.message = String.format("Product added: %s (%d)",item,stock);
        }
        else
        {
            this.message = String.format("Invalid product: %s",item);
        }

    }
    public void dispense(String item, int stock)
    {
        if (item.equals("Coke"))
        {
            this.amountofcoke = this.amountofcoke - stock;
            this.message = String.format("Product removed: %s (%d)",item,stock);
        }
        else if (item.equals("Cheetos Crunchy"))
        {
            this.amountofcheetoscrunchy = this.amountofcheetoscrunchy - stock;
            this.message = String.format("Product removed: %s (%d)",item,stock);
        }
        else if (item.equals("Doritos Nacho Cheese"))
        {
            this.amountofdoritosnachocheese = this.amountofdoritosnachocheese - stock;
            this.message = String.format("Product removed: %s (%d)",item,stock);
        }
        else if(item.equals("Red Bull"))
        {
            this.amountofredbull = this.amountofredbull - stock;
            this.message = String.format("Product removed: %s (%d)",item,stock);
        }
        else
        {
            this.message = String.format("Invalid product: %s",item);
        }
    }


}
