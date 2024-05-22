package member;

public class User {

    private String userId;
    private String userNm;

    private User() {}


    static class Builder {
        private User user = new User();
    }
}
