package com.fms.models;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Farm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(message = "Farm name is invalid", min = 3, max = 50)
    private String farmName;

    @Column(unique = true)
    private UUID farmToken;

    private String image;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(nullable = false)
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "farm")
    @ToString.Exclude
    private Set<Field> fields = new HashSet<>();

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "farm", fetch = FetchType.EAGER)
    private Set<PersonalData> workers = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Farm farm = (Farm) o;
        return id != null && Objects.equals(id, farm.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
