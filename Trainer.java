import java.util.*;
public class Trainer {
    private String name, townFrom;
    private int level, xp;
    private ArrayList<PocketMonster> pokedex;
    private PocketMonster[] party;
    public Trainer(String str1, String str2, PocketMonster pm) {
        name = str1;
        townFrom = str2;
        pokedex = new ArrayList<PocketMonster>();
        party = new PocketMonster[4];
        party[0] = pm;
        pokedex.add(pm);
        level = 1;
        xp = 0;
    }
    // name, pokedex, party
    public String getName() {return name;}
    public ArrayList<PocketMonster> getPokedex() {return pokedex;}
    public PocketMonster[] getParty() {return party;}
    // evel and xp
    public void setLevel(int lev) {level = lev;}
    public void setXp(int x) {xp = x;}
    // provide a void method called xpUp that takes an int parameteroit should
    // increase the trainer’s xp by the parameteroit shouldincreaseeach
    // PocketMonster xp currently in partyby the same parameterofor every 5000 xp,
    // the trainer’s level should increase by 1(level = 1 + xp/5000)
    public void xpUp(int int1) {
        xp+=int1;
        for (PocketMonster i : party) {
            i.increaseXp(int1);
        }
        if (xp %5000 == 0) ++level;
    }
    public void addPM(PocketMonster pm) {
        pokedex.add(pm);
        int pos = 0;
        while (pos < party.length && party[pos] == null) {
            party[pos] = pm;
            break;
        }
    }
    public boolean selectParty(int one, int two, int three) {
        if (one != two || two!=three || one != three || one > pokedex.size() || two > pokedex.size() || three > pokedex.size()) {
            party[0] = pokedex.get(one);
            party[1] = pokedex.get(two);
            party[2] = pokedex.get(three);
            return true;
        }
        return false;
    }

    public String currentParty() {
        return Arrays.toString(party);
    }

    public String toString() {
        return name + "from" + townFrom + "(lvl –" + level+")" + "Current Party:" + currentParty();
    }
}