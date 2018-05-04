package week15;

class Order
{
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    protected String name;
    protected double price;
    protected String address;
    protected String phone;

    public Order()
    { }

    public Order(String name, String phone, String address, double price)
    {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.price = price;
    }

    public String toString()
    {
        String template = "{type: Order, name: %s, address: %s, price: $%.2f, phone: %s}";
        return String.format(template, name, address, price, phone);
    }

}