package Kodu1;

public class StudentThings {


    private String name;
    private int eap;
    private int birthYear;
    private String code;

    public StudentThings(String name, int eap) {
        this.name = name;
        this.eap = eap;
    }


    public StudentThings(String name, int eap, String code) {
        this.name = name;
        this.eap = eap;
        this.code = code;

    }

//    public void addPoints(int pointsToAdd) {
//        if (studentsEap.containsKey(name)) {
//            studentsEap.put(name, studentsEap.get(name) + pointsToAdd);
//        }
//    }
//
//    public void addYear(int year) {
//        birthYear = year;
//
//
//        if (studentsBirthYear.containsKey(name)) {
//            studentsBirthYear.put(name, birthYear);
//        }
//    }
//
//    public int getBirthYear() {
//        return birthYear;
//    }
//
//    public int getPoints() {
//        if (studentsEap.get(name) == null) {
//            return 0;
//        } else {
//            return studentsEap.get(name);
//        }
//
//    }
//
//    public String getCode() {
//        return code;
//    }

    public void addYear(int yearToAdd) {
        birthYear = yearToAdd;
    }

    public int getYear() {
        return birthYear;
    }
    public void addPoints(int pointsToAdd) {
        eap += pointsToAdd;
    }


    public String getCode() {
        return code;
    }

    public int getEap() {
        return eap;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public int getPoints() {
        return eap;
    }
}
