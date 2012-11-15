package career.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Career {

	@Id
	@GeneratedValue
	public Integer id;
	@Column(name = "STAFF_ID")
	public Integer staffId;
	public String name;
	public String customer;
	public String summary;
	@Column(name = "PROJECT_MEMBERS")
	public Integer projectMembers;
	@Column(name = "TEAM_MEMBERS")
	public Integer teamMembers;
	@Column(name = "START_YM")
	public String startYm;
	@Column(name = "END_YM")
	public String endYm;

	@OneToMany(mappedBy = "career")
	public List<CareerOs> careerOsList;

	@OneToMany(mappedBy = "career")
	public List<CareerLang> careerLangList;

	@OneToMany(mappedBy = "career")
	public List<CareerMiddle> careerMiddleList;

	@OneToMany(mappedBy = "career")
	public List<CareerDb> careerDbList;

	@OneToMany(mappedBy = "career")
	public List<CareerRole> careerRoleList;

	@OneToMany(mappedBy = "career")
	public List<CareerAssign> careerAssignList;

	@ManyToOne
	public Staff staff;
}
