package Kodu11.Airline;


public class NordicaBoardingPass implements BoardingPass{

    private String firstName;
    private String lastName;
    private long ticketCode;

    public NordicaBoardingPass(String firstName, String lastName, long ticketCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketCode = ticketCode;
    }
    @Override
    public String getPassangerFirstName() {
        return firstName;
    }

    @Override
    public String getPassangerLastName() {
        return lastName;
    }

    @Override
    public long getTicketCode() {
        return ticketCode;
    }
}
