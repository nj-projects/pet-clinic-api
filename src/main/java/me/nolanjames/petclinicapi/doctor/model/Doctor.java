package me.nolanjames.petclinicapi.doctor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.nolanjames.petclinicapi.common.user.model.User;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "doctor_id")
public class Doctor extends User {
     private long id;
     private String specialization;
}
