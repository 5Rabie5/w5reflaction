public class AddTop implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("top");
    }

    @Override
    public String toString() {
        return "top";
    }
}
