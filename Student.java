public class Student {
    private String lName;

    private String fName;

    private double GPA;

    private int currentCredits;

    private int totalCredits;



    public Student(String _lName, String _fName, double _GPA, int _currentCredits, int _totalCredits ){

        lName = _lName;

        fName = _fName;

        GPA = _GPA;

        currentCredits = _currentCredits;

        totalCredits = _totalCredits;

    }



    public String getlName() {

        return lName;

    }

    public void setlName(String lName){

        this.lName = lName;

    }

    public String getfName() {

        return fName;

    }

    public void setfName(String fName){

        this.fName = fName;

    }

    public double getGPA() {

        return GPA;

    }

    public void setGPA(double GPA) {

        this.GPA = GPA;

    }

    public int getCurrentCredits() {

        return currentCredits;

    }

    public void setCurrentCredits(int currentCredits) {

        this.currentCredits = currentCredits;

    }

    public int getTotalCredits() {

        return totalCredits;

    }

    public void setTotalCredits(int TotalCredits) {

        this.totalCredits = totalCredits;

    }
}
