public class item{

    String name;
    String category;
    float price;

    public item(String n, String c, float p){
        name = n;
        category = c;
        price = p;

    }
    public void setname(String n){
        name = n;
    }

    public String getname(){
        return name;
    }
    public void setcategory(String c){
        category = c;
    }
    public String getcategory(){
        return category;
    }
    public void setprice(int p){
        price = p;
    }
    public int getprice(){
        return price;
    }
}