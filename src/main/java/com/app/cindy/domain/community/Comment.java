package com.app.cindy.domain.community;

import com.app.cindy.domain.BaseEntity;
import com.app.cindy.domain.user.User;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "Comment")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
public class Comment extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false,insertable=false, updatable=false)
    private User user;

    @Column(name="user_id")
    private Long userId;


    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false,insertable=false, updatable=false)
    private Board board;

    @Column(name="board_id")
    private Long boardId;

}
