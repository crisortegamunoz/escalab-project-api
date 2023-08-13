package com.cristianortega.escalabproject.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "drivers")
@Getter
@Setter
public class Drivers {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid")
    private String id;
    @Column
    private String code;
    @Column
    private String name;
    @Column
    private String cellphone;
    @Column
    private String email;
    @Column(columnDefinition = "TINYINT")
    private Boolean enable;
    @Column(name = "is_deleted", columnDefinition = "TINYINT")
    private Boolean delated;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "truck_id")
    private Trucks truck;
}
