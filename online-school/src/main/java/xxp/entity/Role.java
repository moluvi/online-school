package xxp.entity;

public class Role {
	private Integer id;
	private String name;
	private String nameZh;
	
	public Role () {}

	public Role(Integer id, String name, String nameZh) {
		super();
		this.id = id;
		this.name = name;
		this.nameZh = nameZh;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameZh() {
		return nameZh;
	}

	public void setNameZh(String nameZh) {
		this.nameZh = nameZh;
	}
	
	
}
