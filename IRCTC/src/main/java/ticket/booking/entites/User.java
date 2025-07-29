package ticket.booking.entites;

import java.util.List;

public class User {
    private String userId;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketsBooked;
    private String userName;
}
