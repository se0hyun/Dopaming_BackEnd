package com.dopaming.dopaming.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Pamings {

    @Id
    @GeneratedValue
    private Long post_id;

    @Column
    private String paming_title;

    @Column
    private LocalDateTime start_date;

    @Column
    private LocalDateTime end_date;

    @Column
    private String info;

    @Column
    private boolean pub_priv;

    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column
    @Enumerated(EnumType.STRING)
    private Region region;

    @Column
    private String photo_name;

    @OneToMany(mappedBy = "pamings")
    private List<Steps> steps = new ArrayList<>();
}
