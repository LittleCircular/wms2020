package p1.JDBCDemo1.entity;

public class Teachers {
	private int id;
	private String name;
	
	public Teachers() {
		super();
	}
	public Teachers(int id, String name) {
		super();
		this.setId(id);
		this.setName(name);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Teachers [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return this.getClass().hashCode() + id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teachers other = (Teachers) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
