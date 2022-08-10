package carsellerwebsite;

public class AboutCar {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    private int width;
    private int year;

    AboutCar(int height, int width, int year) {
        this.height = height;
        this.width = width;
        this.year = year;
    }

    void checkPicture() throws CarPictureException {

        if (this.height == 2400 && this.width == 1500) {
            System.out.println("Picture is vaild");
        } else {
            throw new CarPictureException("Pictute is not valid");
        }
    }

    void checkMade() throws CarMadeException {

        if (1995 <= this.year && this.year <= 2019) {
            System.out.println("Car is Valid");
        } else {
            throw new CarMadeException("Car is not Valid");
        }
    }
}
