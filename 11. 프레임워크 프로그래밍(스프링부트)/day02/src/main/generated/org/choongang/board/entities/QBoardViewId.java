package org.choongang.board.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardViewId is a Querydsl query type for BoardViewId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QBoardViewId extends BeanPath<BoardViewId> {

    private static final long serialVersionUID = -472354115L;

    public static final QBoardViewId boardViewId = new QBoardViewId("boardViewId");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final NumberPath<Integer> uid = createNumber("uid", Integer.class);

    public QBoardViewId(String variable) {
        super(BoardViewId.class, forVariable(variable));
    }

    public QBoardViewId(Path<? extends BoardViewId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardViewId(PathMetadata metadata) {
        super(BoardViewId.class, metadata);
    }

}

