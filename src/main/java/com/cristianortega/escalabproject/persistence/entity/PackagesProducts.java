package com.cristianortega.escalabproject.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "packages")
@Getter
@Setter
public class PackagesProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid")
    private String id;
    @Column
    private String code;
    @Column
    private Double weight;
    @Column
    private Integer quantity;
    @Column(name = "is_deleted", columnDefinition = "TINYINT")
    private Boolean delated;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
    @ManyToOne
    @JoinColumn(name = "id_package", referencedColumnName = "uuid", insertable = false, updatable = false)
    private Packages packages;
}
