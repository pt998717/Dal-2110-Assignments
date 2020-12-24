import java.util.Scanner;
public class Rectangle {
	private double xpos, ypos, width, height;
	public Rectangle() {};
	public void setX(double xpos) {
		this.xpos = xpos;
	}
	public void setY(double ypos) {
		this.ypos = ypos;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getX() {
		return xpos;
	}
	public double getY() {
		return ypos;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public boolean contains(double px, double py) {
		if(this.xpos<px&&px<this.xpos+this.width&&this.ypos<py&&py<this.ypos+this.height) {
			return true;
		}else {
			return false;
		}
	}
	public boolean touches(double px, double py) {
		if(this.xpos==px||px==this.xpos+this.width||this.ypos==py||py==this.ypos+this.height) {
			return true;
		}else {
			return false;
		}
	}
	public boolean contains(Rectangle r) {
		if(contains(r.getX(),r.getY())&&contains(r.getX()+r.getWidth(),r.getY()+r.getHeight())) {
			return true;
		}else {
			return false;
		}
	}
	public boolean touches(Rectangle r) {
		if(touches(r.getX(),r.getY())||touches(r.getX()+r.getWidth(),r.getY()+r.getHeight())&&r.getX()<=this.xpos+this.width&&r.getY()<=this.ypos+this.height) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		for(int i=0;i<num;i++) {
		Rectangle rect1;
		rect1 = new Rectangle();
		Rectangle rect2;
		rect2 = new Rectangle();
		
		double xpos1 = kb.nextDouble();
		double ypos1 = kb.nextDouble();
		double width1 = kb.nextDouble();
		double height1 = kb.nextDouble();
		double xpos2 = kb.nextDouble();
		double ypos2 = kb.nextDouble();
		double width2 = kb.nextDouble();
		double height2 = kb.nextDouble();
		rect1.setX(xpos1);
		rect1.setY(ypos1);
		rect1.setWidth(width1);
		rect1.setHeight(height1);
		rect2.setX(xpos2);
		rect2.setY(ypos2);
		rect2.setWidth(width2);
		rect2.setHeight(height2);
		System.out.println("The first Rectangle's top corner is: "+ xpos1 + ", " + ypos1);
		System.out.println("It's width is: " + width1);
		System.out.println("It's height is: " + height1);
		System.out.println();
		System.out.println("The second Rectangle's top corner is: "+ xpos2 + ", " + ypos2);
		System.out.println("It's width is: " + width2);
		System.out.println("It's height is: " + height2);
		System.out.println();
		System.out.println("The contains method returns: " + rect1.contains(rect2));
		System.out.println("The touches method returns: " + rect1.touches(rect2));
		System.out.println();
		System.out.println();
	}
		kb.close();
	}
}
