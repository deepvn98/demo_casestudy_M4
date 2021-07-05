package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private KhoaHoc khoaHoc;
    @ManyToOne
    private UserApp userTeacher;
    @ManyToOne
    private UserApp userStudent;
    @OneToOne
    private District district;
}
