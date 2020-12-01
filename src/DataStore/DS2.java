package DataStore;

public class DS2 extends DataStore{
    float temp_a;
    float temp_b;
    float temp_c;
    String temp_p;
    String pin;
    float price;
    int G;
    float total;
    float Rprice;
    float Dprice;
    float Sprice;

    // DS1 Specific overrided methods (No need to define)
    @Override
    public int getTemp_c() {
        return 0;
    }

    @Override
    public void setTemp_c(int temp_c) {

    }

    @Override
    public int getCash() {
        return 0;
    }

    @Override
    public void setCash(int cash) {

    }

    @Override
    public int getTotal() {
        return 0;
    }

    @Override
    public void setTotal(int total) {

    }

    @Override
    public int getL() {
        return 0;
    }

    @Override
    public void setL(int l) {

    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setPrice(int price) {

    }

    @Override
    public int getTemp_a() {
        return 0;
    }

    @Override
    public void setTemp_a(int temp_a) {

    }

    @Override
    public int getW() {
        return 0;
    }

    @Override
    public void setW(int w) {

    }

    // DS2 Specific overrided methods
    @Override
    public float getFloatTemp_a() {
        return temp_a;
    }

    @Override
    public void setTemp_a(float temp_a) {
        this.temp_a = temp_a;
    }

    @Override
    public float getTemp_b() {
        return temp_b;
    }

    @Override
    public void setTemp_b(float temp_b) {
        this.temp_b = temp_b;
    }

    @Override
    public String getTemp_p() {
        return temp_p;
    }

    @Override
    public void setTemp_p(String temp_p) {
        this.temp_p = temp_p;
    }

    @Override
    public String getPin() {
        return pin;
    }

    @Override
    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public float getFloatPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int getG() {
        return G;
    }

    @Override
    public void setG(int g) {
        this.G = g;
    }

    @Override
    public float getFloatTotal() {
        return total;
    }

    @Override
    public void setFloatTotal(float total) {
        this.total = total;
    }

    @Override
    public float getRprice() {
        return Rprice;
    }

    @Override
    public void setRprice(float rprice) {
        this.Rprice = rprice;
    }

    @Override
    public float getDprice() {
        return Dprice;
    }

    @Override
    public void setDprice(float dprice) {
        this.Dprice = dprice;
    }

    @Override
    public float getSprice() {
        return Sprice;
    }

    @Override
    public void setSprice(float sprice) {
        this.Sprice = sprice;
    }

    @Override
    public float getFloatTemp_c() {
        return temp_c;
    }

    @Override
    public void setTemp_c(float temp_c) {
        this.temp_c = temp_c;
    }
}
