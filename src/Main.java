class Program {
    public static void main(String[] args) {
        Product sponge = new Sponge("Bob", 19.99);
        Product soap = new LiquidSoap("Soap from Tyler", 999999999.99);
        Product crisps = new Crisps("NotLays", 139.99);
        soap.getRating();
        System.out.println();

        User narrator = new Buyer("notIdentified", "1st_rule_of_the_fightClub", "JacksSmirkingRevenge@gmail.com");

        Transaction transaction = new Transaction(soap, narrator);
        transaction.doTransaction();
    }
}

interface Product {
    String getName();
    double getCost();
    void setRating(int rating);
    void getRating();
}
class Sponge implements Product {
    String nameProduct;
    double cost;
    double rating = 5;

    Sponge(String nameProduct, double cost){
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    @Override
    public String getName(){
        return nameProduct;
    }
    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setRating(int setRating) {
        rating = setRating;
    }

    @Override
    public void getRating() {
        System.out.println(STR."Отлично выполняет свою функцию, так ещё и подходит для мытья посуды, \{rating} звёзд");
    }
}
class LiquidSoap implements Product {
    String nameProduct;
    String about = """
            Там, где мыло стекало в реку, говорит Тайлер,
            после тысячелетий костров и дождей, люди стирали свою одежду и замечали,
            что она отстирывается лучше, чем в других местах.
            – Теперь ты знаешь, – говорит Тайлер, – что первое мыло в мире делали из героев.""";
    double cost;
    double rating = 5;

    LiquidSoap(String nameProduct, double cost){
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    @Override
    public String getName(){
        return nameProduct;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setRating(int setRating) {
        rating = setRating;
    }

    @Override
    public void getRating() {
        System.out.println(STR."\{about}\n\{rating} звёзд");
    }
}
class Crisps implements Product {
    String nameProduct;
    double cost;
    double rating = 5;

    Crisps(String name, double cost){
        this.nameProduct = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return nameProduct;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setRating(int setRating) {
        rating = setRating;
    }

    @Override
    public void getRating() {
        System.out.println(STR."Просто \{rating} звёзд");
    }
}

interface User {
    void setPassword(String password);
    String getPassword();
    void setLogin(String login);
    String getLogin();
}

class Seller implements User {
    String name;
    private String password;
    private String login;

    public Seller(String name, String password, String login) {
        this.name = name;
        this.password = password;
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }
}
class Provider implements User {
    String name;
    String password;
    String login;

    public Provider(String name, String password, String login) {
        this.name = name;
        this.password = password;
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }
}

class Buyer implements User{
    String name;
    String password;
    String login;

    public Buyer(String name, String password, String login) {
        this.name = name;
        this.password = password;
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }
}

class Transaction implements Product, User {
    Product product;
    User user;

    @Override
    public String getName(){
        return product.getName();
    }
    public Transaction(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public void doTransaction(){
        System.out.printf(STR."Пользователь \{user.getLogin()} купил \{product.getName()}");
    }

    @Override
    public double getCost() {
        return product.getCost();
    }

    @Override
    public void setRating(int setRating) {
        product.setRating(setRating);
    }

    @Override
    public void getRating() {
        product.getRating();
    }

    @Override
    public void setPassword(String password) {
        user.setPassword(password);
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public void setLogin(String login) {
        user.setLogin(login);
    }

    @Override
    public String getLogin() {
        return user.getLogin();
    }
}