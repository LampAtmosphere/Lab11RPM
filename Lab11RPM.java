public class Lab11RPM {
    public static void main(String[] args) {
        Phone Arduino = new Phone("Arduino Nano mini", 177, 87);
        Printer TSC  = new Printer("TSC TE200", 16000,82);
        Book Фантастика = new Book("Приключения Перси Джексона", 2500,98);

        Customer Vados = new Customer("VADOS", "parollepr");
        Admin KArlik = new Admin("Karlik1", "qwerty");
        Moderator Schlepa = new Moderator("Schlepa5", "ytrewq");

        Pokupatel Pok = new Pokupatel("Arduino Nano Blue pro", 177,87,"Vados","parollepr");
        Pok.Pokupka();
}}
interface tovar{
    String tovarName();
    Integer tovarCost();
    Integer tovarRaiting();
}
class Book implements tovar{
    String Name;
    Integer Cost;
    Integer Raiting;
    Book(String Name,Integer Cost, Integer Raiting){
        this.Name = Name;
        this.Cost = Cost;
        this.Raiting = Raiting;
    }
    @Override
    public String tovarName(){
        return Name;
    }
    @Override
    public Integer tovarCost(){
        return Cost;
    }
    @Override
    public Integer tovarRaiting(){
        return Raiting;
    }
}
class Phone implements tovar{
    String Name;
    Integer Cost;
    Integer Raiting;
    Phone(String Name,Integer Cost, Integer Raiting){
        this.Name = Name;
        this.Cost = Cost;
        this.Raiting = Raiting;
    }
    @Override
    public String tovarName(){
        return Name;
    }
    @Override
    public Integer tovarCost(){
        return Cost;
    }
    @Override
    public Integer tovarRaiting(){
        return Raiting;
    }
}
class Printer implements tovar{
    String Name;
    Integer Cost;
    Integer Raiting;
    Printer(String Name,Integer Cost, Integer Raiting){
        this.Name = Name;
        this.Cost = Cost;
        this.Raiting = Raiting;
    }
    @Override
    public String tovarName(){
        return Name;
    }
    @Override
    public Integer tovarCost(){
        return Cost;
    }
    @Override
    public Integer tovarRaiting(){
        return Raiting;
    }
}
interface User{
    String UserLogin();
    String UserPassword();}

class Customer implements User{
    String Login;
    String Password;
    Customer(String Login,String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public String UserLogin() {
        return Login;
    }
    @Override
    public String UserPassword() {
        return Password;
    }
}
class Moderator implements User{
    String Login;
    String Password;
    Moderator(String Login,String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public String UserLogin() {
        return Login;
    }
    @Override
    public String UserPassword() {
        return Password;
    }
}
class Admin implements User{
    String Login;
    String Password;
    Admin(String Login,String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public String UserLogin() {
        return Login;
    }
    @Override
    public String UserPassword() {
        return Password;
    }
}
class Pokupatel implements tovar,User{
    String Name;
    Integer Cost;
    Integer Raiting;
    String Login;
    String Password;

    Pokupatel(String Name,Integer Cost, Integer Raiting,String Login,String Password){
        this.Name = Name;
        this.Cost = Cost;
        this.Raiting = Raiting;
        this.Login = Login;
        this.Password = Password;}
        @Override
        public String tovarName(){
            return Name;
        }
        @Override
        public Integer tovarCost(){
            return Cost;
        }
        @Override
        public Integer tovarRaiting() {
            return Raiting;
        }
        @Override
        public String UserLogin() {
            return Login;
        }
        @Override
        public String UserPassword() {
            return Password;
        }
        public void Pokupka() {
        System.out.println(Login + " Купил " + Name + " За " + Cost + " рублей");
    }

}
