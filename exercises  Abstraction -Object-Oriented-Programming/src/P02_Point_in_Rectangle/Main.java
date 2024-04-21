package P02_Point_in_Rectangle;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] coordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int bottomLeftX = coordinates[0];
        int bottomLeftY=coordinates[1];
        int topRightX = coordinates[2];
        int topRightY = coordinates[3];

        Point bottomLeft = new Point(bottomLeftX,bottomLeftY);
        Point bottomTopRight= new Point(topRightX,topRightY);
        Rectangle rectangle = new Rectangle(bottomLeft,bottomTopRight);
        int n =Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
        int [] checkPoint = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int x = checkPoint[0];
        int y = checkPoint[1];
        Point search = new Point(x,y);
            System.out.println(rectangle.contains(search));
        }
    }
}
