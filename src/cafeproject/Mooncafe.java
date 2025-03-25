package cafeproject;

public class Mooncafe {

    String name;
    String latte;
    int credit;

    public Mooncafe(String name, String latte, int credit) {
        this.name = name;
        this.latte = latte;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatte() {
        return latte;
    }

    public void setLatte(String latte) {
        this.latte = latte;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Mooncafe [name=" + name + ", latte=" + latte + ", credit=" + credit + "]";
    }

}
