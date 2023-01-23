public class FordModel {
    public FordModel(int year, int mileage, float price) {
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private int year;
    private int mileage;
    private float price;

}