package com.example.jpa.example1;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "user")
public class UserAddress {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String address;
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private User user;
}
