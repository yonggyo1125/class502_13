package org.choongang;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SocketData {
    private String from;
    private String to;
    private String message;
}
