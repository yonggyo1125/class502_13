package org.choongang.global.rests;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class JSONData {
    private HttpStatus status = HttpStatus.OK;
    private boolean success = true;
    private Object message;
    @NonNull
    private Object data;
}
