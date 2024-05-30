package org.choongang;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocketData {
    private String from; // 보내는쪽
    private String to; // 받는쪽
    private String message;
    private LocalDateTime regDt;
}
