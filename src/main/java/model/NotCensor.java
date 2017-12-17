package model;

import javax.persistence.*;

@Entity
@Table(name = "notcensor")
public class NotCensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
