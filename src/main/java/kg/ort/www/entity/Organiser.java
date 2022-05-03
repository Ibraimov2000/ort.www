package kg.ort.www.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "organisers")
@Data
public class Organiser implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false,unique=true,length=50)
	private String email;
	
	@Column(nullable=false,length=50)
	private String name;
	
	@Column(nullable=false,length=250)
	private String password;
	
	/*
	 * organiser Id is the foreign key in the exam paper
	 */
	@OneToMany(mappedBy="organisers")
	private List<Exam> exams= new ArrayList<Exam>();
}