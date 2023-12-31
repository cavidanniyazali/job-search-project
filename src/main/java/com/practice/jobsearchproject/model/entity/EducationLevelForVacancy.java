package com.practice.jobsearchproject.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@Entity
@Table(name = "education_levels")
@AllArgsConstructor
public class EducationLevelForVacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "level")
    private String level;
    @OneToMany(mappedBy = "educationLevelForVacancy")
    private List<Vacancy> vacancies;
}
