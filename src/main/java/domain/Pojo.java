package domain;

import javax.persistence.*;

@Entity
@Table(name = "pojo_table")
public class Pojo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
