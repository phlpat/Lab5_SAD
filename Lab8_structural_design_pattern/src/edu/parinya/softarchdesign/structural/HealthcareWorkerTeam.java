package edu.parinya.softarchdesign.structural;

import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {

    private Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {
        members = new HashSet<>();
    }

    public void addMember(HealthcareServiceable worker) {
        members.add(worker);
    }

    public void removeMember(HealthcareServiceable worker) {
        members.remove(worker);
    }

    public void service() {
        for(var o : members) {
            o.service();
        }
    }

    public double getPrice() {
        double price = 0;

        for(var m : members) {
            price += m.getPrice();
        }
        return price;
    }
}
