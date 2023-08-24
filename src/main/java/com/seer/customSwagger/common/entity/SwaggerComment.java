package com.seer.customSwagger.common.entity;

import com.seer.customSwagger.common.enums.IsYn;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Getter
@Table(name = "swagger_comments")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class SwaggerComment extends LocalDateTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "swagger_comment_id", updatable = false)
    private Long id;

    @Column(name="user_name", nullable = false)
    private String userName;

    @Column(name="method", nullable = false)
    private String method;

    @Column(name="path", nullable = false)
    private String path;

    @Column(name="content", nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(name="is_delete")
    private IsYn isDelete;

    @Builder
    public SwaggerComment(String userName, String method, String path, String content, IsYn isDelete) {
        this.userName = userName;
        this.method = method;
        this.path = path;
        this.content = content;
        this.isDelete = isDelete;
    }

    public void update(String content, IsYn isDelete) {
        this.content = content;
        this.isDelete = isDelete;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIsDelete(IsYn isDelete) {
        this.isDelete = isDelete;
    }
}
