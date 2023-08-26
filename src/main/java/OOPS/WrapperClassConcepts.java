package OOPS;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		String x="100";
        System.out.println(x+20);
        
        
        //Data Conversion from String to Integer
        int i=Integer.parseInt(x);
        System.out.println(i+20);
        
        //Integer, Double ,Char,Boolean
        
        //double conversion
        String y="12.33";
        double d= Double.parseDouble(y);
        System.out.println(d+12.33);
        
        //String to boolean
        String k="true";
        boolean b= Boolean.parseBoolean(k);
        System.out.println(b);
        
        //int to String
        int j=20;
        System.out.println(j+50);
        String s=String.valueOf(j);
        System.out.println(s+50);
        
        
        String u="100A";
        Integer.parseInt(u); //Number format Exception -it should be pure Numerical
        
	}

}
