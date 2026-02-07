package dev.masoom.productcatalogservice.models;

import java.util.Date;

public abstract class BaseModel {
    private long id;
    private Date createdAt;
    private Date updatedAt;
    private State state;
}
