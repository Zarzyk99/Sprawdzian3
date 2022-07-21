package pl.kurs.expedition;

public class ExpeditionService {

    public <T extends Vehicle & Swimable> void ruszWMorze(T vehicle){
        System.out.println(vehicle.getName() + " wyrusza w morze");
    }
    public <T extends Vehicle & Driveable> void ruszWDroge(T vehicle){
        System.out.println(vehicle.getName() + " wyrusza w drogę");
    }
}
