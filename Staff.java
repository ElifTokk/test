public abstract class Staff implements AnnualLeave{

    private String name;
    private int tckn;
    private int totalWorkingYears;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTckn() {
        return tckn;
    }

    public void setTckn(int tckn) {
        this.tckn = tckn;
    }

    public int getTotalWorkingYears() {
        return totalWorkingYears;
    }

    public void setTotalWorkingYears(int totalWorkingYears) {
        this.totalWorkingYears = totalWorkingYears;
    }

}
