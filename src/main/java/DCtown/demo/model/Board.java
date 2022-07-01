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
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 100)
    private String title;
    @Lob //large data
    private String content;
    @Column(columnDefinition = "integer default 0")
    private Integer count;
    @ManyToOne
    private User user;
    @Column(columnDefinition = "integer default 0")
    private Integer love;

    @CreationTimestamp
    private Timestamp createDate;
}
