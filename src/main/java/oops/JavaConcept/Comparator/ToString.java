package oops.JavaConcept.Comparator;

public class ToString {
    public static class Car{
        String brand;
        public Car()
        {

        }
        public Car(String brand){
            this.brand=brand;
        }
        public String getBrand()
        {
            return brand;
        }

        public void setBrand(String brand)
        {
            this.brand=brand;
        }

        @Override
        public String toString() {
            return brand;
        }
    }

    public static void main(String[] args){
        Car car = new Car();
        car.brand = "BMW";
        System.out.println(car);
    }

}
