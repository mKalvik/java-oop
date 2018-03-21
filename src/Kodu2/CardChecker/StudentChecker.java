package Kodu2.CardChecker;

import java.util.Arrays;


public class StudentChecker implements StudentInterface {

    private String[] validSchools = {"MHG", "REAAL", "KARDLA", "NOO"};
    private String idCode;
    private String schoolCode;


    public StudentChecker(String idCode, String schoolCode) {
        this.idCode = idCode;
        this.schoolCode = schoolCode;
    }


    @Override
    public boolean isStudent(String idCode, String schoolCode) {
        return (this.idCode.startsWith("5") ||
                this.idCode.startsWith("6")) &&
                Arrays.asList(validSchools).contains(this.schoolCode);
    }
}