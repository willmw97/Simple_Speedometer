public class Speedometer 
{
//data
private double mph;
// the data item
//methods
// public double getMph ()
// public double getKph ()
// public void setMph (double M)
// public void setKpm (double K)
public double getMph ()
{
return mph;
}
public double getKph ()
{
return 80.0/50.0 * mph;
// decimal so when converting, we get results after decimal
}
public void setMph (double M)
{
mph = M;
}
public void setKph (double K)
{
mph = 50.0/80.0 * K;
}
// constructor(s)
public Speedometer ()
{
mph = 0.0; // why 0.0? it's a double
}
public Speedometer (double M)
{
mph = M;
}

public static void main(String[] args) 
{
// make 2 speedometers 
Speedometer S1;
S1 = new Speedometer ();
// test it
System.out.println(S1.getMph());
Speedometer S2;
S2 = new Speedometer (50.0);
// test it
S2.setKph(80.0);
// last test, setting kph
System.out.println(S2.getMph());
System.out.println(S2.getKph());
// test getKph

}

}