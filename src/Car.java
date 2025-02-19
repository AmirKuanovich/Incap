public class Car {
    String carName;
    String color;
    int year;

    public Car(String carName, String color, int year) {
        this.carName = carName;
        this.color = color;
        this.year = year;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
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
                "carName='" + carName + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
