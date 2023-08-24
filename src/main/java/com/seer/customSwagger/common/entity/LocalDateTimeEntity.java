package com.seer.customSwagger.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class LocalDateTimeEntity {
    @CreatedDate
    @Column(name="create_dt")
    private LocalDateTime createDt;

    @LastModifiedDate
    @Column(name = "update_dt")
    private LocalDateTime updateDt;
}
