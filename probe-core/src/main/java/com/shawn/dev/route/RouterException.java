package com.shawn.dev.route;

/**
 * Created by Qijun on 2016/1/25.
 */
public class RouterException extends RuntimeException {

    public RouterException(String message) {
        super(message);
    }

    public RouterException(String message, Throwable cause) {
        super(message, cause);
    }

    public RouterException(Throwable cause) {
        super(cause);
    }

}
