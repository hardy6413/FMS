package com.fms.models;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonalData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Length(message = "Name length is invalid", min = 3, max = 30)
    private String firstName;

    @Length(message = "Last name length is invalid", min = 3, max = 30)
    private String lastName;

    private Boolean isOwner;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(nullable = false)
    private Address address;

    @ManyToOne
    @JoinColumn(name = "farm_id")
    private Farm farm;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "personalData")
    @ToString.Exclude
    private Set<FieldAction> fieldActions = new HashSet<>();

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "personalData")
    @ToString.Exclude
    private Set<Task> tasks = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersonalData that = (PersonalData) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
