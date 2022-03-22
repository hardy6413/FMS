package com.fms.models;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(message = "City length is invalid", min = 3, max = 30)
    private String city;

    @Length(message = "Street length is invalid", min = 3, max = 30)
    private String street;

    @Length(message = "Postal code length is invalid", min = 3, max = 30)
    private String postalCode;

    @Length(message = "Building number is invalid", min = 1, max = 30)
    private String buildingNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Address address = (Address) o;
        return id != null && Objects.equals(id, address.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
