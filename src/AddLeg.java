public class AddLeg implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }

    @Override
    public String toString() {
        return "leg";
    }
}
