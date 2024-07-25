package org.choongang.member.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -1096527217L;

    public static final QMember member = new QMember("member1");

    public final org.choongang.global.entities.QBaseEntity _super = new org.choongang.global.entities.QBaseEntity(this);

    public final EnumPath<org.choongang.member.constants.Authority> authority = createEnum("authority", org.choongang.member.constants.Authority.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final ListPath<org.choongang.board.entities.BoardData, org.choongang.board.entities.QBoardData> items = this.<org.choongang.board.entities.BoardData, org.choongang.board.entities.QBoardData>createList("items", org.choongang.board.entities.BoardData.class, org.choongang.board.entities.QBoardData.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final StringPath password = createString("password");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath userName = createString("userName");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

