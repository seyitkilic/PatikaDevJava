package Week2;

public class CustomExeption extends Exception {
    String message;

    public CustomExeption(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
