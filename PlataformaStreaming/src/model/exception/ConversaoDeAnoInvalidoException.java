package model.exception;

public class ConversaoDeAnoInvalidoException extends RuntimeException {
    private String mensagem;

    public ConversaoDeAnoInvalidoException(String s) {
        this.mensagem = s;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
