package com.app.cindy.domain.community;

import com.app.cindy.domain.BaseEntity;
import com.app.cindy.domain.user.User;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "Board")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
public class Board extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false,insertable=false, updatable=false)
    private User user;

    @Column(name="user_id")
    private Long userId;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;



}
