class Vehicle {
    double basePerDay=1000,perKm=8;
    double rentalCost(int days){return days*basePerDay;}
    double rentalCost(int days,int kms){return days*basePerDay+kms*perKm;}
}
class Car extends Vehicle {
    double insurancePerDay=150;
    @Override double rentalCost(int days){return days*(basePerDay+insurancePerDay);}
    @Override double rentalCost(int d,int k){return d*(basePerDay+insurancePerDay)+k*perKm;}
}
class Bike extends Vehicle {
    Bike(){basePerDay=600;perKm=5;}
    @Override double rentalCost(int d,int k){return d*basePerDay+k*perKm*0.8;}
}
public class RentalDemo {
    public static void main(String[] args){
        System.out.println("Car cost: 3 days & 250 km => "+new Car().rentalCost(3,250));
        System.out.println("Bike cost: 2 days & 80 km => "+new Bike().rentalCost(2,80));
    }
}
