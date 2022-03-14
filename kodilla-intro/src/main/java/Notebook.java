public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        String msg = "";

        if (this.price < 600){
            msg+="This notebook is very cheap ";
        }else if (this.price <= 1000){
            msg+="The price is good ";
        }else {
            msg+="This notebook is expensive ";
        }

        if (this.year >= 2022){
            msg+="and this notebook is brand new.";
        }else if (this.year >= 2019){
            msg+="and this notebook is new.";
        }else if (this.year >= 2015){
            msg+="and this notebook is quite old.";
        }else {
            msg+="and this notebook is old.";
        }

        System.out.println(msg);
    }

    public void checkWeight(){
        int weightG;
        try{
            if (this.weight.contains("kg")){
                weightG = 1000 * Integer.parseInt(this.weight.replace("kg",""));
            } else if (this.weight.contains("g")) {
                weightG = Integer.parseInt(this.weight.replace("g", ""));
            } else{
                System.out.println("Wrong value for weight - No units");
                return;
            }
        }
        catch(NumberFormatException ex){
            ex.printStackTrace();
            System.out.println("Wrong value for weight");
            return;
        }

        if (weightG <= 600){
            System.out.println("This notebook is very light.");
        }else if (weightG <= 1600){
            System.out.println("The notebook is not so heavy.");
        }else {
            System.out.println("Soo heavy.");
        }
    }
}
