public class OutOfRangeException extends Exception {
    public void checkvalue(int value, int MIN, int MAX) throws OutOfRangeException {
        if (value < MIN || value > MAX) {
            throw new OutOfRangeException(); // โยน error ถ้าค่าเกินขอบเขต
        }
    }
}
