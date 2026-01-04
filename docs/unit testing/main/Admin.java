package TRIP;

public class Admin extends User {

    private int adminId;
    private char role;

    public Admin(int userId, String name, int adminId, char role) {
        super(userId, name);
        this.adminId = adminId;
        this.role = role;
    }

    public int getAdminId() {
        return adminId;
    }

    public boolean canViewReport() {
        return role == 'A';
    }
}
