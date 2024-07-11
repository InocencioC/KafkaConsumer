package org.example.kafkaconsumer.service;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Builder;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Builder

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="seqGen", sequenceName = "seq", initialValue = 1)
    private Long id;

    private String name;
    private Integer standard;
    private Integer rollNo;
}
