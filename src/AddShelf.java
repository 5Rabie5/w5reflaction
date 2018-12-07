public class AddShelf implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("shlef");
    }

    @Override
    public String toString() {
        return "shlef";
    }
}
