package kg.ort.www.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "options")
@Data
@NoArgsConstructor
public class Option {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name= "queston_id", nullable=false)
	private Question questions;

	@Column(length=50,name = "statement")
	private String option;

	public Option(Question questions, String option) {
		this.questions = questions;
		this.option = option;
	}

}
