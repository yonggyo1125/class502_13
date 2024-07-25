package org.choongang.member.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberProfile is a Querydsl query type for MemberProfile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberProfile extends EntityPathBase<MemberProfile> {

    private static final long serialVersionUID = -1194680294L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberProfile memberProfile = new QMemberProfile("memberProfile");

    public final QMember member;

    public final StringPath profileImage = createString("profileImage");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath status = createString("status");

    public QMemberProfile(String variable) {
        this(MemberProfile.class, forVariable(variable), INITS);
    }

    public QMemberProfile(Path<? extends MemberProfile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberProfile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberProfile(PathMetadata metadata, PathInits inits) {
        this(MemberProfile.class, metadata, inits);
    }

    public QMemberProfile(Class<? extends MemberProfile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

