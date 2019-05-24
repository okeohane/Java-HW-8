package javaapplication1;
public class PreferredCustomer extends Customer
{
    private double amountSpent;
    private double discountLevel;
    
    public PreferredCustomer()
    {
        super();
        amountSpent = 0.0;
        discountLevel = 0.0;
    }
    
    public PreferredCustomer(String name, String address, String phone, String id, boolean onList, double amountSpent)
    {
        super(name, address, phone, id, onList);
        this.amountSpent = amountSpent;
    }
    
    public void setPurchases(double amountSpent)
    {
        this.amountSpent = amountSpent;
    }
    public double getPurchases()
    {
        return amountSpent;
    }
    public double getDiscountLevel()
    {
        if(amountSpent >= 2000)
            discountLevel = 10;
        else if(amountSpent >= 1500)
            discountLevel = 7;
        else if(amountSpent >= 1000)
            discountLevel = 6;
        else if(amountSpent >= 500)
            discountLevel = 5;
        return discountLevel;
    }
}
