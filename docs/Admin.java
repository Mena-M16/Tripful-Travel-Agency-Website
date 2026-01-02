package TRIP;

/**
 * @author Hp
 * @version 1.0
 * @created 29-Dec-2025 9:29:47 PM
 */
public class Admin extends User {

	private int adminId;
	private char permissions;
	private char role;

	public Admin() {
		super();
	}

	public Admin(int id, char name) {
		super(id, name);
		adminId = id;
	}

	public void manageUser() {
		System.out.println("Managing users");
	}

	public void updateServices() {
		System.out.println("Services updated");
	}

	public void viewReport() {
		System.out.println("Viewing report");
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int id) {
		adminId = id;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}