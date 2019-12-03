package practise.JavasePackage;

public class CarTest {
    static Car[] car = new Car[20];
    static int count = 0;

    static {
        for (int i = 0; i < 5; i++) {
            car[i] = new Car("大奔" + i + "系列", "大奔", "color" + i, "2018-01-1" + i, "china");
            count++;
        }
    }

    public static void adar(Car ca) {
        car[count++] = ca;
    }

    public static void delmar(String model) {
        for (int i = 0; i < count; i++) {
            if (car[i].getModel().equals(model)) {
                for (int k = i; k < count; k++) {
                    car[k] = car[k + 1];
                    if (k == count - 1) {
                        car[k] = null;
                        break;
                    }
                }
                count--;
                break;
            }
        }
    }


    public static void println() {

        for (int i = 0; i < count; i++) {

            System.out.println(car[i].toString());
        }
    }

    public static void main(String[] args) {
        Car c = new Car("大奔" + 9 + "系列", "大奔", "color" + 9, "2018-01-1" + 9, "china");
        adar(c);
        delmar("大奔" + 4 + "系列");
        println();
    }
}