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
	 * @param draftOrderNum, draft order number.
	 * @param name, owner name.
	 * Constructor
	 */
	public owner(int draftOrderNum, String name) {
		this.draftOrderNum = draftOrderNum;
		this.ownerName = name;
	}

	/**
	 * @return used to get the draft order number.
	 */
	public int getDraftOrderNum() {
		return draftOrderNum;
	}

	/**
	 * @param draftOrderNum, used to set the draft order number. 
	 */
	public void setDraftOrderNum(int draftOrderNum) {
		this.draftOrderNum = draftOrderNum;
	}

	/**
	 * @return used to get the name of the owner.
	 */
	public String getName() {
		return ownerName;
	}

	/**
	 * @param name, used to set the name of the owner. 
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
