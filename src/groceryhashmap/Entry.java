package groceryhashmap;

public class Entry {
    private static Grocery1 g1 = new Grocery1();


    public static void main(String[] args) {


        g1.addItem(1, "手机");
        g1.addItem(2, "书");
        g1.addItem(3, "本子");
        g1.addItem(4, "杯子");
        g1.addItem(5, "耳机");
        g1.addItem(6, "充电器");

        System.out.println("Total number of "+ g1.total());

        //查找
        String f = g1.find(3);
        System.out.println(f);



        //通过键值删除
//        System.out.println("-----------");
//        g1.delItemkey(3);
//        System.out.println(g1);

//通过值删除
        g1.delItemvalue("本子");
        System.out.println(g1);


        //修改(通过查找键来修改 value)
        g1.modifyItemKey(1,"手机(xiaomi)");
        System.out.println(g1);

        // 修改（通过查找value，来修改）
        g1.modifyItemValue("书");
        System.out.println(g1);


    }


}
