public class StudyRoom implements Borrowable {
    private String roomName;
    private int roomNumber;

    public StudyRoom(String roomName, int roomNumber) {
        this.roomName = roomName;
        this.roomNumber = roomNumber;
    }

    @Override
    public void borrowItem() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
