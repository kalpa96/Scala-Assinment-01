object Q3{
    def main(args:Array[String])
    {
        var total:Double=bookprice(60)-discount(bookprice(60));
        println("The total wholesale cost for 60 copies:"+total);
    }
    def bookprice(a:Int):Double={
        a*24.95;
    }
    def discount(amount:Double):Double={
        amount*0.4;
    }
    def shippingCost(a:Int):Double={
        3*a+(a-50)*0.75;
    }
}