package org.choongang;

import lombok.Data;

@Data
public class SocketData {
    private String from; // 보내는쪽
    private String to; // 받는쪽
    private String message;
}
