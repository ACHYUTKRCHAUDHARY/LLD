package org.example.cabbooking.Models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity//entity annotations works on java logic
@Table(name = "bookingreview")//table annotations only works on table logic


public class Review {
    @Id //this annotations match the primary key of the table
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identity means auto _ increment
    private Long id;

    @Column(nullable = false)
    private String content;

    private double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)//this tells us about the format of the
    // date to stored
    @CreatedDate//this annotation tells that only handle it for creation
    private Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate//this annotation tells spring that only handle it for
    // object creation
    @Column(nullable = false)
    private Date updatedAt;
}
/**
 * whenever we are inserting and creating the new objects in the java schema
 * review(id,content,rating,createdAt,updatedAt) then we have implement the
 * manual insertion.
 * but we can automate this things by adding the automation to the date columns
 */
