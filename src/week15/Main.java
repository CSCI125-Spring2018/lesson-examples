package week15;

class Main
{
    public static void main(String[] args)
    {

        Order order1 = new Order("order-001", "000.000.1234", "some address", 100);
        System.out.println(order1);

        OrderBuilder builder = new OrderBuilder();
        Order order2 = builder.setPrice(5).setName("order-2").setAddress("other address").build();
        System.out.println(order2);

    }
}