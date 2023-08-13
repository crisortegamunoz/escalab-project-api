package com.cristianortega.escalabproject.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "trucks")
@Getter
@Setter
public class Trucks {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid")
    private String id;
    @Column
    private String code;
    @Column(columnDefinition = "TINYINT")
    private Boolean enable;
    @Column(name = "is_deleted", columnDefinition = "TINYINT")
    private Boolean delated;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
    @OneToOne(mappedBy = "truck", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Drivers drivers;
    @OneToMany(mappedBy = "trucks", fetch = FetchType.LAZY)
    private List<Packages> packages;
}
