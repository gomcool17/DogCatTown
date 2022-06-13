package DCtown.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 10)
    private String nickName;
    @Column(nullable = false, length = 15)
    private String password;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 20)
    private String city;

    @CreationTimestamp
    private Timestamp createTime;
}
