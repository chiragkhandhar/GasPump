package DataStore;

public class DS1 extends DataStore {
    int temp_a;
    int temp_c;
    int cash;
    int total;
    int L;
    int price;
    int w;

    // DS1 Specific overrided methods
    @Override
    public int getTemp_c() {
        return temp_c;
    }

    @Override
    public void setTemp_c(int temp_c) {
        this.temp_c = temp_c;
    }

    @Override
    public int getCash() {
        return cash;
    }

    @Override
    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int getL() {
        return L;
    }

    @Override
    public void setL(int l) {
        this.L = l;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getTemp_a() {
        return temp_a;
    }

    @Override
    public void setTemp_a(int temp_a) {
        this.temp_a = temp_a;
    }

    @Override
    public int getW() {
        return w;
    }

    @Override
    public void setW(int w) {
        this.w = w;
    }

    // DS2 Specific overrided methods (No need to define)
    @Override
    public float getFloatTemp_a() {
        return 0;
    }

    @Override
    public void setTemp_a(float temp_a) {

    }

    @Override
    public float getTemp_b() {
        return 0;
    }

    @Override
    public void setTemp_b(float temp_b) {

    }

    @Override
    public String getTemp_p() {
        return null;
    }

    @Override
    public void setTemp_p(String temp_p) {

    }

    @Override
    public String getPin() {
        return null;
    }

    @Override
    public void setPin(String pin) {

    }

    @Override
    public float getFloatPrice() {
        return 0;
    }

    @Override
    public void setPrice(float price) {

    }

    @Override
    public int getG() {
        return 0;
    }

    @Override
    public void setG(int g) {

    }

    @Override
    public float getFloatTotal() {
        return 0;
    }

    @Override
    public void setFloatTotal(float total) {

    }

    @Override
    public float getRprice() {
        return 0;
    }

    @Override
    public void setRprice(float rprice) {

    }

    @Override
    public float getDprice() {
        return 0;
    }

    @Override
    public void setDprice(float dprice) {

    }

    @Override
    public float getSprice() {
        return 0;
    }

    @Override
    public void setSprice(float sprice) {

    }

    @Override
    public float getFloatTemp_c() {
        return 0;
    }

    @Override
    public void setTemp_c(float temp_c) {

    }
}
