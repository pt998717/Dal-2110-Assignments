import java.util.Scanner;
import java.text.DecimalFormat;
public class Circle {
	private double xpos, ypos, radius;
	public Circle() {
		
	}
	public double getX() {
		return xpos;
	}
	public double getY() {
		return ypos;
	}
	public double getRadius() {
		return radius;
	}
	public void setCenter(double xpos, double ypos){
		this.xpos = xpos;
		this.ypos = ypos;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*this.radius*this.radius;
	}
	public double getCircumference() {
		return 2*3.14*this.radius;
	}
	public boolean contains(double x, double y) {
		double distance = (x-xpos)*(x-xpos)+(y-ypos)*(y-ypos);
		if(distance<this.radius*this.radius) {
			return true;
		}else {
			return false;
		}
	}
	public boolean touches(double x, double y) {
		double distance = (x-xpos)*(x-xpos)+(y-ypos)*(y-ypos);
		if(distance==this.radius*this.radius) {
			return true;
		}else {
			return false;
		}
	}
	public boolean contains(Circle c) {
		if(contains(c.getX(),c.getY())&&(c.getX()-xpos)*(c.getX()-xpos)+(c.getY()-ypos)*(c.getY()-ypos)<((this.radius-c.getRadius())*(this.radius-c.getRadius()))) {
			return true;
		}else {
			return false;
		}
	}
	public boolean touches(Circle c) {
		if(((c.getX()-xpos)*(c.getX()-xpos)+(c.getY()-ypos)*(c.getY()-ypos)==((this.radius-c.getRadius())*(this.radius-c.getRadius())))||((c.getX()-xpos)*(c.getX()-xpos))+((c.getY()-ypos)*(c.getY()-ypos))==((this.radius+c.getRadius())*(this.radius+c.getRadius()))) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		DecimalFormat df = new DecimalFormat("######0.0");
		for(int i=0;i<num;i++) {
			
		Circle cir1 = new Circle();
		Circle cir2 = new Circle();
		
		double xpos1 = in.nextDouble();
		double ypos1 = in.nextDouble();
		double radius1 = in.nextDouble();
		double xpos2 = in.nextDouble();
		double ypos2 = in.nextDouble();
		double radius2 = in.nextDouble();
		
		cir1.setCenter(xpos1,ypos1);
		cir1.setRadius(radius1);
		cir2.setCenter(xpos2,ypos2);
		cir2.setRadius(radius2);

		System.out.println("The first Circle's centre is: "+ cir1.getX()+", "+cir1.getY());
		System.out.println("It's radius is: "+cir1.getRadius());
		System.out.println("It's area is: "+df.format(cir1.getArea()));
		System.out.println("It's circumference is: "+df.format(cir1.getCircumference()));
		System.out.println("The second Circle's centre is: "+ cir2.getX()+", "+cir2.getY());
		System.out.println("It's radius is: "+cir2.getRadius());
		System.out.println("It's area is: "+df.format(cir2.getArea()));
		System.out.println("It's circumference is: "+df.format(cir2.getCircumference()));
		System.out.println("The 'contains' method returns: "+ cir1.contains(cir2));
		System.out.println("The 'touches' method returns: "+ cir1.touches(cir2)+"\n"+"\n");
		
	}
		in.close();
	}
}