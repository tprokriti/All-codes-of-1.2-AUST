package newjava;

public class BoxJava {

    public static void main(String[] args) {
        Box resultBox = new Box(10, 15, 20);

        System.out.println("Information of the box:");
        System.out.println("The length is :" + resultBox.length);
        System.out.println("The width is :" + resultBox.width);
        System.out.println("The height is :" + resultBox.height);
        System.out.println("Volume of the Box :" + resultBox.getVolume());
        
      
    }

}
