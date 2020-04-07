package PracticalTasks;

public class Enum {
    public static void main(String[] args) {
        Season season = Season.valueOf("SUMMER");
        Season seson1 = season.nextSeason();
        System.out.println(season.getTemperature());

//        Season season = Season.valueOf("SUMMER");
//        switch (season) {
//            case SUMMER:
//                System.out.println("its HOT!");
//                break;
//             case WINTER:
//                System.out.println("its COLD!");
//                break;
//            default:
//                System.out.println("its not HOT!");
//                break;
//                        }


    }
}
enum Season {
        WINTER(-10), AUTUMN(10), SPRING(15), SUMMER(35);
        private  final int temperature;

        Season (int temp){
            this.temperature = temp;
        }

        public Season nextSeason() {
            if (this == Season.SUMMER) return AUTUMN;
            return  SPRING;

        }

    public int getTemperature() {
        return temperature;
    }
}

