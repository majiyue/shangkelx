package groceryhashmap;

import javax.management.loading.PrivateClassLoader;
import java.util.Scanner;

public class Operator {
    private static Scanner scanner = new Scanner(System.in);

    private Grocery1 grocery1;

    public Operator(Grocery1 grocery1) {
        this.grocery1 = grocery1;
    }


    public void printInstruction() {
        System.out.println("0  指令\n"
                + "1  商品清单\n"
                + "2  添加商品\n"
                + "3  修改商品\n"
                + "4  删除商品\n"
                + "5  查找商品\n"
                + "6  推出\n"
        );
    }


    public void run() {
        boolean quit = false;
        int choice = 0;

        while (!quit) {
            System.out.println("请输入你的选择：");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;

                case 1:
                    grocery1.listAll();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    deleteItem();
                    break;

                case 5:
                    find();
                    break;

                case 6:
                    quit = true;
                    break;


            }
        }


    }

    private void find() {
        System.out.println("请输入查询的商品号：");
        int id = scanner.nextInt();
        grocery1.find(id);


    }

    private void deleteItem() {
        System.out.println("请输入要删除的商品号：");
        int id = scanner.nextInt();
        grocery1.delItemkey(id);

    }

    private void modifyItem() {

        System.out.println("请输入需要修改的商品的编号和商品的新名字：");
        int id = scanner.nextInt();
        String name = scanner.nextLine();

        grocery1.modifyItemKey(id, name);


    }

    private void addItem() {
        System.out.println("请输入添加的商品号和商品名：");
        grocery1.addItem(scanner.nextInt(), scanner.nextLine());
    }


    public static void main(String[] args) {
        Operator operator = new Operator(new Grocery1());

        operator.printInstruction();
        operator.run();
    }
}
