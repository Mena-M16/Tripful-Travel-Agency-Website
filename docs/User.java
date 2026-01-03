package TRIP;

/**
 * @author Hp
 * @version 1.0
 * @created 29-Dec-2025 9:30:52 PM
 */
public class User {

	private int dateJoined;
	private char email;
	private char fullName;
	private int passwordHash;
	private int phone;
	private int userid;
	public Review m_Review;

	public User() {
	}

	public User(int id, char name) {
		userid = id;
		fullName = name;
	}

	public int getUserId() {
		return userid;
	}

	public char getFullName() {
		return fullName;
	}

	public void setUserId(int id) {
		userid = id;
	}

	public void setFullName(char name) {
		fullName = name;
	}

	public void display() {
		System.out.println("User ID: " + userid);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}