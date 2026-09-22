public class Sprinkles extends CakeDecorator {
    public Sprinkles(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with sprinkles";
    }
}
