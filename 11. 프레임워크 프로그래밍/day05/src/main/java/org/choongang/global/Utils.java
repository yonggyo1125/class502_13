package org.choongang.global;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Utils {

    private final MessageSource messageSource;
    private final HttpServletRequest request;

    public Map<String, List<String>> getErrorMessages(Errors errors) {
        // FieldErrors
        Map<String, List<String>> messages = errors.getFieldErrors()
                .stream()
                .collect(Collectors.toMap(FieldError::getField, e -> getCodeMessages(e.getCodes())));

        // GlobalErrors
        List<String> gMessages = errors.getGlobalErrors()
                                    .stream()
                .flatMap(e -> getCodeMessages(e.getCodes()).stream()).toList();

        messages.put("global", gMessages);

        return messages;
    }


    public List<String> getCodeMessages(String[] codes) {
        List<String> messages = Arrays.stream(codes)
                .map(c -> messageSource.getMessage(c, null, request.getLocale()))
                .filter(s -> s != null && !s.isBlank())
                .toList();

        return messages;
    }
}
