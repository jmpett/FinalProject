package Final;

/**
 * @author Joe Pett 
 * An athlete class used to store athlete attributes
 */
public class athlete extends owner {
	private String name;
	private String team;
	private String position;

	/**
	 * Default Constructor
	 */
	public athlete() {
	}


	/**
	 * @param name, athlete name
	 * @param team, athlete team
	 * @param position, athlete position
	 * Constructor
	 */
	public athlete(String name, String team, String position) {
		this.name = name;
		this.team = team;
		this.position = position;
	}

	/*
	 * (non-Javadoc)
	 * @see Final.owner#getName()
	 */
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * @see Final.owner#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return used to get the team name of the athlete. 
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team, used to set the team name of the athlete. 
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * @return used to get the position of the athlete. 
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position, used to set the position of the athlete. 
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/*
	 * (non-Javadoc)
	 * @see Final.owner#toString()
	 */
	@Override
	public String toString() {
		return name + ", " + team + ", " + position;
	}

}
