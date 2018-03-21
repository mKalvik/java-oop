package Kodu2.SchoolDoor;

import Kodu2.CardChecker.StudentChecker;

public class ElectronicLock {

    private String schoolCode;

    public ElectronicLock(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public void isValidCard(String idCode) {
        StudentChecker student = new StudentChecker(idCode, schoolCode);
        if (student.isStudent(idCode, schoolCode)) {
            System.out.println(idCode + " " + schoolCode + " saab sisse");
        } else {
            System.out.println(idCode + " " + schoolCode + " ei saa sisse");
        }
    }

}
