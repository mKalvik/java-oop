package Kodu2;


import Kodu2.SchoolDoor.ElectronicLock;

public class LockController {

    public static void main(String[] args) {

        ElectronicLock lock1 = new ElectronicLock("REAAL");
        lock1.isValidCard("5111111111111");

        ElectronicLock lock2 = new ElectronicLock("KARDLA");
        lock2.isValidCard("4111111111111");

        ElectronicLock lock3 = new ElectronicLock("KARDLA");
        lock3.isValidCard("6222222222222");

        ElectronicLock lock4 = new ElectronicLock("KAPAK");
        lock4.isValidCard("5222222222222");

        ElectronicLock lock5 = new ElectronicLock("NOO");
        lock5.isValidCard("52325333333333");

        ElectronicLock lock6 = new ElectronicLock("NOO");
        lock6.isValidCard("1111111111111111");
    }
}
