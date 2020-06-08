import java.util.ArrayList;
import java.util.List;

public class Inheritence {
    public static void main(String[] args) {
      /*  List<Shape> list = new ArrayList<>();
        list.add(new Rectangle());
        list.add(new Square());
        list.add(new Triangle());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).printTheShape());
        }*/

        List<Generic> shapeList = new ArrayList<>();
        shapeList.add(new Generic<Rectangle>().initialize(new Rectangle()));
        shapeList.add(new Generic<Triangle>().initialize(new Triangle()));
        shapeList.add(new Generic<Square>().initialize(new Square()));

        for (int i = 0; i < shapeList.size(); i++) {
            System.out.println(shapeList.get(i).printShape());
        }
    }
}
