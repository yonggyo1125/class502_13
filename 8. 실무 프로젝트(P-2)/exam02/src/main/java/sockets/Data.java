package sockets;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter @Setter @ToString
public class Data implements Serializable {
    private String from;
    private String to;
    private String message;
}
