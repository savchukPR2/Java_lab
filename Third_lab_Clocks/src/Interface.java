public interface Interface
{
    String getBrand();
    int getPrice();
    void printWatch();
    String printBiggestPrice();
    enum Arrow { Hours, Minutes, Seconds }
    void setTime(Arrow type, int Value);
}