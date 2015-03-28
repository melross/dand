package formPackageOne;

import java.util.ArrayList;

/**
 * Created by Mel on 3/28/2015.
 */
public class npcTracker {
    private ArrayList<Npc> npcList = new ArrayList<Npc>();
    public npcTracker(){

    }


    public void addNpc(Npc newNpc){
        npcList.add(newNpc);
    }

    public void removeNpc(Npc purgee){
        npcList.remove(purgee);
    }

    public Npc getNpc(int index){
        return npcList.get(index);
    }

    public int getNpcIndex(Npc npc){
        return npcList.indexOf(npc);
    }
}
