package kt2;


public class Bill extends Stock {

    private String deadline;

    public Bill(String shortName, String name, String deadline) {
        super(shortName, name);
        this.deadline = deadline;
    }

    public String getDate() {
        return deadline;
    }
}
