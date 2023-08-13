package com.cristianortega.escalabproject.persistence.entity;

import com.cristianortega.escalabproject.persistence.enumeration.StatusPackage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "packages")
@Getter
@Setter
public class Packages {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid")
    private String id;
    @Column
    private String code;
    @Column
    private Double weight;
    @Column
    private LocalDateTime schedule;
    @Column
    @Enumerated(EnumType.STRING)
    private StatusPackage status;
    @Column(name = "is_deleted", columnDefinition = "TINYINT")
    private Boolean delated;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
    @ManyToOne
    @JoinColumn(name = "id_truck", referencedColumnName = "uuid", insertable = false, updatable = false)
    private Trucks trucks;
    @OneToMany(mappedBy = "packages", fetch = FetchType.LAZY)
    private List<PackagesProducts> packagesProducts;
}
