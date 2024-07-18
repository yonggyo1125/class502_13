package org.choongang.exam;

import lombok.Data;

@Data
public class PostData {
    private long userId;
    private long id;
    private String title;
    private String body;
}
