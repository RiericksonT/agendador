package com.gabipsi.agendamentos.infra.persistence.psychologist;

import com.gabipsi.agendamentos.domain.WorkSchedule;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "psychologists")
public class PsychologistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String crp;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @ManyToMany
    @JoinTable(
            name = "psychologist_work_schedule",
            joinColumns = @JoinColumn(name = "psychologist_id"),
            inverseJoinColumns = @JoinColumn(name = "work_schedule_id")
    )
    private Set<WorkScheduleEntity> workSchedules = new HashSet<>();

    @Column(nullable = false)
    private String password;

    public PsychologistEntity() {}

    public PsychologistEntity(String name, String crp, String email, String phone, HashSet<WorkScheduleEntity> workSchedules, String password) {
        this.name = name;
        this.crp = crp;
        this.email = email;
        this.phone = phone;
        this.workSchedules = workSchedules;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<WorkScheduleEntity> getWorkSchedules() {
        return workSchedules;
    }

    public void setWorkSchedules(Set<WorkScheduleEntity> workSchedules) {
        this.workSchedules = workSchedules;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
