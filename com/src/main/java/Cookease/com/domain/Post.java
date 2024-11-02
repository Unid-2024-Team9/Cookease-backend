package Cookease.com.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Getter
public class Post extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")  // `User` 엔티티와의 연관 관계 설정
    private Member member;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder
    public Post(Member member, String content) {
        this.member = member;
        this.content = content;
    }
}
