package Universidad;


/**
 * @author kendr
 * @version 1.0
 * @created 05-sep.-2024 18:19:01
 */
public class Professor {

	private String id;
	private String name;
	private String lastname;
	private int title;
	public Coordination m_Coordination;

	public Professor(){

	}

	public Coordination getCoordination(){
		return m_Coordination;
	}

	/**
	 * 
	 * @param coordination
	 */
	public void setCoordination(Coordination coordination){

	}
}//end Professor