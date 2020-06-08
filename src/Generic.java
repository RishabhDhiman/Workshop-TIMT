public class Generic<T extends Shape> {
    private T mObject;

    Generic initialize(Shape s){
        mObject = (T) s;
        return this;
    }


    String printShape() {
        return mObject.printTheShape();
    }
}
