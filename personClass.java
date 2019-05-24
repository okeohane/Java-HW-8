package javaapplication1;
public class Person 
{
    private String name;
    private String address;
    private String phone;
    
    public Person()
    {
        name = "";
        address = "";
        phone = "";
    }
    public Person(String name, String address, String phone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public String getPhone()
    {
        return phone;
    }
}
