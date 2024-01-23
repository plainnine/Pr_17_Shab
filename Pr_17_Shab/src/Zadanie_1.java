public class Zadanie_1 {
    public void task1() {
        Устройство устройство=new Устройство("Уст");
        Чайник чайник=new Чайник("чай");
        Микроволновка микроволновка=new Микроволновка("микро");
        Автомобиль автомобиль=new Автомобиль("авто");
        Пароход пароход=new Пароход("пар");
        устройство.Show();
        устройство.Desc();
        устройство.Sound();
        чайник.Show();
        чайник.Desc();
        чайник.Sound();
        автомобиль.Show();
        автомобиль.Desc();
        автомобиль.Sound();
        пароход.Show();
        пароход.Desc();
        пароход.Sound();
    }
}
class Устройство{ // практика 17
    private String имя;
    public Устройство(String имя){
        this.имя=имя;
    }
    public void Sound(){System.out.println("Звук устройства");}
    public void Show(){System.out.println("Название устройства: "+имя);}
    public void Desc(){
        System.out.println("Описание устройства");
    }
}

class Чайник extends Устройство{
    public  Чайник(String имя){super(имя);}
}
class Микроволновка extends Устройство{
    public Микроволновка(String имя){super(имя);}
}
class Автомобиль extends Устройство{
    public Автомобиль(String имя){super(имя);}
}
class Пароход extends Устройство{
    public Пароход (String имя){super(имя);}
}
