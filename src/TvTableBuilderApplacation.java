public class TvTableBuilderApplacation {
    public static void main(String[] args) {
        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable tvTable = new TvTable();
        tvTable = tvTableBuilder.build();
        System.out.println(tvTable);
    }
}
