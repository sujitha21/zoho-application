import java.util.*;

public class Amazon {
    static Scanner sc = new Scanner(System.in);
    static int p = 123;
    static String k = "k";
    static String uname = "";
    static String pass = "";
    static int count = 0;
    static int balance = 30000;
    static List<String> l = new ArrayList<>();// merchent name
    static List<String> l1 = new ArrayList<>(); // merchent id
    static List<String> l2 = new ArrayList<>(); // product name
    static List<String> l3 = new ArrayList<>(); // product id
    static List<String> l4 = new ArrayList<>(); // product price
    static List<Integer> l5 = new ArrayList<>(); // no.of.product

    static List<String> i = new ArrayList<>();// merchent name
    static List<String> i1 = new ArrayList<>(); // merchent id
    static List<String> i2 = new ArrayList<>(); // product name
    static List<String> i3 = new ArrayList<>(); // product id
    static List<String> i4 = new ArrayList<>(); // product price
    static List<Integer> i5 = new ArrayList<>(); // no.of.product

    static List<String> c = new ArrayList<>();
    static List<String> o = new ArrayList<>();// product nmae
    static List<String> o2 = new ArrayList<>();// price
    static List<Integer> o3 = new ArrayList<>(); // quantity

    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
        System.out.println(".....WELCOME.....");
        System.out.println("1.ADMIN LOGIN");
        System.out.println("2.MERCHENT LOGIN");
        System.out.println("3.USER LOGIN");
        System.out.println("4.EXIT");
        int a = sc.nextInt();
        if (a == 1)
            admin();
        else if (a == 2)
            merchent();
        else if (a == 3)
            user();
    }

    public static void admin() {
        System.out.print("Enter your Name:");
        String s = sc.next();
        System.out.print("Enter your password: ");
        int a = sc.nextInt();
        if (s.equals(k) && a == p) {
            admin1();
        } else {
            System.out.println("Invalid username and password");
            welcome();
        }

    }

    public static void admin1() {
        System.out.println("1. Add/remove merchents");
        System.out.println("2. view all products");
        System.out.println("3. view merchents");
        System.out.println("4. approve merchents");
        System.out.println("5.exit");
        int b = sc.nextInt();
        switch (b) {
            case 1:
                addremove();
            case 2:
                viewproducts();
            case 3:
                viewmerchents();
            case 4:
                approve();
            case 5:
                welcome();
            default:
                System.out.println("PRESS ENTER TO CONTINUE");
                sc.nextLine();
                String w = sc.nextLine();
                if (w.equals(""))
                    welcome();

        }

    }

    public static void addremove() {
        System.out.println("1.Add a new merchent");
        System.out.println("2.remove merchent");
        int b = sc.nextInt();
        if (b == 1)
            addMerchent();
        else if (b == 2)
            removeMerchent();

    }

    public static void addMerchent() {
        System.out.print("Enter your name: ");
        String s1 = sc.next();
        l.add(s1);
        System.out.print("Enter your merchent id : ");
        String s2 = sc.next();
        l1.add(s2);
        System.out.print("Enter the product name: ");
        String s3 = sc.next();
        l2.add(s3);
        System.out.print("Enter the product ID:");
        String s4 = sc.next();
        l3.add(s4);
        System.out.print("Enter the product price:");
        String s5 = sc.next();
        l4.add(s5);
        System.out.print("Enter the number of products:");
        int s6 = sc.nextInt();
        l5.add(s6);
        System.out.println("PRESS ENTER TO CONTINUE");
        sc.nextLine();
        String w = sc.nextLine();
        if (w.equals(""))
            admin1();

    }

    public static void removeMerchent() {
        int i = sc.nextInt();
        if (i < l.size()) {
            System.out.println(l.remove(i));
            System.out.println(l1.remove(i));
            System.out.println(l2.remove(i));
            System.out.println(l3.remove(i));
            System.out.println(l4.remove(i));
            System.out.println(l5.remove(i));
        }
        System.out.println("Removed successfully");
        System.out.println("PRESS ENTER TO CONTINUE");
        sc.nextLine();
        String w = sc.nextLine();
        if (w.equals(""))
            admin1();

    }

    public static void viewproducts() {
        for (int i = 0; i < l2.size(); i++) {
            String s = l2.get(i);
            if (s.equals("0")) {
                System.out.println("THERE IS NOTHING TO DISPLAY THE PRODUCTS");
            } else {
                System.out.println("Product name: " + "  " + l2.get(i));
                System.out.println("Product Id: " + "  " + l3.get(i));
                System.out.println("Product Id: " + "  " + l4.get(i));
                System.out.println("..........................................");
            }
        }
        System.out.println("PRESS ENTER TO CONTINUE");
        sc.nextLine();

        String w = sc.nextLine();
        if (w.equals(""))
            admin1();

    }

    public static void viewmerchents() {
        System.out.println("1.view all merchents");
        System.out.println("2. view particular merchents");
        int s = sc.nextInt();
        if (s == 1) {
            for (int i = 0; i < l.size(); i++) {
                // System.out.println(l.get(i));
                System.out.println(l.get(i) + "  ");
                System.out.println(".......");
                /*
                 * System.out.println(l2.get(i));
                 * System.out.println(l3.get(i));
                 * System.out.println(l4.get(i));
                 * System.out.println(l5.get(i));
                 */
                sc.nextLine();

            }
        } else if (s == 2) {
            int j = sc.nextInt();
            if (j < l.size()) {
                System.out.println(l.get(j));
                System.out.println(l1.get(j));
                System.out.println(l2.get(j));
                System.out.println(l3.get(j));
                System.out.println(l4.get(j));
                System.out.println(l5.get(j));
            }
        }
        System.out.println("PRESS ENTER TO CONTINUE");
        sc.nextLine();
        String w = sc.nextLine();
        if (w.equals(""))
            admin1();

    }

    public static void approve() {
        if (i.size() <= 0) {
            System.out.println("-----NO PENDING APPROVAL-------");
        } else {
            System.out.println("Enter your name: " + i.get(i.size() - 1));
            System.out.println("Enter merchent id: " + i1.get(i1.size() - 1));
            System.out.println("Enter product name: " + i2.get(i2.size() - 1));
            System.out.println("Enter product id: " + i3.get(i3.size() - 1));
            System.out.println("Enter product price: " + i4.get(i4.size() - 1));
            System.out.println("Enter number of products: " + i5.get(i5.size() - 1));
            System.out.println("PRESS 3 TO APPROVE THE REQUEST");
            System.out.println("PRESS 10 TO REJECT THE REQUEST");

            int s = sc.nextInt();
            if (s == 3) {
                l.add(i.get(i.size() - 1));
                l1.add(i1.get(i1.size() - 1));
                l2.add(i2.get(i2.size() - 1));
                l3.add(i3.get(i3.size() - 1));
                l4.add(i4.get(i4.size() - 1));
                l5.add(i5.get(i5.size() - 1));
                System.out.println("SUCCESSFULLY APPROVED");
                i.clear();
                i1.clear();
                i2.clear();
                i3.clear();
                i4.clear();
                i5.clear();

            } else if (s == 10) {
                System.out.println("APPROVAL REJECTED");
            }
        }

        System.out.println("PRESS ENTER TO CONTINUE");
        sc.nextLine();
        String w = sc.nextLine();
        if (w.equals(""))
            welcome();

    }

    public static void merchent() {
        System.out.println("1.SIGN UP");
        System.out.println("2.LOGIN");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("....SIGN UP TO GET STARTED....");
            System.out.print("Enter your name: ");
            String s1 = sc.next();
            i.add(s1);
            System.out.print("Enter your merchent id : ");
            String s2 = sc.next();
            i1.add(s2);
            System.out.print("Enter the product name: ");
            String s3 = sc.next();
            i2.add(s3);
            System.out.print("Enter the product ID:");
            String s4 = sc.next();
            i3.add(s4);
            System.out.print("Enter the product price:");
            String s5 = sc.next();
            i4.add(s5);
            System.out.print("Enter the number of products:");
            int s6 = sc.nextInt();
            i5.add(s6);
            System.out.println("PRESS ENTER TO CONTINUE");
            sc.nextLine();
            String w = sc.nextLine();
            if (w.equals(""))
                welcome();
        } else if (a == 2) {
            System.out.print("Enter your name: ");
            String j = sc.next();
            System.out.print("Enter your ID: ");
            String j1 = sc.next();
            if (l.contains(j) && l1.contains(j1)) {
                login();
            } else {
                System.out.println("....PRESS ENTER TO CONTINUE....");
                sc.nextLine();
                String e = sc.nextLine();
                if (e.equals(""))
                    welcome();
            }
        }
    }

    public static void login() {
        System.out.println("1.ADD NEW PRODUCTS ");
        System.out.println("2. VIEW THE EXISTING  STOCKS ");
        System.out.println("3.EDIT");
        System.out.println("4.EXIT");
        int j3 = sc.nextInt();
        if (j3 == 1) {
            add();
        } else if (j3 == 2) {
            System.out.println("ENTER YOUR MERCHENT ID: ");
            int i = sc.nextInt();
            System.out.print("YOUR EXISTING STOCK: ");
            System.out.println(l5.get(i) - count);

        } else if (j3 == 3) {
            edit();
        }

        else if (j3 == 4) {
            System.out.println("....PRESS ENTER TO CONTINUE.....");
            sc.nextLine();
            String e = sc.nextLine();
            if (e.equals(""))
                welcome();
        }

    }

    public static void add() {
        System.out.println("...........Add a new product...........");
        System.out.print("Enter the product name: ");
        String s1 = sc.next();
        l2.add(s1);
        System.out.print("Enter the product Id: ");
        String s2 = sc.next();
        l3.add(s2);
        System.out.print("Enter the product price: ");
        String s = sc.next();
        l4.add(s);
        System.out.print("Enter the number of product: ");
        int s3 = sc.nextInt();
        l5.add(s3);
        System.out.println("....PRESS ENTER TO CONTINUE.....");
        sc.nextLine();
        String e = sc.nextLine();
        if (e.equals(""))
            login();

    }

    public static void user() {
        System.out.println("1..........SIGN UP TO CONTINUE..........");
        System.out.println("2..........LOGIN TO CONTINUE..........");
        int h = sc.nextInt();
        if (h == 1) {
            System.out.print("  Enter your name: ");
            String s = sc.next();
            uname = s;
            System.out.print("  Enter your mobile number: ");
            String s2 = sc.next();
            System.out.print("  creat a new password: ");
            String s3 = sc.next();
            pass = s3;
            System.out.println("----ACCOUNT CREATED ----");
            System.out.println("....PRESS ENTER TO CONTINUE.....");
            sc.nextLine();
            String e = sc.nextLine();
            if (e.equals(""))
                user();
        } else if (h == 2) {
            System.out.println("LOGIN TO CONTINUE");
            System.out.print("Enter your name : ");
            String n = sc.next();
            System.out.print("Enter your password :");
            String m = sc.next();
            if (n.equals(uname) && m.equals(pass)) {
                System.out.println("--------WELCOME TO AMAZON--------");
                sc.nextLine();
                System.out.println("PRODUCT NAME : ");
                int k = 0;
                ;
                for (int i = 0; i < l2.size(); i++) {

                    System.out.println(k + "." + l2.get(i));
                    k++;
                }
                System.out.println("PRODUCT PRICE : ");
                for (int i = 1; i <= l2.size(); i++) {
                    System.out.println(l4.get(i));
                }
                System.out.println("-------------------------------");
                user1();
            } else {
                System.out.println("---INVALID USERNAME AND PASSWORD---");
            }
            System.out.println(".......PRESS ENTER TO CONTINUE.....");
            sc.nextLine();
            String e = sc.nextLine();
            if (e.equals(""))
                welcome();
        }
    }

    public static void edit() {
        System.out.print("ADD ADDTIONAL PRODUCT COUNT : ");

    }

    public static void user1() {
        System.out.println("1.ORDER");
        System.out.println("2.CART");
        System.out.println("3.WALLET");
        System.out.println("4.ORDER HISTORY");
        System.out.println("5.Exit");
        int s = sc.nextInt();
        if (s == 1)
            order();
        else if (s == 2)
            cart();
        else if (s == 3)
            wallet();
        else if (s == 4)
            history();
        else if (s == 5)
            welcome();
    }

    public static void order() {
        System.out.println("----ENTER THE PRODUCT----");
        int i = sc.nextInt();
        System.out.println("PRODUCT NAME  : " + l2.get(i));
        System.out.println("PRODUCT PRICE : " + l4.get(i));
        System.out.println("---PRESS 1 TO PLACE ORDER---");
        System.out.println("---PRESS 2 TO ADD TO CART---");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.print("ENTER NUMBER OF PRODUCTS TO ORDER : ");
            int j = sc.nextInt();
            System.out.println("..........ORDER PLACED........");
            o.add(l2.get(i));
            o2.add(l4.get(i));
            o3.add(j);
            count = j;
            balance -= j * (Integer.parseInt(l4.get(i)));
        } else if (a == 2) {
            c.add(l2.get(i));
            System.out.println("......ADDED TO CART......");
        }
        System.out.println("-----PRESS ENTER TO CONTINUE-----");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            user1();
    }

    public static void cart() {
        for (int i = 0; i < c.size(); i++) {
            if ((c.get(i)).equals(" ")) {
                System.out.println("----YOUR CART IS EMPTY-----");
            } else {

                System.out.println(c.get(i));

            }
        }
        System.out.println("-----PRESS ENTER TO CONTINUE-----");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            user1();
    }

    public static void history() {
        if (o.size() > 0) {
            System.out.println("----PRODUCTS PURCHASED---");
            for (int i = o.size() - 1; i >= 0; i--) {
                System.out.println("PRODUCT NAME : " + o.get(i));
                System.out.println("PRODUCT PRICE : " + o2.get(i));
                System.out.println("NUMBER OF PRODUCTS ORDERED : " + o3.get(i));
            }
            System.out.println("YOUR AVALAIBLE WALLET BALANCE:" + balance);

        } else {
            System.out.println("!!!!!.YOU HAVE NOT PURCHASED ANYTHING.!!!!");
        }
        System.out.println("-----PRESS ENTER TO CONTINUE-----");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            user1();
    }

    public static void wallet() {
        System.out.println("YOUR WALLET BALANCE : " + balance);
        System.out.println("PRESS 1 TO ADD MONEY TO YOUR WALLET!!!!!");
        int b = sc.nextInt();
        if (b == 1) {
            System.out.print("Enter the amount : ");
            int a = sc.nextInt();
            balance += a;
            System.out.println("----MONEY ADDED TO WALLET SUCCESSFULLY-----");
        } else {
            System.out.println("-----PRESS ENTER TO CONTINUE-----");
            sc.nextLine();
            String u = sc.nextLine();
            if (u.equals(""))
                user1();

        }
    }
}