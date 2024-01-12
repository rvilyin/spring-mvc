package web;

public class Car {
    private String brand;

    private String color;

    private int year;

    public Car(String name, String color, int year) {
        this.brand = name;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
