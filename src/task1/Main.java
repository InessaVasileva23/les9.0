package task1;

//Заставить программу ”Hello, World!” упасть…
// Смоделировав ошибку «NullPointerException»
// Смоделировав ошибку «ArrayIndexOutOfBoundsException»
// Вызвав свой вариант ошибки через оператор throw


class HelloWorld {
    String Hello;
    String World;
    public void Test (HelloWorld x){
        x.Hello="Hello";
    }
}

class Car {
   int [] myArray = {1, 2, 3, 4, 5};
   public void DisPlay (int n) {
       myArray [n] = 8;
          }
}
class Bike {
    String brand = "bmw";
       public void GetCar(String C) throws CarException {
           switch (C) {
            case ("bmw"):
                System.out.println("Любимая машина " +C);
                break;
            default:
                throw new CarException(C);
        }
    }
}
class CarException extends Exception {
    String inBrand;
    CarException(String C){
        inBrand = C;
    }


    }
class Main {
    public static void main(String[] args) {
    try {
        int g;
        System.out.println("Hello, World!");
        HelloWorld n = new HelloWorld();
        n.Test(null);
        }
    catch (NullPointerException I){
        System.out.println("Не объявлен класс HelloWorld ");
    }
    try{
        Car D = new Car();
        D.DisPlay(8);
    }
    catch (ArrayIndexOutOfBoundsException O){
        System.out.println("Ошибка при обращении к элементу массива по отрицательному или превышающему размер массива индексу");
    }

    try {
        Bike B = new Bike();
        B.GetCar ("bmw");
    }
        catch (CarException W){
            System.out.println("не моя машина " + W.inBrand);

        }

    }
    }


