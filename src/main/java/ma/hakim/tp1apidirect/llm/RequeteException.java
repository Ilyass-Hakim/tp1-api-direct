package ma.hakim.tp1apidirect.llm;

public class RequeteException extends Exception {

    private final String requeteJson;

    public RequeteException(String message, String requeteJson) {
        super(message);
        this.requeteJson = requeteJson;
    }

    public String getRequeteJson() {
        return requeteJson;
    }
}
