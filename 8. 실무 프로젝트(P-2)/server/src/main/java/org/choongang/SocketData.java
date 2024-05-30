package org.choongang;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime regDt;
}
