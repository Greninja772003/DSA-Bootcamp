package Oops;

public class subject {
    private String subID;
    private String subName;
    private int maxMarks;
    private int obtainMarks;

    public subject(String subID, String subName, int maxMarks, int obtainMarks) {
        this.subID = subID;
        this.subName = subName;
        this.maxMarks = maxMarks;
        this.obtainMarks = obtainMarks;
    }

    public subject(String subID, String subName, int maxMarks) {
        this.subID = subID;
        this.subName = subName;
        this.maxMarks = maxMarks;
    }

    public void details() {
        System.out.println("Subject id: " + subID);
        System.out.println("Subject name: " + subName);
        System.out.println("Maximum marks can be achieve: " + maxMarks);
        System.out.println("Marks obtain by student: " + obtainMarks);
    }
    public void detail() {
        System.out.println("Subject id: " + subID);
        System.out.println("Subject name: " + subName);
        System.out.println("Maximum marks can be achieve: " + maxMarks);
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setObtainMarks(int obtainMarks) {
        this.obtainMarks = obtainMarks;
    }

    public String getSubID() {
        return subID;
    }

    public String getSubName() {
        return subName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getObtainMarks() {
        return obtainMarks;
    }

    public static void main(String[] args) {
        subject obj= new subject("BTIBM403N", "Application Developer", 100, 95);
        obj.details();

    }
}
