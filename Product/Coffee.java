package Product;

import java.util.Scanner;

public class Coffee extends Product{
    private boolean shot;

    public Coffee(int id, String name, int price, boolean shot) {
        super(id, name, price);
        this.shot = shot;
    }

    private void setShot(boolean shot) {
        this.shot = shot;
    }

    @Override
    public void applyOption() {
        System.out.println("샷을 추가하시겠습니까? (1)_예 (2)_아니오");
        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());
        if (option == 1) setShot(true);
    }

    @Override
    public String getOptionToString() {
        return shot ? "(샷 추가)" : "";
    }
}
