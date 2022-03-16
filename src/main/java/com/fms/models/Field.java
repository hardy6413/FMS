package com.fms.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Field {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double area;
    private String name;
    private String description;
    private Boolean isProperty;
    private String BlockNumber;
    private Double extraPayment;

    @ManyToOne
    @JoinColumn(name = "farm_id")
    private Farm farm;
    private String image;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "field")
    private Set<FieldAction> fieldActions;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Field field = (Field) o;
        return id != null && Objects.equals(id, field.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
