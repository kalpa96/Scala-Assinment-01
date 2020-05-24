object Q1{
    def main(args:Array[String])
    {
        temperture_Farenheit(35);
    }
    def temperture_Farenheit(C:Float)
    {
        var Faren_val:Float=C*1.8000f+32.00f;
        println("Farenheit value="+Faren_val);
    }
}