package org.choongang.board.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class BoardView {
    @EmbeddedId
    private BoardViewId id;
}
/*
@IdClass(BoardViewId.class)
public class BoardView {
    @Id
    private long seq;

    @Id
    @Column(name="_uid")
    private int uid;
}
*/