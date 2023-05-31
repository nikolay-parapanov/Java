package P07Generics.L02Car;

import java.util.ArrayList;
import java.util.List;

public class CarList<T extends Car> extends Object {

    List<T> cars = new ArrayList<>();

    public void addCar(T car) {
        cars.add(car);
    }

    public T getFastestCar() {
        T fastestCar = null;
        for (T car : cars) {
            if (fastestCar == null) {
                fastestCar = car;
            } else {
                if (car.horsePower > fastestCar.horsePower) {
                    fastestCar = car;
                }
            }
        }
        return fastestCar;
    }
}