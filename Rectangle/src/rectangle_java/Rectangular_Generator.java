package rectangle_java;

public class Rectangular_Generator {

	public static void main(String[] args) {
	
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		
		Rectangular myRectangular = new Rectangular(length, width);
		
		String output = String.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangular.length, myRectangular.width, myRectangular.getArea(), myRectangular.getParameter());
System.out.println(output);
	}

}
