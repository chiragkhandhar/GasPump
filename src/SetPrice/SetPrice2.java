package SetPrice;

import DataStore.DataStore;

public class SetPrice2 extends SetPrice {
    @Override
    public void setPrice(DataStore dst, int price) {

        switch (price)
        {
            case 1:
                System.out.println("|         Regular Gas Selected           |");
                dst.setPrice(dst.getRprice());
                break;
            case 2:
                System.out.println("|           Super Gas Selected           |");
                dst.setPrice(dst.getSprice());
                break;
            case 3:
                System.out.println("|          Diesel Gas Selected           |");
                dst.setPrice(dst.getDprice());
                break;
        }

    }
}
