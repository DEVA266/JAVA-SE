//package ticket.booking.services;
//
//
//import ticket.booking.entites.User;
//
//import java.io.File;
//import java.io.IOException;
//import java.lang.reflect.Type;
//import java.util.List;
//
//public class UserServices {
//    private final User user;
//
//    private static final String USER_PATH = "src/main/java/ticket/booking/localDB/user.json";
//
//    private List<User> userList;
//
//    private ObjectMapper objectMapper = new ObjectMapper();
//
//    public UserServices(User user1) throws IOException {
//        this.user = user1;
//        File userfile = new File(USER_PATH);
//        userList = objectMapper.readValue(userfile, new TypeReference<List<User>>() {
//            @Override
//            public Type getType() {
//                return super.getType();
//            }
//        });
//    }
//}
