//Создать абстрактный базовый класс Worker (работника) с методом Print(). Создайте четыре производных
//        класса: President, Security, Manager, Engineer. Переопределите метод.
//        Print() для вывода информации, соответствующей
//        каждому типу работника.
public class Zadanie_3 {
    public void task3() {
        Worker president=new President();
        Worker security=new Security();
        Worker manager=new Manager();
        Worker engineer=new Engineer();
        president.Print();
        security.Print();
        manager.Print();
        engineer.Print();
    }
}
abstract class Worker {
    public abstract void Print();
}
class President extends  Worker{
    @Override
    public void Print() {
        System.out.println("Информация о President");
    }
}
class Security extends  Worker{
    @Override
    public void Print() {
        System.out.println("Информация о Security");
    }
}
class Manager extends  Worker{
    @Override
    public void Print() {
        System.out.println("Информация о Manager");
    }
}
class Engineer extends  Worker{
    @Override
    public void Print() {
        System.out.println("Информация о Engineer");
    }
}