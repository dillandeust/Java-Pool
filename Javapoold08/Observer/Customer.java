package Observer;

public class Customer implements Observer {

    public void update(Observable observable) {
        Order order = (Order) observable;
        if (order instanceof Order)

            System.out.println("Position (" + order.getPosition() + "), " + order.getTimeBeforeArrival()
                    + " minutes before arrival at " + order.getDestination() + ".");
    }

}
