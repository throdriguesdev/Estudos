
public class Member {
    private String name;
    private String type;
    private int level; // note the data type here
    private int rank; // note the data type here as well
    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }
    public String getName() { //metodo get p perguntar nome
        return this.name; //resposta do nome
    }
    public String getType() {
        return this.type;
    }
    public int getLevel() {
        return this.level;
    }
    public int getRank() {
        return this.rank;
    }
}
