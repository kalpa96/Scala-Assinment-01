object Q2{
    def main(args:Array[String])
    {
        volume(5);
    }
    def volume(radius:Double)
    {
        var volume_sphere:Double=4/3*math.Pi*radius*radius*radius;
        println("Volume of sphere="+volume_sphere);
    }
}