package geopoliticalzones;

public enum PoliticalZone {
    NORTH_CENTRAL("Benue","FCT","Kwara","Nasarawa","Plateau","Niger"),
    NORTH_EAST("Adamawa","Bauchi","Borno","Gombe","Yobe","Taraba"),
    NORTH_WEST("Kaduna","Kastina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTH_EAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_WEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo"),
    SOUTH_SOUTH("Akwa-Ibom","Bayelsa","Cross-River","Delta","Edo","Rivers");
    private String[] state ;

    PoliticalZone(String... state){
        this.state = state;
    }

    public String[] getState(){
        return this.state;
    }


}
