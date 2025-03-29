package io.datajek.springdatajdbc.tennisplayerrest;

import java.io.Serial;

public class PlayerNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public PlayerNotFoundException() {
        super();

    }

    public PlayerNotFoundException(String message) {
        super(message);

    }

    public PlayerNotFoundException(String message, Throwable cause) {
        super(message, cause);

    }

    public PlayerNotFoundException(Throwable cause) {
        super(cause);

    }
}