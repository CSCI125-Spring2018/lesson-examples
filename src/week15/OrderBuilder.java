package week15;

class OrderBuilder extends Order implements Builder<Order>
{

    public OrderBuilder()
    {
    }

    public OrderBuilder setName(String name)
    {
        this.name = name;
        return this;
    }

    public OrderBuilder setPhone(String phone)
    {
        this.phone = phone;
        return this;
    }

    public OrderBuilder setAddress(String address)
    {
        this.address = address;
        return this;
    }

    public OrderBuilder setPrice(float price)
    {
        this.price = price;
        return this;
    }

    public OrderBuilder reset()
    {
        name = null;
        phone = null;
        address = null;
        price = 0;
        return this;
    }

    public Order build()
    {
        return new Order(name, phone, address, price);
    }


}