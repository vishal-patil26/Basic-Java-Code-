import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String className;

    // Constructor
    public Student(int studentId, String name, String className) {
        this.studentId = studentId;
        this.name = name;
        this.className = className;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Class: " + className;
    }
}

class Hosteller {
    private String hostelName;
    private String roomNumber;
    private String phoneNumber;

    // Constructor
    public Hosteller(String hostelName, String roomNumber, String phoneNumber) {
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Hostel Name: " + hostelName + ", Room Number: " + roomNumber + ", Phone Number: " + phoneNumber;
    }
}

public class MainClass {

    // Global counter for generating room numbers
    private static int roomCounter = 1;
    private static final int MAX_ROOMS = 150;

    // Method to get hosteller details and assign a room number automatically
    public static Hosteller getHostellerDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hostel name:");
        String hostelName = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        // Generate room number or set it to "NA" if room limit is exceeded
        String roomNumber = (roomCounter <= MAX_ROOMS) ? String.valueOf(roomCounter++) : "NA";

        return new Hosteller(hostelName, roomNumber, phoneNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student details
        System.out.println("Enter student ID:");
        int studentId = scanner.nextInt();

        System.out.println("Enter student name:");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();

        System.out.println("Enter class name:");
        String className = scanner.nextLine();

        Student student = new Student(studentId, name, className);
        System.out.println("\nStudent Details:");
        System.out.println(student);

        // Get hosteller details and auto-generate room number
        Hosteller hosteller = getHostellerDetails();
        System.out.println("\nHosteller Details:");
        System.out.println(hosteller);

        // Handle if room number is "NA"
        if (hosteller.getRoomNumber().equals("NA")) {
            System.out.println("Sorry, the hostel is full. No room available.");
        }
    }
}
