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

    private static final PathInits INITS = PathInits.DIRECT2;

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

    public final QMemberProfile profile;

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath userName = createString("userName");

    public QMember(String variable) {
        this(Member.class, forVariable(variable), INITS);
    }

    public QMember(Path<? extends Member> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMember(PathMetadata metadata, PathInits inits) {
        this(Member.class, metadata, inits);
    }

    public QMember(Class<? extends Member> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.profile = inits.isInitialized("profile") ? new QMemberProfile(forProperty("profile"), inits.get("profile")) : null;
    }

}

