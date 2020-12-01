package DataStore;
/*
This class is meant to declare all the methods present in both the data stores. Note that, none of the methods here
are defined, they will either get or set values in their respective Child classes.
*/

public abstract class DataStore {

    // Methods of DS1
    public abstract int getTemp_c();

    public abstract void setTemp_c(int temp_c);

    public abstract int getCash();

    public abstract void setCash(int cash);

    public abstract int getTotal();

    public abstract void setTotal(int total);

    public abstract int getL();

    public abstract void setL(int l);

    public abstract int getPrice();

    public abstract void setPrice(int price);

    public abstract int getTemp_a();

    public abstract void setTemp_a(int temp_a);

    public abstract int getW();

    public abstract void setW(int w);


    // Methods of DS2

    public abstract float getFloatTemp_a();

    public  abstract  void setTemp_a(float temp_a);

    public abstract float getTemp_b();

    public abstract void setTemp_b(float temp_b);

    public abstract String getTemp_p();

    public abstract void setTemp_p(String temp_p);

    public abstract String getPin();

    public abstract void setPin(String pin);

    public abstract float getFloatPrice();

    public abstract void setPrice(float price);

    public abstract int getG();

    public abstract void setG(int g);

    public abstract float getFloatTotal();

    public abstract void setFloatTotal(float total);

    public abstract float getRprice();

    public abstract void setRprice(float rprice);

    public abstract float getDprice();

    public abstract void setDprice(float dprice);

    public abstract float getSprice();

    public abstract void setSprice(float sprice);

    public abstract float getFloatTemp_c();

    public abstract void setTemp_c(float temp_c);
}
