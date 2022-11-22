public class CustomExceptions {
    static class IncorrectLengthException extends Exception {
        public IncorrectLengthException(String message) {
            super(message);
        }
    }
}
