class UndergroundSystem {
    
    public class StartPoint{
        String stationName;
        Integer startTime;
        
        StartPoint(String stnName, Integer time){
            this.stationName = stnName;
            this.startTime = time;
        }
    }
    public class StationAverage{
        Double totalTime;
        Double count;
        
        StationAverage(double time){
            this.totalTime = time;
            this.count = 1.0;
        }
        public void addTime(int val){
            totalTime = totalTime+val;
            count = count+1.0;
        }
        public double getAverage(){
            return (totalTime/count);
        }
    }
    Map<Integer,StartPoint> pointsMap;
    Map<String,StationAverage> averageMap;

    public UndergroundSystem() {
        pointsMap = new HashMap<>();
        averageMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        StartPoint point = new StartPoint(stationName,t);
        pointsMap.put(id,point);
    }
    
    public void checkOut(int id, String stationName, int t) {
        StartPoint point = pointsMap.get(id);
        String key = point.stationName + "$" + stationName;
        if(averageMap.containsKey(key)){
            StationAverage avg = averageMap.get(key);
            avg.addTime(t-point.startTime);
        }
        else{
            StationAverage avg = new StationAverage( t - point.startTime);
            averageMap.put(key,avg);   
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
            String key = startStation + "$" + endStation;
            StationAverage avg = averageMap.get(key);
            return avg.getAverage();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */