package Universidad;


import java.util.ArrayList;

/**
 * @author kendr
 * @version 1.0
 * @created 05-sep.-2024 18:19:00
 */
public class Faculty {

	private String building;
	private int id;
	private String name;
	public ArrayList<Coordination> coordinations;

	public Faculty(){
		coordinations = new ArrayList<>();
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
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

	/**
	 * 
	 * @param id
	 * @param name
	 */

	public void addCoordination(int id, String name){
		coordinations.add(new Coordination(id, name));
	}

	public ArrayList<Coordination> showCoordinationList(){
		return coordinations;
	}

	@Override
	public String toString() {
		return "Faculty{" +
				"building='" + building + '\'' +
				", id=" + id +
				", name='" + name + '\'' +
				",\ncoordinations=" + coordinations +
				'}';
	}
}//end Faculty