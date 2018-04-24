package Final;

/**
 * @author Joe Pett 
 * An owner class used to store owner attributes
 */
public class owner {
	private int draftOrderNum;
	private String ownerName;

	/**
	 * Default Constructor
	 */
	public owner() {
	}

	/**
	 * Constructor
	 */
	public owner(int draftOrderNum, String name) {
		this.draftOrderNum = draftOrderNum;
		this.ownerName = name;
	}

	/**
	 * @return
	 */
	public int getDraftOrderNum() {
		return draftOrderNum;
	}

	/**
	 * @param draftOrderNum
	 */
	public void setDraftOrderNum(int draftOrderNum) {
		this.draftOrderNum = draftOrderNum;
	}

	/**
	 * @return
	 */
	public String getName() {
		return ownerName;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.ownerName = name;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pick# " + draftOrderNum + ": " + ownerName + "= ";
	}

}
