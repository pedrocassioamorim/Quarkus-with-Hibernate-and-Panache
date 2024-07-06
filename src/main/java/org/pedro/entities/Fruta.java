package org.pedro.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Fruta extends PanacheEntity {

    public String name;

    public int quantity;




}
