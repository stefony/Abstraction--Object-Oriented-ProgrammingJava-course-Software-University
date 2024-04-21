package P4_Traffic_Lights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String [] colors = scanner.nextLine().split("\\s+"); // цветовете та крушките от конзолата
         int n = Integer.parseInt(scanner.nextLine()); // брой смени на крушките

        List<Light> trafficLight = new ArrayList<>(); // списък с  всички крушки

        for (String color: colors) { // обхождам  си всеки цвят и от всеки един цвят съдавам крушка с този цвят и добавям крушката в светофара
            Light light = new Light(Color.valueOf(color));

            trafficLight.add(light);
        }

        for (int i = 0; i < n ; i++) {
            trafficLight.forEach(light -> {
            light.changeColor();
                System.out.print(light.getColor() + " ");
            });
            System.out.println();
        }

    }
}

