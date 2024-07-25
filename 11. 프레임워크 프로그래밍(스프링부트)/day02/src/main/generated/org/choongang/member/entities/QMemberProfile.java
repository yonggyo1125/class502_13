package org.choongang.member.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberProfile is a Querydsl query type for MemberProfile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberProfile extends EntityPathBase<MemberProfile> {

    private static final long serialVersionUID = -1194680294L;

    public static final QMemberProfile memberProfile = new QMemberProfile("memberProfile");

    public final StringPath profileImage = createString("profileImage");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath status = createString("status");

    public QMemberProfile(String variable) {
        super(MemberProfile.class, forVariable(variable));
    }

    public QMemberProfile(Path<? extends MemberProfile> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberProfile(PathMetadata metadata) {
        super(MemberProfile.class, metadata);
    }

}

