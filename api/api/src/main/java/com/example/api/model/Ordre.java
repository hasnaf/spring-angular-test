package com.example.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ordre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    , mappedBy = "order"
    //@JoinColumn(name="offer_id", referencedColumnName = "id")
    @OneToMany( cascade=CascadeType.ALL)
    private List<Article> articles;

}
