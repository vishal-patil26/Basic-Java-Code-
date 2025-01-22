public class DateMain {

    public static void main(String[] args) {
        
        // Create an instance of Date class
        MyDate date = new MyDate();

        // Set values for day, month, and year
        date.setDd(23);
        date.setMm(12);
        date.setYy(2024);

        // Get and print values for day, month, and year
        System.out.println("Day: " + date.getDd());
        System.out.println("Month: " + date.getMm());
        System.out.println("Year: " + date.getYy());
    }
}

// Custom Date class
class MyDate {
    private int dd; // day
    private int mm; // month
    private int yy; // year

    // Getter and setter for day
    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    // Getter and setter for month
    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    // Getter and setter for year
    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }
}
