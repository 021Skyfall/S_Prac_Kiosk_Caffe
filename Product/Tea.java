package Product;

import java.util.Scanner;

public class Tea extends Product{
    private boolean noTeabag;

    public Tea(int id, String name, int price, boolean noTeabag) {
        super(id, name, price);
        this.noTeabag = noTeabag;
    }

    public void setNoTeabag(boolean noTeabag) {
        this.noTeabag = noTeabag;
    }

    @Override
    public void applyOption() {
        System.out.println("티백을 제거하시겠습니까? (1)_예 (2)_아니오");
        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());
        if (option == 1) setNoTeabag(true);
    }

    @Override
    public String getOptionToString() {
        return noTeabag ? "(티백 제거)" : "";
    }
}
